//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:31 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.toxic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="evtToxic">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}T_ideEvento_trab_PJ_sem_simplificado"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}T_ideEmpregador"/>
 *                   &lt;element name="ideVinculo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_cpfTrab"/>
 *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_matricula"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="toxicologico">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtExame" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="cnpjLab" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_cnpj"/>
 *                             &lt;element name="codSeqExame">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[a-zA-z]{2}\d{9}"/>
 *                                   &lt;length value="11"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nmMed" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_nome"/>
 *                             &lt;element name="nrCRM" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_crm_10" minOccurs="0"/>
 *                             &lt;element name="ufCRM" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_uf" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_Id" />
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
    "evtToxic",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtToxic evtToxic;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtToxic.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtToxic }
     *     
     */
    public ESocial.EvtToxic getEvtToxic() {
        return evtToxic;
    }

    /**
     * Define o valor da propriedade evtToxic.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtToxic }
     *     
     */
    public void setEvtToxic(ESocial.EvtToxic value) {
        this.evtToxic = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}T_ideEvento_trab_PJ_sem_simplificado"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}T_ideEmpregador"/>
     *         &lt;element name="ideVinculo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_cpfTrab"/>
     *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_matricula"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="toxicologico">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtExame" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="cnpjLab" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_cnpj"/>
     *                   &lt;element name="codSeqExame">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[a-zA-z]{2}\d{9}"/>
     *                         &lt;length value="11"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nmMed" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_nome"/>
     *                   &lt;element name="nrCRM" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_crm_10" minOccurs="0"/>
     *                   &lt;element name="ufCRM" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_uf" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_Id" />
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
        "ideVinculo",
        "toxicologico"
    })
    public static class EvtToxic {

        @XmlElement(required = true)
        protected TIdeEventoTrabPJSemSimplificado ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtToxic.IdeVinculo ideVinculo;
        @XmlElement(required = true)
        protected ESocial.EvtToxic.Toxicologico toxicologico;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrabPJSemSimplificado }
         *     
         */
        public TIdeEventoTrabPJSemSimplificado getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrabPJSemSimplificado }
         *     
         */
        public void setIdeEvento(TIdeEventoTrabPJSemSimplificado value) {
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
         * Obtém o valor da propriedade ideVinculo.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtToxic.IdeVinculo }
         *     
         */
        public ESocial.EvtToxic.IdeVinculo getIdeVinculo() {
            return ideVinculo;
        }

        /**
         * Define o valor da propriedade ideVinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtToxic.IdeVinculo }
         *     
         */
        public void setIdeVinculo(ESocial.EvtToxic.IdeVinculo value) {
            this.ideVinculo = value;
        }

        /**
         * Obtém o valor da propriedade toxicologico.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtToxic.Toxicologico }
         *     
         */
        public ESocial.EvtToxic.Toxicologico getToxicologico() {
            return toxicologico;
        }

        /**
         * Define o valor da propriedade toxicologico.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtToxic.Toxicologico }
         *     
         */
        public void setToxicologico(ESocial.EvtToxic.Toxicologico value) {
            this.toxicologico = value;
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
         * CHAVE_GRUPO: {cpfTrab*}, {matricula*}
         * 
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_cpfTrab"/>
         *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_matricula"/>
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
            "cpfTrab",
            "matricula"
        })
        public static class IdeVinculo {

            @XmlElement(required = true)
            protected String cpfTrab;
            @XmlElement(required = true)
            protected String matricula;

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
             * Obtém o valor da propriedade matricula.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMatricula() {
                return matricula;
            }

            /**
             * Define o valor da propriedade matricula.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMatricula(String value) {
                this.matricula = value;
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
         *         &lt;element name="dtExame" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="cnpjLab" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_cnpj"/>
         *         &lt;element name="codSeqExame">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[a-zA-z]{2}\d{9}"/>
         *               &lt;length value="11"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nmMed" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_nome"/>
         *         &lt;element name="nrCRM" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_crm_10" minOccurs="0"/>
         *         &lt;element name="ufCRM" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_uf" minOccurs="0"/>
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
            "dtExame",
            "cnpjLab",
            "codSeqExame",
            "nmMed",
            "nrCRM",
            "ufCRM"
        })
        public static class Toxicologico {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtExame;
            @XmlElement(required = true)
            protected String cnpjLab;
            @XmlElement(required = true)
            protected String codSeqExame;
            @XmlElement(required = true)
            protected String nmMed;
            protected String nrCRM;
            @XmlSchemaType(name = "string")
            protected TSUf ufCRM;

            /**
             * Obtém o valor da propriedade dtExame.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtExame() {
                return dtExame;
            }

            /**
             * Define o valor da propriedade dtExame.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtExame(XMLGregorianCalendar value) {
                this.dtExame = value;
            }

            /**
             * Obtém o valor da propriedade cnpjLab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCnpjLab() {
                return cnpjLab;
            }

            /**
             * Define o valor da propriedade cnpjLab.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCnpjLab(String value) {
                this.cnpjLab = value;
            }

            /**
             * Obtém o valor da propriedade codSeqExame.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodSeqExame() {
                return codSeqExame;
            }

            /**
             * Define o valor da propriedade codSeqExame.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodSeqExame(String value) {
                this.codSeqExame = value;
            }

            /**
             * Obtém o valor da propriedade nmMed.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNmMed() {
                return nmMed;
            }

            /**
             * Define o valor da propriedade nmMed.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNmMed(String value) {
                this.nmMed = value;
            }

            /**
             * Obtém o valor da propriedade nrCRM.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrCRM() {
                return nrCRM;
            }

            /**
             * Define o valor da propriedade nrCRM.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrCRM(String value) {
                this.nrCRM = value;
            }

            /**
             * Obtém o valor da propriedade ufCRM.
             * 
             * @return
             *     possible object is
             *     {@link TSUf }
             *     
             */
            public TSUf getUfCRM() {
                return ufCRM;
            }

            /**
             * Define o valor da propriedade ufCRM.
             * 
             * @param value
             *     allowed object is
             *     {@link TSUf }
             *     
             */
            public void setUfCRM(TSUf value) {
                this.ufCRM = value;
            }

        }

    }

}
