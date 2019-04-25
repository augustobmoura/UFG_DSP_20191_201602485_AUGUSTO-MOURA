package br.com.augustobmoura.dsp20191.aulas1316.ap.configuracao.ddl;

import br.com.augustobmoura.dsp20191.aulas1316.ap.configuracao.FabricaConexao;
import br.com.augustobmoura.dsp20191.aulas1316.ap.configuracao.PersistenciaJdbc;

public class CriaTabelas extends PersistenciaJdbc {
  public CriaTabelas(final FabricaConexao fabricaConexao) {
    super(fabricaConexao);
  }

  public void criaTabelaCargo() {
  }
}
