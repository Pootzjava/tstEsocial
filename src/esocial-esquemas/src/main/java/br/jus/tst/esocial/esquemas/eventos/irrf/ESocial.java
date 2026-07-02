//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:26 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.irrf;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="evtIrrf">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}T_ideEvento_retorno_mensal"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}T_ideEmpregador"/>
 *                   &lt;element name="infoIRRF">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_nrRecArqBase"/>
 *                             &lt;element name="indExistInfo">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="infoCRMen" maxOccurs="50" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_CRMen"/>
 *                                       &lt;element name="vrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_valorMonetario_positivo"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infoCRDia" maxOccurs="350" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="perApurDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_dia"/>
 *                                       &lt;element name="CRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_CRDia"/>
 *                                       &lt;element name="vrCRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_valorMonetario_positivo"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_Id_retorno" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
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
    "evtIrrf",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtIrrf evtIrrf;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtIrrf.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtIrrf }
     *     
     */
    public ESocial.EvtIrrf getEvtIrrf() {
        return evtIrrf;
    }

    /**
     * Define o valor da propriedade evtIrrf.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtIrrf }
     *     
     */
    public void setEvtIrrf(ESocial.EvtIrrf value) {
        this.evtIrrf = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}T_ideEvento_retorno_mensal"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}T_ideEmpregador"/>
     *         &lt;element name="infoIRRF">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_nrRecArqBase"/>
     *                   &lt;element name="indExistInfo">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="infoCRMen" maxOccurs="50" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_CRMen"/>
     *                             &lt;element name="vrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_valorMonetario_positivo"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infoCRDia" maxOccurs="350" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="perApurDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_dia"/>
     *                             &lt;element name="CRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_CRDia"/>
     *                             &lt;element name="vrCRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_valorMonetario_positivo"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_Id_retorno" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoIRRF"
    })
    public static class EvtIrrf {

        @XmlElement(required = true)
        protected TIdeEventoRetornoMensal ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtIrrf.InfoIRRF infoIRRF;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoRetornoMensal }
         *     
         */
        public TIdeEventoRetornoMensal getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoRetornoMensal }
         *     
         */
        public void setIdeEvento(TIdeEventoRetornoMensal value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregador }
         *     
         */
        public TIdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade infoIRRF.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtIrrf.InfoIRRF }
         *     
         */
        public ESocial.EvtIrrf.InfoIRRF getInfoIRRF() {
            return infoIRRF;
        }

        /**
         * Define o valor da propriedade infoIRRF.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtIrrf.InfoIRRF }
         *     
         */
        public void setInfoIRRF(ESocial.EvtIrrf.InfoIRRF value) {
            this.infoIRRF = value;
        }

        /**
         * Obtém o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
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
         *         &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_nrRecArqBase"/>
         *         &lt;element name="indExistInfo">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="infoCRMen" maxOccurs="50" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_CRMen"/>
         *                   &lt;element name="vrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_valorMonetario_positivo"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoCRDia" maxOccurs="350" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="perApurDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_dia"/>
         *                   &lt;element name="CRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_CRDia"/>
         *                   &lt;element name="vrCRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_valorMonetario_positivo"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "nrRecArqBase",
            "indExistInfo",
            "infoCRMen",
            "infoCRDia"
        })
        public static class InfoIRRF {

            @XmlElement(required = true)
            protected String nrRecArqBase;
            protected byte indExistInfo;
            protected List<ESocial.EvtIrrf.InfoIRRF.InfoCRMen> infoCRMen;
            protected List<ESocial.EvtIrrf.InfoIRRF.InfoCRDia> infoCRDia;

            /**
             * Obtém o valor da propriedade nrRecArqBase.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrRecArqBase() {
                return nrRecArqBase;
            }

            /**
             * Define o valor da propriedade nrRecArqBase.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrRecArqBase(String value) {
                this.nrRecArqBase = value;
            }

            /**
             * Obtém o valor da propriedade indExistInfo.
             * 
             */
            public byte getIndExistInfo() {
                return indExistInfo;
            }

            /**
             * Define o valor da propriedade indExistInfo.
             * 
             */
            public void setIndExistInfo(byte value) {
                this.indExistInfo = value;
            }

            /**
             * Gets the value of the infoCRMen property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoCRMen property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoCRMen().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtIrrf.InfoIRRF.InfoCRMen }
             * 
             * 
             */
            public List<ESocial.EvtIrrf.InfoIRRF.InfoCRMen> getInfoCRMen() {
                if (infoCRMen == null) {
                    infoCRMen = new ArrayList<ESocial.EvtIrrf.InfoIRRF.InfoCRMen>();
                }
                return this.infoCRMen;
            }

            /**
             * Gets the value of the infoCRDia property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoCRDia property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoCRDia().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtIrrf.InfoIRRF.InfoCRDia }
             * 
             * 
             */
            public List<ESocial.EvtIrrf.InfoIRRF.InfoCRDia> getInfoCRDia() {
                if (infoCRDia == null) {
                    infoCRDia = new ArrayList<ESocial.EvtIrrf.InfoIRRF.InfoCRDia>();
                }
                return this.infoCRDia;
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
             *         &lt;element name="perApurDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_dia"/>
             *         &lt;element name="CRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_CRDia"/>
             *         &lt;element name="vrCRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                "perApurDia",
                "crDia",
                "vrCRDia"
            })
            public static class InfoCRDia {

                protected byte perApurDia;
                @XmlElement(name = "CRDia", required = true)
                protected String crDia;
                @XmlElement(required = true)
                protected BigDecimal vrCRDia;

                /**
                 * Obtém o valor da propriedade perApurDia.
                 * 
                 */
                public byte getPerApurDia() {
                    return perApurDia;
                }

                /**
                 * Define o valor da propriedade perApurDia.
                 * 
                 */
                public void setPerApurDia(byte value) {
                    this.perApurDia = value;
                }

                /**
                 * Obtém o valor da propriedade crDia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCRDia() {
                    return crDia;
                }

                /**
                 * Define o valor da propriedade crDia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCRDia(String value) {
                    this.crDia = value;
                }

                /**
                 * Obtém o valor da propriedade vrCRDia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrCRDia() {
                    return vrCRDia;
                }

                /**
                 * Define o valor da propriedade vrCRDia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrCRDia(BigDecimal value) {
                    this.vrCRDia = value;
                }

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
             *         &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_CRMen"/>
             *         &lt;element name="vrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                "crMen",
                "vrCRMen"
            })
            public static class InfoCRMen {

                @XmlElement(name = "CRMen", required = true)
                protected String crMen;
                @XmlElement(required = true)
                protected BigDecimal vrCRMen;

                /**
                 * Obtém o valor da propriedade crMen.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCRMen() {
                    return crMen;
                }

                /**
                 * Define o valor da propriedade crMen.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCRMen(String value) {
                    this.crMen = value;
                }

                /**
                 * Obtém o valor da propriedade vrCRMen.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrCRMen() {
                    return vrCRMen;
                }

                /**
                 * Define o valor da propriedade vrCRMen.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrCRMen(BigDecimal value) {
                    this.vrCRMen = value;
                }

            }

        }

    }

}
