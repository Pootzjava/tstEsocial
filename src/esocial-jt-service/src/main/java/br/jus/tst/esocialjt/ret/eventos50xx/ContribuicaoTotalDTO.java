package br.jus.tst.esocialjt.ret.eventos50xx;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO com dados consolidados de contribuições (evento S-5020).
 * Informações essenciais para geração da DCTFWeb.
 */
public class ContribuicaoTotalDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String periodoApuracao;
    private BigDecimal valorCPREmpresa;      // Cota Patronal
    private BigDecimal valorCPRSegurado;     // Cota Segurado
    private BigDecimal valorTerceiros;       // Outras entidades
    private BigDecimal valorGILRAT;          // GIL / RAT / FAP
    private BigDecimal valorSuspContrib;     // Contribuições suspensas
    private BigDecimal valorDeclaradoDCTFWeb;

    // Getters e Setters
    public String getPeriodoApuracao() { return periodoApuracao; }
    public void setPeriodoApuracao(String periodoApuracao) { this.periodoApuracao = periodoApuracao; }

    public BigDecimal getValorCPREmpresa() { return valorCPREmpresa; }
    public void setValorCPREmpresa(BigDecimal valorCPREmpresa) { this.valorCPREmpresa = valorCPREmpresa; }

    public BigDecimal getValorCPRSegurado() { return valorCPRSegurado; }
    public void setValorCPRSegurado(BigDecimal valorCPRSegurado) { this.valorCPRSegurado = valorCPRSegurado; }

    public BigDecimal getValorTerceiros() { return valorTerceiros; }
    public void setValorTerceiros(BigDecimal valorTerceiros) { this.valorTerceiros = valorTerceiros; }

    public BigDecimal getValorGILRAT() { return valorGILRAT; }
    public void setValorGILRAT(BigDecimal valorGILRAT) { this.valorGILRAT = valorGILRAT; }

    public BigDecimal getValorSuspContrib() { return valorSuspContrib; }
    public void setValorSuspContrib(BigDecimal valorSuspContrib) { this.valorSuspContrib = valorSuspContrib; }

    public BigDecimal getValorDeclaradoDCTFWeb() { return valorDeclaradoDCTFWeb; }
    public void setValorDeclaradoDCTFWeb(BigDecimal valorDeclaradoDCTFWeb) { this.valorDeclaradoDCTFWeb = valorDeclaradoDCTFWeb; }
}
