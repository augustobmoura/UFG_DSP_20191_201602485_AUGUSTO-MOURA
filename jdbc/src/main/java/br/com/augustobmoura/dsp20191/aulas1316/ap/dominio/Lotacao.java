package br.com.augustobmoura.dsp20191.aulas1316.ap.dominio;

import lombok.Data;

import java.util.Date;

@Data
public class Lotacao {
  private Long id;
  private Date dataInicial;
  private Date dataFinal;
  private Cargo cargo;
  private Departamento departamento;
}
