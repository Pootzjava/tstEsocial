package br.jus.tst.esocialjt.multitenant;

import java.time.LocalDateTime;

/**
 * DTO para informações do certificado digital.
 * 
 * @author eSocial-JT
 */
public class TenantCertificadoDTO {

    private Long id;
    private String nomeCertificado;
    private TenantCertificado.TipoCertificado tipoCertificado;
    private String numeroSerie;
    private LocalDateTime dataValidade;
    private boolean ativo;
    private LocalDateTime criadoEm;
    private LocalDateTime modificadoEm;

    public TenantCertificadoDTO() {
    }

    public TenantCertificadoDTO(Long id, String nomeCertificado, TenantCertificado.TipoCertificado tipoCertificado,
                                String numeroSerie, LocalDateTime dataValidade, boolean ativo,
                                LocalDateTime criadoEm, LocalDateTime modificadoEm) {
        this.id = id;
        this.nomeCertificado = nomeCertificado;
        this.tipoCertificado = tipoCertificado;
        this.numeroSerie = numeroSerie;
        this.dataValidade = dataValidade;
        this.ativo = ativo;
        this.criadoEm = criadoEm;
        this.modificadoEm = modificadoEm;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCertificado() {
        return nomeCertificado;
    }

    public void setNomeCertificado(String nomeCertificado) {
        this.nomeCertificado = nomeCertificado;
    }

    public TenantCertificado.TipoCertificado getTipoCertificado() {
        return tipoCertificado;
    }

    public void setTipoCertificado(TenantCertificado.TipoCertificado tipoCertificado) {
        this.tipoCertificado = tipoCertificado;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public LocalDateTime getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDateTime dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
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

    /**
     * Verifica se o certificado está vencido.
     */
    public boolean isVencido() {
        return dataValidade != null && dataValidade.isBefore(LocalDateTime.now());
    }

    /**
     * Retorna dias restantes até o vencimento.
     */
    public Long getDiasRestantesVencimento() {
        if (dataValidade == null) {
            return null;
        }
        long dias = java.time.temporal.ChronoUnit.DAYS.between(LocalDateTime.now(), dataValidade);
        return dias >= 0 ? dias : 0;
    }
}
