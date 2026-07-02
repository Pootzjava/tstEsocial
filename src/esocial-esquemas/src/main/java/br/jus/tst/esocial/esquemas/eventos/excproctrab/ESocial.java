//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:22 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.excproctrab;

import java.math.BigInteger;
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
 *         &lt;element name="evtExcProcTrab">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}T_ideEvento_exclusao_proc_trab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}T_ideEmpregador_exclusao"/>
 *                   &lt;element name="infoExclusao">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpEvento">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrRecEvt" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_nrRecibo"/>
 *                             &lt;element name="ideProcTrab">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_nrProcTrab"/>
 *                                       &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_cpf" minOccurs="0"/>
 *                                       &lt;element name="perApurPgto" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_periodo_mensal" minOccurs="0"/>
 *                                       &lt;element name="ideSeqProc" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                                             &lt;pattern value="\d{1,3}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_Id" />
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
    "evtExcProcTrab",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtExcProcTrab evtExcProcTrab;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtExcProcTrab.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtExcProcTrab }
     *     
     */
    public ESocial.EvtExcProcTrab getEvtExcProcTrab() {
        return evtExcProcTrab;
    }

    /**
     * Define o valor da propriedade evtExcProcTrab.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtExcProcTrab }
     *     
     */
    public void setEvtExcProcTrab(ESocial.EvtExcProcTrab value) {
        this.evtExcProcTrab = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}T_ideEvento_exclusao_proc_trab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}T_ideEmpregador_exclusao"/>
     *         &lt;element name="infoExclusao">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpEvento">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nrRecEvt" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_nrRecibo"/>
     *                   &lt;element name="ideProcTrab">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_nrProcTrab"/>
     *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_cpf" minOccurs="0"/>
     *                             &lt;element name="perApurPgto" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_periodo_mensal" minOccurs="0"/>
     *                             &lt;element name="ideSeqProc" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *                                   &lt;pattern value="\d{1,3}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_Id" />
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
        "infoExclusao"
    })
    public static class EvtExcProcTrab {

        @XmlElement(required = true)
        protected TIdeEventoExclusaoProcTrab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregadorExclusao ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtExcProcTrab.InfoExclusao infoExclusao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoExclusaoProcTrab }
         *     
         */
        public TIdeEventoExclusaoProcTrab getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoExclusaoProcTrab }
         *     
         */
        public void setIdeEvento(TIdeEventoExclusaoProcTrab value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregadorExclusao }
         *     
         */
        public TIdeEmpregadorExclusao getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregadorExclusao }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregadorExclusao value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade infoExclusao.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtExcProcTrab.InfoExclusao }
         *     
         */
        public ESocial.EvtExcProcTrab.InfoExclusao getInfoExclusao() {
            return infoExclusao;
        }

        /**
         * Define o valor da propriedade infoExclusao.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtExcProcTrab.InfoExclusao }
         *     
         */
        public void setInfoExclusao(ESocial.EvtExcProcTrab.InfoExclusao value) {
            this.infoExclusao = value;
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
         *         &lt;element name="tpEvento">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nrRecEvt" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_nrRecibo"/>
         *         &lt;element name="ideProcTrab">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_nrProcTrab"/>
         *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_cpf" minOccurs="0"/>
         *                   &lt;element name="perApurPgto" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_periodo_mensal" minOccurs="0"/>
         *                   &lt;element name="ideSeqProc" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
         *                         &lt;pattern value="\d{1,3}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
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
            "tpEvento",
            "nrRecEvt",
            "ideProcTrab"
        })
        public static class InfoExclusao {

            @XmlElement(required = true)
            protected String tpEvento;
            @XmlElement(required = true)
            protected String nrRecEvt;
            @XmlElement(required = true)
            protected ESocial.EvtExcProcTrab.InfoExclusao.IdeProcTrab ideProcTrab;

            /**
             * Obtém o valor da propriedade tpEvento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpEvento() {
                return tpEvento;
            }

            /**
             * Define o valor da propriedade tpEvento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpEvento(String value) {
                this.tpEvento = value;
            }

            /**
             * Obtém o valor da propriedade nrRecEvt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrRecEvt() {
                return nrRecEvt;
            }

            /**
             * Define o valor da propriedade nrRecEvt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrRecEvt(String value) {
                this.nrRecEvt = value;
            }

            /**
             * Obtém o valor da propriedade ideProcTrab.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtExcProcTrab.InfoExclusao.IdeProcTrab }
             *     
             */
            public ESocial.EvtExcProcTrab.InfoExclusao.IdeProcTrab getIdeProcTrab() {
                return ideProcTrab;
            }

            /**
             * Define o valor da propriedade ideProcTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtExcProcTrab.InfoExclusao.IdeProcTrab }
             *     
             */
            public void setIdeProcTrab(ESocial.EvtExcProcTrab.InfoExclusao.IdeProcTrab value) {
                this.ideProcTrab = value;
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
             *         &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_nrProcTrab"/>
             *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_cpf" minOccurs="0"/>
             *         &lt;element name="perApurPgto" type="{http://www.esocial.gov.br/schema/evt/evtExcProcTrab/v_S_01_03_00}TS_periodo_mensal" minOccurs="0"/>
             *         &lt;element name="ideSeqProc" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
             *               &lt;pattern value="\d{1,3}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "nrProcTrab",
                "cpfTrab",
                "perApurPgto",
                "ideSeqProc"
            })
            public static class IdeProcTrab {

                @XmlElement(required = true)
                protected String nrProcTrab;
                protected String cpfTrab;
                protected String perApurPgto;
                protected BigInteger ideSeqProc;

                /**
                 * Obtém o valor da propriedade nrProcTrab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrProcTrab() {
                    return nrProcTrab;
                }

                /**
                 * Define o valor da propriedade nrProcTrab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrProcTrab(String value) {
                    this.nrProcTrab = value;
                }

                /**
                 * Obtém o valor da propriedade cpfTrab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCpfTrab() {
                    return cpfTrab;
                }

                /**
                 * Define o valor da propriedade cpfTrab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCpfTrab(String value) {
                    this.cpfTrab = value;
                }

                /**
                 * Obtém o valor da propriedade perApurPgto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPerApurPgto() {
                    return perApurPgto;
                }

                /**
                 * Define o valor da propriedade perApurPgto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPerApurPgto(String value) {
                    this.perApurPgto = value;
                }

                /**
                 * Obtém o valor da propriedade ideSeqProc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getIdeSeqProc() {
                    return ideSeqProc;
                }

                /**
                 * Define o valor da propriedade ideSeqProc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setIdeSeqProc(BigInteger value) {
                    this.ideSeqProc = value;
                }

            }

        }

    }

}
