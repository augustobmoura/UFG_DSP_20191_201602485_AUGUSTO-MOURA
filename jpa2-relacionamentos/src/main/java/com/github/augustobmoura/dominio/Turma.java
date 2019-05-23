package com.github.augustobmoura.dominio;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
public class Turma {

  @Id
  @GeneratedValue
  private Long id;

  @OneToMany(mappedBy = "turma")
  private Set<Aluno> alunos;

  @ManyToMany(mappedBy = "turmas")
  private Set<Professor> professores;

}
