package com.github.augustobmoura.dominio;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Historico {

  @Id
  @GeneratedValue
  private Long id;

  private Aluno aluno;

}
