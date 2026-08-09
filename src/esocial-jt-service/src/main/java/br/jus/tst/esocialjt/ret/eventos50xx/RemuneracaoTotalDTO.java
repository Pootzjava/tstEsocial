package br.jus.tst.esocialjt.ret.eventos50xx;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * DTO com dados consolidados de remuneração (evento S-5010).
 */
public class RemuneracaoTotalDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String periodoApuracao;
    private LocalDate periodoApuracaoFormatado;
    private BigDecimal valorRemuneracaoBruta;
    private BigDecimal valorRemuneracaoLiquida;
    private BigDecimal valorFGTS;
    private BigDecimal valorBaseIRRF;
    private BigDecimal valorIRRF;

    // Getters e Setters
    public String getPeriodoApuracao() { return periodoApuracao; }
    public void setPeriodoApuracao(String periodoApuracao) { this.periodoApuracao = periodoApuracao; }

    public LocalDate getPeriodoApuracaoFormatado() { return periodoApuracaoFormatado; }
    public void setPeriodoApuracaoFormatado(LocalDate periodoApuracaoFormatado) { this.periodoApuracaoFormatado = periodoApuracaoFormatado; }

    public BigDecimal getValorRemuneracaoBruta() { return valorRemuneracaoBruta; }
    public void setValorRemuneracaoBruta(BigDecimal valorRemuneracaoBruta) { this.valorRemuneracaoBruta = valorRemuneracaoBruta; }

    public BigDecimal getValorRemuneracaoLiquida() { return valorRemuneracaoLiquida; }
    public void setValorRemuneracaoLiquida(BigDecimal valorRemuneracaoLiquida) { this.valorRemuneracaoLiquida = valorRemuneracaoLiquida; }

    public BigDecimal getValorFGTS() { return valorFGTS; }
    public void setValorFGTS(BigDecimal valorFGTS) { this.valorFGTS = valorFGTS; }

    public BigDecimal getValorBaseIRRF() { return valorBaseIRRF; }
    public void setValorBaseIRRF(BigDecimal valorBaseIRRF) { this.valorBaseIRRF = valorBaseIRRF; }

    public BigDecimal getValorIRRF() { return valorIRRF; }
    public void setValorIRRF(BigDecimal valorIRRF) { this.valorIRRF = valorIRRF; }
}
