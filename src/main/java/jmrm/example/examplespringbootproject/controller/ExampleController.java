package jmrm.example.examplespringbootproject.controller;

import javax.validation.Valid;
import jmrm.example.examplespringbootproject.dto.ExampleDto;
import jmrm.example.examplespringbootproject.dto.ExamplesDto;
import jmrm.example.examplespringbootproject.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class ExampleController {

  private final ExampleService exampleService;

  @Autowired
  public ExampleController(ExampleService exampleService) {
    this.exampleService = exampleService;
  }

  @GetMapping("/")
  public ResponseEntity<ExamplesDto> getAll() {
    return ResponseEntity.ok(exampleService.getAll());
  }

  @PostMapping("/")
  public ResponseEntity<Void> add(@Valid @RequestBody ExampleDto exampleDto) {
    exampleService.add(exampleDto);
    return ResponseEntity.ok().build();
  }

}
