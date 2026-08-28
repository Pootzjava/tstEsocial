package br.jus.tst.esocialjt.regras;

import java.io.Serializable;

public class EventoPrioritarioDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long idEvento;
    private String tipoEvento;
    private int prioridade; // 1 (mais alta) a 5 (mais baixa)
    private String justificativa;
    
    // Getters e Setters
    public Long getIdEvento() { return idEvento; }
    public void setIdEvento(Long idEvento) { this.idEvento = idEvento; }
    
    public String getTipoEvento() { return tipoEvento; }
    public void setTipoEvento(String tipoEvento) { this.tipoEvento = tipoEvento; }
    
    public int getPrioridade() { return prioridade; }
    public void setPrioridade(int prioridade) { this.prioridade = prioridade; }
    
    public String getJustificativa() { return justificativa; }
    public void setJustificativa(String justificativa) { this.justificativa = justificativa; }
}
