package br.jus.tst.esocialjt.regras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RegraEventosTabela extends Regra {

    @Autowired
    private RegraEmpregadorCadastrado regraEmpregadorCadastrado;

    @Autowired
    private RegraNaoHaEventoTabelaEmProcessamento regraNaoHaEventoTabelaEmProcessamento;

    @Override
    public List<Regra> regras() {
        return Arrays.asList(regraEmpregadorCadastrado, regraNaoHaEventoTabelaEmProcessamento);
    }
}
