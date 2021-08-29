package jmrm.example.examplespringbootproject.service;

import jmrm.example.examplespringbootproject.dto.ExampleDto;
import jmrm.example.examplespringbootproject.dto.ExamplesDto;
import jmrm.example.examplespringbootproject.mapper.ExampleDtoMapper;
import jmrm.example.examplespringbootproject.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

  private final ExampleRepository exampleRepository;

  @Autowired
  public ExampleService(ExampleRepository exampleRepository) {
    this.exampleRepository = exampleRepository;
  }

  public ExamplesDto getAll() {
    return ExampleDtoMapper.mapToExamplesDto(exampleRepository.findAll());
  }

  public void add(ExampleDto exampleDto) {
    exampleRepository.save(ExampleDtoMapper.mapToExample(exampleDto));
  }
}
