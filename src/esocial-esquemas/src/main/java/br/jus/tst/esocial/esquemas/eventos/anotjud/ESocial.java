//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:14 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.anotjud;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="evtAnotJud">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}T_ideEvento_trab_jud"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}T_ideEmpregador"/>
 *                   &lt;element name="infoProcesso">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nrProcJud"/>
 *                             &lt;element name="dtSent" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_uf"/>
 *                             &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_codMunic"/>
 *                             &lt;element name="idVara">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;pattern value="\d{1,4}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoAnotJud">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_cpfTrab"/>
 *                             &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nmTrab"/>
 *                             &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_codigo_esocial"/>
 *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_codCateg"/>
 *                             &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_natAtividade"/>
 *                             &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpContr"/>
 *                             &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="tpInscTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpInsc_1_3_4" minOccurs="0"/>
 *                             &lt;element name="localTrabalho" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nrInsc_12_14" minOccurs="0"/>
 *                             &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpRegTrab_1"/>
 *                             &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpRegPrev_1_2_3"/>
 *                             &lt;element name="cargo" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtCargo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_cbo"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="remuneracao" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_vrSalFx"/>
 *                                       &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_undSalFixo"/>
 *                                       &lt;element name="dscSalVar" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="incorporacao" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpInsc_1_2" minOccurs="0"/>
 *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nrInsc_8_11_14" minOccurs="0"/>
 *                                       &lt;element name="matIncorp" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_matricula"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="afastamento" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtIniAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_codMotAfast"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="desligamento" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="mtvDeslig" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_mtvDeslig"/>
 *                                       &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="dtProjFimAPI" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_dtProjFimAPI" minOccurs="0"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_Id" />
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
    "evtAnotJud",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtAnotJud evtAnotJud;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtAnotJud.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtAnotJud }
     *     
     */
    public ESocial.EvtAnotJud getEvtAnotJud() {
        return evtAnotJud;
    }

    /**
     * Define o valor da propriedade evtAnotJud.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtAnotJud }
     *     
     */
    public void setEvtAnotJud(ESocial.EvtAnotJud value) {
        this.evtAnotJud = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}T_ideEvento_trab_jud"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}T_ideEmpregador"/>
     *         &lt;element name="infoProcesso">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nrProcJud"/>
     *                   &lt;element name="dtSent" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_uf"/>
     *                   &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_codMunic"/>
     *                   &lt;element name="idVara">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;pattern value="\d{1,4}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoAnotJud">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_cpfTrab"/>
     *                   &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nmTrab"/>
     *                   &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_codigo_esocial"/>
     *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_codCateg"/>
     *                   &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_natAtividade"/>
     *                   &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpContr"/>
     *                   &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="tpInscTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpInsc_1_3_4" minOccurs="0"/>
     *                   &lt;element name="localTrabalho" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nrInsc_12_14" minOccurs="0"/>
     *                   &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpRegTrab_1"/>
     *                   &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpRegPrev_1_2_3"/>
     *                   &lt;element name="cargo" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtCargo" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_cbo"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="remuneracao" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_vrSalFx"/>
     *                             &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_undSalFixo"/>
     *                             &lt;element name="dscSalVar" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="incorporacao" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpInsc_1_2" minOccurs="0"/>
     *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nrInsc_8_11_14" minOccurs="0"/>
     *                             &lt;element name="matIncorp" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_matricula"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="afastamento" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtIniAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_codMotAfast"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="desligamento" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="mtvDeslig" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_mtvDeslig"/>
     *                             &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="dtProjFimAPI" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_dtProjFimAPI" minOccurs="0"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_Id" />
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
        "infoProcesso",
        "infoAnotJud"
    })
    public static class EvtAnotJud {

        @XmlElement(required = true)
        protected TIdeEventoTrabJud ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtAnotJud.InfoProcesso infoProcesso;
        @XmlElement(required = true)
        protected ESocial.EvtAnotJud.InfoAnotJud infoAnotJud;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrabJud }
         *     
         */
        public TIdeEventoTrabJud getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrabJud }
         *     
         */
        public void setIdeEvento(TIdeEventoTrabJud value) {
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
         * Obtém o valor da propriedade infoProcesso.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtAnotJud.InfoProcesso }
         *     
         */
        public ESocial.EvtAnotJud.InfoProcesso getInfoProcesso() {
            return infoProcesso;
        }

        /**
         * Define o valor da propriedade infoProcesso.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAnotJud.InfoProcesso }
         *     
         */
        public void setInfoProcesso(ESocial.EvtAnotJud.InfoProcesso value) {
            this.infoProcesso = value;
        }

        /**
         * Obtém o valor da propriedade infoAnotJud.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtAnotJud.InfoAnotJud }
         *     
         */
        public ESocial.EvtAnotJud.InfoAnotJud getInfoAnotJud() {
            return infoAnotJud;
        }

        /**
         * Define o valor da propriedade infoAnotJud.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAnotJud.InfoAnotJud }
         *     
         */
        public void setInfoAnotJud(ESocial.EvtAnotJud.InfoAnotJud value) {
            this.infoAnotJud = value;
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
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_cpfTrab"/>
         *         &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nmTrab"/>
         *         &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_codigo_esocial"/>
         *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_codCateg"/>
         *         &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_natAtividade"/>
         *         &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpContr"/>
         *         &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="tpInscTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpInsc_1_3_4" minOccurs="0"/>
         *         &lt;element name="localTrabalho" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nrInsc_12_14" minOccurs="0"/>
         *         &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpRegTrab_1"/>
         *         &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpRegPrev_1_2_3"/>
         *         &lt;element name="cargo" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtCargo" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_cbo"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="remuneracao" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_vrSalFx"/>
         *                   &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_undSalFixo"/>
         *                   &lt;element name="dscSalVar" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="incorporacao" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpInsc_1_2" minOccurs="0"/>
         *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nrInsc_8_11_14" minOccurs="0"/>
         *                   &lt;element name="matIncorp" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_matricula"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="afastamento" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtIniAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_codMotAfast"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="desligamento" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="mtvDeslig" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_mtvDeslig"/>
         *                   &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="dtProjFimAPI" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_dtProjFimAPI" minOccurs="0"/>
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
            "cpfTrab",
            "nmTrab",
            "dtNascto",
            "dtAdm",
            "matricula",
            "codCateg",
            "natAtividade",
            "tpContr",
            "dtTerm",
            "tpInscTrab",
            "localTrabalho",
            "tpRegTrab",
            "tpRegPrev",
            "cargo",
            "remuneracao",
            "incorporacao",
            "afastamento",
            "desligamento"
        })
        public static class InfoAnotJud {

            @XmlElement(required = true)
            protected String cpfTrab;
            @XmlElement(required = true)
            protected String nmTrab;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtNascto;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtAdm;
            @XmlElement(required = true)
            protected String matricula;
            @XmlElement(required = true)
            protected BigInteger codCateg;
            protected byte natAtividade;
            protected byte tpContr;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtTerm;
            protected Byte tpInscTrab;
            protected String localTrabalho;
            protected byte tpRegTrab;
            protected byte tpRegPrev;
            @XmlElement(required = true)
            protected List<ESocial.EvtAnotJud.InfoAnotJud.Cargo> cargo;
            @XmlElement(required = true)
            protected List<ESocial.EvtAnotJud.InfoAnotJud.Remuneracao> remuneracao;
            protected List<ESocial.EvtAnotJud.InfoAnotJud.Incorporacao> incorporacao;
            protected ESocial.EvtAnotJud.InfoAnotJud.Afastamento afastamento;
            protected ESocial.EvtAnotJud.InfoAnotJud.Desligamento desligamento;

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
             * Obtém o valor da propriedade nmTrab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNmTrab() {
                return nmTrab;
            }

            /**
             * Define o valor da propriedade nmTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNmTrab(String value) {
                this.nmTrab = value;
            }

            /**
             * Obtém o valor da propriedade dtNascto.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtNascto() {
                return dtNascto;
            }

            /**
             * Define o valor da propriedade dtNascto.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtNascto(XMLGregorianCalendar value) {
                this.dtNascto = value;
            }

            /**
             * Obtém o valor da propriedade dtAdm.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtAdm() {
                return dtAdm;
            }

            /**
             * Define o valor da propriedade dtAdm.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtAdm(XMLGregorianCalendar value) {
                this.dtAdm = value;
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

            /**
             * Obtém o valor da propriedade codCateg.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCodCateg() {
                return codCateg;
            }

            /**
             * Define o valor da propriedade codCateg.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCodCateg(BigInteger value) {
                this.codCateg = value;
            }

            /**
             * Obtém o valor da propriedade natAtividade.
             * 
             */
            public byte getNatAtividade() {
                return natAtividade;
            }

            /**
             * Define o valor da propriedade natAtividade.
             * 
             */
            public void setNatAtividade(byte value) {
                this.natAtividade = value;
            }

            /**
             * Obtém o valor da propriedade tpContr.
             * 
             */
            public byte getTpContr() {
                return tpContr;
            }

            /**
             * Define o valor da propriedade tpContr.
             * 
             */
            public void setTpContr(byte value) {
                this.tpContr = value;
            }

            /**
             * Obtém o valor da propriedade dtTerm.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtTerm() {
                return dtTerm;
            }

            /**
             * Define o valor da propriedade dtTerm.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtTerm(XMLGregorianCalendar value) {
                this.dtTerm = value;
            }

            /**
             * Obtém o valor da propriedade tpInscTrab.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getTpInscTrab() {
                return tpInscTrab;
            }

            /**
             * Define o valor da propriedade tpInscTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setTpInscTrab(Byte value) {
                this.tpInscTrab = value;
            }

            /**
             * Obtém o valor da propriedade localTrabalho.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocalTrabalho() {
                return localTrabalho;
            }

            /**
             * Define o valor da propriedade localTrabalho.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocalTrabalho(String value) {
                this.localTrabalho = value;
            }

            /**
             * Obtém o valor da propriedade tpRegTrab.
             * 
             */
            public byte getTpRegTrab() {
                return tpRegTrab;
            }

            /**
             * Define o valor da propriedade tpRegTrab.
             * 
             */
            public void setTpRegTrab(byte value) {
                this.tpRegTrab = value;
            }

            /**
             * Obtém o valor da propriedade tpRegPrev.
             * 
             */
            public byte getTpRegPrev() {
                return tpRegPrev;
            }

            /**
             * Define o valor da propriedade tpRegPrev.
             * 
             */
            public void setTpRegPrev(byte value) {
                this.tpRegPrev = value;
            }

            /**
             * Gets the value of the cargo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cargo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCargo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtAnotJud.InfoAnotJud.Cargo }
             * 
             * 
             */
            public List<ESocial.EvtAnotJud.InfoAnotJud.Cargo> getCargo() {
                if (cargo == null) {
                    cargo = new ArrayList<ESocial.EvtAnotJud.InfoAnotJud.Cargo>();
                }
                return this.cargo;
            }

            /**
             * Gets the value of the remuneracao property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the remuneracao property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRemuneracao().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtAnotJud.InfoAnotJud.Remuneracao }
             * 
             * 
             */
            public List<ESocial.EvtAnotJud.InfoAnotJud.Remuneracao> getRemuneracao() {
                if (remuneracao == null) {
                    remuneracao = new ArrayList<ESocial.EvtAnotJud.InfoAnotJud.Remuneracao>();
                }
                return this.remuneracao;
            }

            /**
             * Gets the value of the incorporacao property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the incorporacao property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIncorporacao().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtAnotJud.InfoAnotJud.Incorporacao }
             * 
             * 
             */
            public List<ESocial.EvtAnotJud.InfoAnotJud.Incorporacao> getIncorporacao() {
                if (incorporacao == null) {
                    incorporacao = new ArrayList<ESocial.EvtAnotJud.InfoAnotJud.Incorporacao>();
                }
                return this.incorporacao;
            }

            /**
             * Obtém o valor da propriedade afastamento.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAnotJud.InfoAnotJud.Afastamento }
             *     
             */
            public ESocial.EvtAnotJud.InfoAnotJud.Afastamento getAfastamento() {
                return afastamento;
            }

            /**
             * Define o valor da propriedade afastamento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAnotJud.InfoAnotJud.Afastamento }
             *     
             */
            public void setAfastamento(ESocial.EvtAnotJud.InfoAnotJud.Afastamento value) {
                this.afastamento = value;
            }

            /**
             * Obtém o valor da propriedade desligamento.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAnotJud.InfoAnotJud.Desligamento }
             *     
             */
            public ESocial.EvtAnotJud.InfoAnotJud.Desligamento getDesligamento() {
                return desligamento;
            }

            /**
             * Define o valor da propriedade desligamento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAnotJud.InfoAnotJud.Desligamento }
             *     
             */
            public void setDesligamento(ESocial.EvtAnotJud.InfoAnotJud.Desligamento value) {
                this.desligamento = value;
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
             *         &lt;element name="dtIniAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_codMotAfast"/>
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
                "dtIniAfast",
                "codMotAfast"
            })
            public static class Afastamento {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtIniAfast;
                @XmlElement(required = true)
                protected String codMotAfast;

                /**
                 * Obtém o valor da propriedade dtIniAfast.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtIniAfast() {
                    return dtIniAfast;
                }

                /**
                 * Define o valor da propriedade dtIniAfast.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtIniAfast(XMLGregorianCalendar value) {
                    this.dtIniAfast = value;
                }

                /**
                 * Obtém o valor da propriedade codMotAfast.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodMotAfast() {
                    return codMotAfast;
                }

                /**
                 * Define o valor da propriedade codMotAfast.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodMotAfast(String value) {
                    this.codMotAfast = value;
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
             *         &lt;element name="dtCargo" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_cbo"/>
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
                "dtCargo",
                "cboCargo"
            })
            public static class Cargo {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtCargo;
                @XmlElement(name = "CBOCargo", required = true)
                protected String cboCargo;

                /**
                 * Obtém o valor da propriedade dtCargo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtCargo() {
                    return dtCargo;
                }

                /**
                 * Define o valor da propriedade dtCargo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtCargo(XMLGregorianCalendar value) {
                    this.dtCargo = value;
                }

                /**
                 * Obtém o valor da propriedade cboCargo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCBOCargo() {
                    return cboCargo;
                }

                /**
                 * Define o valor da propriedade cboCargo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCBOCargo(String value) {
                    this.cboCargo = value;
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
             *         &lt;element name="mtvDeslig" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_mtvDeslig"/>
             *         &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="dtProjFimAPI" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_dtProjFimAPI" minOccurs="0"/>
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
                "mtvDeslig",
                "dtDeslig",
                "dtProjFimAPI"
            })
            public static class Desligamento {

                @XmlElement(required = true)
                protected String mtvDeslig;
                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtDeslig;
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtProjFimAPI;

                /**
                 * Obtém o valor da propriedade mtvDeslig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMtvDeslig() {
                    return mtvDeslig;
                }

                /**
                 * Define o valor da propriedade mtvDeslig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMtvDeslig(String value) {
                    this.mtvDeslig = value;
                }

                /**
                 * Obtém o valor da propriedade dtDeslig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtDeslig() {
                    return dtDeslig;
                }

                /**
                 * Define o valor da propriedade dtDeslig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtDeslig(XMLGregorianCalendar value) {
                    this.dtDeslig = value;
                }

                /**
                 * Obtém o valor da propriedade dtProjFimAPI.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtProjFimAPI() {
                    return dtProjFimAPI;
                }

                /**
                 * Define o valor da propriedade dtProjFimAPI.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtProjFimAPI(XMLGregorianCalendar value) {
                    this.dtProjFimAPI = value;
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
             *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_tpInsc_1_2" minOccurs="0"/>
             *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nrInsc_8_11_14" minOccurs="0"/>
             *         &lt;element name="matIncorp" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_matricula"/>
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
                "tpInsc",
                "nrInsc",
                "matIncorp"
            })
            public static class Incorporacao {

                protected Byte tpInsc;
                protected String nrInsc;
                @XmlElement(required = true)
                protected String matIncorp;

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
                 * Obtém o valor da propriedade matIncorp.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMatIncorp() {
                    return matIncorp;
                }

                /**
                 * Define o valor da propriedade matIncorp.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMatIncorp(String value) {
                    this.matIncorp = value;
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
             *         &lt;element name="dtRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_vrSalFx"/>
             *         &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_undSalFixo"/>
             *         &lt;element name="dscSalVar" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
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
                "dtRemun",
                "vrSalFx",
                "undSalFixo",
                "dscSalVar"
            })
            public static class Remuneracao {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtRemun;
                @XmlElement(required = true)
                protected BigDecimal vrSalFx;
                protected byte undSalFixo;
                protected String dscSalVar;

                /**
                 * Obtém o valor da propriedade dtRemun.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtRemun() {
                    return dtRemun;
                }

                /**
                 * Define o valor da propriedade dtRemun.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtRemun(XMLGregorianCalendar value) {
                    this.dtRemun = value;
                }

                /**
                 * Obtém o valor da propriedade vrSalFx.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrSalFx() {
                    return vrSalFx;
                }

                /**
                 * Define o valor da propriedade vrSalFx.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrSalFx(BigDecimal value) {
                    this.vrSalFx = value;
                }

                /**
                 * Obtém o valor da propriedade undSalFixo.
                 * 
                 */
                public byte getUndSalFixo() {
                    return undSalFixo;
                }

                /**
                 * Define o valor da propriedade undSalFixo.
                 * 
                 */
                public void setUndSalFixo(byte value) {
                    this.undSalFixo = value;
                }

                /**
                 * Obtém o valor da propriedade dscSalVar.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDscSalVar() {
                    return dscSalVar;
                }

                /**
                 * Define o valor da propriedade dscSalVar.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDscSalVar(String value) {
                    this.dscSalVar = value;
                }

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
         *         &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_nrProcJud"/>
         *         &lt;element name="dtSent" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_uf"/>
         *         &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtAnotJud/v_S_01_03_00}TS_codMunic"/>
         *         &lt;element name="idVara">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;pattern value="\d{1,4}"/>
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
            "dtSent",
            "ufVara",
            "codMunic",
            "idVara"
        })
        public static class InfoProcesso {

            @XmlElement(required = true)
            protected String nrProcTrab;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtSent;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSUf ufVara;
            @XmlElement(required = true)
            protected BigInteger codMunic;
            @XmlElement(required = true)
            protected BigInteger idVara;

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
             * Obtém o valor da propriedade dtSent.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtSent() {
                return dtSent;
            }

            /**
             * Define o valor da propriedade dtSent.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtSent(XMLGregorianCalendar value) {
                this.dtSent = value;
            }

            /**
             * Obtém o valor da propriedade ufVara.
             * 
             * @return
             *     possible object is
             *     {@link TSUf }
             *     
             */
            public TSUf getUfVara() {
                return ufVara;
            }

            /**
             * Define o valor da propriedade ufVara.
             * 
             * @param value
             *     allowed object is
             *     {@link TSUf }
             *     
             */
            public void setUfVara(TSUf value) {
                this.ufVara = value;
            }

            /**
             * Obtém o valor da propriedade codMunic.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCodMunic() {
                return codMunic;
            }

            /**
             * Define o valor da propriedade codMunic.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCodMunic(BigInteger value) {
                this.codMunic = value;
            }

            /**
             * Obtém o valor da propriedade idVara.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getIdVara() {
                return idVara;
            }

            /**
             * Define o valor da propriedade idVara.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIdVara(BigInteger value) {
                this.idVara = value;
            }

        }

    }

}
