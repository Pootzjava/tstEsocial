package br.jus.tst.esocialjt.simulator;

import java.math.BigDecimal;

/**
 * DTO de Entrada para Simulação de Rubricas
 */
public class RubricaSimulacaoDTO {
    private String codigo;
    private String descricao;
    private BigDecimal valor;
    private String tipo; // SALARIO, PROVENTO, DESCONTO, DEPENDENTE
    private boolean compoeBaseINSS;
    private boolean compoeBaseIRRF;
    private int quantidade; // Para dependentes ou horas

    public RubricaSimulacaoDTO() {}

    public RubricaSimulacaoDTO(String codigo, String descricao, BigDecimal valor, String tipo, boolean compoeBaseINSS, boolean compoeBaseIRRF) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.compoeBaseINSS = compoeBaseINSS;
        this.compoeBaseIRRF = compoeBaseIRRF;
        this.quantidade = 1;
    }

    // Getters e Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public boolean isCompoeBaseINSS() { return compoeBaseINSS; }
    public void setCompoeBaseINSS(boolean compoeBaseINSS) { this.compoeBaseINSS = compoeBaseINSS; }
    public boolean isCompoeBaseIRRF() { return compoeBaseIRRF; }
    public void setCompoeBaseIRRF(boolean compoeBaseIRRF) { this.compoeBaseIRRF = compoeBaseIRRF; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
}
