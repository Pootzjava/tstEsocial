package br.jus.tst.esocialjt.multitenant;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Base64;

/**
 * Entidade que armazena os certificados digitais por tenant.
 * 
 * Estratégia: Schema-per-tenant, então cada schema terá sua própria tabela tenant_certificado.
 * 
 * @author eSocial-JT
 */
@Entity
@Table(name = "tenant_certificado")
public class TenantCertificado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tenant_id", nullable = false, length = 100, unique = true)
    private String tenantId;

    @Column(name = "nome_certificado", nullable = false, length = 200)
    private String nomeCertificado;

    @Column(name = "tipo_certificado", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private TipoCertificado tipoCertificado;

    @Column(name = "conteudo_certificado", columnDefinition = "BYTEA")
    private byte[] conteudoCertificado;

    @Column(name = "senha_criptografada", nullable = false, length = 512)
    private String senhaCriptografada;

    @Column(name = "data_validade")
    private LocalDateTime dataValidade;

    @Column(name = "numero_serie", length = 100)
    private String numeroSerie;

    @Column(name = "ativo", nullable = false)
    private boolean ativo = true;

    @Column(name = "observacoes", columnDefinition = "TEXT")
    private String observacoes;

    @Column(name = "criado_em", nullable = false, updatable = false)
    private LocalDateTime criadoEm;

    @Column(name = "modificado_em")
    private LocalDateTime modificadoEm;

    public enum TipoCertificado {
        A1_ARQUIVO("A1", "Arquivo PKCS#12 (.pfx/.p12)"),
        A3_TOKEN("A3-TOKEN", "Token USB (PKCS#11)"),
        A3_CARTAO("A3-CARTÃO", "Cartão Inteligente (PKCS#11)"),
        A1_NUVEM("A1-NUVEM", "Certificado em nuvem HSM");

        private final String codigo;
        private final String descricao;

        TipoCertificado(String codigo, String descricao) {
            this.codigo = codigo;
            this.descricao = descricao;
        }

        public String getCodigo() {
            return codigo;
        }

        public String getDescricao() {
            return descricao;
        }
    }

    // Construtores
    public TenantCertificado() {
    }

    public TenantCertificado(String tenantId, String nomeCertificado, TipoCertificado tipoCertificado) {
        this.tenantId = tenantId;
        this.nomeCertificado = nomeCertificado;
        this.tipoCertificado = tipoCertificado;
        this.criadoEm = LocalDateTime.now();
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getNomeCertificado() {
        return nomeCertificado;
    }

    public void setNomeCertificado(String nomeCertificado) {
        this.nomeCertificado = nomeCertificado;
    }

    public TipoCertificado getTipoCertificado() {
        return tipoCertificado;
    }

    public void setTipoCertificado(TipoCertificado tipoCertificado) {
        this.tipoCertificado = tipoCertificado;
    }

    public byte[] getConteudoCertificado() {
        return conteudoCertificado != null ? Arrays.copyOf(conteudoCertificado, conteudoCertificado.length) : null;
    }

    public void setConteudoCertificado(byte[] conteudoCertificado) {
        this.conteudoCertificado = conteudoCertificado != null ? Arrays.copyOf(conteudoCertificado, conteudoCertificado.length) : null;
    }

    public String getSenhaCriptografada() {
        return senhaCriptografada;
    }

    public void setSenhaCriptografada(String senhaCriptografada) {
        this.senhaCriptografada = senhaCriptografada;
    }

    public LocalDateTime getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDateTime dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public LocalDateTime getModificadoEm() {
        return modificadoEm;
    }

    public void setModificadoEm(LocalDateTime modificadoEm) {
        this.modificadoEm = modificadoEm;
    }

    // Métodos utilitários
    @PrePersist
    protected void prePersist() {
        if (criadoEm == null) {
            criadoEm = LocalDateTime.now();
        }
        modificadoEm = LocalDateTime.now();
    }

    @PreUpdate
    protected void preUpdate() {
        modificadoEm = LocalDateTime.now();
    }

    /**
     * Retorna o conteúdo do certificado em Base64 para transmissão segura via API.
     */
    public String getConteudoBase64() {
        return conteudoCertificado != null ? Base64.getEncoder().encodeToString(conteudoCertificado) : null;
    }

    /**
     * Define o conteúdo do certificado a partir de uma string Base64.
     */
    public void setConteudoBase64(String base64Content) {
        if (base64Content != null && !base64Content.isEmpty()) {
            this.conteudoCertificado = Base64.getDecoder().decode(base64Content);
        } else {
            this.conteudoCertificado = null;
        }
    }

    @Override
    public String toString() {
        return "TenantCertificado{" +
                "id=" + id +
                ", tenantId='" + tenantId + '\'' +
                ", nomeCertificado='" + nomeCertificado + '\'' +
                ", tipoCertificado=" + tipoCertificado +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", ativo=" + ativo +
                ", dataValidade=" + dataValidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TenantCertificado that = (TenantCertificado) o;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
