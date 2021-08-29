package jmrm.example.examplespringbootproject.mapper;

import java.util.List;
import jmrm.example.examplespringbootproject.dto.ExampleDto;
import jmrm.example.examplespringbootproject.dto.ExamplesDto;
import jmrm.example.examplespringbootproject.entity.Example;

public class ExampleDtoMapper {

  public static ExampleDto mapToExampleDto(Example example) {
    return new ExampleDto(example.getId(), example.getValue1());
  }

  public static ExamplesDto mapToExamplesDto(List<Example> examples) {
    ExamplesDto dto = new ExamplesDto();
    examples.forEach(e -> dto.getExampleDtos().add(mapToExampleDto(e)));
    return dto;
  }

  public static Example mapToExample(ExampleDto exampleDto) {
    return new Example(null, exampleDto.getValue1());
  }

}
