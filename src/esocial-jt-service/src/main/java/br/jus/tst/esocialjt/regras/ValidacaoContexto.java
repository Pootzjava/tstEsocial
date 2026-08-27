package br.jus.tst.esocialjt.regras;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ValidacaoContexto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private DadosFolhaDTO dadosFolha;
    private List<ValidacaoErroDTO> erros;
    
    public ValidacaoContexto() {
        this.erros = new ArrayList<>();
    }
    
    // Getters e Setters
    public DadosFolhaDTO getDadosFolha() { return dadosFolha; }
    public void setDadosFolha(DadosFolhaDTO dadosFolha) { this.dadosFolha = dadosFolha; }
    
    public List<ValidacaoErroDTO> getErros() { return erros; }
    public void setErros(List<ValidacaoErroDTO> erros) { this.erros = erros; }
}
