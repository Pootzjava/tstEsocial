package br.jus.tst.esocialjt.simulator;

import java.math.BigDecimal;
import java.util.List;

/**
 * DTO de Saída com Resultados da Simulação
 */
public class SimulacaoSaidaDTO {
    private String competencia;
    private BigDecimal totalBruto;
    private BigDecimal inssEmpregado;
    private BigDecimal inssPatronal;
    private BigDecimal irrf;
    private BigDecimal fgts;
    private BigDecimal valorLiquido;
    private BigDecimal dcftfWebEstimada;
    private List<String> alertas;

    public SimulacaoSaidaDTO() {}

    public SimulacaoSaidaDTO(String competencia, BigDecimal totalBruto, BigDecimal inssEmpregado, 
                             BigDecimal inssPatronal, BigDecimal irrf, BigDecimal fgts, 
                             BigDecimal valorLiquido, BigDecimal dcftfWebEstimada, List<String> alertas) {
        this.competencia = competencia;
        this.totalBruto = totalBruto;
        this.inssEmpregado = inssEmpregado;
        this.inssPatronal = inssPatronal;
        this.irrf = irrf;
        this.fgts = fgts;
        this.valorLiquido = valorLiquido;
        this.dcftfWebEstimada = dcftfWebEstimada;
        this.alertas = alertas;
    }

    // Getters e Setters
    public String getCompetencia() { return competencia; }
    public void setCompetencia(String competencia) { this.competencia = competencia; }
    public BigDecimal getTotalBruto() { return totalBruto; }
    public void setTotalBruto(BigDecimal totalBruto) { this.totalBruto = totalBruto; }
    public BigDecimal getInssEmpregado() { return inssEmpregado; }
    public void setInssEmpregado(BigDecimal inssEmpregado) { this.inssEmpregado = inssEmpregado; }
    public BigDecimal getInssPatronal() { return inssPatronal; }
    public void setInssPatronal(BigDecimal inssPatronal) { this.inssPatronal = inssPatronal; }
    public BigDecimal getIrrf() { return irrf; }
    public void setIrrf(BigDecimal irrf) { this.irrf = irrf; }
    public BigDecimal getFgts() { return fgts; }
    public void setFgts(BigDecimal fgts) { this.fgts = fgts; }
    public BigDecimal getValorLiquido() { return valorLiquido; }
    public void setValorLiquido(BigDecimal valorLiquido) { this.valorLiquido = valorLiquido; }
    public BigDecimal getDcftfWebEstimada() { return dcftfWebEstimada; }
    public void setDcftfWebEstimada(BigDecimal dcftfWebEstimada) { this.dcftfWebEstimada = dcftfWebEstimada; }
    public List<String> getAlertas() { return alertas; }
    public void setAlertas(List<String> alertas) { this.alertas = alertas; }
}
