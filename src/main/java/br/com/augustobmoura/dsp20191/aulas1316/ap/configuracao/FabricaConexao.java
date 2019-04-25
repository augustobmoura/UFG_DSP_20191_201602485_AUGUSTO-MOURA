package br.com.augustobmoura.dsp20191.aulas1316.ap.configuracao;

import java.sql.Connection;

public interface FabricaConexao {
  Connection construirConexao();
}
