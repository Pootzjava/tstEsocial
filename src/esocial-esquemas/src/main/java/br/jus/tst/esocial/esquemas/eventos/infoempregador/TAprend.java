//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:25 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.infoempregador;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_aprend complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_aprend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indAprend">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cnpjEntQual" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_tpInsc_1_2" minOccurs="0"/>
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_nrInsc_11_14" minOccurs="0"/>
 *         &lt;element name="cnpjPrat" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_aprend", propOrder = {
    "indAprend",
    "cnpjEntQual",
    "tpInsc",
    "nrInsc",
    "cnpjPrat"
})
public class TAprend {

    protected byte indAprend;
    protected String cnpjEntQual;
    protected Byte tpInsc;
    protected String nrInsc;
    protected String cnpjPrat;

    /**
     * Obtém o valor da propriedade indAprend.
     * 
     */
    public byte getIndAprend() {
        return indAprend;
    }

    /**
     * Define o valor da propriedade indAprend.
     * 
     */
    public void setIndAprend(byte value) {
        this.indAprend = value;
    }

    /**
     * Obtém o valor da propriedade cnpjEntQual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjEntQual() {
        return cnpjEntQual;
    }

    /**
     * Define o valor da propriedade cnpjEntQual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjEntQual(String value) {
        this.cnpjEntQual = value;
    }

    /**
     * Obtém o valor da propriedade tpInsc.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTpInsc() {
        return tpInsc;
    }

    /**
     * Define o valor da propriedade tpInsc.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTpInsc(Byte value) {
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
     * Obtém o valor da propriedade cnpjPrat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjPrat() {
        return cnpjPrat;
    }

    /**
     * Define o valor da propriedade cnpjPrat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjPrat(String value) {
        this.cnpjPrat = value;
    }

}
