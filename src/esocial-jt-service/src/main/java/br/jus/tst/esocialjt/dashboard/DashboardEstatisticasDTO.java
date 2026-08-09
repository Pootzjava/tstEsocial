package br.jus.tst.esocialjt.dashboard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO para estatísticas consolidadas do dashboard por tenant.
 * Fornece visão gerencial completa do status dos eventos eSocial.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DashboardEstatisticasDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    // Identificação do Tenant
    private String tenantId;
    private String cnpjEmpregador;
    private String razaoSocial;

    // Totais Gerais de Eventos
    private Long totalEventos;
    private Long totalEventosEmFila;
    private Long totalEventosEmProcessamento;
    private Long totalEventosSucesso;
    private Long totalEventosErro;
    private Long totalEventosProcessadoComErro;

    // Totais por Grupo de Evento
    private Long totalEventosTabela;        // Grupo 1
    private Long totalEventosNaoPeriodico;  // Grupo 2
    private Long totalEventosPeriodico;     // Grupo 3

    // Totais por Tipo de Evento (principais)
    private Long totalEvento1000;  // Informações do Empregador
    private Long totalEvento1010;  // Tabela de Rubricas
    private Long totalEvento2200;  // Admissão de Trabalhador
    private Long totalEvento2300;  // Alteração Cadastral
    private Long totalEvento2400;  // Afastamento Temporário
    private Long totalEvento2500;  // Desligamento
    private Long totalEventoS5000; // Fechamento das Remunerações
    private Long totalEventoS5010; // Apuração de Contribuição Previdenciária
    private Long totalEventoS5020; // Apuração de Contribuição Previdenciária - Entidades Públicas

    // Lotes
    private Long totalLotes;
    private Long totalLotesEmProcessamento;
    private Long totalLotesSucesso;
    private Long totalLotesErro;

    // Retornos S-50XX (Apurações)
    private Long totalRetornosS5010;
    private Long totalRetornosS5020;
    private Double valorTotalFGTS;
    private Double valorTotalIRRF;
    private Double valorTotalContribuicaoPrevidenciaria;

    // Certificados
    private Boolean certificadoAtivo;
    private Integer diasParaVencimentoCertificado;
    private String numeroSerieCertificado;

    // Indicadores de Saúde do Sistema
    private Double percentualSucesso;
    private Double percentualErro;
    private String statusSaude; // "SAUDAVEL", "ATENCAO", "CRITICO"

    // Timestamp da geração
    private String dataHoraGeracao;
}
