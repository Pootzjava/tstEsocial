package br.jus.tst.esocialjt.regras;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.negocio.EventoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class RegraNaoHaEventoTabelaEmProcessamento extends Regra {

    @Autowired
    private EventoServico eventoServico;

    @Override
    public List<Regra> regras() {
        Regra regra = new RegraEvento(eventoServico)
                .dosGrupos(GrupoTipoEvento.TABELA)
                .nosEstados(Estado.PROCESSAMENTO)
                .naoExiste();

        return Collections.singletonList(regra);
    }
}
