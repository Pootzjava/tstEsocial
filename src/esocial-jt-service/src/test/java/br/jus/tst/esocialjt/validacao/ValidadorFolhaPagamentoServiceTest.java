package br.jus.tst.esocialjt.validacao;

import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorFolhaPagamentoServiceTest {

    @InjectMocks
    private ValidadorFolhaPagamentoService validadorService;

    @Mock
    private ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        // Inicializa o ObjectMapper real para os testes funcionais
        validadorService = new ValidadorFolhaPagamentoService(new ObjectMapper());
    }

    @Test
    void deveRetornarErroQuandoSalarioAbaixoDoMinimo() throws Exception {
        // Arrange: Evento S-1200 com salário abaixo do mínimo
        String jsonEvento = """
            {
                "evtRemun": {
                    "dmDev": {
                        "ideDmDev": {
                            "vrUnitario": 800.00,
                            "qtdRubr": 1,
                            "vrRubr": 800.00
                        }
                    }
                }
            }
            """;

        Evento evento = criarEventoS1200(jsonEvento);

        // Act
        List<ResultadoValidacaoDTO> resultados = validadorService.validarEventos(List.of(evento));

        // Assert
        assertFalse(resultados.isEmpty());
        assertTrue(resultados.stream()
                .anyMatch(r -> r.getCodigoErro().equals("SALARIO_ABAIXO_MINIMO")));
    }

    @Test
    void deveRetornarAvisoQuandoBaseAcimaTetoINSS() throws Exception {
        // Arrange: Evento S-1200 com base acima do teto
        String jsonEvento = """
            {
                "evtRemun": {
                    "dmDev": {
                        "ideDmDev": {
                            "vrUnitario": 9000.00,
                            "qtdRubr": 1,
                            "vrRubr": 9000.00,
                            "baseCalc": 9000.00
                        }
                    }
                }
            }
            """;

        Evento evento = criarEventoS1200(jsonEvento);

        // Act
        List<ResultadoValidacaoDTO> resultados = validadorService.validarEventos(List.of(evento));

        // Assert
        assertTrue(resultados.stream()
                .anyMatch(r -> r.getCodigoErro().equals("BASE_ACIMA_TETO") && 
                              r.getTipo() == ResultadoValidacaoDTO.TipoValidacao.AVISO));
    }

    @Test
    void deveRetornarErroQuandoInconsistenciaRemuneracao() throws Exception {
        // Arrange: Evento S-1200 com inconsistência (unitário * qtd != total)
        String jsonEvento = """
            {
                "evtRemun": {
                    "dmDev": {
                        "ideDmDev": {
                            "vrUnitario": 1000.00,
                            "qtdRubr": 2,
                            "vrRubr": 1500.00
                        }
                    }
                }
            }
            """;

        Evento evento = criarEventoS1200(jsonEvento);

        // Act
        List<ResultadoValidacaoDTO> resultados = validadorService.validarEventos(List.of(evento));

        // Assert
        assertTrue(resultados.stream()
                .anyMatch(r -> r.getCodigoErro().equals("INCONSISTENCIA_REMUNERACAO")));
    }

    @Test
    void deveValidarDesligimentoSemReciboExtincao() throws Exception {
        // Arrange: Evento S-2299 sem número de recibo
        String jsonEvento = """
            {
                "evtDeslig": {
                    "infoDeslig": {
                        "nrRecExt": ""
                    }
                }
            }
            """;

        Evento evento = criarEvento("S-2299", jsonEvento);

        // Act
        List<ResultadoValidacaoDTO> resultados = validadorService.validarEventos(List.of(evento));

        // Assert
        assertTrue(resultados.stream()
                .anyMatch(r -> r.getCodigoErro().equals("SEM_RECIBO_EXTINCAO") &&
                              r.getTipo() == ResultadoValidacaoDTO.TipoValidacao.AVISO));
    }

    @Test
    void deveRetornarListaVaziaQuandoDadosValidos() throws Exception {
        // Arrange: Evento S-1200 com dados consistentes
        String jsonEvento = """
            {
                "evtRemun": {
                    "dmDev": {
                        "ideDmDev": {
                            "vrUnitario": 2000.00,
                            "qtdRubr": 1,
                            "vrRubr": 2000.00,
                            "baseCalc": 2000.00
                        }
                    }
                }
            }
            """;

        Evento evento = criarEventoS1200(jsonEvento);

        // Act
        List<ResultadoValidacaoDTO> resultados = validadorService.validarEventos(List.of(evento));

        // Assert: Não deve haver erros críticos (pode ter avisos)
        long erros = resultados.stream()
                .filter(r -> r.getTipo() == ResultadoValidacaoDTO.TipoValidacao.ERRO)
                .count();
        
        assertEquals(0, erros);
    }

    private Evento criarEventoS1200(String dadosEvento) {
        return criarEvento("S-1200", dadosEvento);
    }

    private Evento criarEvento(String tipoEventoCodigo, String dadosEvento) {
        Evento evento = new Evento();
        evento.setId(1L);
        
        TipoEvento tipoEvento = new TipoEvento();
        tipoEvento.setCodigo(tipoEventoCodigo);
        evento.setTipoEvento(tipoEvento);
        
        evento.setDadosEvento(dadosEvento);
        
        return evento;
    }
}
