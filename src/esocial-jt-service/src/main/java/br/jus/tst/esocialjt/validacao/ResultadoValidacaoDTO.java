package br.jus.tst.esocialjt.validacao;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para resultado de validações de folha de pagamento.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultadoValidacaoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idEvento;
    private String tipoEvento;
    private String codigoErro;
    private String descricao;
    private TipoValidacao tipo;
    private LocalDateTime dataValidacao;

    public enum TipoValidacao {
        ERRO,
        AVISO,
        SUCESSO
    }

    public static ResultadoValidacaoDTO erro(Long idEvento, String tipoEvento, String codigoErro, String descricao) {
        return ResultadoValidacaoDTO.builder()
                .idEvento(idEvento)
                .tipoEvento(tipoEvento)
                .codigoErro(codigoErro)
                .descricao(descricao)
                .tipo(TipoValidacao.ERRO)
                .dataValidacao(LocalDateTime.now())
                .build();
    }

    public static ResultadoValidacaoDTO aviso(Long idEvento, String tipoEvento, String codigoErro, String descricao) {
        return ResultadoValidacaoDTO.builder()
                .idEvento(idEvento)
                .tipoEvento(tipoEvento)
                .codigoErro(codigoErro)
                .descricao(descricao)
                .tipo(TipoValidacao.AVISO)
                .dataValidacao(LocalDateTime.now())
                .build();
    }

    public static ResultadoValidacaoDTO sucesso(Long idEvento, String tipoEvento) {
        return ResultadoValidacaoDTO.builder()
                .idEvento(idEvento)
                .tipoEvento(tipoEvento)
                .codigoErro(null)
                .descricao("Validação realizada com sucesso")
                .tipo(TipoValidacao.SUCESSO)
                .dataValidacao(LocalDateTime.now())
                .build();
    }
}
