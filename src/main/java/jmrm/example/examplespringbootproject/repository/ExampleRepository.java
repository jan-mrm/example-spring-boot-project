package jmrm.example.examplespringbootproject.repository;

import java.util.List;
import jmrm.example.examplespringbootproject.entity.Example;
import org.springframework.data.repository.CrudRepository;

public interface ExampleRepository extends CrudRepository<Example, Long> {

  List<Example> findAll();

}
