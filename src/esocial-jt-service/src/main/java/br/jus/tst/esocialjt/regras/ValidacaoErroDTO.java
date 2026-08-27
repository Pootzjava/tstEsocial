package br.jus.tst.esocialjt.regras;

import java.io.Serializable;

public class ValidacaoErroDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String tipoErro;
    private String descricao;
    private String severidade; // BAIXA, MEDIA, ALTA, CRITICA
    private String campo;
    private Object valorEncontrado;
    private Object valorEsperado;
    
    // Getters e Setters
    public String getTipoErro() { return tipoErro; }
    public void setTipoErro(String tipoErro) { this.tipoErro = tipoErro; }
    
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    
    public String getSeveridade() { return severidade; }
    public void setSeveridade(String severidade) { this.severidade = severidade; }
    
    public String getCampo() { return campo; }
    public void setCampo(String campo) { this.campo = campo; }
    
    public Object getValorEncontrado() { return valorEncontrado; }
    public void setValorEncontrado(Object valorEncontrado) { this.valorEncontrado = valorEncontrado; }
    
    public Object getValorEsperado() { return valorEsperado; }
    public void setValorEsperado(Object valorEsperado) { this.valorEsperado = valorEsperado; }
}
