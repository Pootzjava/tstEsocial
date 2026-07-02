//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:21 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.deslig;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_ideEstabLot_infoPerAnt complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_ideEstabLot_infoPerAnt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}TS_tpInsc_EstabLot"/>
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}TS_nrInsc_EstabLot"/>
 *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}TS_codLotacao"/>
 *         &lt;element name="detVerbas" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}T_detVerbas" maxOccurs="200"/>
 *         &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}T_infoAgNocivo" minOccurs="0"/>
 *         &lt;element name="infoSimples" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}T_infoSimples_S-2299" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideEstabLot_infoPerAnt", propOrder = {
    "tpInsc",
    "nrInsc",
    "codLotacao",
    "detVerbas",
    "infoAgNocivo",
    "infoSimples"
})
public class TIdeEstabLotInfoPerAnt {

    protected byte tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;
    @XmlElement(required = true)
    protected String codLotacao;
    @XmlElement(required = true)
    protected List<TDetVerbas> detVerbas;
    protected TInfoAgNocivo infoAgNocivo;
    protected TInfoSimplesS2299 infoSimples;

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
     * Obtém o valor da propriedade codLotacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLotacao() {
        return codLotacao;
    }

    /**
     * Define o valor da propriedade codLotacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLotacao(String value) {
        this.codLotacao = value;
    }

    /**
     * Gets the value of the detVerbas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detVerbas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetVerbas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDetVerbas }
     * 
     * 
     */
    public List<TDetVerbas> getDetVerbas() {
        if (detVerbas == null) {
            detVerbas = new ArrayList<TDetVerbas>();
        }
        return this.detVerbas;
    }

    /**
     * Obtém o valor da propriedade infoAgNocivo.
     * 
     * @return
     *     possible object is
     *     {@link TInfoAgNocivo }
     *     
     */
    public TInfoAgNocivo getInfoAgNocivo() {
        return infoAgNocivo;
    }

    /**
     * Define o valor da propriedade infoAgNocivo.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoAgNocivo }
     *     
     */
    public void setInfoAgNocivo(TInfoAgNocivo value) {
        this.infoAgNocivo = value;
    }

    /**
     * Obtém o valor da propriedade infoSimples.
     * 
     * @return
     *     possible object is
     *     {@link TInfoSimplesS2299 }
     *     
     */
    public TInfoSimplesS2299 getInfoSimples() {
        return infoSimples;
    }

    /**
     * Define o valor da propriedade infoSimples.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoSimplesS2299 }
     *     
     */
    public void setInfoSimples(TInfoSimplesS2299 value) {
        this.infoSimples = value;
    }

}
