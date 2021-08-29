package jmrm.example.examplespringbootproject.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class ExamplesDto {

  private List<ExampleDto> exampleDtos = new ArrayList<>();

}
