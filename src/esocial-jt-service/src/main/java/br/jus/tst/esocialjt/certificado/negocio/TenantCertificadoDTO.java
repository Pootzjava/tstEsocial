package br.jus.tst.esocialjt.certificado.negocio;

import java.io.Serializable;

/**
 * DTO para armazenar dados do certificado digital de um tenant.
 * Em produção, esta classe deve ser mapeada como entidade JPA.
 */
public class TenantCertificadoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String tenantId;
    private byte[] conteudoCertificado;
    private String senhaCertificado;
    private String tipoCertificado = "pkcs12";
    private String aliasCertificado;
    private String caminhoArquivo; // Para certificados A3 (arquivo físico)
    private String caminhoCacerts;
    private String senhaCacerts = "changeit";
    private String dataValidade;
    private boolean ativo = true;

    public TenantCertificadoDTO() {
    }

    public boolean temCertificadoValido() {
        return ativo && 
               conteudoCertificado != null && 
               conteudoCertificado.length > 0 &&
               senhaCertificado != null && !senhaCertificado.isEmpty();
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTenantId() { return tenantId; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }

    public byte[] getConteudoCertificado() { return conteudoCertificado; }
    public void setConteudoCertificado(byte[] conteudoCertificado) { this.conteudoCertificado = conteudoCertificado; }

    public String getSenhaCertificado() { return senhaCertificado; }
    public void setSenhaCertificado(String senhaCertificado) { this.senhaCertificado = senhaCertificado; }

    public String getTipoCertificado() { return tipoCertificado; }
    public void setTipoCertificado(String tipoCertificado) { this.tipoCertificado = tipoCertificado; }

    public String getAliasCertificado() { return aliasCertificado; }
    public void setAliasCertificado(String aliasCertificado) { this.aliasCertificado = aliasCertificado; }

    public String getCaminhoArquivo() { return caminhoArquivo; }
    public void setCaminhoArquivo(String caminhoArquivo) { this.caminhoArquivo = caminhoArquivo; }

    public String getCaminhoCacerts() { return caminhoCacerts; }
    public void setCaminhoCacerts(String caminhoCacerts) { this.caminhoCacerts = caminhoCacerts; }

    public String getSenhaCacerts() { return senhaCacerts; }
    public void setSenhaCacerts(String senhaCacerts) { this.senhaCacerts = senhaCacerts; }

    public String getDataValidade() { return dataValidade; }
    public void setDataValidade(String dataValidade) { this.dataValidade = dataValidade; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }
}
