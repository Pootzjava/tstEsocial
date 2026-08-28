package br.jus.tst.esocialjt.connector;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "con_integracao")
public class IntegracaoConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sistemaOrigem;

    @Column(nullable = false)
    private String sistemaDestino;

    @Column(columnDefinition = "JSONB")
    private String mapeamentoCampos;

    @Column(columnDefinition = "JSONB")
    private String transformacoes;

    @Enumerated(EnumType.STRING)
    private StatusIntegracao status;

    private LocalDateTime ultimaExecucao;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSistemaOrigem() { return sistemaOrigem; }
    public void setSistemaOrigem(String sistemaOrigem) { this.sistemaOrigem = sistemaOrigem; }
    public String getSistemaDestino() { return sistemaDestino; }
    public void setSistemaDestino(String sistemaDestino) { this.sistemaDestino = sistemaDestino; }
    public String getMapeamentoCampos() { return mapeamentoCampos; }
    public void setMapeamentoCampos(String mapeamentoCampos) { this.mapeamentoCampos = mapeamentoCampos; }
    public String getTransformacoes() { return transformacoes; }
    public void setTransformacoes(String transformacoes) { this.transformacoes = transformacoes; }
    public StatusIntegracao getStatus() { return status; }
    public void setStatus(StatusIntegracao status) { this.status = status; }
    public LocalDateTime getUltimaExecucao() { return ultimaExecucao; }
    public void setUltimaExecucao(LocalDateTime ultimaExecucao) { this.ultimaExecucao = ultimaExecucao; }

    public enum StatusIntegracao {
        ATIVO, INATIVO, ERRO
    }
}
