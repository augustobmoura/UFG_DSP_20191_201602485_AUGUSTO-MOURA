package br.com.ufg.es.pers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Veiculo {

  @Id
  @GeneratedValue
  private Long id;

  @NotNull
  private String marca;

  @NotNull
  private String modelo;

  @NotNull
  private Integer anoFabricacao;

  @NotNull
  private Integer anoModelo;

  @Min(0)
  @NotNull
  private Integer potenciaMotor;

  public Veiculo() {
  }

  public Veiculo(
      @NotNull String marca,
      @NotNull String modelo,
      @NotNull Integer anoFabricacao,
      @NotNull Integer anoModelo,
      @Min(0) @NotNull Integer potenciaMotor
  ) {
    this.marca = marca;
    this.modelo = modelo;
    this.anoFabricacao = anoFabricacao;
    this.anoModelo = anoModelo;
    this.potenciaMotor = potenciaMotor;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public Integer getAnoFabricacao() {
    return anoFabricacao;
  }

  public void setAnoFabricacao(Integer anoFabricacao) {
    this.anoFabricacao = anoFabricacao;
  }

  public Integer getAnoModelo() {
    return anoModelo;
  }

  public void setAnoModelo(Integer anoModelo) {
    this.anoModelo = anoModelo;
  }

  public Integer getPotenciaMotor() {
    return potenciaMotor;
  }

  public void setPotenciaMotor(Integer potenciaMotor) {
    this.potenciaMotor = potenciaMotor;
  }

  @Override
  public String toString() {
    return "Veiculo{" +
        "id=" + id +
        ", marca='" + marca + '\'' +
        ", modelo='" + modelo + '\'' +
        ", anoFabricacao=" + anoFabricacao +
        ", anoModelo=" + anoModelo +
        ", potenciaMotor=" + potenciaMotor +
        '}';
  }
}
