//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:21 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.deslig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_detVerbas_descFolha complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_detVerbas_descFolha">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}T_detVerbas">
 *       &lt;sequence>
 *         &lt;element name="descFolha" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpDesc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}TS_tpDesc"/>
 *                   &lt;element name="instFinanc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}TS_instFinanc"/>
 *                   &lt;element name="nrDoc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}TS_nrDoc"/>
 *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}TS_observacao" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_detVerbas_descFolha", propOrder = {
    "descFolha"
})
public class TDetVerbasDescFolha
    extends TDetVerbas
{

    protected TDetVerbasDescFolha.DescFolha descFolha;

    /**
     * Obtém o valor da propriedade descFolha.
     * 
     * @return
     *     possible object is
     *     {@link TDetVerbasDescFolha.DescFolha }
     *     
     */
    public TDetVerbasDescFolha.DescFolha getDescFolha() {
        return descFolha;
    }

    /**
     * Define o valor da propriedade descFolha.
     * 
     * @param value
     *     allowed object is
     *     {@link TDetVerbasDescFolha.DescFolha }
     *     
     */
    public void setDescFolha(TDetVerbasDescFolha.DescFolha value) {
        this.descFolha = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tpDesc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}TS_tpDesc"/>
     *         &lt;element name="instFinanc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}TS_instFinanc"/>
     *         &lt;element name="nrDoc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}TS_nrDoc"/>
     *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_03_00}TS_observacao" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpDesc",
        "instFinanc",
        "nrDoc",
        "observacao"
    })
    public static class DescFolha {

        protected byte tpDesc;
        @XmlElement(required = true)
        protected String instFinanc;
        @XmlElement(required = true)
        protected String nrDoc;
        protected String observacao;

        /**
         * Obtém o valor da propriedade tpDesc.
         * 
         */
        public byte getTpDesc() {
            return tpDesc;
        }

        /**
         * Define o valor da propriedade tpDesc.
         * 
         */
        public void setTpDesc(byte value) {
            this.tpDesc = value;
        }

        /**
         * Obtém o valor da propriedade instFinanc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstFinanc() {
            return instFinanc;
        }

        /**
         * Define o valor da propriedade instFinanc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstFinanc(String value) {
            this.instFinanc = value;
        }

        /**
         * Obtém o valor da propriedade nrDoc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrDoc() {
            return nrDoc;
        }

        /**
         * Define o valor da propriedade nrDoc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrDoc(String value) {
            this.nrDoc = value;
        }

        /**
         * Obtém o valor da propriedade observacao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObservacao() {
            return observacao;
        }

        /**
         * Define o valor da propriedade observacao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObservacao(String value) {
            this.observacao = value;
        }

    }

}
