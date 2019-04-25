package br.com.ufg.es.pers;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

  public static void main(String[] args) {
    final EntityManagerFactory factory = Persistence
        .createEntityManagerFactory("br.com.ufg.es.pers.base");

    final RepositorioVeiculo repositorioVeiculo = new RepositorioVeiculo(factory);

    final Veiculo gol = repositorioVeiculo.cadastrar(new Veiculo(
        "Volks",
        "Gol",
        2010,
        2011,
        200
    ));

    System.out.println("gol: " + gol);

    gol.setPotenciaMotor(300);
    repositorioVeiculo.alterar(gol);

    System.out.println("gol: " + gol);

    final Long idGol = gol.getId();

    System.out.println("persistido: " + repositorioVeiculo.buscarPorId(idGol));

    repositorioVeiculo.excluir(gol);

    System.out.println("consultar: " + repositorioVeiculo.buscarPorId(idGol));
  }
}
