package br.jus.tst.esocialjt.webhook;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Entidade que representa um webhook configurado para notificações assíncronas.
 */
@Entity
@Table(name = "webhook")
public class Webhook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 500)
    private String url;

    @Column(length = 200)
    private String descricao;

    @ElementCollection
    @CollectionTable(name = "webhook_eventos", joinColumns = @JoinColumn(name = "webhook_id"))
    @Column(name = "evento")
    private List<String> eventos;

    @Column(nullable = false)
    private Boolean ativo = true;

    @Column(name = "secret_key", nullable = false, length = 100)
    private String secretKey;

    @Column(name = "tenant_id", nullable = false, length = 50)
    private String tenantId;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    @Column(name = "ultimas_tentativas", columnDefinition = "jsonb")
    private String ultimasTentativas = "[]";

    // Construtores
    public Webhook() {
        this.dataCriacao = LocalDateTime.now();
        this.dataAtualizacao = LocalDateTime.now();
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public List<String> getEventos() { return eventos; }
    public void setEventos(List<String> eventos) { this.eventos = eventos; }

    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }

    public String getSecretKey() { return secretKey; }
    public void setSecretKey(String secretKey) { this.secretKey = secretKey; }

    public String getTenantId() { return tenantId; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }

    public LocalDateTime getDataCriacao() { return dataCriacao; }
    public void setDataCriacao(LocalDateTime dataCriacao) { this.dataCriacao = dataCriacao; }

    public LocalDateTime getDataAtualizacao() { return dataAtualizacao; }
    public void setDataAtualizacao(LocalDateTime dataAtualizacao) { this.dataAtualizacao = dataAtualizacao; }

    public String getUltimasTentativas() { return ultimasTentativas; }
    public void setUltimasTentativas(String ultimasTentativas) { this.ultimasTentativas = ultimasTentativas; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Webhook)) return false;
        Webhook webhook = (Webhook) o;
        return id != null && id.equals(webhook.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
