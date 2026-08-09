package br.jus.tst.esocialjt.dashboard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * DTO para histórico mensal de apurações do dashboard.
 * Exibe evolução de FGTS, IRRF e Contribuição Previdenciária ao longo dos meses.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DashboardHistoricoApuracaoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tenantId;
    private List<HistoricoMensalDTO> historicoMensal;
    private Double totalGeralFGTS;
    private Double totalGeralIRRF;
    private Double totalGeralContribuicaoPrevidenciaria;
    private Integer quantidadeMesesAnalisados;
    private String periodoInicio;
    private String periodoFim;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class HistoricoMensalDTO implements Serializable {
        private String competencia; // MM/YYYY
        private Double valorFGTS;
        private Double valorIRRF;
        private Double valorContribuicaoPrevidenciaria;
        private Double valorDCTFWeb;
        private Long quantidadeEventosS5010;
        private Long quantidadeEventosS5020;
        private LocalDate dataProcessamento;
    }
}
