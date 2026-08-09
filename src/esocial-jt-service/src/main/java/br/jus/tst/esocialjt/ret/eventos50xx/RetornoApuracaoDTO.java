package br.jus.tst.esocialjt.ret.eventos50xx;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO que representa o resultado do processamento de eventos S-50XX.
 * Contém informações consolidadas de apuração para DCTFWeb e FGTS.
 */
public class RetornoApuracaoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String periodoApuracao;
    private RemuneracaoTotalDTO remuneracaoTotal;
    private ContribuicaoTotalDTO contribuicaoTotal;
    private String xmlProcessado;
    private LocalDate dataProcessamento;
    private boolean valido;

    public String getPeriodoApuracao() {
        return remuneracaoTotal != null ? remuneracaoTotal.getPeriodoApuracao() :
               (contribuicaoTotal != null ? contribuicaoTotal.getPeriodoApuracao() : null);
    }

    // Getters e Setters
    public RemuneracaoTotalDTO getRemuneracaoTotal() { return remuneracaoTotal; }
    public void setRemuneracaoTotal(RemuneracaoTotalDTO remuneracaoTotal) { this.remuneracaoTotal = remuneracaoTotal; }

    public ContribuicaoTotalDTO getContribuicaoTotal() { return contribuicaoTotal; }
    public void setContribuicaoTotal(ContribuicaoTotalDTO contribuicaoTotal) { this.contribuicaoTotal = contribuicaoTotal; }

    public String getXmlProcessado() { return xmlProcessado; }
    public void setXmlProcessado(String xmlProcessado) { this.xmlProcessado = xmlProcessado; }

    public LocalDate getDataProcessamento() { return dataProcessamento; }
    public void setDataProcessamento(LocalDate dataProcessamento) { this.dataProcessamento = dataProcessamento; }

    public boolean isValido() { return valido; }
    public void setValido(boolean valido) { this.valido = valido; }
}
