package br.jus.tst.esocialjt.dashboard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO simplificado para status de saúde do sistema.
 * Ideal para polling frequente em dashboards em tempo real.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DashboardSaudeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tenantId;
    private Double percentualSucesso;
    private Double percentualErro;
    private String statusSaude; // "SAUDAVEL", "ATENCAO", "CRITICO", "SEM_DADOS"
    private String dataHoraGeracao;
}
