//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:14 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.anotjud;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_detReemb_Tot complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_detReemb_Tot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpInsc_1_2"/>
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nrInsc_11_14"/>
 *         &lt;element name="vlrReemb" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
 *         &lt;element name="vlrReembAnt" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_detReemb_Tot", propOrder = {
    "tpInsc",
    "nrInsc",
    "vlrReemb",
    "vlrReembAnt"
})
public class TDetReembTot {

    protected byte tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;
    protected BigDecimal vlrReemb;
    protected BigDecimal vlrReembAnt;

    /**
     * Obtém o valor da propriedade tpInsc.
     * 
     */
    public byte getTpInsc() {
        return tpInsc;
    }

    /**
     * Define o valor da propriedade tpInsc.
     * 
     */
    public void setTpInsc(byte value) {
        this.tpInsc = value;
    }

    /**
     * Obtém o valor da propriedade nrInsc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInsc() {
        return nrInsc;
    }

    /**
     * Define o valor da propriedade nrInsc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInsc(String value) {
        this.nrInsc = value;
    }

    /**
     * Obtém o valor da propriedade vlrReemb.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrReemb() {
        return vlrReemb;
    }

    /**
     * Define o valor da propriedade vlrReemb.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrReemb(BigDecimal value) {
        this.vlrReemb = value;
    }

    /**
     * Obtém o valor da propriedade vlrReembAnt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrReembAnt() {
        return vlrReembAnt;
    }

    /**
     * Define o valor da propriedade vlrReembAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrReembAnt(BigDecimal value) {
        this.vlrReembAnt = value;
    }

}
