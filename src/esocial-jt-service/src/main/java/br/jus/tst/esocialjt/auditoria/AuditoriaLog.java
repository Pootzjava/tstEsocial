package br.jus.tst.esocialjt.auditoria;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;

@Entity
@Table(name = "auditoria_log", indexes = {
    @Index(name = "idx_auditoria_usuario", columnList = "usuario"),
    @Index(name = "idx_auditoria_data", columnList = "timestamp"),
    @Index(name = "idx_auditoria_entidade", columnList = "entidade")
})
public class AuditoriaLog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auditoria_seq")
    @SequenceGenerator(name = "auditoria_seq", sequenceName = "auditoria_seq", allocationSize = 1)
    private Long id;

    @Column(nullable = false, length = 100)
    private String usuario;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private AcaoAuditoria acao;

    @Column(nullable = false, length = 100)
    private String entidade;

    @Column(length = 50)
    private String entidadeId;

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private String dadosAntigos;

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private String dadosNovos;

    @Column(length = 45)
    private String ipOrigem;

    @Column(length = 500)
    private String userAgent;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Column(length = 20)
    private String tenantId;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public AcaoAuditoria getAcao() { return acao; }
    public void setAcao(AcaoAuditoria acao) { this.acao = acao; }

    public String getEntidade() { return entidade; }
    public void setEntidade(String entidade) { this.entidade = entidade; }

    public String getEntidadeId() { return entidadeId; }
    public void setEntidadeId(String entidadeId) { this.entidadeId = entidadeId; }

    public String getDadosAntigos() { return dadosAntigos; }
    public void setDadosAntigos(String dadosAntigos) { this.dadosAntigos = dadosAntigos; }

    public String getDadosNovos() { return dadosNovos; }
    public void setDadosNovos(String dadosNovos) { this.dadosNovos = dadosNovos; }

    public String getIpOrigem() { return ipOrigem; }
    public void setIpOrigem(String ipOrigem) { this.ipOrigem = ipOrigem; }

    public String getUserAgent() { return userAgent; }
    public void setUserAgent(String userAgent) { this.userAgent = userAgent; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public String getTenantId() { return tenantId; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
}
