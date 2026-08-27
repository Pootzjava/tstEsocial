package br.jt.esocial.dominio.apuracao;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Entidade para armazenar os totais consolidados das apurações S-5010 e S-5020.
 * Permite histórico gerencial sem precisar reprocessar XMLs brutos.
 */
@Entity
@Table(name = "apuracao_esocial", indexes = {
    @Index(name = "idx_apuracao_competencia", columnList = "competencia"),
    @Index(name = "idx_apuracao_tipo", columnList = "tipoEvento")
})
public class ApuracaoEsocial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Competência da apuração (ex: 2024-01)
     */
    @Column(nullable = false)
    private LocalDate competencia;

    /**
     * Tipo do evento de origem (S-5010 ou S-5020)
     */
    @Column(nullable = false, length = 6)
    private String tipoEvento;

    /**
     * Número do Recibo do Evento (nrRecibo no XML)
     */
    @Column(length = 50, unique = true)
    private String numeroRecibo;

    // --- Totais S-5010 (Remuneração) ---

    /**
     * Total de Base de FGTS (ideBenefício != 4)
     */
    @Column(precision = 15, scale = 2)
    private BigDecimal totalBaseFgts = BigDecimal.ZERO;

    /**
     * Total de FGTS Mensal
     */
    @Column(precision = 15, scale = 2)
    private BigDecimal totalFgtsMensal = BigDecimal.ZERO;

    /**
     * Total de Base IRRF
     */
    @Column(precision = 15, scale = 2)
    private BigDecimal totalBaseIrrf = BigDecimal.ZERO;

    /**
     * Total de IRRF Retido
     */
    @Column(precision = 15, scale = 2)
    private BigDecimal totalIrrf = BigDecimal.ZERO;

    /**
     * Total de Base Contribuição Previdenciária
     */
    @Column(precision = 15, scale = 2)
    private BigDecimal totalBaseContribPrev = BigDecimal.ZERO;

    /**
     * Total de Contribuição Previdenciária Patronal
     */
    @Column(precision = 15, scale = 2)
    private BigDecimal totalContribPrevPatronal = BigDecimal.ZERO;

    // --- Totais S-5020 (Contribuição Sindical/Outras) ---

    /**
     * Valor total da contribuição sindical patronal
     */
    @Column(precision = 15, scale = 2)
    private BigDecimal totalContribSindicalPatronal = BigDecimal.ZERO;

    /**
     * Valor total de outras contribuições (ex: RAT/FAP, Terceiros)
     */
    @Column(precision = 15, scale = 2)
    private BigDecimal totalOutrasContribuicoes = BigDecimal.ZERO;

    /**
     * Data/Hora do processamento deste registro
     */
    @Column(nullable = false)
    private LocalDateTime dataProcessamento;

    public ApuracaoEsocial() {
        this.dataProcessamento = LocalDateTime.now();
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getCompetencia() { return competencia; }
    public void setCompetencia(LocalDate competencia) { this.competencia = competencia; }

    public String getTipoEvento() { return tipoEvento; }
    public void setTipoEvento(String tipoEvento) { this.tipoEvento = tipoEvento; }

    public String getNumeroRecibo() { return numeroRecibo; }
    public void setNumeroRecibo(String numeroRecibo) { this.numeroRecibo = numeroRecibo; }

    public BigDecimal getTotalBaseFgts() { return totalBaseFgts; }
    public void setTotalBaseFgts(BigDecimal totalBaseFgts) { this.totalBaseFgts = totalBaseFgts; }

    public BigDecimal getTotalFgtsMensal() { return totalFgtsMensal; }
    public void setTotalFgtsMensal(BigDecimal totalFgtsMensal) { this.totalFgtsMensal = totalFgtsMensal; }

    public BigDecimal getTotalBaseIrrf() { return totalBaseIrrf; }
    public void setTotalBaseIrrf(BigDecimal totalBaseIrrf) { this.totalBaseIrrf = totalBaseIrrf; }

    public BigDecimal getTotalIrrf() { return totalIrrf; }
    public void setTotalIrrf(BigDecimal totalIrrf) { this.totalIrrf = totalIrrf; }

    public BigDecimal getTotalBaseContribPrev() { return totalBaseContribPrev; }
    public void setTotalBaseContribPrev(BigDecimal totalBaseContribPrev) { this.totalBaseContribPrev = totalBaseContribPrev; }

    public BigDecimal getTotalContribPrevPatronal() { return totalContribPrevPatronal; }
    public void setTotalContribPrevPatronal(BigDecimal totalContribPrevPatronal) { this.totalContribPrevPatronal = totalContribPrevPatronal; }

    public BigDecimal getTotalContribSindicalPatronal() { return totalContribSindicalPatronal; }
    public void setTotalContribSindicalPatronal(BigDecimal totalContribSindicalPatronal) { this.totalContribSindicalPatronal = totalContribSindicalPatronal; }

    public BigDecimal getTotalOutrasContribuicoes() { return totalOutrasContribuicoes; }
    public void setTotalOutrasContribuicoes(BigDecimal totalOutrasContribuicoes) { this.totalOutrasContribuicoes = totalOutrasContribuicoes; }

    public LocalDateTime getDataProcessamento() { return dataProcessamento; }
    public void setDataProcessamento(LocalDateTime dataProcessamento) { this.dataProcessamento = dataProcessamento; }
}
