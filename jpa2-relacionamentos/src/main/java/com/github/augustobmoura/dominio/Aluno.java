package com.github.augustobmoura.dominio;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Aluno {

  @Id
  @GeneratedValue
  private Long id;

  @OneToOne(mappedBy = "aluno")
  private Historico historico;

  private Turma turma;

}
