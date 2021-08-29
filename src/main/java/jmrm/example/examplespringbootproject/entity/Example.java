package jmrm.example.examplespringbootproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Example {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String value1;
}
