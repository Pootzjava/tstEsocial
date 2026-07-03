//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:26 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.pgtos;

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
 *         &lt;element name="evtPgtos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_ideEvento_folha_mensal"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_ideEmpregador"/>
 *                   &lt;element name="ideBenef">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpf"/>
 *                             &lt;element name="infoPgto" maxOccurs="999" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="tpPgto">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                             &lt;enumeration value="4"/>
 *                                             &lt;enumeration value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_perApur"/>
 *                                       &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codigo_esocial"/>
 *                                       &lt;element name="vrLiq" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario"/>
 *                                       &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_pais" minOccurs="0"/>
 *                                       &lt;element name="infoPgtoExt" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="indNIF" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indNIF"/>
 *                                                 &lt;element name="nifBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codigo_esocial" minOccurs="0"/>
 *                                                 &lt;element name="frmTribut">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="\d{2}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="endExt" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="endDscLograd" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="80"/>
 *                                                                 &lt;pattern value="[^\s]{1}[\S\s]*"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="endNrLograd" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrLograd" minOccurs="0"/>
 *                                                           &lt;element name="endComplem" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_complemento" minOccurs="0"/>
 *                                                           &lt;element name="endBairro" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                                 &lt;pattern value=".*[^\s].*"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="endCidade" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="40"/>
 *                                                                 &lt;pattern value=".*[^\s].*"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="endEstado" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="40"/>
 *                                                                 &lt;pattern value=".*[^\s].*"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="endCodPostal" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="12"/>
 *                                                                 &lt;pattern value="[A-Za-z0-9]{1,12}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="telef" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="\d{8,15}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
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
 *                             &lt;element name="infoIRComplem" maxOccurs="13" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtLaudo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="perAnt" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="perRefAjuste" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_perApur_mensal"/>
 *                                                 &lt;element name="nrRec1210Orig" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrRecibo"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoDep" maxOccurs="999" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR"/>
 *                                                 &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_dtNascto" minOccurs="0"/>
 *                                                 &lt;element name="nome" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nmDep" minOccurs="0"/>
 *                                                 &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_depIRRF_IR" minOccurs="0"/>
 *                                                 &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpDep" minOccurs="0"/>
 *                                                 &lt;element name="descrDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_descrDep" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoIRCR" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpCR" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_CR_IR"/>
 *                                                 &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpRendDep"/>
 *                                                           &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
 *                                                           &lt;element name="vlrDedDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDedDep"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="penAlim" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpRendPenAlim"/>
 *                                                           &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfPenAlim"/>
 *                                                           &lt;element name="vlrDedPenAlim" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDedPenAlim"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="previdCompl" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpPrev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpPrevCompl"/>
 *                                                           &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj"/>
 *                                                           &lt;element name="vlrDedPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                           &lt;element name="vlrDedPC13" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                           &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                           &lt;element name="vlrPatrocFunp13" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoProcRet" maxOccurs="50" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpProcRet" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpProc_1_2"/>
 *                                                           &lt;element name="nrProcRet" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrProcRet"/>
 *                                                           &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codSuspIR" minOccurs="0"/>
 *                                                           &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indApuracao"/>
 *                                                                     &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
 *                                                                     &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
 *                                                                     &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
 *                                                                     &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
 *                                                                     &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
 *                                                                     &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indTpDeducao"/>
 *                                                                               &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                                               &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
 *                                                                               &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                                               &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
 *                                                                                         &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
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
 *                                       &lt;element name="planSaude" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj"/>
 *                                                 &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_regANS" minOccurs="0"/>
 *                                                 &lt;element name="vlrSaudeTit" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="infoDepSau" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
 *                                                           &lt;element name="vlrSaudeDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
 *                                       &lt;element name="infoReembMed" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="indOrgReemb" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indOrgReemb"/>
 *                                                 &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
 *                                                 &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_regANS" minOccurs="0"/>
 *                                                 &lt;element name="detReembTit" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_detReemb" maxOccurs="99" minOccurs="0"/>
 *                                                 &lt;element name="infoReembDep" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
 *                                                           &lt;element name="detReembDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_detReemb" maxOccurs="99" minOccurs="0"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_Id" />
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
    "evtPgtos",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtPgtos evtPgtos;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtPgtos.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtPgtos }
     *     
     */
    public ESocial.EvtPgtos getEvtPgtos() {
        return evtPgtos;
    }

    /**
     * Define o valor da propriedade evtPgtos.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtPgtos }
     *     
     */
    public void setEvtPgtos(ESocial.EvtPgtos value) {
        this.evtPgtos = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_ideEvento_folha_mensal"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_ideEmpregador"/>
     *         &lt;element name="ideBenef">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpf"/>
     *                   &lt;element name="infoPgto" maxOccurs="999" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="tpPgto">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="3"/>
     *                                   &lt;enumeration value="4"/>
     *                                   &lt;enumeration value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_perApur"/>
     *                             &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codigo_esocial"/>
     *                             &lt;element name="vrLiq" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario"/>
     *                             &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_pais" minOccurs="0"/>
     *                             &lt;element name="infoPgtoExt" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="indNIF" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indNIF"/>
     *                                       &lt;element name="nifBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codigo_esocial" minOccurs="0"/>
     *                                       &lt;element name="frmTribut">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="\d{2}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="endExt" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="endDscLograd" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="80"/>
     *                                                       &lt;pattern value="[^\s]{1}[\S\s]*"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="endNrLograd" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrLograd" minOccurs="0"/>
     *                                                 &lt;element name="endComplem" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_complemento" minOccurs="0"/>
     *                                                 &lt;element name="endBairro" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="60"/>
     *                                                       &lt;pattern value=".*[^\s].*"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="endCidade" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="40"/>
     *                                                       &lt;pattern value=".*[^\s].*"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="endEstado" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="40"/>
     *                                                       &lt;pattern value=".*[^\s].*"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="endCodPostal" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="12"/>
     *                                                       &lt;pattern value="[A-Za-z0-9]{1,12}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="telef" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="\d{8,15}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
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
     *                   &lt;element name="infoIRComplem" maxOccurs="13" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtLaudo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="perAnt" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="perRefAjuste" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_perApur_mensal"/>
     *                                       &lt;element name="nrRec1210Orig" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrRecibo"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoDep" maxOccurs="999" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR"/>
     *                                       &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_dtNascto" minOccurs="0"/>
     *                                       &lt;element name="nome" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nmDep" minOccurs="0"/>
     *                                       &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_depIRRF_IR" minOccurs="0"/>
     *                                       &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpDep" minOccurs="0"/>
     *                                       &lt;element name="descrDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_descrDep" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoIRCR" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpCR" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_CR_IR"/>
     *                                       &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpRendDep"/>
     *                                                 &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
     *                                                 &lt;element name="vlrDedDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDedDep"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="penAlim" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpRendPenAlim"/>
     *                                                 &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfPenAlim"/>
     *                                                 &lt;element name="vlrDedPenAlim" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDedPenAlim"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="previdCompl" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpPrev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpPrevCompl"/>
     *                                                 &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj"/>
     *                                                 &lt;element name="vlrDedPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                 &lt;element name="vlrDedPC13" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                 &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                 &lt;element name="vlrPatrocFunp13" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="infoProcRet" maxOccurs="50" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpProcRet" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpProc_1_2"/>
     *                                                 &lt;element name="nrProcRet" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrProcRet"/>
     *                                                 &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codSuspIR" minOccurs="0"/>
     *                                                 &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indApuracao"/>
     *                                                           &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
     *                                                           &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
     *                                                           &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
     *                                                           &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
     *                                                           &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
     *                                                           &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indTpDeducao"/>
     *                                                                     &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                                     &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
     *                                                                     &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                                     &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
     *                                                                               &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
     *                             &lt;element name="planSaude" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj"/>
     *                                       &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_regANS" minOccurs="0"/>
     *                                       &lt;element name="vlrSaudeTit" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="infoDepSau" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
     *                                                 &lt;element name="vlrSaudeDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
     *                             &lt;element name="infoReembMed" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="indOrgReemb" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indOrgReemb"/>
     *                                       &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
     *                                       &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_regANS" minOccurs="0"/>
     *                                       &lt;element name="detReembTit" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_detReemb" maxOccurs="99" minOccurs="0"/>
     *                                       &lt;element name="infoReembDep" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
     *                                                 &lt;element name="detReembDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_detReemb" maxOccurs="99" minOccurs="0"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_Id" />
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
        "ideBenef"
    })
    public static class EvtPgtos {

        @XmlElement(required = true)
        protected TIdeEventoFolhaMensal ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtPgtos.IdeBenef ideBenef;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoFolhaMensal }
         *     
         */
        public TIdeEventoFolhaMensal getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoFolhaMensal }
         *     
         */
        public void setIdeEvento(TIdeEventoFolhaMensal value) {
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
         * Obtém o valor da propriedade ideBenef.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtPgtos.IdeBenef }
         *     
         */
        public ESocial.EvtPgtos.IdeBenef getIdeBenef() {
            return ideBenef;
        }

        /**
         * Define o valor da propriedade ideBenef.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtPgtos.IdeBenef }
         *     
         */
        public void setIdeBenef(ESocial.EvtPgtos.IdeBenef value) {
            this.ideBenef = value;
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
         *         &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpf"/>
         *         &lt;element name="infoPgto" maxOccurs="999" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="tpPgto">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                         &lt;enumeration value="4"/>
         *                         &lt;enumeration value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_perApur"/>
         *                   &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codigo_esocial"/>
         *                   &lt;element name="vrLiq" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario"/>
         *                   &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_pais" minOccurs="0"/>
         *                   &lt;element name="infoPgtoExt" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="indNIF" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indNIF"/>
         *                             &lt;element name="nifBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codigo_esocial" minOccurs="0"/>
         *                             &lt;element name="frmTribut">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="\d{2}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="endExt" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="endDscLograd" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="80"/>
         *                                             &lt;pattern value="[^\s]{1}[\S\s]*"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="endNrLograd" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrLograd" minOccurs="0"/>
         *                                       &lt;element name="endComplem" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_complemento" minOccurs="0"/>
         *                                       &lt;element name="endBairro" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="60"/>
         *                                             &lt;pattern value=".*[^\s].*"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="endCidade" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="40"/>
         *                                             &lt;pattern value=".*[^\s].*"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="endEstado" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="40"/>
         *                                             &lt;pattern value=".*[^\s].*"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="endCodPostal" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="12"/>
         *                                             &lt;pattern value="[A-Za-z0-9]{1,12}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="telef" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="\d{8,15}"/>
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
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoIRComplem" maxOccurs="13" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtLaudo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="perAnt" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="perRefAjuste" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_perApur_mensal"/>
         *                             &lt;element name="nrRec1210Orig" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrRecibo"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoDep" maxOccurs="999" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR"/>
         *                             &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_dtNascto" minOccurs="0"/>
         *                             &lt;element name="nome" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nmDep" minOccurs="0"/>
         *                             &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_depIRRF_IR" minOccurs="0"/>
         *                             &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpDep" minOccurs="0"/>
         *                             &lt;element name="descrDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_descrDep" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoIRCR" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpCR" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_CR_IR"/>
         *                             &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpRendDep"/>
         *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
         *                                       &lt;element name="vlrDedDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDedDep"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="penAlim" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpRendPenAlim"/>
         *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfPenAlim"/>
         *                                       &lt;element name="vlrDedPenAlim" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDedPenAlim"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="previdCompl" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpPrev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpPrevCompl"/>
         *                                       &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj"/>
         *                                       &lt;element name="vlrDedPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                       &lt;element name="vlrDedPC13" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                       &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                       &lt;element name="vlrPatrocFunp13" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="infoProcRet" maxOccurs="50" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpProcRet" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpProc_1_2"/>
         *                                       &lt;element name="nrProcRet" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrProcRet"/>
         *                                       &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codSuspIR" minOccurs="0"/>
         *                                       &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indApuracao"/>
         *                                                 &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
         *                                                 &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
         *                                                 &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
         *                                                 &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
         *                                                 &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
         *                                                 &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indTpDeducao"/>
         *                                                           &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                                           &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
         *                                                           &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                                           &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
         *                                                                     &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
         *                   &lt;element name="planSaude" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj"/>
         *                             &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_regANS" minOccurs="0"/>
         *                             &lt;element name="vlrSaudeTit" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="infoDepSau" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
         *                                       &lt;element name="vlrSaudeDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
         *                   &lt;element name="infoReembMed" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="indOrgReemb" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indOrgReemb"/>
         *                             &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
         *                             &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_regANS" minOccurs="0"/>
         *                             &lt;element name="detReembTit" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_detReemb" maxOccurs="99" minOccurs="0"/>
         *                             &lt;element name="infoReembDep" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
         *                                       &lt;element name="detReembDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_detReemb" maxOccurs="99" minOccurs="0"/>
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
            "cpfBenef",
            "infoPgto",
            "infoIRComplem"
        })
        public static class IdeBenef {

            @XmlElement(required = true)
            protected String cpfBenef;
            protected List<ESocial.EvtPgtos.IdeBenef.InfoPgto> infoPgto;
            protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem> infoIRComplem;

            /**
             * Obtém o valor da propriedade cpfBenef.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpfBenef() {
                return cpfBenef;
            }

            /**
             * Define o valor da propriedade cpfBenef.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpfBenef(String value) {
                this.cpfBenef = value;
            }

            /**
             * Gets the value of the infoPgto property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoPgto property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoPgto().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtPgtos.IdeBenef.InfoPgto }
             * 
             * 
             */
            public List<ESocial.EvtPgtos.IdeBenef.InfoPgto> getInfoPgto() {
                if (infoPgto == null) {
                    infoPgto = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoPgto>();
                }
                return this.infoPgto;
            }

            /**
             * Gets the value of the infoIRComplem property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoIRComplem property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoIRComplem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem }
             * 
             * 
             */
            public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem> getInfoIRComplem() {
                if (infoIRComplem == null) {
                    infoIRComplem = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem>();
                }
                return this.infoIRComplem;
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
             *         &lt;element name="dtLaudo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="perAnt" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="perRefAjuste" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_perApur_mensal"/>
             *                   &lt;element name="nrRec1210Orig" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrRecibo"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoDep" maxOccurs="999" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR"/>
             *                   &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_dtNascto" minOccurs="0"/>
             *                   &lt;element name="nome" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nmDep" minOccurs="0"/>
             *                   &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_depIRRF_IR" minOccurs="0"/>
             *                   &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpDep" minOccurs="0"/>
             *                   &lt;element name="descrDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_descrDep" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoIRCR" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpCR" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_CR_IR"/>
             *                   &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpRendDep"/>
             *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
             *                             &lt;element name="vlrDedDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDedDep"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="penAlim" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpRendPenAlim"/>
             *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfPenAlim"/>
             *                             &lt;element name="vlrDedPenAlim" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDedPenAlim"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="previdCompl" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpPrev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpPrevCompl"/>
             *                             &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj"/>
             *                             &lt;element name="vlrDedPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                             &lt;element name="vlrDedPC13" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                             &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                             &lt;element name="vlrPatrocFunp13" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="infoProcRet" maxOccurs="50" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpProcRet" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpProc_1_2"/>
             *                             &lt;element name="nrProcRet" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrProcRet"/>
             *                             &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codSuspIR" minOccurs="0"/>
             *                             &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indApuracao"/>
             *                                       &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
             *                                       &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
             *                                       &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
             *                                       &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
             *                                       &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
             *                                       &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indTpDeducao"/>
             *                                                 &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                                                 &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
             *                                                 &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                                                 &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
             *                                                           &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="planSaude" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj"/>
             *                   &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_regANS" minOccurs="0"/>
             *                   &lt;element name="vlrSaudeTit" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="infoDepSau" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
             *                             &lt;element name="vlrSaudeDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
             *         &lt;element name="infoReembMed" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="indOrgReemb" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indOrgReemb"/>
             *                   &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
             *                   &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_regANS" minOccurs="0"/>
             *                   &lt;element name="detReembTit" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_detReemb" maxOccurs="99" minOccurs="0"/>
             *                   &lt;element name="infoReembDep" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
             *                             &lt;element name="detReembDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_detReemb" maxOccurs="99" minOccurs="0"/>
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
                "dtLaudo",
                "perAnt",
                "infoDep",
                "infoIRCR",
                "planSaude",
                "infoReembMed"
            })
            public static class InfoIRComplem {

                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtLaudo;
                protected ESocial.EvtPgtos.IdeBenef.InfoIRComplem.PerAnt perAnt;
                protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoDep> infoDep;
                protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR> infoIRCR;
                protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.PlanSaude> planSaude;
                protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoReembMed> infoReembMed;

                /**
                 * Obtém o valor da propriedade dtLaudo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtLaudo() {
                    return dtLaudo;
                }

                /**
                 * Define o valor da propriedade dtLaudo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtLaudo(XMLGregorianCalendar value) {
                    this.dtLaudo = value;
                }

                /**
                 * Obtém o valor da propriedade perAnt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.PerAnt }
                 *     
                 */
                public ESocial.EvtPgtos.IdeBenef.InfoIRComplem.PerAnt getPerAnt() {
                    return perAnt;
                }

                /**
                 * Define o valor da propriedade perAnt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.PerAnt }
                 *     
                 */
                public void setPerAnt(ESocial.EvtPgtos.IdeBenef.InfoIRComplem.PerAnt value) {
                    this.perAnt = value;
                }

                /**
                 * Gets the value of the infoDep property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoDep property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoDep().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoDep }
                 * 
                 * 
                 */
                public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoDep> getInfoDep() {
                    if (infoDep == null) {
                        infoDep = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoDep>();
                    }
                    return this.infoDep;
                }

                /**
                 * Gets the value of the infoIRCR property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoIRCR property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoIRCR().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR }
                 * 
                 * 
                 */
                public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR> getInfoIRCR() {
                    if (infoIRCR == null) {
                        infoIRCR = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR>();
                    }
                    return this.infoIRCR;
                }

                /**
                 * Gets the value of the planSaude property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the planSaude property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPlanSaude().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.PlanSaude }
                 * 
                 * 
                 */
                public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.PlanSaude> getPlanSaude() {
                    if (planSaude == null) {
                        planSaude = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.PlanSaude>();
                    }
                    return this.planSaude;
                }

                /**
                 * Gets the value of the infoReembMed property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoReembMed property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoReembMed().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoReembMed }
                 * 
                 * 
                 */
                public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoReembMed> getInfoReembMed() {
                    if (infoReembMed == null) {
                        infoReembMed = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoReembMed>();
                    }
                    return this.infoReembMed;
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
                 *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR"/>
                 *         &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_dtNascto" minOccurs="0"/>
                 *         &lt;element name="nome" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nmDep" minOccurs="0"/>
                 *         &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_depIRRF_IR" minOccurs="0"/>
                 *         &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpDep" minOccurs="0"/>
                 *         &lt;element name="descrDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_descrDep" minOccurs="0"/>
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
                    "cpfDep",
                    "dtNascto",
                    "nome",
                    "depIRRF",
                    "tpDep",
                    "descrDep"
                })
                public static class InfoDep {

                    @XmlElement(required = true)
                    protected String cpfDep;
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtNascto;
                    protected String nome;
                    @XmlSchemaType(name = "string")
                    protected TSSim depIRRF;
                    protected String tpDep;
                    protected String descrDep;

                    /**
                     * Obtém o valor da propriedade cpfDep.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCpfDep() {
                        return cpfDep;
                    }

                    /**
                     * Define o valor da propriedade cpfDep.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCpfDep(String value) {
                        this.cpfDep = value;
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
                     * Obtém o valor da propriedade nome.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNome() {
                        return nome;
                    }

                    /**
                     * Define o valor da propriedade nome.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNome(String value) {
                        this.nome = value;
                    }

                    /**
                     * Obtém o valor da propriedade depIRRF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TSSim }
                     *     
                     */
                    public TSSim getDepIRRF() {
                        return depIRRF;
                    }

                    /**
                     * Define o valor da propriedade depIRRF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TSSim }
                     *     
                     */
                    public void setDepIRRF(TSSim value) {
                        this.depIRRF = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpDep.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpDep() {
                        return tpDep;
                    }

                    /**
                     * Define o valor da propriedade tpDep.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpDep(String value) {
                        this.tpDep = value;
                    }

                    /**
                     * Obtém o valor da propriedade descrDep.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescrDep() {
                        return descrDep;
                    }

                    /**
                     * Define o valor da propriedade descrDep.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescrDep(String value) {
                        this.descrDep = value;
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
                 *         &lt;element name="tpCR" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_CR_IR"/>
                 *         &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpRendDep"/>
                 *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
                 *                   &lt;element name="vlrDedDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDedDep"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="penAlim" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpRendPenAlim"/>
                 *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfPenAlim"/>
                 *                   &lt;element name="vlrDedPenAlim" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDedPenAlim"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="previdCompl" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpPrev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpPrevCompl"/>
                 *                   &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj"/>
                 *                   &lt;element name="vlrDedPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                   &lt;element name="vlrDedPC13" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                   &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                   &lt;element name="vlrPatrocFunp13" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="infoProcRet" maxOccurs="50" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpProcRet" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpProc_1_2"/>
                 *                   &lt;element name="nrProcRet" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrProcRet"/>
                 *                   &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codSuspIR" minOccurs="0"/>
                 *                   &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indApuracao"/>
                 *                             &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
                 *                             &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
                 *                             &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
                 *                             &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
                 *                             &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
                 *                             &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indTpDeducao"/>
                 *                                       &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                                       &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
                 *                                       &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                                       &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
                 *                                                 &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "tpCR",
                    "dedDepen",
                    "penAlim",
                    "previdCompl",
                    "infoProcRet"
                })
                public static class InfoIRCR {

                    @XmlElement(required = true)
                    protected String tpCR;
                    protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.DedDepen> dedDepen;
                    protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.PenAlim> penAlim;
                    protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.PrevidCompl> previdCompl;
                    protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet> infoProcRet;

                    /**
                     * Obtém o valor da propriedade tpCR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpCR() {
                        return tpCR;
                    }

                    /**
                     * Define o valor da propriedade tpCR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpCR(String value) {
                        this.tpCR = value;
                    }

                    /**
                     * Gets the value of the dedDepen property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the dedDepen property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getDedDepen().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.DedDepen }
                     * 
                     * 
                     */
                    public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.DedDepen> getDedDepen() {
                        if (dedDepen == null) {
                            dedDepen = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.DedDepen>();
                        }
                        return this.dedDepen;
                    }

                    /**
                     * Gets the value of the penAlim property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the penAlim property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPenAlim().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.PenAlim }
                     * 
                     * 
                     */
                    public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.PenAlim> getPenAlim() {
                        if (penAlim == null) {
                            penAlim = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.PenAlim>();
                        }
                        return this.penAlim;
                    }

                    /**
                     * Gets the value of the previdCompl property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the previdCompl property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPrevidCompl().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.PrevidCompl }
                     * 
                     * 
                     */
                    public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.PrevidCompl> getPrevidCompl() {
                        if (previdCompl == null) {
                            previdCompl = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.PrevidCompl>();
                        }
                        return this.previdCompl;
                    }

                    /**
                     * Gets the value of the infoProcRet property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infoProcRet property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfoProcRet().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet }
                     * 
                     * 
                     */
                    public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet> getInfoProcRet() {
                        if (infoProcRet == null) {
                            infoProcRet = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet>();
                        }
                        return this.infoProcRet;
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
                     *         &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpRendDep"/>
                     *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
                     *         &lt;element name="vlrDedDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDedDep"/>
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
                        "tpRend",
                        "cpfDep",
                        "vlrDedDep"
                    })
                    public static class DedDepen {

                        protected byte tpRend;
                        @XmlElement(required = true)
                        protected String cpfDep;
                        @XmlElement(required = true)
                        protected BigDecimal vlrDedDep;

                        /**
                         * Obtém o valor da propriedade tpRend.
                         * 
                         */
                        public byte getTpRend() {
                            return tpRend;
                        }

                        /**
                         * Define o valor da propriedade tpRend.
                         * 
                         */
                        public void setTpRend(byte value) {
                            this.tpRend = value;
                        }

                        /**
                         * Obtém o valor da propriedade cpfDep.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCpfDep() {
                            return cpfDep;
                        }

                        /**
                         * Define o valor da propriedade cpfDep.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCpfDep(String value) {
                            this.cpfDep = value;
                        }

                        /**
                         * Obtém o valor da propriedade vlrDedDep.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrDedDep() {
                            return vlrDedDep;
                        }

                        /**
                         * Define o valor da propriedade vlrDedDep.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrDedDep(BigDecimal value) {
                            this.vlrDedDep = value;
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
                     *         &lt;element name="tpProcRet" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpProc_1_2"/>
                     *         &lt;element name="nrProcRet" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrProcRet"/>
                     *         &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codSuspIR" minOccurs="0"/>
                     *         &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indApuracao"/>
                     *                   &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
                     *                   &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
                     *                   &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
                     *                   &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
                     *                   &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
                     *                   &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indTpDeducao"/>
                     *                             &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *                             &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
                     *                             &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *                             &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
                     *                                       &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                        "tpProcRet",
                        "nrProcRet",
                        "codSusp",
                        "infoValores"
                    })
                    public static class InfoProcRet {

                        protected byte tpProcRet;
                        @XmlElement(required = true)
                        protected String nrProcRet;
                        protected BigInteger codSusp;
                        protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores> infoValores;

                        /**
                         * Obtém o valor da propriedade tpProcRet.
                         * 
                         */
                        public byte getTpProcRet() {
                            return tpProcRet;
                        }

                        /**
                         * Define o valor da propriedade tpProcRet.
                         * 
                         */
                        public void setTpProcRet(byte value) {
                            this.tpProcRet = value;
                        }

                        /**
                         * Obtém o valor da propriedade nrProcRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNrProcRet() {
                            return nrProcRet;
                        }

                        /**
                         * Define o valor da propriedade nrProcRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNrProcRet(String value) {
                            this.nrProcRet = value;
                        }

                        /**
                         * Obtém o valor da propriedade codSusp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getCodSusp() {
                            return codSusp;
                        }

                        /**
                         * Define o valor da propriedade codSusp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setCodSusp(BigInteger value) {
                            this.codSusp = value;
                        }

                        /**
                         * Gets the value of the infoValores property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the infoValores property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getInfoValores().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores }
                         * 
                         * 
                         */
                        public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores> getInfoValores() {
                            if (infoValores == null) {
                                infoValores = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores>();
                            }
                            return this.infoValores;
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
                         *         &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indApuracao"/>
                         *         &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
                         *         &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
                         *         &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
                         *         &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
                         *         &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
                         *         &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indTpDeducao"/>
                         *                   &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                         *                   &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
                         *                   &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                         *                   &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
                         *                             &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                            "indApuracao",
                            "vlrNRetido",
                            "vlrDepJud",
                            "vlrCmpAnoCal",
                            "vlrCmpAnoAnt",
                            "vlrRendSusp",
                            "dedSusp"
                        })
                        public static class InfoValores {

                            protected byte indApuracao;
                            protected BigDecimal vlrNRetido;
                            protected BigDecimal vlrDepJud;
                            protected BigDecimal vlrCmpAnoCal;
                            protected BigDecimal vlrCmpAnoAnt;
                            protected BigDecimal vlrRendSusp;
                            protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp> dedSusp;

                            /**
                             * Obtém o valor da propriedade indApuracao.
                             * 
                             */
                            public byte getIndApuracao() {
                                return indApuracao;
                            }

                            /**
                             * Define o valor da propriedade indApuracao.
                             * 
                             */
                            public void setIndApuracao(byte value) {
                                this.indApuracao = value;
                            }

                            /**
                             * Obtém o valor da propriedade vlrNRetido.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVlrNRetido() {
                                return vlrNRetido;
                            }

                            /**
                             * Define o valor da propriedade vlrNRetido.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVlrNRetido(BigDecimal value) {
                                this.vlrNRetido = value;
                            }

                            /**
                             * Obtém o valor da propriedade vlrDepJud.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVlrDepJud() {
                                return vlrDepJud;
                            }

                            /**
                             * Define o valor da propriedade vlrDepJud.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVlrDepJud(BigDecimal value) {
                                this.vlrDepJud = value;
                            }

                            /**
                             * Obtém o valor da propriedade vlrCmpAnoCal.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVlrCmpAnoCal() {
                                return vlrCmpAnoCal;
                            }

                            /**
                             * Define o valor da propriedade vlrCmpAnoCal.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVlrCmpAnoCal(BigDecimal value) {
                                this.vlrCmpAnoCal = value;
                            }

                            /**
                             * Obtém o valor da propriedade vlrCmpAnoAnt.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVlrCmpAnoAnt() {
                                return vlrCmpAnoAnt;
                            }

                            /**
                             * Define o valor da propriedade vlrCmpAnoAnt.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVlrCmpAnoAnt(BigDecimal value) {
                                this.vlrCmpAnoAnt = value;
                            }

                            /**
                             * Obtém o valor da propriedade vlrRendSusp.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVlrRendSusp() {
                                return vlrRendSusp;
                            }

                            /**
                             * Define o valor da propriedade vlrRendSusp.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVlrRendSusp(BigDecimal value) {
                                this.vlrRendSusp = value;
                            }

                            /**
                             * Gets the value of the dedSusp property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the dedSusp property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getDedSusp().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp }
                             * 
                             * 
                             */
                            public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp> getDedSusp() {
                                if (dedSusp == null) {
                                    dedSusp = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp>();
                                }
                                return this.dedSusp;
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
                             *         &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indTpDeducao"/>
                             *         &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                             *         &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
                             *         &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                             *         &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
                             *                   &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                                "indTpDeducao",
                                "vlrDedSusp",
                                "cnpjEntidPC",
                                "vlrPatrocFunp",
                                "benefPen"
                            })
                            public static class DedSusp {

                                protected byte indTpDeducao;
                                protected BigDecimal vlrDedSusp;
                                protected String cnpjEntidPC;
                                protected BigDecimal vlrPatrocFunp;
                                protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp.BenefPen> benefPen;

                                /**
                                 * Obtém o valor da propriedade indTpDeducao.
                                 * 
                                 */
                                public byte getIndTpDeducao() {
                                    return indTpDeducao;
                                }

                                /**
                                 * Define o valor da propriedade indTpDeducao.
                                 * 
                                 */
                                public void setIndTpDeducao(byte value) {
                                    this.indTpDeducao = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vlrDedSusp.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getVlrDedSusp() {
                                    return vlrDedSusp;
                                }

                                /**
                                 * Define o valor da propriedade vlrDedSusp.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setVlrDedSusp(BigDecimal value) {
                                    this.vlrDedSusp = value;
                                }

                                /**
                                 * Obtém o valor da propriedade cnpjEntidPC.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCnpjEntidPC() {
                                    return cnpjEntidPC;
                                }

                                /**
                                 * Define o valor da propriedade cnpjEntidPC.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCnpjEntidPC(String value) {
                                    this.cnpjEntidPC = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vlrPatrocFunp.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getVlrPatrocFunp() {
                                    return vlrPatrocFunp;
                                }

                                /**
                                 * Define o valor da propriedade vlrPatrocFunp.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setVlrPatrocFunp(BigDecimal value) {
                                    this.vlrPatrocFunp = value;
                                }

                                /**
                                 * Gets the value of the benefPen property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the benefPen property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getBenefPen().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp.BenefPen }
                                 * 
                                 * 
                                 */
                                public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp.BenefPen> getBenefPen() {
                                    if (benefPen == null) {
                                        benefPen = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp.BenefPen>();
                                    }
                                    return this.benefPen;
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
                                 *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
                                 *         &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                                    "cpfDep",
                                    "vlrDepenSusp"
                                })
                                public static class BenefPen {

                                    @XmlElement(required = true)
                                    protected String cpfDep;
                                    @XmlElement(required = true)
                                    protected BigDecimal vlrDepenSusp;

                                    /**
                                     * Obtém o valor da propriedade cpfDep.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getCpfDep() {
                                        return cpfDep;
                                    }

                                    /**
                                     * Define o valor da propriedade cpfDep.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setCpfDep(String value) {
                                        this.cpfDep = value;
                                    }

                                    /**
                                     * Obtém o valor da propriedade vlrDepenSusp.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public BigDecimal getVlrDepenSusp() {
                                        return vlrDepenSusp;
                                    }

                                    /**
                                     * Define o valor da propriedade vlrDepenSusp.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public void setVlrDepenSusp(BigDecimal value) {
                                        this.vlrDepenSusp = value;
                                    }

                                }

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
                     *         &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpRendPenAlim"/>
                     *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfPenAlim"/>
                     *         &lt;element name="vlrDedPenAlim" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_vlrDedPenAlim"/>
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
                        "tpRend",
                        "cpfDep",
                        "vlrDedPenAlim"
                    })
                    public static class PenAlim {

                        protected byte tpRend;
                        @XmlElement(required = true)
                        protected String cpfDep;
                        @XmlElement(required = true)
                        protected BigDecimal vlrDedPenAlim;

                        /**
                         * Obtém o valor da propriedade tpRend.
                         * 
                         */
                        public byte getTpRend() {
                            return tpRend;
                        }

                        /**
                         * Define o valor da propriedade tpRend.
                         * 
                         */
                        public void setTpRend(byte value) {
                            this.tpRend = value;
                        }

                        /**
                         * Obtém o valor da propriedade cpfDep.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCpfDep() {
                            return cpfDep;
                        }

                        /**
                         * Define o valor da propriedade cpfDep.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCpfDep(String value) {
                            this.cpfDep = value;
                        }

                        /**
                         * Obtém o valor da propriedade vlrDedPenAlim.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrDedPenAlim() {
                            return vlrDedPenAlim;
                        }

                        /**
                         * Define o valor da propriedade vlrDedPenAlim.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrDedPenAlim(BigDecimal value) {
                            this.vlrDedPenAlim = value;
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
                     *         &lt;element name="tpPrev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_tpPrevCompl"/>
                     *         &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj"/>
                     *         &lt;element name="vlrDedPC" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *         &lt;element name="vlrDedPC13" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *         &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *         &lt;element name="vlrPatrocFunp13" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
                        "tpPrev",
                        "cnpjEntidPC",
                        "vlrDedPC",
                        "vlrDedPC13",
                        "vlrPatrocFunp",
                        "vlrPatrocFunp13"
                    })
                    public static class PrevidCompl {

                        protected byte tpPrev;
                        @XmlElement(required = true)
                        protected String cnpjEntidPC;
                        protected BigDecimal vlrDedPC;
                        protected BigDecimal vlrDedPC13;
                        protected BigDecimal vlrPatrocFunp;
                        protected BigDecimal vlrPatrocFunp13;

                        /**
                         * Obtém o valor da propriedade tpPrev.
                         * 
                         */
                        public byte getTpPrev() {
                            return tpPrev;
                        }

                        /**
                         * Define o valor da propriedade tpPrev.
                         * 
                         */
                        public void setTpPrev(byte value) {
                            this.tpPrev = value;
                        }

                        /**
                         * Obtém o valor da propriedade cnpjEntidPC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCnpjEntidPC() {
                            return cnpjEntidPC;
                        }

                        /**
                         * Define o valor da propriedade cnpjEntidPC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCnpjEntidPC(String value) {
                            this.cnpjEntidPC = value;
                        }

                        /**
                         * Obtém o valor da propriedade vlrDedPC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrDedPC() {
                            return vlrDedPC;
                        }

                        /**
                         * Define o valor da propriedade vlrDedPC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrDedPC(BigDecimal value) {
                            this.vlrDedPC = value;
                        }

                        /**
                         * Obtém o valor da propriedade vlrDedPC13.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrDedPC13() {
                            return vlrDedPC13;
                        }

                        /**
                         * Define o valor da propriedade vlrDedPC13.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrDedPC13(BigDecimal value) {
                            this.vlrDedPC13 = value;
                        }

                        /**
                         * Obtém o valor da propriedade vlrPatrocFunp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrPatrocFunp() {
                            return vlrPatrocFunp;
                        }

                        /**
                         * Define o valor da propriedade vlrPatrocFunp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrPatrocFunp(BigDecimal value) {
                            this.vlrPatrocFunp = value;
                        }

                        /**
                         * Obtém o valor da propriedade vlrPatrocFunp13.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrPatrocFunp13() {
                            return vlrPatrocFunp13;
                        }

                        /**
                         * Define o valor da propriedade vlrPatrocFunp13.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrPatrocFunp13(BigDecimal value) {
                            this.vlrPatrocFunp13 = value;
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
                 *         &lt;element name="indOrgReemb" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indOrgReemb"/>
                 *         &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
                 *         &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_regANS" minOccurs="0"/>
                 *         &lt;element name="detReembTit" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_detReemb" maxOccurs="99" minOccurs="0"/>
                 *         &lt;element name="infoReembDep" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
                 *                   &lt;element name="detReembDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_detReemb" maxOccurs="99" minOccurs="0"/>
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
                    "indOrgReemb",
                    "cnpjOper",
                    "regANS",
                    "detReembTit",
                    "infoReembDep"
                })
                public static class InfoReembMed {

                    protected byte indOrgReemb;
                    protected String cnpjOper;
                    protected String regANS;
                    protected List<TDetReemb> detReembTit;
                    protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoReembMed.InfoReembDep> infoReembDep;

                    /**
                     * Obtém o valor da propriedade indOrgReemb.
                     * 
                     */
                    public byte getIndOrgReemb() {
                        return indOrgReemb;
                    }

                    /**
                     * Define o valor da propriedade indOrgReemb.
                     * 
                     */
                    public void setIndOrgReemb(byte value) {
                        this.indOrgReemb = value;
                    }

                    /**
                     * Obtém o valor da propriedade cnpjOper.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjOper() {
                        return cnpjOper;
                    }

                    /**
                     * Define o valor da propriedade cnpjOper.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjOper(String value) {
                        this.cnpjOper = value;
                    }

                    /**
                     * Obtém o valor da propriedade regANS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegANS() {
                        return regANS;
                    }

                    /**
                     * Define o valor da propriedade regANS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegANS(String value) {
                        this.regANS = value;
                    }

                    /**
                     * Gets the value of the detReembTit property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the detReembTit property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getDetReembTit().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TDetReemb }
                     * 
                     * 
                     */
                    public List<TDetReemb> getDetReembTit() {
                        if (detReembTit == null) {
                            detReembTit = new ArrayList<TDetReemb>();
                        }
                        return this.detReembTit;
                    }

                    /**
                     * Gets the value of the infoReembDep property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infoReembDep property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfoReembDep().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoReembMed.InfoReembDep }
                     * 
                     * 
                     */
                    public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoReembMed.InfoReembDep> getInfoReembDep() {
                        if (infoReembDep == null) {
                            infoReembDep = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.InfoReembMed.InfoReembDep>();
                        }
                        return this.infoReembDep;
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
                     *         &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
                     *         &lt;element name="detReembDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}T_detReemb" maxOccurs="99" minOccurs="0"/>
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
                        "cpfBenef",
                        "detReembDep"
                    })
                    public static class InfoReembDep {

                        @XmlElement(required = true)
                        protected String cpfBenef;
                        protected List<TDetReemb> detReembDep;

                        /**
                         * Obtém o valor da propriedade cpfBenef.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCpfBenef() {
                            return cpfBenef;
                        }

                        /**
                         * Define o valor da propriedade cpfBenef.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCpfBenef(String value) {
                            this.cpfBenef = value;
                        }

                        /**
                         * Gets the value of the detReembDep property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the detReembDep property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getDetReembDep().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link TDetReemb }
                         * 
                         * 
                         */
                        public List<TDetReemb> getDetReembDep() {
                            if (detReembDep == null) {
                                detReembDep = new ArrayList<TDetReemb>();
                            }
                            return this.detReembDep;
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
                 *         &lt;element name="perRefAjuste" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_perApur_mensal"/>
                 *         &lt;element name="nrRec1210Orig" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrRecibo"/>
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
                    "perRefAjuste",
                    "nrRec1210Orig"
                })
                public static class PerAnt {

                    @XmlElement(required = true)
                    protected String perRefAjuste;
                    @XmlElement(required = true)
                    protected String nrRec1210Orig;

                    /**
                     * Obtém o valor da propriedade perRefAjuste.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPerRefAjuste() {
                        return perRefAjuste;
                    }

                    /**
                     * Define o valor da propriedade perRefAjuste.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPerRefAjuste(String value) {
                        this.perRefAjuste = value;
                    }

                    /**
                     * Obtém o valor da propriedade nrRec1210Orig.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNrRec1210Orig() {
                        return nrRec1210Orig;
                    }

                    /**
                     * Define o valor da propriedade nrRec1210Orig.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNrRec1210Orig(String value) {
                        this.nrRec1210Orig = value;
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
                 *         &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cnpj"/>
                 *         &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_regANS" minOccurs="0"/>
                 *         &lt;element name="vlrSaudeTit" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="infoDepSau" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
                 *                   &lt;element name="vlrSaudeDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                    "cnpjOper",
                    "regANS",
                    "vlrSaudeTit",
                    "infoDepSau"
                })
                public static class PlanSaude {

                    @XmlElement(required = true)
                    protected String cnpjOper;
                    protected String regANS;
                    @XmlElement(required = true)
                    protected BigDecimal vlrSaudeTit;
                    protected List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.PlanSaude.InfoDepSau> infoDepSau;

                    /**
                     * Obtém o valor da propriedade cnpjOper.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjOper() {
                        return cnpjOper;
                    }

                    /**
                     * Define o valor da propriedade cnpjOper.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjOper(String value) {
                        this.cnpjOper = value;
                    }

                    /**
                     * Obtém o valor da propriedade regANS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegANS() {
                        return regANS;
                    }

                    /**
                     * Define o valor da propriedade regANS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegANS(String value) {
                        this.regANS = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrSaudeTit.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrSaudeTit() {
                        return vlrSaudeTit;
                    }

                    /**
                     * Define o valor da propriedade vlrSaudeTit.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrSaudeTit(BigDecimal value) {
                        this.vlrSaudeTit = value;
                    }

                    /**
                     * Gets the value of the infoDepSau property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infoDepSau property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfoDepSau().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtPgtos.IdeBenef.InfoIRComplem.PlanSaude.InfoDepSau }
                     * 
                     * 
                     */
                    public List<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.PlanSaude.InfoDepSau> getInfoDepSau() {
                        if (infoDepSau == null) {
                            infoDepSau = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoIRComplem.PlanSaude.InfoDepSau>();
                        }
                        return this.infoDepSau;
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
                     *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_cpfDepIR2"/>
                     *         &lt;element name="vlrSaudeDep" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                        "cpfDep",
                        "vlrSaudeDep"
                    })
                    public static class InfoDepSau {

                        @XmlElement(required = true)
                        protected String cpfDep;
                        @XmlElement(required = true)
                        protected BigDecimal vlrSaudeDep;

                        /**
                         * Obtém o valor da propriedade cpfDep.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCpfDep() {
                            return cpfDep;
                        }

                        /**
                         * Define o valor da propriedade cpfDep.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCpfDep(String value) {
                            this.cpfDep = value;
                        }

                        /**
                         * Obtém o valor da propriedade vlrSaudeDep.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrSaudeDep() {
                            return vlrSaudeDep;
                        }

                        /**
                         * Define o valor da propriedade vlrSaudeDep.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrSaudeDep(BigDecimal value) {
                            this.vlrSaudeDep = value;
                        }

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
             *         &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="tpPgto">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *               &lt;enumeration value="4"/>
             *               &lt;enumeration value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_perApur"/>
             *         &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codigo_esocial"/>
             *         &lt;element name="vrLiq" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_valorMonetario"/>
             *         &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_pais" minOccurs="0"/>
             *         &lt;element name="infoPgtoExt" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="indNIF" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indNIF"/>
             *                   &lt;element name="nifBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codigo_esocial" minOccurs="0"/>
             *                   &lt;element name="frmTribut">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="\d{2}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="endExt" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="endDscLograd" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="80"/>
             *                                   &lt;pattern value="[^\s]{1}[\S\s]*"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="endNrLograd" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrLograd" minOccurs="0"/>
             *                             &lt;element name="endComplem" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_complemento" minOccurs="0"/>
             *                             &lt;element name="endBairro" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="60"/>
             *                                   &lt;pattern value=".*[^\s].*"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="endCidade" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="40"/>
             *                                   &lt;pattern value=".*[^\s].*"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="endEstado" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="40"/>
             *                                   &lt;pattern value=".*[^\s].*"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="endCodPostal" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="12"/>
             *                                   &lt;pattern value="[A-Za-z0-9]{1,12}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="telef" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="\d{8,15}"/>
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "dtPgto",
                "tpPgto",
                "perRef",
                "ideDmDev",
                "vrLiq",
                "paisResidExt",
                "infoPgtoExt"
            })
            public static class InfoPgto {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtPgto;
                protected byte tpPgto;
                @XmlElement(required = true)
                protected String perRef;
                @XmlElement(required = true)
                protected String ideDmDev;
                @XmlElement(required = true)
                protected BigDecimal vrLiq;
                protected String paisResidExt;
                protected ESocial.EvtPgtos.IdeBenef.InfoPgto.InfoPgtoExt infoPgtoExt;

                /**
                 * Obtém o valor da propriedade dtPgto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtPgto() {
                    return dtPgto;
                }

                /**
                 * Define o valor da propriedade dtPgto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtPgto(XMLGregorianCalendar value) {
                    this.dtPgto = value;
                }

                /**
                 * Obtém o valor da propriedade tpPgto.
                 * 
                 */
                public byte getTpPgto() {
                    return tpPgto;
                }

                /**
                 * Define o valor da propriedade tpPgto.
                 * 
                 */
                public void setTpPgto(byte value) {
                    this.tpPgto = value;
                }

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
                 * Obtém o valor da propriedade vrLiq.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrLiq() {
                    return vrLiq;
                }

                /**
                 * Define o valor da propriedade vrLiq.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrLiq(BigDecimal value) {
                    this.vrLiq = value;
                }

                /**
                 * Obtém o valor da propriedade paisResidExt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaisResidExt() {
                    return paisResidExt;
                }

                /**
                 * Define o valor da propriedade paisResidExt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaisResidExt(String value) {
                    this.paisResidExt = value;
                }

                /**
                 * Obtém o valor da propriedade infoPgtoExt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtPgtos.IdeBenef.InfoPgto.InfoPgtoExt }
                 *     
                 */
                public ESocial.EvtPgtos.IdeBenef.InfoPgto.InfoPgtoExt getInfoPgtoExt() {
                    return infoPgtoExt;
                }

                /**
                 * Define o valor da propriedade infoPgtoExt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtPgtos.IdeBenef.InfoPgto.InfoPgtoExt }
                 *     
                 */
                public void setInfoPgtoExt(ESocial.EvtPgtos.IdeBenef.InfoPgto.InfoPgtoExt value) {
                    this.infoPgtoExt = value;
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
                 *         &lt;element name="indNIF" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_indNIF"/>
                 *         &lt;element name="nifBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_codigo_esocial" minOccurs="0"/>
                 *         &lt;element name="frmTribut">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="\d{2}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="endExt" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="endDscLograd" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="80"/>
                 *                         &lt;pattern value="[^\s]{1}[\S\s]*"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="endNrLograd" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrLograd" minOccurs="0"/>
                 *                   &lt;element name="endComplem" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_complemento" minOccurs="0"/>
                 *                   &lt;element name="endBairro" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="60"/>
                 *                         &lt;pattern value=".*[^\s].*"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="endCidade" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="40"/>
                 *                         &lt;pattern value=".*[^\s].*"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="endEstado" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="40"/>
                 *                         &lt;pattern value=".*[^\s].*"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="endCodPostal" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="12"/>
                 *                         &lt;pattern value="[A-Za-z0-9]{1,12}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="telef" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="\d{8,15}"/>
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
                    "indNIF",
                    "nifBenef",
                    "frmTribut",
                    "endExt"
                })
                public static class InfoPgtoExt {

                    protected byte indNIF;
                    protected String nifBenef;
                    @XmlElement(required = true)
                    protected String frmTribut;
                    protected ESocial.EvtPgtos.IdeBenef.InfoPgto.InfoPgtoExt.EndExt endExt;

                    /**
                     * Obtém o valor da propriedade indNIF.
                     * 
                     */
                    public byte getIndNIF() {
                        return indNIF;
                    }

                    /**
                     * Define o valor da propriedade indNIF.
                     * 
                     */
                    public void setIndNIF(byte value) {
                        this.indNIF = value;
                    }

                    /**
                     * Obtém o valor da propriedade nifBenef.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNifBenef() {
                        return nifBenef;
                    }

                    /**
                     * Define o valor da propriedade nifBenef.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNifBenef(String value) {
                        this.nifBenef = value;
                    }

                    /**
                     * Obtém o valor da propriedade frmTribut.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFrmTribut() {
                        return frmTribut;
                    }

                    /**
                     * Define o valor da propriedade frmTribut.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFrmTribut(String value) {
                        this.frmTribut = value;
                    }

                    /**
                     * Obtém o valor da propriedade endExt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtPgtos.IdeBenef.InfoPgto.InfoPgtoExt.EndExt }
                     *     
                     */
                    public ESocial.EvtPgtos.IdeBenef.InfoPgto.InfoPgtoExt.EndExt getEndExt() {
                        return endExt;
                    }

                    /**
                     * Define o valor da propriedade endExt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtPgtos.IdeBenef.InfoPgto.InfoPgtoExt.EndExt }
                     *     
                     */
                    public void setEndExt(ESocial.EvtPgtos.IdeBenef.InfoPgto.InfoPgtoExt.EndExt value) {
                        this.endExt = value;
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
                     *         &lt;element name="endDscLograd" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="80"/>
                     *               &lt;pattern value="[^\s]{1}[\S\s]*"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="endNrLograd" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_nrLograd" minOccurs="0"/>
                     *         &lt;element name="endComplem" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_03_00}TS_complemento" minOccurs="0"/>
                     *         &lt;element name="endBairro" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="60"/>
                     *               &lt;pattern value=".*[^\s].*"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="endCidade" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="40"/>
                     *               &lt;pattern value=".*[^\s].*"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="endEstado" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="40"/>
                     *               &lt;pattern value=".*[^\s].*"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="endCodPostal" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="12"/>
                     *               &lt;pattern value="[A-Za-z0-9]{1,12}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="telef" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="\d{8,15}"/>
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
                        "endDscLograd",
                        "endNrLograd",
                        "endComplem",
                        "endBairro",
                        "endCidade",
                        "endEstado",
                        "endCodPostal",
                        "telef"
                    })
                    public static class EndExt {

                        protected String endDscLograd;
                        protected String endNrLograd;
                        protected String endComplem;
                        protected String endBairro;
                        protected String endCidade;
                        protected String endEstado;
                        protected String endCodPostal;
                        protected String telef;

                        /**
                         * Obtém o valor da propriedade endDscLograd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndDscLograd() {
                            return endDscLograd;
                        }

                        /**
                         * Define o valor da propriedade endDscLograd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndDscLograd(String value) {
                            this.endDscLograd = value;
                        }

                        /**
                         * Obtém o valor da propriedade endNrLograd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndNrLograd() {
                            return endNrLograd;
                        }

                        /**
                         * Define o valor da propriedade endNrLograd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndNrLograd(String value) {
                            this.endNrLograd = value;
                        }

                        /**
                         * Obtém o valor da propriedade endComplem.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndComplem() {
                            return endComplem;
                        }

                        /**
                         * Define o valor da propriedade endComplem.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndComplem(String value) {
                            this.endComplem = value;
                        }

                        /**
                         * Obtém o valor da propriedade endBairro.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndBairro() {
                            return endBairro;
                        }

                        /**
                         * Define o valor da propriedade endBairro.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndBairro(String value) {
                            this.endBairro = value;
                        }

                        /**
                         * Obtém o valor da propriedade endCidade.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndCidade() {
                            return endCidade;
                        }

                        /**
                         * Define o valor da propriedade endCidade.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndCidade(String value) {
                            this.endCidade = value;
                        }

                        /**
                         * Obtém o valor da propriedade endEstado.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndEstado() {
                            return endEstado;
                        }

                        /**
                         * Define o valor da propriedade endEstado.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndEstado(String value) {
                            this.endEstado = value;
                        }

                        /**
                         * Obtém o valor da propriedade endCodPostal.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndCodPostal() {
                            return endCodPostal;
                        }

                        /**
                         * Define o valor da propriedade endCodPostal.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndCodPostal(String value) {
                            this.endCodPostal = value;
                        }

                        /**
                         * Obtém o valor da propriedade telef.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTelef() {
                            return telef;
                        }

                        /**
                         * Define o valor da propriedade telef.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTelef(String value) {
                            this.telef = value;
                        }

                    }

                }

            }

        }

    }

}
