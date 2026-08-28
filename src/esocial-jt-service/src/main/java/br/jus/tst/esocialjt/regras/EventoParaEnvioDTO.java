package br.jus.tst.esocialjt.regras;

import java.io.Serializable;

public class EventoParaEnvioDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long idEvento;
    private String tipoEvento;
    private String cpfCnpj;
    private int tentativas;
    private boolean urgente;
    private String competencia;
    
    // Getters e Setters
    public Long getIdEvento() { return idEvento; }
    public void setIdEvento(Long idEvento) { this.idEvento = idEvento; }
    
    public String getTipoEvento() { return tipoEvento; }
    public void setTipoEvento(String tipoEvento) { this.tipoEvento = tipoEvento; }
    
    public String getCpfCnpj() { return cpfCnpj; }
    public void setCpfCnpj(String cpfCnpj) { this.cpfCnpj = cpfCnpj; }
    
    public int getTentativas() { return tentativas; }
    public void setTentativas(int tentativas) { this.tentativas = tentativas; }
    
    public boolean isUrgente() { return urgente; }
    public void setUrgente(boolean urgente) { this.urgente = urgente; }
    
    public String getCompetencia() { return competencia; }
    public void setCompetencia(String competencia) { this.competencia = competencia; }
}
