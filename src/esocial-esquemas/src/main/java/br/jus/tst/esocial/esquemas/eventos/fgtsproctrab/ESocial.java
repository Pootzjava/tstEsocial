//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:23 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.fgtsproctrab;

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
 *         &lt;element name="evtFGTSProcTrab">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrRecArqBase"/>
 *                             &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_perApur"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ideEmpregador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_tpInsc_1_2"/>
 *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrInsc_8_11_14"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ideProc">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="origem" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_origem"/>
 *                             &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrProcTrab"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ideTrabalhador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_cpfRetorno"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoTrabFGTS" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
 *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
 *                             &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
 *                             &lt;element name="infoFGTSProcTrab">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="totalFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario"/>
 *                                       &lt;element name="ideEstab" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_tpInsc_EstabLot"/>
 *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrInsc_EstabLot"/>
 *                                                 &lt;element name="basePerRef" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
 *                                                           &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_codCateg"/>
 *                                                           &lt;element name="tpValorProcTrab">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                 &lt;enumeration value="71"/>
 *                                                                 &lt;enumeration value="72"/>
 *                                                                 &lt;enumeration value="73"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="remFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario"/>
 *                                                           &lt;element name="dpsFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                           &lt;element name="remFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                           &lt;element name="dpsFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                           &lt;element name="remFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                           &lt;element name="dpsFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_Id_retorno" />
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
    "evtFGTSProcTrab",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtFGTSProcTrab evtFGTSProcTrab;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtFGTSProcTrab.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtFGTSProcTrab }
     *     
     */
    public ESocial.EvtFGTSProcTrab getEvtFGTSProcTrab() {
        return evtFGTSProcTrab;
    }

    /**
     * Define o valor da propriedade evtFGTSProcTrab.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtFGTSProcTrab }
     *     
     */
    public void setEvtFGTSProcTrab(ESocial.EvtFGTSProcTrab value) {
        this.evtFGTSProcTrab = value;
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
     *         &lt;element name="ideEvento">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrRecArqBase"/>
     *                   &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_perApur"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ideEmpregador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_tpInsc_1_2"/>
     *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrInsc_8_11_14"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ideProc">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="origem" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_origem"/>
     *                   &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrProcTrab"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ideTrabalhador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_cpfRetorno"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoTrabFGTS" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
     *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
     *                   &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
     *                   &lt;element name="infoFGTSProcTrab">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="totalFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario"/>
     *                             &lt;element name="ideEstab" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_tpInsc_EstabLot"/>
     *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrInsc_EstabLot"/>
     *                                       &lt;element name="basePerRef" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
     *                                                 &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_codCateg"/>
     *                                                 &lt;element name="tpValorProcTrab">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                       &lt;enumeration value="71"/>
     *                                                       &lt;enumeration value="72"/>
     *                                                       &lt;enumeration value="73"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="remFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario"/>
     *                                                 &lt;element name="dpsFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                 &lt;element name="remFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                 &lt;element name="dpsFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                 &lt;element name="remFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                 &lt;element name="dpsFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
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
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_Id_retorno" />
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
        "ideProc",
        "ideTrabalhador",
        "infoTrabFGTS"
    })
    public static class EvtFGTSProcTrab {

        @XmlElement(required = true)
        protected ESocial.EvtFGTSProcTrab.IdeEvento ideEvento;
        @XmlElement(required = true)
        protected ESocial.EvtFGTSProcTrab.IdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtFGTSProcTrab.IdeProc ideProc;
        @XmlElement(required = true)
        protected ESocial.EvtFGTSProcTrab.IdeTrabalhador ideTrabalhador;
        @XmlElement(required = true)
        protected List<ESocial.EvtFGTSProcTrab.InfoTrabFGTS> infoTrabFGTS;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtFGTSProcTrab.IdeEvento }
         *     
         */
        public ESocial.EvtFGTSProcTrab.IdeEvento getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtFGTSProcTrab.IdeEvento }
         *     
         */
        public void setIdeEvento(ESocial.EvtFGTSProcTrab.IdeEvento value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtFGTSProcTrab.IdeEmpregador }
         *     
         */
        public ESocial.EvtFGTSProcTrab.IdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtFGTSProcTrab.IdeEmpregador }
         *     
         */
        public void setIdeEmpregador(ESocial.EvtFGTSProcTrab.IdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade ideProc.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtFGTSProcTrab.IdeProc }
         *     
         */
        public ESocial.EvtFGTSProcTrab.IdeProc getIdeProc() {
            return ideProc;
        }

        /**
         * Define o valor da propriedade ideProc.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtFGTSProcTrab.IdeProc }
         *     
         */
        public void setIdeProc(ESocial.EvtFGTSProcTrab.IdeProc value) {
            this.ideProc = value;
        }

        /**
         * Obtém o valor da propriedade ideTrabalhador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtFGTSProcTrab.IdeTrabalhador }
         *     
         */
        public ESocial.EvtFGTSProcTrab.IdeTrabalhador getIdeTrabalhador() {
            return ideTrabalhador;
        }

        /**
         * Define o valor da propriedade ideTrabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtFGTSProcTrab.IdeTrabalhador }
         *     
         */
        public void setIdeTrabalhador(ESocial.EvtFGTSProcTrab.IdeTrabalhador value) {
            this.ideTrabalhador = value;
        }

        /**
         * Gets the value of the infoTrabFGTS property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the infoTrabFGTS property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInfoTrabFGTS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ESocial.EvtFGTSProcTrab.InfoTrabFGTS }
         * 
         * 
         */
        public List<ESocial.EvtFGTSProcTrab.InfoTrabFGTS> getInfoTrabFGTS() {
            if (infoTrabFGTS == null) {
                infoTrabFGTS = new ArrayList<ESocial.EvtFGTSProcTrab.InfoTrabFGTS>();
            }
            return this.infoTrabFGTS;
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
         *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_tpInsc_1_2"/>
         *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrInsc_8_11_14"/>
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
            "nrInsc"
        })
        public static class IdeEmpregador {

            protected byte tpInsc;
            @XmlElement(required = true)
            protected String nrInsc;

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
         *         &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrRecArqBase"/>
         *         &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_perApur"/>
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
            "perApur"
        })
        public static class IdeEvento {

            @XmlElement(required = true)
            protected String nrRecArqBase;
            @XmlElement(required = true)
            protected String perApur;

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
             * Obtém o valor da propriedade perApur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPerApur() {
                return perApur;
            }

            /**
             * Define o valor da propriedade perApur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPerApur(String value) {
                this.perApur = value;
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
         *         &lt;element name="origem" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_origem"/>
         *         &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrProcTrab"/>
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
            "origem",
            "nrProcTrab"
        })
        public static class IdeProc {

            protected byte origem;
            @XmlElement(required = true)
            protected String nrProcTrab;

            /**
             * Obtém o valor da propriedade origem.
             * 
             */
            public byte getOrigem() {
                return origem;
            }

            /**
             * Define o valor da propriedade origem.
             * 
             */
            public void setOrigem(byte value) {
                this.origem = value;
            }

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
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_cpfRetorno"/>
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
            "cpfTrab"
        })
        public static class IdeTrabalhador {

            @XmlElement(required = true)
            protected String cpfTrab;

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
         *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
         *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
         *         &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
         *         &lt;element name="infoFGTSProcTrab">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="totalFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario"/>
         *                   &lt;element name="ideEstab" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_tpInsc_EstabLot"/>
         *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrInsc_EstabLot"/>
         *                             &lt;element name="basePerRef" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
         *                                       &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_codCateg"/>
         *                                       &lt;element name="tpValorProcTrab">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                             &lt;enumeration value="71"/>
         *                                             &lt;enumeration value="72"/>
         *                                             &lt;enumeration value="73"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="remFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario"/>
         *                                       &lt;element name="dpsFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                       &lt;element name="remFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                       &lt;element name="dpsFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                       &lt;element name="remFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                       &lt;element name="dpsFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
            "matricula",
            "codCateg",
            "categOrig",
            "infoFGTSProcTrab"
        })
        public static class InfoTrabFGTS {

            protected String matricula;
            protected BigInteger codCateg;
            protected BigInteger categOrig;
            @XmlElement(required = true)
            protected ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab infoFGTSProcTrab;

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
             * Obtém o valor da propriedade categOrig.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCategOrig() {
                return categOrig;
            }

            /**
             * Define o valor da propriedade categOrig.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCategOrig(BigInteger value) {
                this.categOrig = value;
            }

            /**
             * Obtém o valor da propriedade infoFGTSProcTrab.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab }
             *     
             */
            public ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab getInfoFGTSProcTrab() {
                return infoFGTSProcTrab;
            }

            /**
             * Define o valor da propriedade infoFGTSProcTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab }
             *     
             */
            public void setInfoFGTSProcTrab(ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab value) {
                this.infoFGTSProcTrab = value;
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
             *         &lt;element name="totalFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario"/>
             *         &lt;element name="ideEstab" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_tpInsc_EstabLot"/>
             *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrInsc_EstabLot"/>
             *                   &lt;element name="basePerRef" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
             *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_codCateg"/>
             *                             &lt;element name="tpValorProcTrab">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                   &lt;enumeration value="71"/>
             *                                   &lt;enumeration value="72"/>
             *                                   &lt;enumeration value="73"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="remFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario"/>
             *                             &lt;element name="dpsFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                             &lt;element name="remFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                             &lt;element name="dpsFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                             &lt;element name="remFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                             &lt;element name="dpsFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "totalFGTS",
                "ideEstab"
            })
            public static class InfoFGTSProcTrab {

                @XmlElement(required = true)
                protected BigDecimal totalFGTS;
                protected ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab.IdeEstab ideEstab;

                /**
                 * Obtém o valor da propriedade totalFGTS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalFGTS() {
                    return totalFGTS;
                }

                /**
                 * Define o valor da propriedade totalFGTS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalFGTS(BigDecimal value) {
                    this.totalFGTS = value;
                }

                /**
                 * Obtém o valor da propriedade ideEstab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab.IdeEstab }
                 *     
                 */
                public ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab.IdeEstab getIdeEstab() {
                    return ideEstab;
                }

                /**
                 * Define o valor da propriedade ideEstab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab.IdeEstab }
                 *     
                 */
                public void setIdeEstab(ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab.IdeEstab value) {
                    this.ideEstab = value;
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
                 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_tpInsc_EstabLot"/>
                 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_nrInsc_EstabLot"/>
                 *         &lt;element name="basePerRef" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
                 *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_codCateg"/>
                 *                   &lt;element name="tpValorProcTrab">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                         &lt;enumeration value="71"/>
                 *                         &lt;enumeration value="72"/>
                 *                         &lt;enumeration value="73"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="remFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario"/>
                 *                   &lt;element name="dpsFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                   &lt;element name="remFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                   &lt;element name="dpsFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                   &lt;element name="remFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                   &lt;element name="dpsFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
                    "tpInsc",
                    "nrInsc",
                    "basePerRef"
                })
                public static class IdeEstab {

                    protected byte tpInsc;
                    @XmlElement(required = true)
                    protected String nrInsc;
                    protected List<ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab.IdeEstab.BasePerRef> basePerRef;

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
                     * Gets the value of the basePerRef property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the basePerRef property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBasePerRef().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab.IdeEstab.BasePerRef }
                     * 
                     * 
                     */
                    public List<ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab.IdeEstab.BasePerRef> getBasePerRef() {
                        if (basePerRef == null) {
                            basePerRef = new ArrayList<ESocial.EvtFGTSProcTrab.InfoTrabFGTS.InfoFGTSProcTrab.IdeEstab.BasePerRef>();
                        }
                        return this.basePerRef;
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
                     *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
                     *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_codCateg"/>
                     *         &lt;element name="tpValorProcTrab">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *               &lt;enumeration value="71"/>
                     *               &lt;enumeration value="72"/>
                     *               &lt;enumeration value="73"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="remFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario"/>
                     *         &lt;element name="dpsFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *         &lt;element name="remFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *         &lt;element name="dpsFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *         &lt;element name="remFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *         &lt;element name="dpsFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtFGTSProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
                        "perRef",
                        "codCateg",
                        "tpValorProcTrab",
                        "remFGTSProcTrab",
                        "dpsFGTSProcTrab",
                        "remFGTSSefip",
                        "dpsFGTSSefip",
                        "remFGTSDecAnt",
                        "dpsFGTSDecAnt"
                    })
                    public static class BasePerRef {

                        @XmlElement(required = true)
                        protected String perRef;
                        @XmlElement(required = true)
                        protected BigInteger codCateg;
                        protected byte tpValorProcTrab;
                        @XmlElement(required = true)
                        protected BigDecimal remFGTSProcTrab;
                        protected BigDecimal dpsFGTSProcTrab;
                        protected BigDecimal remFGTSSefip;
                        protected BigDecimal dpsFGTSSefip;
                        protected BigDecimal remFGTSDecAnt;
                        protected BigDecimal dpsFGTSDecAnt;

                        /**
                         * Obtém o valor da propriedade perRef.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPerRef() {
                            return perRef;
                        }

                        /**
                         * Define o valor da propriedade perRef.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPerRef(String value) {
                            this.perRef = value;
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
                         * Obtém o valor da propriedade tpValorProcTrab.
                         * 
                         */
                        public byte getTpValorProcTrab() {
                            return tpValorProcTrab;
                        }

                        /**
                         * Define o valor da propriedade tpValorProcTrab.
                         * 
                         */
                        public void setTpValorProcTrab(byte value) {
                            this.tpValorProcTrab = value;
                        }

                        /**
                         * Obtém o valor da propriedade remFGTSProcTrab.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getRemFGTSProcTrab() {
                            return remFGTSProcTrab;
                        }

                        /**
                         * Define o valor da propriedade remFGTSProcTrab.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setRemFGTSProcTrab(BigDecimal value) {
                            this.remFGTSProcTrab = value;
                        }

                        /**
                         * Obtém o valor da propriedade dpsFGTSProcTrab.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getDpsFGTSProcTrab() {
                            return dpsFGTSProcTrab;
                        }

                        /**
                         * Define o valor da propriedade dpsFGTSProcTrab.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setDpsFGTSProcTrab(BigDecimal value) {
                            this.dpsFGTSProcTrab = value;
                        }

                        /**
                         * Obtém o valor da propriedade remFGTSSefip.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getRemFGTSSefip() {
                            return remFGTSSefip;
                        }

                        /**
                         * Define o valor da propriedade remFGTSSefip.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setRemFGTSSefip(BigDecimal value) {
                            this.remFGTSSefip = value;
                        }

                        /**
                         * Obtém o valor da propriedade dpsFGTSSefip.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getDpsFGTSSefip() {
                            return dpsFGTSSefip;
                        }

                        /**
                         * Define o valor da propriedade dpsFGTSSefip.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setDpsFGTSSefip(BigDecimal value) {
                            this.dpsFGTSSefip = value;
                        }

                        /**
                         * Obtém o valor da propriedade remFGTSDecAnt.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getRemFGTSDecAnt() {
                            return remFGTSDecAnt;
                        }

                        /**
                         * Define o valor da propriedade remFGTSDecAnt.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setRemFGTSDecAnt(BigDecimal value) {
                            this.remFGTSDecAnt = value;
                        }

                        /**
                         * Obtém o valor da propriedade dpsFGTSDecAnt.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getDpsFGTSDecAnt() {
                            return dpsFGTSDecAnt;
                        }

                        /**
                         * Define o valor da propriedade dpsFGTSDecAnt.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setDpsFGTSDecAnt(BigDecimal value) {
                            this.dpsFGTSDecAnt = value;
                        }

                    }

                }

            }

        }

    }

}
