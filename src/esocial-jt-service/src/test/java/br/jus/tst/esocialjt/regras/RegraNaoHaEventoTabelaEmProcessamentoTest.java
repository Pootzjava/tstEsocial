package br.jus.tst.esocialjt.regras;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.evento.EventoDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class RegraNaoHaEventoTabelaEmProcessamentoTest {

	@Autowired
	private EntityManager em;

	@Autowired
	private RegraNaoHaEventoTabelaEmProcessamento regra;

	@Test
	public void deveSerVerdadeiroSeNaoExisteEventoTabelaEmProcessamento() {
		Evento eventoEmpregador = new Evento()
				.setTipoEvento(TipoEvento.INFORMACOES_EMPREGADOR)
				.setEstado(Estado.EM_FILA);

		salvar(eventoEmpregador);

		boolean habilitado = regra.habilitado(new EventoDTO());
		assertThat(habilitado).isTrue();
	}

	@Test
	public void deveSerVerdadeiroSeEventoNaoProcessamento() {
		List<Estado> estados = Arrays.asList(
				Estado.EM_FILA,
				Estado.ERRO,
				Estado.PROCESSADO_COM_ERRO,
				Estado.PROCESSADO_COM_SUCESSO);

		estados.forEach(estado -> {
			Evento eventoEmpregador = new Evento()
					.setTipoEvento(TipoEvento.INFORMACOES_EMPREGADOR)
					.setEstado(estado);

			salvar(eventoEmpregador);

			boolean habilitado = regra.habilitado(new EventoDTO());
			assertThat(habilitado).as(estado.getDescricao()).isTrue();
		});
	}

	@Test
	public void deveSerFalsoSeEventoTabelaEmProcessamento() {
		Evento eventoEmpregador = new Evento()
				.setTipoEvento(TipoEvento.INFORMACOES_EMPREGADOR)
				.setEstado(Estado.PROCESSAMENTO);

		salvar(eventoEmpregador);

		boolean habilitado = regra.habilitado(new EventoDTO());
		assertThat(habilitado).isFalse();
	}

	@Test
	public void deveSerVerdadeiroSeExisteOutroEvento() {
		Evento eventoAdmissao = new Evento()
				.setTipoEvento(TipoEvento.ADMISSAO_TRABALHADOR)
				.setEstado(Estado.PROCESSAMENTO);

		salvar(eventoAdmissao);

		boolean habilitado = regra.habilitado(new EventoDTO());
		assertThat(habilitado).isTrue();
	}

	@Test
	public void deveSerTrueSeNaoExisteEventoCadastrado() {
		boolean habilitado = regra.habilitado(new EventoDTO());
		assertThat(habilitado).isTrue();
	}

	@Test
	public void deveSerFalsoSeExisteMultiplosEventosTabelaEmProcessamento() {
		Evento evento1 = new Evento()
				.setTipoEvento(TipoEvento.INFORMACOES_EMPREGADOR)
				.setEstado(Estado.PROCESSAMENTO);

		Evento evento2 = new Evento()
				.setTipoEvento(TipoEvento.TABELA_ESTABELECIMENTO)
				.setEstado(Estado.PROCESSAMENTO);

		salvar(evento1);
		salvar(evento2);

		boolean habilitado = regra.habilitado(new EventoDTO());
		assertThat(habilitado).isFalse();
	}

	private void salvar(Evento evento) {
		em.persist(evento);
	}
}

