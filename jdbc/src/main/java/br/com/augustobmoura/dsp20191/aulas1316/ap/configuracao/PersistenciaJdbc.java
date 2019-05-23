package br.com.augustobmoura.dsp20191.aulas1316.ap.configuracao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersistenciaJdbc {

  private final FabricaConexao fabricaConexao;

  public PersistenciaJdbc(final FabricaConexao fabricaConexao) {
    this.fabricaConexao = fabricaConexao;
  }

  protected int rodaUpdate(final String sql) throws SQLException {
    try (
        final Connection connection = fabricaConexao.construirConexao();
        final Statement statement = connection.createStatement();
    ) {
      return statement.executeUpdate(sql);
    }
  }

  protected ResultSet rodaQuery(final String sql) throws SQLException {
    try (
        final Connection connection = fabricaConexao.construirConexao();
        final Statement statement = connection.createStatement();
    ) {
      return statement.executeQuery(sql);
    }
  }

}
