//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:33 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tsvtermino;

import java.math.BigDecimal;
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
 *         &lt;element name="evtTSVTermino">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_ideEvento_trab_indGuia"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_ideEmpregador"/>
 *                   &lt;element name="ideTrabSemVinculo" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_ideTrabSemVinculo"/>
 *                   &lt;element name="infoTSVTermino">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="mtvDesligTSV" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="01"/>
 *                                   &lt;enumeration value="02"/>
 *                                   &lt;enumeration value="03"/>
 *                                   &lt;enumeration value="04"/>
 *                                   &lt;enumeration value="05"/>
 *                                   &lt;enumeration value="06"/>
 *                                   &lt;enumeration value="07"/>
 *                                   &lt;enumeration value="99"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="pensAlim" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_pensAlim" minOccurs="0"/>
 *                             &lt;element name="percAliment" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_percAliment" minOccurs="0"/>
 *                             &lt;element name="vrAlim" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_vrAlim" minOccurs="0"/>
 *                             &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrProcJud" minOccurs="0"/>
 *                             &lt;element name="mudancaCPF" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="novoCPF" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_cpf"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="verbasResc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dmDev" maxOccurs="50">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codigo_esocial"/>
 *                                                 &lt;element name="indRRA" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_indRRA" minOccurs="0"/>
 *                                                 &lt;element name="notAFT" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_notAFT" minOccurs="0"/>
 *                                                 &lt;element name="infoRRA" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoRRA" minOccurs="0"/>
 *                                                 &lt;element name="ideEstabLot" maxOccurs="99">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpInsc_EstabLot_1_4"/>
 *                                                           &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrInsc_12_14"/>
 *                                                           &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codLotacao"/>
 *                                                           &lt;element name="detVerbas" maxOccurs="200">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codigo_esocial"/>
 *                                                                     &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_ideTabRubr"/>
 *                                                                     &lt;element name="qtdRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_qtdRubr" minOccurs="0"/>
 *                                                                     &lt;element name="fatorRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_fator" minOccurs="0"/>
 *                                                                     &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_vrRubr"/>
 *                                                                     &lt;element name="indApurIR" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_indApurIR" minOccurs="0"/>
 *                                                                     &lt;element name="descFolha" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="tpDesc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpDesc"/>
 *                                                                               &lt;element name="instFinanc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_instFinanc"/>
 *                                                                               &lt;element name="nrDoc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrDoc"/>
 *                                                                               &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_observacao" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="infoSimples" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoSimples_S-2399" minOccurs="0"/>
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
 *                                       &lt;element name="procJudTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_procJudTrab" maxOccurs="99" minOccurs="0"/>
 *                                       &lt;element name="infoMV" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoMV" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="remunAposTerm" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="indRemun" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dtFimRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_Id" />
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
    "evtTSVTermino",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtTSVTermino evtTSVTermino;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTSVTermino.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTSVTermino }
     *     
     */
    public ESocial.EvtTSVTermino getEvtTSVTermino() {
        return evtTSVTermino;
    }

    /**
     * Define o valor da propriedade evtTSVTermino.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTSVTermino }
     *     
     */
    public void setEvtTSVTermino(ESocial.EvtTSVTermino value) {
        this.evtTSVTermino = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_ideEvento_trab_indGuia"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_ideEmpregador"/>
     *         &lt;element name="ideTrabSemVinculo" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_ideTrabSemVinculo"/>
     *         &lt;element name="infoTSVTermino">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="mtvDesligTSV" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="01"/>
     *                         &lt;enumeration value="02"/>
     *                         &lt;enumeration value="03"/>
     *                         &lt;enumeration value="04"/>
     *                         &lt;enumeration value="05"/>
     *                         &lt;enumeration value="06"/>
     *                         &lt;enumeration value="07"/>
     *                         &lt;enumeration value="99"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="pensAlim" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_pensAlim" minOccurs="0"/>
     *                   &lt;element name="percAliment" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_percAliment" minOccurs="0"/>
     *                   &lt;element name="vrAlim" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_vrAlim" minOccurs="0"/>
     *                   &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrProcJud" minOccurs="0"/>
     *                   &lt;element name="mudancaCPF" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="novoCPF" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_cpf"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="verbasResc" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dmDev" maxOccurs="50">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codigo_esocial"/>
     *                                       &lt;element name="indRRA" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_indRRA" minOccurs="0"/>
     *                                       &lt;element name="notAFT" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_notAFT" minOccurs="0"/>
     *                                       &lt;element name="infoRRA" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoRRA" minOccurs="0"/>
     *                                       &lt;element name="ideEstabLot" maxOccurs="99">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpInsc_EstabLot_1_4"/>
     *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrInsc_12_14"/>
     *                                                 &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codLotacao"/>
     *                                                 &lt;element name="detVerbas" maxOccurs="200">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codigo_esocial"/>
     *                                                           &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_ideTabRubr"/>
     *                                                           &lt;element name="qtdRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_qtdRubr" minOccurs="0"/>
     *                                                           &lt;element name="fatorRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_fator" minOccurs="0"/>
     *                                                           &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_vrRubr"/>
     *                                                           &lt;element name="indApurIR" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_indApurIR" minOccurs="0"/>
     *                                                           &lt;element name="descFolha" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="tpDesc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpDesc"/>
     *                                                                     &lt;element name="instFinanc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_instFinanc"/>
     *                                                                     &lt;element name="nrDoc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrDoc"/>
     *                                                                     &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_observacao" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="infoSimples" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoSimples_S-2399" minOccurs="0"/>
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
     *                             &lt;element name="procJudTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_procJudTrab" maxOccurs="99" minOccurs="0"/>
     *                             &lt;element name="infoMV" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoMV" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="remunAposTerm" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="indRemun" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dtFimRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_Id" />
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
        "ideTrabSemVinculo",
        "infoTSVTermino"
    })
    public static class EvtTSVTermino {

        @XmlElement(required = true)
        protected TIdeEventoTrabIndGuia ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected TIdeTrabSemVinculo ideTrabSemVinculo;
        @XmlElement(required = true)
        protected ESocial.EvtTSVTermino.InfoTSVTermino infoTSVTermino;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrabIndGuia }
         *     
         */
        public TIdeEventoTrabIndGuia getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrabIndGuia }
         *     
         */
        public void setIdeEvento(TIdeEventoTrabIndGuia value) {
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
         * Obtém o valor da propriedade ideTrabSemVinculo.
         * 
         * @return
         *     possible object is
         *     {@link TIdeTrabSemVinculo }
         *     
         */
        public TIdeTrabSemVinculo getIdeTrabSemVinculo() {
            return ideTrabSemVinculo;
        }

        /**
         * Define o valor da propriedade ideTrabSemVinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeTrabSemVinculo }
         *     
         */
        public void setIdeTrabSemVinculo(TIdeTrabSemVinculo value) {
            this.ideTrabSemVinculo = value;
        }

        /**
         * Obtém o valor da propriedade infoTSVTermino.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTSVTermino.InfoTSVTermino }
         *     
         */
        public ESocial.EvtTSVTermino.InfoTSVTermino getInfoTSVTermino() {
            return infoTSVTermino;
        }

        /**
         * Define o valor da propriedade infoTSVTermino.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTSVTermino.InfoTSVTermino }
         *     
         */
        public void setInfoTSVTermino(ESocial.EvtTSVTermino.InfoTSVTermino value) {
            this.infoTSVTermino = value;
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
         *         &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="mtvDesligTSV" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="01"/>
         *               &lt;enumeration value="02"/>
         *               &lt;enumeration value="03"/>
         *               &lt;enumeration value="04"/>
         *               &lt;enumeration value="05"/>
         *               &lt;enumeration value="06"/>
         *               &lt;enumeration value="07"/>
         *               &lt;enumeration value="99"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="pensAlim" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_pensAlim" minOccurs="0"/>
         *         &lt;element name="percAliment" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_percAliment" minOccurs="0"/>
         *         &lt;element name="vrAlim" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_vrAlim" minOccurs="0"/>
         *         &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrProcJud" minOccurs="0"/>
         *         &lt;element name="mudancaCPF" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="novoCPF" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_cpf"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="verbasResc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dmDev" maxOccurs="50">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codigo_esocial"/>
         *                             &lt;element name="indRRA" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_indRRA" minOccurs="0"/>
         *                             &lt;element name="notAFT" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_notAFT" minOccurs="0"/>
         *                             &lt;element name="infoRRA" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoRRA" minOccurs="0"/>
         *                             &lt;element name="ideEstabLot" maxOccurs="99">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpInsc_EstabLot_1_4"/>
         *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrInsc_12_14"/>
         *                                       &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codLotacao"/>
         *                                       &lt;element name="detVerbas" maxOccurs="200">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codigo_esocial"/>
         *                                                 &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_ideTabRubr"/>
         *                                                 &lt;element name="qtdRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_qtdRubr" minOccurs="0"/>
         *                                                 &lt;element name="fatorRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_fator" minOccurs="0"/>
         *                                                 &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_vrRubr"/>
         *                                                 &lt;element name="indApurIR" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_indApurIR" minOccurs="0"/>
         *                                                 &lt;element name="descFolha" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="tpDesc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpDesc"/>
         *                                                           &lt;element name="instFinanc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_instFinanc"/>
         *                                                           &lt;element name="nrDoc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrDoc"/>
         *                                                           &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_observacao" minOccurs="0"/>
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
         *                                       &lt;element name="infoSimples" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoSimples_S-2399" minOccurs="0"/>
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
         *                   &lt;element name="procJudTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_procJudTrab" maxOccurs="99" minOccurs="0"/>
         *                   &lt;element name="infoMV" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoMV" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="remunAposTerm" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="indRemun" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dtFimRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "dtTerm",
            "mtvDesligTSV",
            "pensAlim",
            "percAliment",
            "vrAlim",
            "nrProcTrab",
            "mudancaCPF",
            "verbasResc",
            "remunAposTerm"
        })
        public static class InfoTSVTermino {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtTerm;
            protected String mtvDesligTSV;
            protected Byte pensAlim;
            protected BigDecimal percAliment;
            protected BigDecimal vrAlim;
            protected String nrProcTrab;
            protected ESocial.EvtTSVTermino.InfoTSVTermino.MudancaCPF mudancaCPF;
            protected ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc verbasResc;
            protected ESocial.EvtTSVTermino.InfoTSVTermino.RemunAposTerm remunAposTerm;

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
             * Obtém o valor da propriedade mtvDesligTSV.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMtvDesligTSV() {
                return mtvDesligTSV;
            }

            /**
             * Define o valor da propriedade mtvDesligTSV.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMtvDesligTSV(String value) {
                this.mtvDesligTSV = value;
            }

            /**
             * Obtém o valor da propriedade pensAlim.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getPensAlim() {
                return pensAlim;
            }

            /**
             * Define o valor da propriedade pensAlim.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setPensAlim(Byte value) {
                this.pensAlim = value;
            }

            /**
             * Obtém o valor da propriedade percAliment.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercAliment() {
                return percAliment;
            }

            /**
             * Define o valor da propriedade percAliment.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercAliment(BigDecimal value) {
                this.percAliment = value;
            }

            /**
             * Obtém o valor da propriedade vrAlim.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrAlim() {
                return vrAlim;
            }

            /**
             * Define o valor da propriedade vrAlim.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrAlim(BigDecimal value) {
                this.vrAlim = value;
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

            /**
             * Obtém o valor da propriedade mudancaCPF.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVTermino.InfoTSVTermino.MudancaCPF }
             *     
             */
            public ESocial.EvtTSVTermino.InfoTSVTermino.MudancaCPF getMudancaCPF() {
                return mudancaCPF;
            }

            /**
             * Define o valor da propriedade mudancaCPF.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVTermino.InfoTSVTermino.MudancaCPF }
             *     
             */
            public void setMudancaCPF(ESocial.EvtTSVTermino.InfoTSVTermino.MudancaCPF value) {
                this.mudancaCPF = value;
            }

            /**
             * Obtém o valor da propriedade verbasResc.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc }
             *     
             */
            public ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc getVerbasResc() {
                return verbasResc;
            }

            /**
             * Define o valor da propriedade verbasResc.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc }
             *     
             */
            public void setVerbasResc(ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc value) {
                this.verbasResc = value;
            }

            /**
             * Obtém o valor da propriedade remunAposTerm.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVTermino.InfoTSVTermino.RemunAposTerm }
             *     
             */
            public ESocial.EvtTSVTermino.InfoTSVTermino.RemunAposTerm getRemunAposTerm() {
                return remunAposTerm;
            }

            /**
             * Define o valor da propriedade remunAposTerm.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVTermino.InfoTSVTermino.RemunAposTerm }
             *     
             */
            public void setRemunAposTerm(ESocial.EvtTSVTermino.InfoTSVTermino.RemunAposTerm value) {
                this.remunAposTerm = value;
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
             *         &lt;element name="novoCPF" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_cpf"/>
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
                "novoCPF"
            })
            public static class MudancaCPF {

                @XmlElement(required = true)
                protected String novoCPF;

                /**
                 * Obtém o valor da propriedade novoCPF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNovoCPF() {
                    return novoCPF;
                }

                /**
                 * Define o valor da propriedade novoCPF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNovoCPF(String value) {
                    this.novoCPF = value;
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
             *         &lt;element name="indRemun" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dtFimRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "indRemun",
                "dtFimRemun"
            })
            public static class RemunAposTerm {

                protected Byte indRemun;
                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtFimRemun;

                /**
                 * Obtém o valor da propriedade indRemun.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getIndRemun() {
                    return indRemun;
                }

                /**
                 * Define o valor da propriedade indRemun.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setIndRemun(Byte value) {
                    this.indRemun = value;
                }

                /**
                 * Obtém o valor da propriedade dtFimRemun.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtFimRemun() {
                    return dtFimRemun;
                }

                /**
                 * Define o valor da propriedade dtFimRemun.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtFimRemun(XMLGregorianCalendar value) {
                    this.dtFimRemun = value;
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
             *         &lt;element name="dmDev" maxOccurs="50">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codigo_esocial"/>
             *                   &lt;element name="indRRA" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_indRRA" minOccurs="0"/>
             *                   &lt;element name="notAFT" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_notAFT" minOccurs="0"/>
             *                   &lt;element name="infoRRA" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoRRA" minOccurs="0"/>
             *                   &lt;element name="ideEstabLot" maxOccurs="99">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpInsc_EstabLot_1_4"/>
             *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrInsc_12_14"/>
             *                             &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codLotacao"/>
             *                             &lt;element name="detVerbas" maxOccurs="200">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codigo_esocial"/>
             *                                       &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_ideTabRubr"/>
             *                                       &lt;element name="qtdRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_qtdRubr" minOccurs="0"/>
             *                                       &lt;element name="fatorRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_fator" minOccurs="0"/>
             *                                       &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_vrRubr"/>
             *                                       &lt;element name="indApurIR" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_indApurIR" minOccurs="0"/>
             *                                       &lt;element name="descFolha" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="tpDesc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpDesc"/>
             *                                                 &lt;element name="instFinanc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_instFinanc"/>
             *                                                 &lt;element name="nrDoc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrDoc"/>
             *                                                 &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_observacao" minOccurs="0"/>
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
             *                             &lt;element name="infoSimples" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoSimples_S-2399" minOccurs="0"/>
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
             *         &lt;element name="procJudTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_procJudTrab" maxOccurs="99" minOccurs="0"/>
             *         &lt;element name="infoMV" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoMV" minOccurs="0"/>
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
                "dmDev",
                "procJudTrab",
                "infoMV"
            })
            public static class VerbasResc {

                @XmlElement(required = true)
                protected List<ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev> dmDev;
                protected List<TProcJudTrab> procJudTrab;
                protected TInfoMV infoMV;

                /**
                 * Gets the value of the dmDev property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dmDev property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDmDev().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev }
                 * 
                 * 
                 */
                public List<ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev> getDmDev() {
                    if (dmDev == null) {
                        dmDev = new ArrayList<ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev>();
                    }
                    return this.dmDev;
                }

                /**
                 * Gets the value of the procJudTrab property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the procJudTrab property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcJudTrab().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TProcJudTrab }
                 * 
                 * 
                 */
                public List<TProcJudTrab> getProcJudTrab() {
                    if (procJudTrab == null) {
                        procJudTrab = new ArrayList<TProcJudTrab>();
                    }
                    return this.procJudTrab;
                }

                /**
                 * Obtém o valor da propriedade infoMV.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TInfoMV }
                 *     
                 */
                public TInfoMV getInfoMV() {
                    return infoMV;
                }

                /**
                 * Define o valor da propriedade infoMV.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TInfoMV }
                 *     
                 */
                public void setInfoMV(TInfoMV value) {
                    this.infoMV = value;
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
                 *         &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codigo_esocial"/>
                 *         &lt;element name="indRRA" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_indRRA" minOccurs="0"/>
                 *         &lt;element name="notAFT" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_notAFT" minOccurs="0"/>
                 *         &lt;element name="infoRRA" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoRRA" minOccurs="0"/>
                 *         &lt;element name="ideEstabLot" maxOccurs="99">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpInsc_EstabLot_1_4"/>
                 *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrInsc_12_14"/>
                 *                   &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codLotacao"/>
                 *                   &lt;element name="detVerbas" maxOccurs="200">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codigo_esocial"/>
                 *                             &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_ideTabRubr"/>
                 *                             &lt;element name="qtdRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_qtdRubr" minOccurs="0"/>
                 *                             &lt;element name="fatorRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_fator" minOccurs="0"/>
                 *                             &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_vrRubr"/>
                 *                             &lt;element name="indApurIR" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_indApurIR" minOccurs="0"/>
                 *                             &lt;element name="descFolha" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="tpDesc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpDesc"/>
                 *                                       &lt;element name="instFinanc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_instFinanc"/>
                 *                                       &lt;element name="nrDoc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrDoc"/>
                 *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_observacao" minOccurs="0"/>
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
                 *                   &lt;element name="infoSimples" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoSimples_S-2399" minOccurs="0"/>
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
                    "ideDmDev",
                    "indRRA",
                    "notAFT",
                    "infoRRA",
                    "ideEstabLot"
                })
                public static class DmDev {

                    @XmlElement(required = true)
                    protected String ideDmDev;
                    @XmlSchemaType(name = "string")
                    protected TSSim indRRA;
                    protected String notAFT;
                    protected TInfoRRA infoRRA;
                    @XmlElement(required = true)
                    protected List<ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot> ideEstabLot;

                    /**
                     * Obtém o valor da propriedade ideDmDev.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIdeDmDev() {
                        return ideDmDev;
                    }

                    /**
                     * Define o valor da propriedade ideDmDev.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIdeDmDev(String value) {
                        this.ideDmDev = value;
                    }

                    /**
                     * Obtém o valor da propriedade indRRA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TSSim }
                     *     
                     */
                    public TSSim getIndRRA() {
                        return indRRA;
                    }

                    /**
                     * Define o valor da propriedade indRRA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TSSim }
                     *     
                     */
                    public void setIndRRA(TSSim value) {
                        this.indRRA = value;
                    }

                    /**
                     * Obtém o valor da propriedade notAFT.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNotAFT() {
                        return notAFT;
                    }

                    /**
                     * Define o valor da propriedade notAFT.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNotAFT(String value) {
                        this.notAFT = value;
                    }

                    /**
                     * Obtém o valor da propriedade infoRRA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TInfoRRA }
                     *     
                     */
                    public TInfoRRA getInfoRRA() {
                        return infoRRA;
                    }

                    /**
                     * Define o valor da propriedade infoRRA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TInfoRRA }
                     *     
                     */
                    public void setInfoRRA(TInfoRRA value) {
                        this.infoRRA = value;
                    }

                    /**
                     * Gets the value of the ideEstabLot property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the ideEstabLot property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getIdeEstabLot().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot }
                     * 
                     * 
                     */
                    public List<ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot> getIdeEstabLot() {
                        if (ideEstabLot == null) {
                            ideEstabLot = new ArrayList<ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot>();
                        }
                        return this.ideEstabLot;
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
                     *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpInsc_EstabLot_1_4"/>
                     *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrInsc_12_14"/>
                     *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codLotacao"/>
                     *         &lt;element name="detVerbas" maxOccurs="200">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codigo_esocial"/>
                     *                   &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_ideTabRubr"/>
                     *                   &lt;element name="qtdRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_qtdRubr" minOccurs="0"/>
                     *                   &lt;element name="fatorRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_fator" minOccurs="0"/>
                     *                   &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_vrRubr"/>
                     *                   &lt;element name="indApurIR" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_indApurIR" minOccurs="0"/>
                     *                   &lt;element name="descFolha" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="tpDesc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpDesc"/>
                     *                             &lt;element name="instFinanc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_instFinanc"/>
                     *                             &lt;element name="nrDoc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrDoc"/>
                     *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_observacao" minOccurs="0"/>
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
                     *         &lt;element name="infoSimples" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}T_infoSimples_S-2399" minOccurs="0"/>
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
                        "codLotacao",
                        "detVerbas",
                        "infoSimples"
                    })
                    public static class IdeEstabLot {

                        protected byte tpInsc;
                        @XmlElement(required = true)
                        protected String nrInsc;
                        @XmlElement(required = true)
                        protected String codLotacao;
                        @XmlElement(required = true)
                        protected List<ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas> detVerbas;
                        protected TInfoSimplesS2399 infoSimples;

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
                         * {@link ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas }
                         * 
                         * 
                         */
                        public List<ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas> getDetVerbas() {
                            if (detVerbas == null) {
                                detVerbas = new ArrayList<ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas>();
                            }
                            return this.detVerbas;
                        }

                        /**
                         * Obtém o valor da propriedade infoSimples.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TInfoSimplesS2399 }
                         *     
                         */
                        public TInfoSimplesS2399 getInfoSimples() {
                            return infoSimples;
                        }

                        /**
                         * Define o valor da propriedade infoSimples.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TInfoSimplesS2399 }
                         *     
                         */
                        public void setInfoSimples(TInfoSimplesS2399 value) {
                            this.infoSimples = value;
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
                         *         &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_codigo_esocial"/>
                         *         &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_ideTabRubr"/>
                         *         &lt;element name="qtdRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_qtdRubr" minOccurs="0"/>
                         *         &lt;element name="fatorRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_fator" minOccurs="0"/>
                         *         &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_vrRubr"/>
                         *         &lt;element name="indApurIR" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_indApurIR" minOccurs="0"/>
                         *         &lt;element name="descFolha" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="tpDesc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpDesc"/>
                         *                   &lt;element name="instFinanc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_instFinanc"/>
                         *                   &lt;element name="nrDoc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrDoc"/>
                         *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_observacao" minOccurs="0"/>
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
                            "codRubr",
                            "ideTabRubr",
                            "qtdRubr",
                            "fatorRubr",
                            "vrRubr",
                            "indApurIR",
                            "descFolha"
                        })
                        public static class DetVerbas {

                            @XmlElement(required = true)
                            protected String codRubr;
                            @XmlElement(required = true)
                            protected String ideTabRubr;
                            protected BigDecimal qtdRubr;
                            protected BigDecimal fatorRubr;
                            @XmlElement(required = true)
                            protected BigDecimal vrRubr;
                            protected Byte indApurIR;
                            protected ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas.DescFolha descFolha;

                            /**
                             * Obtém o valor da propriedade codRubr.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodRubr() {
                                return codRubr;
                            }

                            /**
                             * Define o valor da propriedade codRubr.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodRubr(String value) {
                                this.codRubr = value;
                            }

                            /**
                             * Obtém o valor da propriedade ideTabRubr.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getIdeTabRubr() {
                                return ideTabRubr;
                            }

                            /**
                             * Define o valor da propriedade ideTabRubr.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setIdeTabRubr(String value) {
                                this.ideTabRubr = value;
                            }

                            /**
                             * Obtém o valor da propriedade qtdRubr.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getQtdRubr() {
                                return qtdRubr;
                            }

                            /**
                             * Define o valor da propriedade qtdRubr.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setQtdRubr(BigDecimal value) {
                                this.qtdRubr = value;
                            }

                            /**
                             * Obtém o valor da propriedade fatorRubr.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getFatorRubr() {
                                return fatorRubr;
                            }

                            /**
                             * Define o valor da propriedade fatorRubr.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setFatorRubr(BigDecimal value) {
                                this.fatorRubr = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrRubr.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrRubr() {
                                return vrRubr;
                            }

                            /**
                             * Define o valor da propriedade vrRubr.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrRubr(BigDecimal value) {
                                this.vrRubr = value;
                            }

                            /**
                             * Obtém o valor da propriedade indApurIR.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Byte }
                             *     
                             */
                            public Byte getIndApurIR() {
                                return indApurIR;
                            }

                            /**
                             * Define o valor da propriedade indApurIR.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Byte }
                             *     
                             */
                            public void setIndApurIR(Byte value) {
                                this.indApurIR = value;
                            }

                            /**
                             * Obtém o valor da propriedade descFolha.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas.DescFolha }
                             *     
                             */
                            public ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas.DescFolha getDescFolha() {
                                return descFolha;
                            }

                            /**
                             * Define o valor da propriedade descFolha.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas.DescFolha }
                             *     
                             */
                            public void setDescFolha(ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas.DescFolha value) {
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
                             *         &lt;element name="tpDesc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_tpDesc"/>
                             *         &lt;element name="instFinanc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_instFinanc"/>
                             *         &lt;element name="nrDoc" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_nrDoc"/>
                             *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVTermino/v_S_01_03_00}TS_observacao" minOccurs="0"/>
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

                    }

                }

            }

        }

    }

}
