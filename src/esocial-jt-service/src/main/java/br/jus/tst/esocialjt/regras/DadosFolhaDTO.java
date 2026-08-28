package br.jus.tst.esocialjt.regras;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class DadosFolhaDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String cpfTrabalhador;
    private BigDecimal salarioBruto;
    private BigDecimal salarioMinimoVigente;
    private BigDecimal tetoINSS;
    private BigDecimal aliquotaFGTS;
    private BigDecimal baseFGTS;
    private BigDecimal baseIRRF;
    private int dependentes;
    private LocalDate competencia;
    private List<String> vinculosAtivos;
    
    // Getters e Setters
    public String getCpfTrabalhador() { return cpfTrabalhador; }
    public void setCpfTrabalhador(String cpfTrabalhador) { this.cpfTrabalhador = cpfTrabalhador; }
    
    public BigDecimal getSalarioBruto() { return salarioBruto; }
    public void setSalarioBruto(BigDecimal salarioBruto) { this.salarioBruto = salarioBruto; }
    
    public BigDecimal getSalarioMinimoVigente() { return salarioMinimoVigente; }
    public void setSalarioMinimoVigente(BigDecimal salarioMinimoVigente) { this.salarioMinimoVigente = salarioMinimoVigente; }
    
    public BigDecimal getTetoINSS() { return tetoINSS; }
    public void setTetoINSS(BigDecimal tetoINSS) { this.tetoINSS = tetoINSS; }
    
    public BigDecimal getAliquotaFGTS() { return aliquotaFGTS; }
    public void setAliquotaFGTS(BigDecimal aliquotaFGTS) { this.aliquotaFGTS = aliquotaFGTS; }
    
    public BigDecimal getBaseFGTS() { return baseFGTS; }
    public void setBaseFGTS(BigDecimal baseFGTS) { this.baseFGTS = baseFGTS; }
    
    public BigDecimal getBaseIRRF() { return baseIRRF; }
    public void setBaseIRRF(BigDecimal baseIRRF) { this.baseIRRF = baseIRRF; }
    
    public int getDependentes() { return dependentes; }
    public void setDependentes(int dependentes) { this.dependentes = dependentes; }
    
    public LocalDate getCompetencia() { return competencia; }
    public void setCompetencia(LocalDate competencia) { this.competencia = competencia; }
    
    public List<String> getVinculosAtivos() { return vinculosAtivos; }
    public void setVinculosAtivos(List<String> vinculosAtivos) { this.vinculosAtivos = vinculosAtivos; }
}
