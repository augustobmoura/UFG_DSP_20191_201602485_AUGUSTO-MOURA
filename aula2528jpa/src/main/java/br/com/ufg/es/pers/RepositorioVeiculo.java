package br.com.ufg.es.pers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.function.Function;

public class RepositorioVeiculo {

  private final EntityManagerFactory entityManagerFactory;

  private final EntityManager em;

  public RepositorioVeiculo(final EntityManagerFactory entityManagerFactory) {
    this.entityManagerFactory = entityManagerFactory;
    this.em = entityManagerFactory.createEntityManager();
  }

  private <T> T inTransaction(final Function<EntityTransaction, T> fn) {
    final EntityManager entityManager = entityManagerFactory.createEntityManager();
    final EntityTransaction tr = entityManager.getTransaction();

    try {
      tr.begin();
      final T res = fn.apply(tr);
      tr.commit();

      return res;
    } catch (Throwable e) {
      tr.rollback();
      throw new RuntimeException(e);
    }
  }

  public Veiculo cadastrar(final Veiculo veiculo) {
    return inTransaction(tr -> {
      em.persist(veiculo);
      return veiculo;
    });
  }

  public Veiculo alterar(final Veiculo veiculo) {
    return inTransaction(tr -> em.merge(veiculo));
  }

  public void excluir(final Veiculo veiculo) {
    inTransaction(tr -> {
      em.remove(veiculo);
      return null;
    });
  }

  public Veiculo buscarPorId(final Long id) {
    return inTransaction(tr -> em.find(Veiculo.class, id));
  }

}
