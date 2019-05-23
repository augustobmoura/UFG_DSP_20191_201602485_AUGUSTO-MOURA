package com.github.augustobmoura.dominio;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@Entity
public class Professor {

  @Id
  @GeneratedValue
  private Long id;

  @ManyToMany
  private Set<Turma> turmas;
}
