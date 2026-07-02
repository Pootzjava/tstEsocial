//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:20 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.contproc;

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
 *         &lt;element name="evtContProc">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}T_ideEvento_trab"/>
 *                   &lt;element name="ideEmpregador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpInsc_1_2"/>
 *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrInsc_8_11_14"/>
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
 *                             &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrProcTrab"/>
 *                             &lt;element name="perApurPgto" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_periodo_mensal"/>
 *                             &lt;element name="ideSeqProc" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                                   &lt;pattern value="\d{1,3}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="obs" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ideTrab" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="calcTrib" maxOccurs="999" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="infoCRContrib" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="tpCR" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                     &lt;pattern value="\d{6}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="vrCR" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="perRef" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_periodo_mensal">
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="vrBcCpMensal" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="vrBcCp13" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infoCRIRRF" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="infoIR" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="rendIsen0561" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="vlrDiarias">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="vlrAjudaCusto">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="vlrIndResContrato">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="vlrAbonoPec">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="vlrAuxMoradia">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="vrRendTrib">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="vrRendTrib13">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="vrRendMoleGrave">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="vrRendMoleGrave13">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="vrRendIsen65">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="vrRendIsen65Dec">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="vrJurosMora">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="vrJurosMora13">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="vrRendIsenNTrib">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="descIsenNTrib">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="60"/>
 *                                                     &lt;pattern value=".*[^\s].*"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="vrPrevOficial">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="vrPrevOficial13">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoRRA" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="despProcJud" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="vlrDespCustas">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="vlrDespAdvogados">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ideAdv" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="tpInsc">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpInsc_1_2">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="nrInsc">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrInsc_11_14">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="vlrAdv">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="descRRA">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_descRRA">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="qtdMesesRRA">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_qtdMesesRRA">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="tpRend">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                     &lt;enumeration value="11"/>
 *                                                     &lt;enumeration value="12"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="cpfDep">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR2">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="vlrDeducao">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDedDep">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="penAlim" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="tpRend">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                     &lt;enumeration value="11"/>
 *                                                     &lt;enumeration value="12"/>
 *                                                     &lt;enumeration value="18"/>
 *                                                     &lt;enumeration value="79"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="cpfDep">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfPenAlim">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="vlrPensao">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDedPenAlim">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoProcRet" maxOccurs="50" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="cpfDep">
 *                                                                               &lt;simpleType>
 *                                                                                 &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR2">
 *                                                                                 &lt;/restriction>
 *                                                                               &lt;/simpleType>
 *                                                                             &lt;/attribute>
 *                                                                             &lt;attribute name="vlrDepenSusp">
 *                                                                               &lt;simpleType>
 *                                                                                 &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
 *                                                                                 &lt;/restriction>
 *                                                                               &lt;/simpleType>
 *                                                                             &lt;/attribute>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="indTpDeducao">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                         &lt;enumeration value="1"/>
 *                                                                         &lt;enumeration value="5"/>
 *                                                                         &lt;enumeration value="7"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                   &lt;attribute name="vlrDedSusp">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="indApuracao">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_indApuracao">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="vlrNRetido">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrNRetido">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="vlrDepJud">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDepJud">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="vlrCmpAnoCal">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrCmpAnoCal">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="vlrCmpAnoAnt">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrCmpAnoAnt">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="vlrRendSusp">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrRendSusp">
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="tpProcRet">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpProc_1_2">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="nrProcRet">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrProcRet">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="codSusp">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_codSuspIR">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="tpCR" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;enumeration value="593656"/>
 *                                           &lt;enumeration value="056152"/>
 *                                           &lt;enumeration value="188951"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="vrCR" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="vrCR13">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infoIRComplem" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="infoDep" maxOccurs="999" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="cpfDep">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="dtNascto">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_dtNascto">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="nome">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nmDep">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="depIRRF">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_depIRRF_IR">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="tpDep">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpDep">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="descrDep">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_descrDep">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="dtLaudo">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="cpfTrab" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfTrab">
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_Id" />
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
    "evtContProc",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtContProc evtContProc;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtContProc.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtContProc }
     *     
     */
    public ESocial.EvtContProc getEvtContProc() {
        return evtContProc;
    }

    /**
     * Define o valor da propriedade evtContProc.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtContProc }
     *     
     */
    public void setEvtContProc(ESocial.EvtContProc value) {
        this.evtContProc = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}T_ideEvento_trab"/>
     *         &lt;element name="ideEmpregador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpInsc_1_2"/>
     *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrInsc_8_11_14"/>
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
     *                   &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrProcTrab"/>
     *                   &lt;element name="perApurPgto" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_periodo_mensal"/>
     *                   &lt;element name="ideSeqProc" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *                         &lt;pattern value="\d{1,3}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="obs" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ideTrab" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="calcTrib" maxOccurs="999" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="infoCRContrib" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="tpCR" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                           &lt;pattern value="\d{6}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="vrCR" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="perRef" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_periodo_mensal">
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="vrBcCpMensal" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="vrBcCp13" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infoCRIRRF" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="infoIR" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="rendIsen0561" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="vlrDiarias">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="vlrAjudaCusto">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="vlrIndResContrato">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="vlrAbonoPec">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="vlrAuxMoradia">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="vrRendTrib">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="vrRendTrib13">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="vrRendMoleGrave">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="vrRendMoleGrave13">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="vrRendIsen65">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="vrRendIsen65Dec">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="vrJurosMora">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="vrJurosMora13">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="vrRendIsenNTrib">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="descIsenNTrib">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="60"/>
     *                                           &lt;pattern value=".*[^\s].*"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="vrPrevOficial">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="vrPrevOficial13">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoRRA" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="despProcJud" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="vlrDespCustas">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="vlrDespAdvogados">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ideAdv" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="tpInsc">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpInsc_1_2">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="nrInsc">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrInsc_11_14">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="vlrAdv">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="descRRA">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_descRRA">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="qtdMesesRRA">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_qtdMesesRRA">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="tpRend">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                           &lt;enumeration value="11"/>
     *                                           &lt;enumeration value="12"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="cpfDep">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR2">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="vlrDeducao">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDedDep">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="penAlim" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="tpRend">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                           &lt;enumeration value="11"/>
     *                                           &lt;enumeration value="12"/>
     *                                           &lt;enumeration value="18"/>
     *                                           &lt;enumeration value="79"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="cpfDep">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfPenAlim">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="vlrPensao">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDedPenAlim">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoProcRet" maxOccurs="50" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="cpfDep">
     *                                                                     &lt;simpleType>
     *                                                                       &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR2">
     *                                                                       &lt;/restriction>
     *                                                                     &lt;/simpleType>
     *                                                                   &lt;/attribute>
     *                                                                   &lt;attribute name="vlrDepenSusp">
     *                                                                     &lt;simpleType>
     *                                                                       &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
     *                                                                       &lt;/restriction>
     *                                                                     &lt;/simpleType>
     *                                                                   &lt;/attribute>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="indTpDeducao">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                               &lt;enumeration value="1"/>
     *                                                               &lt;enumeration value="5"/>
     *                                                               &lt;enumeration value="7"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                         &lt;attribute name="vlrDedSusp">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="indApuracao">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_indApuracao">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="vlrNRetido">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrNRetido">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="vlrDepJud">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDepJud">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="vlrCmpAnoCal">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrCmpAnoCal">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="vlrCmpAnoAnt">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrCmpAnoAnt">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="vlrRendSusp">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrRendSusp">
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="tpProcRet">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpProc_1_2">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="nrProcRet">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrProcRet">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="codSusp">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_codSuspIR">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="tpCR" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;enumeration value="593656"/>
     *                                 &lt;enumeration value="056152"/>
     *                                 &lt;enumeration value="188951"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="vrCR" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="vrCR13">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infoIRComplem" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="infoDep" maxOccurs="999" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="cpfDep">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="dtNascto">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_dtNascto">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="nome">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nmDep">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="depIRRF">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_depIRRF_IR">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="tpDep">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpDep">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="descrDep">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_descrDep">
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="dtLaudo">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="cpfTrab" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfTrab">
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_Id" />
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
        "ideTrab"
    })
    public static class EvtContProc {

        @XmlElement(required = true)
        protected TIdeEventoTrab ideEvento;
        @XmlElement(required = true)
        protected ESocial.EvtContProc.IdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtContProc.IdeProc ideProc;
        @XmlElement(required = true)
        protected List<ESocial.EvtContProc.IdeTrab> ideTrab;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrab }
         *     
         */
        public TIdeEventoTrab getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrab }
         *     
         */
        public void setIdeEvento(TIdeEventoTrab value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtContProc.IdeEmpregador }
         *     
         */
        public ESocial.EvtContProc.IdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtContProc.IdeEmpregador }
         *     
         */
        public void setIdeEmpregador(ESocial.EvtContProc.IdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade ideProc.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtContProc.IdeProc }
         *     
         */
        public ESocial.EvtContProc.IdeProc getIdeProc() {
            return ideProc;
        }

        /**
         * Define o valor da propriedade ideProc.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtContProc.IdeProc }
         *     
         */
        public void setIdeProc(ESocial.EvtContProc.IdeProc value) {
            this.ideProc = value;
        }

        /**
         * Gets the value of the ideTrab property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ideTrab property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdeTrab().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ESocial.EvtContProc.IdeTrab }
         * 
         * 
         */
        public List<ESocial.EvtContProc.IdeTrab> getIdeTrab() {
            if (ideTrab == null) {
                ideTrab = new ArrayList<ESocial.EvtContProc.IdeTrab>();
            }
            return this.ideTrab;
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
         *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpInsc_1_2"/>
         *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrInsc_8_11_14"/>
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
         *         &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrProcTrab"/>
         *         &lt;element name="perApurPgto" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_periodo_mensal"/>
         *         &lt;element name="ideSeqProc" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
         *               &lt;pattern value="\d{1,3}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="obs" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
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
            "perApurPgto",
            "ideSeqProc",
            "obs"
        })
        public static class IdeProc {

            @XmlElement(required = true)
            protected String nrProcTrab;
            @XmlElement(required = true)
            protected String perApurPgto;
            protected BigInteger ideSeqProc;
            protected String obs;

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

            /**
             * Obtém o valor da propriedade obs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObs() {
                return obs;
            }

            /**
             * Define o valor da propriedade obs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObs(String value) {
                this.obs = value;
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
         *         &lt;element name="calcTrib" maxOccurs="999" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="infoCRContrib" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="tpCR" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                 &lt;pattern value="\d{6}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="vrCR" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="perRef" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_periodo_mensal">
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="vrBcCpMensal" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="vrBcCp13" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoCRIRRF" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="infoIR" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="rendIsen0561" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="vlrDiarias">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="vlrAjudaCusto">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="vlrIndResContrato">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="vlrAbonoPec">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="vlrAuxMoradia">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="vrRendTrib">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="vrRendTrib13">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="vrRendMoleGrave">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="vrRendMoleGrave13">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="vrRendIsen65">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="vrRendIsen65Dec">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="vrJurosMora">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="vrJurosMora13">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="vrRendIsenNTrib">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="descIsenNTrib">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="60"/>
         *                                 &lt;pattern value=".*[^\s].*"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="vrPrevOficial">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="vrPrevOficial13">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoRRA" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="despProcJud" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="vlrDespCustas">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="vlrDespAdvogados">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ideAdv" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="tpInsc">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpInsc_1_2">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="nrInsc">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrInsc_11_14">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="vlrAdv">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="descRRA">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_descRRA">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="qtdMesesRRA">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_qtdMesesRRA">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="tpRend">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                 &lt;enumeration value="11"/>
         *                                 &lt;enumeration value="12"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="cpfDep">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR2">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="vlrDeducao">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDedDep">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="penAlim" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="tpRend">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                 &lt;enumeration value="11"/>
         *                                 &lt;enumeration value="12"/>
         *                                 &lt;enumeration value="18"/>
         *                                 &lt;enumeration value="79"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="cpfDep">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfPenAlim">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="vlrPensao">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDedPenAlim">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoProcRet" maxOccurs="50" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="cpfDep">
         *                                                           &lt;simpleType>
         *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR2">
         *                                                             &lt;/restriction>
         *                                                           &lt;/simpleType>
         *                                                         &lt;/attribute>
         *                                                         &lt;attribute name="vlrDepenSusp">
         *                                                           &lt;simpleType>
         *                                                             &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
         *                                                             &lt;/restriction>
         *                                                           &lt;/simpleType>
         *                                                         &lt;/attribute>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="indTpDeducao">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                                     &lt;enumeration value="1"/>
         *                                                     &lt;enumeration value="5"/>
         *                                                     &lt;enumeration value="7"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                               &lt;attribute name="vlrDedSusp">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="indApuracao">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_indApuracao">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="vlrNRetido">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrNRetido">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="vlrDepJud">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDepJud">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="vlrCmpAnoCal">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrCmpAnoCal">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="vlrCmpAnoAnt">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrCmpAnoAnt">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="vlrRendSusp">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrRendSusp">
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="tpProcRet">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpProc_1_2">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="nrProcRet">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrProcRet">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="codSusp">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_codSuspIR">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="tpCR" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;enumeration value="593656"/>
         *                       &lt;enumeration value="056152"/>
         *                       &lt;enumeration value="188951"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="vrCR" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="vrCR13">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoIRComplem" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="infoDep" maxOccurs="999" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="cpfDep">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="dtNascto">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_dtNascto">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="nome">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nmDep">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="depIRRF">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_depIRRF_IR">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="tpDep">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpDep">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="descrDep">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_descrDep">
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="dtLaudo">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="cpfTrab" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfTrab">
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "calcTrib",
            "infoCRIRRF",
            "infoIRComplem"
        })
        public static class IdeTrab {

            protected List<ESocial.EvtContProc.IdeTrab.CalcTrib> calcTrib;
            protected List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF> infoCRIRRF;
            protected ESocial.EvtContProc.IdeTrab.InfoIRComplem infoIRComplem;
            @XmlAttribute(name = "cpfTrab", required = true)
            protected String cpfTrab;

            /**
             * Gets the value of the calcTrib property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the calcTrib property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCalcTrib().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtContProc.IdeTrab.CalcTrib }
             * 
             * 
             */
            public List<ESocial.EvtContProc.IdeTrab.CalcTrib> getCalcTrib() {
                if (calcTrib == null) {
                    calcTrib = new ArrayList<ESocial.EvtContProc.IdeTrab.CalcTrib>();
                }
                return this.calcTrib;
            }

            /**
             * Gets the value of the infoCRIRRF property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoCRIRRF property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoCRIRRF().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF }
             * 
             * 
             */
            public List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF> getInfoCRIRRF() {
                if (infoCRIRRF == null) {
                    infoCRIRRF = new ArrayList<ESocial.EvtContProc.IdeTrab.InfoCRIRRF>();
                }
                return this.infoCRIRRF;
            }

            /**
             * Obtém o valor da propriedade infoIRComplem.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtContProc.IdeTrab.InfoIRComplem }
             *     
             */
            public ESocial.EvtContProc.IdeTrab.InfoIRComplem getInfoIRComplem() {
                return infoIRComplem;
            }

            /**
             * Define o valor da propriedade infoIRComplem.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtContProc.IdeTrab.InfoIRComplem }
             *     
             */
            public void setInfoIRComplem(ESocial.EvtContProc.IdeTrab.InfoIRComplem value) {
                this.infoIRComplem = value;
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
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="infoCRContrib" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="tpCR" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                       &lt;pattern value="\d{6}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="vrCR" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="perRef" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_periodo_mensal">
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="vrBcCpMensal" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="vrBcCp13" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "infoCRContrib"
            })
            public static class CalcTrib {

                protected List<ESocial.EvtContProc.IdeTrab.CalcTrib.InfoCRContrib> infoCRContrib;
                @XmlAttribute(name = "perRef", required = true)
                protected String perRef;
                @XmlAttribute(name = "vrBcCpMensal", required = true)
                protected BigDecimal vrBcCpMensal;
                @XmlAttribute(name = "vrBcCp13", required = true)
                protected BigDecimal vrBcCp13;

                /**
                 * Gets the value of the infoCRContrib property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoCRContrib property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoCRContrib().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtContProc.IdeTrab.CalcTrib.InfoCRContrib }
                 * 
                 * 
                 */
                public List<ESocial.EvtContProc.IdeTrab.CalcTrib.InfoCRContrib> getInfoCRContrib() {
                    if (infoCRContrib == null) {
                        infoCRContrib = new ArrayList<ESocial.EvtContProc.IdeTrab.CalcTrib.InfoCRContrib>();
                    }
                    return this.infoCRContrib;
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
                 * Obtém o valor da propriedade vrBcCpMensal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrBcCpMensal() {
                    return vrBcCpMensal;
                }

                /**
                 * Define o valor da propriedade vrBcCpMensal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrBcCpMensal(BigDecimal value) {
                    this.vrBcCpMensal = value;
                }

                /**
                 * Obtém o valor da propriedade vrBcCp13.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrBcCp13() {
                    return vrBcCp13;
                }

                /**
                 * Define o valor da propriedade vrBcCp13.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrBcCp13(BigDecimal value) {
                    this.vrBcCp13 = value;
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
                 *       &lt;attribute name="tpCR" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *             &lt;pattern value="\d{6}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="vrCR" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class InfoCRContrib {

                    @XmlAttribute(name = "tpCR", required = true)
                    protected BigInteger tpCR;
                    @XmlAttribute(name = "vrCR", required = true)
                    protected BigDecimal vrCR;

                    /**
                     * Obtém o valor da propriedade tpCR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getTpCR() {
                        return tpCR;
                    }

                    /**
                     * Define o valor da propriedade tpCR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setTpCR(BigInteger value) {
                        this.tpCR = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrCR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrCR() {
                        return vrCR;
                    }

                    /**
                     * Define o valor da propriedade vrCR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrCR(BigDecimal value) {
                        this.vrCR = value;
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
             *         &lt;element name="infoIR" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="rendIsen0561" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="vlrDiarias">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="vlrAjudaCusto">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="vlrIndResContrato">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="vlrAbonoPec">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="vlrAuxMoradia">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="vrRendTrib">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="vrRendTrib13">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="vrRendMoleGrave">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="vrRendMoleGrave13">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="vrRendIsen65">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="vrRendIsen65Dec">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="vrJurosMora">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="vrJurosMora13">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="vrRendIsenNTrib">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="descIsenNTrib">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="60"/>
             *                       &lt;pattern value=".*[^\s].*"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="vrPrevOficial">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="vrPrevOficial13">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoRRA" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="despProcJud" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="vlrDespCustas">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="vlrDespAdvogados">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ideAdv" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="tpInsc">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpInsc_1_2">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="nrInsc">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrInsc_11_14">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="vlrAdv">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="descRRA">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_descRRA">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="qtdMesesRRA">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_qtdMesesRRA">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="tpRend">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                       &lt;enumeration value="11"/>
             *                       &lt;enumeration value="12"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="cpfDep">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR2">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="vlrDeducao">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDedDep">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="penAlim" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="tpRend">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                       &lt;enumeration value="11"/>
             *                       &lt;enumeration value="12"/>
             *                       &lt;enumeration value="18"/>
             *                       &lt;enumeration value="79"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="cpfDep">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfPenAlim">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="vlrPensao">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDedPenAlim">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoProcRet" maxOccurs="50" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="cpfDep">
             *                                                 &lt;simpleType>
             *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR2">
             *                                                   &lt;/restriction>
             *                                                 &lt;/simpleType>
             *                                               &lt;/attribute>
             *                                               &lt;attribute name="vlrDepenSusp">
             *                                                 &lt;simpleType>
             *                                                   &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
             *                                                   &lt;/restriction>
             *                                                 &lt;/simpleType>
             *                                               &lt;/attribute>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="indTpDeducao">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                           &lt;enumeration value="1"/>
             *                                           &lt;enumeration value="5"/>
             *                                           &lt;enumeration value="7"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                     &lt;attribute name="vlrDedSusp">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="indApuracao">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_indApuracao">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="vlrNRetido">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrNRetido">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="vlrDepJud">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDepJud">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="vlrCmpAnoCal">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrCmpAnoCal">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="vlrCmpAnoAnt">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrCmpAnoAnt">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="vlrRendSusp">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrRendSusp">
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="tpProcRet">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpProc_1_2">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="nrProcRet">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrProcRet">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="codSusp">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_codSuspIR">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="tpCR" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;enumeration value="593656"/>
             *             &lt;enumeration value="056152"/>
             *             &lt;enumeration value="188951"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="vrCR" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="vrCR13">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "infoIR",
                "infoRRA",
                "dedDepen",
                "penAlim",
                "infoProcRet"
            })
            public static class InfoCRIRRF {

                protected ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoIR infoIR;
                protected ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA infoRRA;
                protected List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.DedDepen> dedDepen;
                protected List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.PenAlim> penAlim;
                protected List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet> infoProcRet;
                @XmlAttribute(name = "tpCR", required = true)
                protected BigInteger tpCR;
                @XmlAttribute(name = "vrCR", required = true)
                protected BigDecimal vrCR;
                @XmlAttribute(name = "vrCR13")
                protected BigDecimal vrCR13;

                /**
                 * Obtém o valor da propriedade infoIR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoIR }
                 *     
                 */
                public ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoIR getInfoIR() {
                    return infoIR;
                }

                /**
                 * Define o valor da propriedade infoIR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoIR }
                 *     
                 */
                public void setInfoIR(ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoIR value) {
                    this.infoIR = value;
                }

                /**
                 * Obtém o valor da propriedade infoRRA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA }
                 *     
                 */
                public ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA getInfoRRA() {
                    return infoRRA;
                }

                /**
                 * Define o valor da propriedade infoRRA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA }
                 *     
                 */
                public void setInfoRRA(ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA value) {
                    this.infoRRA = value;
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
                 * {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.DedDepen }
                 * 
                 * 
                 */
                public List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.DedDepen> getDedDepen() {
                    if (dedDepen == null) {
                        dedDepen = new ArrayList<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.DedDepen>();
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
                 * {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.PenAlim }
                 * 
                 * 
                 */
                public List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.PenAlim> getPenAlim() {
                    if (penAlim == null) {
                        penAlim = new ArrayList<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.PenAlim>();
                    }
                    return this.penAlim;
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
                 * {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet }
                 * 
                 * 
                 */
                public List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet> getInfoProcRet() {
                    if (infoProcRet == null) {
                        infoProcRet = new ArrayList<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet>();
                    }
                    return this.infoProcRet;
                }

                /**
                 * Obtém o valor da propriedade tpCR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTpCR() {
                    return tpCR;
                }

                /**
                 * Define o valor da propriedade tpCR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTpCR(BigInteger value) {
                    this.tpCR = value;
                }

                /**
                 * Obtém o valor da propriedade vrCR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrCR() {
                    return vrCR;
                }

                /**
                 * Define o valor da propriedade vrCR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrCR(BigDecimal value) {
                    this.vrCR = value;
                }

                /**
                 * Obtém o valor da propriedade vrCR13.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrCR13() {
                    return vrCR13;
                }

                /**
                 * Define o valor da propriedade vrCR13.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrCR13(BigDecimal value) {
                    this.vrCR13 = value;
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
                 *       &lt;attribute name="tpRend">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *             &lt;enumeration value="11"/>
                 *             &lt;enumeration value="12"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="cpfDep">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR2">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="vlrDeducao">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDedDep">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class DedDepen {

                    @XmlAttribute(name = "tpRend")
                    protected Byte tpRend;
                    @XmlAttribute(name = "cpfDep")
                    protected String cpfDep;
                    @XmlAttribute(name = "vlrDeducao")
                    protected BigDecimal vlrDeducao;

                    /**
                     * Obtém o valor da propriedade tpRend.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getTpRend() {
                        return tpRend;
                    }

                    /**
                     * Define o valor da propriedade tpRend.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setTpRend(Byte value) {
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
                     * Obtém o valor da propriedade vlrDeducao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrDeducao() {
                        return vlrDeducao;
                    }

                    /**
                     * Define o valor da propriedade vlrDeducao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrDeducao(BigDecimal value) {
                        this.vlrDeducao = value;
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
                 *         &lt;element name="rendIsen0561" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="vlrDiarias">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="vlrAjudaCusto">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="vlrIndResContrato">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="vlrAbonoPec">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="vlrAuxMoradia">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="vrRendTrib">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="vrRendTrib13">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="vrRendMoleGrave">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="vrRendMoleGrave13">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="vrRendIsen65">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="vrRendIsen65Dec">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="vrJurosMora">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="vrJurosMora13">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="vrRendIsenNTrib">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="descIsenNTrib">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="60"/>
                 *             &lt;pattern value=".*[^\s].*"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="vrPrevOficial">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="vrPrevOficial13">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "rendIsen0561"
                })
                public static class InfoIR {

                    protected ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoIR.RendIsen0561 rendIsen0561;
                    @XmlAttribute(name = "vrRendTrib")
                    protected BigDecimal vrRendTrib;
                    @XmlAttribute(name = "vrRendTrib13")
                    protected BigDecimal vrRendTrib13;
                    @XmlAttribute(name = "vrRendMoleGrave")
                    protected BigDecimal vrRendMoleGrave;
                    @XmlAttribute(name = "vrRendMoleGrave13")
                    protected BigDecimal vrRendMoleGrave13;
                    @XmlAttribute(name = "vrRendIsen65")
                    protected BigDecimal vrRendIsen65;
                    @XmlAttribute(name = "vrRendIsen65Dec")
                    protected BigDecimal vrRendIsen65Dec;
                    @XmlAttribute(name = "vrJurosMora")
                    protected BigDecimal vrJurosMora;
                    @XmlAttribute(name = "vrJurosMora13")
                    protected BigDecimal vrJurosMora13;
                    @XmlAttribute(name = "vrRendIsenNTrib")
                    protected BigDecimal vrRendIsenNTrib;
                    @XmlAttribute(name = "descIsenNTrib")
                    protected String descIsenNTrib;
                    @XmlAttribute(name = "vrPrevOficial")
                    protected BigDecimal vrPrevOficial;
                    @XmlAttribute(name = "vrPrevOficial13")
                    protected BigDecimal vrPrevOficial13;

                    /**
                     * Obtém o valor da propriedade rendIsen0561.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoIR.RendIsen0561 }
                     *     
                     */
                    public ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoIR.RendIsen0561 getRendIsen0561() {
                        return rendIsen0561;
                    }

                    /**
                     * Define o valor da propriedade rendIsen0561.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoIR.RendIsen0561 }
                     *     
                     */
                    public void setRendIsen0561(ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoIR.RendIsen0561 value) {
                        this.rendIsen0561 = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrRendTrib.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrRendTrib() {
                        return vrRendTrib;
                    }

                    /**
                     * Define o valor da propriedade vrRendTrib.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrRendTrib(BigDecimal value) {
                        this.vrRendTrib = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrRendTrib13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrRendTrib13() {
                        return vrRendTrib13;
                    }

                    /**
                     * Define o valor da propriedade vrRendTrib13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrRendTrib13(BigDecimal value) {
                        this.vrRendTrib13 = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrRendMoleGrave.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrRendMoleGrave() {
                        return vrRendMoleGrave;
                    }

                    /**
                     * Define o valor da propriedade vrRendMoleGrave.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrRendMoleGrave(BigDecimal value) {
                        this.vrRendMoleGrave = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrRendMoleGrave13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrRendMoleGrave13() {
                        return vrRendMoleGrave13;
                    }

                    /**
                     * Define o valor da propriedade vrRendMoleGrave13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrRendMoleGrave13(BigDecimal value) {
                        this.vrRendMoleGrave13 = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrRendIsen65.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrRendIsen65() {
                        return vrRendIsen65;
                    }

                    /**
                     * Define o valor da propriedade vrRendIsen65.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrRendIsen65(BigDecimal value) {
                        this.vrRendIsen65 = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrRendIsen65Dec.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrRendIsen65Dec() {
                        return vrRendIsen65Dec;
                    }

                    /**
                     * Define o valor da propriedade vrRendIsen65Dec.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrRendIsen65Dec(BigDecimal value) {
                        this.vrRendIsen65Dec = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrJurosMora.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrJurosMora() {
                        return vrJurosMora;
                    }

                    /**
                     * Define o valor da propriedade vrJurosMora.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrJurosMora(BigDecimal value) {
                        this.vrJurosMora = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrJurosMora13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrJurosMora13() {
                        return vrJurosMora13;
                    }

                    /**
                     * Define o valor da propriedade vrJurosMora13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrJurosMora13(BigDecimal value) {
                        this.vrJurosMora13 = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrRendIsenNTrib.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrRendIsenNTrib() {
                        return vrRendIsenNTrib;
                    }

                    /**
                     * Define o valor da propriedade vrRendIsenNTrib.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrRendIsenNTrib(BigDecimal value) {
                        this.vrRendIsenNTrib = value;
                    }

                    /**
                     * Obtém o valor da propriedade descIsenNTrib.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescIsenNTrib() {
                        return descIsenNTrib;
                    }

                    /**
                     * Define o valor da propriedade descIsenNTrib.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescIsenNTrib(String value) {
                        this.descIsenNTrib = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrPrevOficial.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrPrevOficial() {
                        return vrPrevOficial;
                    }

                    /**
                     * Define o valor da propriedade vrPrevOficial.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrPrevOficial(BigDecimal value) {
                        this.vrPrevOficial = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrPrevOficial13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrPrevOficial13() {
                        return vrPrevOficial13;
                    }

                    /**
                     * Define o valor da propriedade vrPrevOficial13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrPrevOficial13(BigDecimal value) {
                        this.vrPrevOficial13 = value;
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
                     *       &lt;attribute name="vlrDiarias">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="vlrAjudaCusto">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="vlrIndResContrato">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="vlrAbonoPec">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="vlrAuxMoradia">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class RendIsen0561 {

                        @XmlAttribute(name = "vlrDiarias")
                        protected BigDecimal vlrDiarias;
                        @XmlAttribute(name = "vlrAjudaCusto")
                        protected BigDecimal vlrAjudaCusto;
                        @XmlAttribute(name = "vlrIndResContrato")
                        protected BigDecimal vlrIndResContrato;
                        @XmlAttribute(name = "vlrAbonoPec")
                        protected BigDecimal vlrAbonoPec;
                        @XmlAttribute(name = "vlrAuxMoradia")
                        protected BigDecimal vlrAuxMoradia;

                        /**
                         * Obtém o valor da propriedade vlrDiarias.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrDiarias() {
                            return vlrDiarias;
                        }

                        /**
                         * Define o valor da propriedade vlrDiarias.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrDiarias(BigDecimal value) {
                            this.vlrDiarias = value;
                        }

                        /**
                         * Obtém o valor da propriedade vlrAjudaCusto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrAjudaCusto() {
                            return vlrAjudaCusto;
                        }

                        /**
                         * Define o valor da propriedade vlrAjudaCusto.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrAjudaCusto(BigDecimal value) {
                            this.vlrAjudaCusto = value;
                        }

                        /**
                         * Obtém o valor da propriedade vlrIndResContrato.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrIndResContrato() {
                            return vlrIndResContrato;
                        }

                        /**
                         * Define o valor da propriedade vlrIndResContrato.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrIndResContrato(BigDecimal value) {
                            this.vlrIndResContrato = value;
                        }

                        /**
                         * Obtém o valor da propriedade vlrAbonoPec.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrAbonoPec() {
                            return vlrAbonoPec;
                        }

                        /**
                         * Define o valor da propriedade vlrAbonoPec.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrAbonoPec(BigDecimal value) {
                            this.vlrAbonoPec = value;
                        }

                        /**
                         * Obtém o valor da propriedade vlrAuxMoradia.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrAuxMoradia() {
                            return vlrAuxMoradia;
                        }

                        /**
                         * Define o valor da propriedade vlrAuxMoradia.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrAuxMoradia(BigDecimal value) {
                            this.vlrAuxMoradia = value;
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
                 *         &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="cpfDep">
                 *                                       &lt;simpleType>
                 *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR2">
                 *                                         &lt;/restriction>
                 *                                       &lt;/simpleType>
                 *                                     &lt;/attribute>
                 *                                     &lt;attribute name="vlrDepenSusp">
                 *                                       &lt;simpleType>
                 *                                         &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
                 *                                         &lt;/restriction>
                 *                                       &lt;/simpleType>
                 *                                     &lt;/attribute>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="indTpDeducao">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                                 &lt;enumeration value="1"/>
                 *                                 &lt;enumeration value="5"/>
                 *                                 &lt;enumeration value="7"/>
                 *                               &lt;/restriction>
                 *                             &lt;/simpleType>
                 *                           &lt;/attribute>
                 *                           &lt;attribute name="vlrDedSusp">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
                 *                               &lt;/restriction>
                 *                             &lt;/simpleType>
                 *                           &lt;/attribute>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="indApuracao">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_indApuracao">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="vlrNRetido">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrNRetido">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="vlrDepJud">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDepJud">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="vlrCmpAnoCal">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrCmpAnoCal">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="vlrCmpAnoAnt">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrCmpAnoAnt">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="vlrRendSusp">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrRendSusp">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="tpProcRet">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpProc_1_2">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="nrProcRet">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrProcRet">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="codSusp">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_codSuspIR">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "infoValores"
                })
                public static class InfoProcRet {

                    protected List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet.InfoValores> infoValores;
                    @XmlAttribute(name = "tpProcRet")
                    protected Byte tpProcRet;
                    @XmlAttribute(name = "nrProcRet")
                    protected String nrProcRet;
                    @XmlAttribute(name = "codSusp")
                    protected BigInteger codSusp;

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
                     * {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet.InfoValores }
                     * 
                     * 
                     */
                    public List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet.InfoValores> getInfoValores() {
                        if (infoValores == null) {
                            infoValores = new ArrayList<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet.InfoValores>();
                        }
                        return this.infoValores;
                    }

                    /**
                     * Obtém o valor da propriedade tpProcRet.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getTpProcRet() {
                        return tpProcRet;
                    }

                    /**
                     * Define o valor da propriedade tpProcRet.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setTpProcRet(Byte value) {
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
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="cpfDep">
                     *                             &lt;simpleType>
                     *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR2">
                     *                               &lt;/restriction>
                     *                             &lt;/simpleType>
                     *                           &lt;/attribute>
                     *                           &lt;attribute name="vlrDepenSusp">
                     *                             &lt;simpleType>
                     *                               &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
                     *                               &lt;/restriction>
                     *                             &lt;/simpleType>
                     *                           &lt;/attribute>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="indTpDeducao">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *                       &lt;enumeration value="1"/>
                     *                       &lt;enumeration value="5"/>
                     *                       &lt;enumeration value="7"/>
                     *                     &lt;/restriction>
                     *                   &lt;/simpleType>
                     *                 &lt;/attribute>
                     *                 &lt;attribute name="vlrDedSusp">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
                     *                     &lt;/restriction>
                     *                   &lt;/simpleType>
                     *                 &lt;/attribute>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="indApuracao">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_indApuracao">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="vlrNRetido">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrNRetido">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="vlrDepJud">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDepJud">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="vlrCmpAnoCal">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrCmpAnoCal">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="vlrCmpAnoAnt">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrCmpAnoAnt">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="vlrRendSusp">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrRendSusp">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "dedSusp"
                    })
                    public static class InfoValores {

                        protected List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet.InfoValores.DedSusp> dedSusp;
                        @XmlAttribute(name = "indApuracao")
                        protected Byte indApuracao;
                        @XmlAttribute(name = "vlrNRetido")
                        protected BigDecimal vlrNRetido;
                        @XmlAttribute(name = "vlrDepJud")
                        protected BigDecimal vlrDepJud;
                        @XmlAttribute(name = "vlrCmpAnoCal")
                        protected BigDecimal vlrCmpAnoCal;
                        @XmlAttribute(name = "vlrCmpAnoAnt")
                        protected BigDecimal vlrCmpAnoAnt;
                        @XmlAttribute(name = "vlrRendSusp")
                        protected BigDecimal vlrRendSusp;

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
                         * {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet.InfoValores.DedSusp }
                         * 
                         * 
                         */
                        public List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet.InfoValores.DedSusp> getDedSusp() {
                            if (dedSusp == null) {
                                dedSusp = new ArrayList<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet.InfoValores.DedSusp>();
                            }
                            return this.dedSusp;
                        }

                        /**
                         * Obtém o valor da propriedade indApuracao.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *     
                         */
                        public Byte getIndApuracao() {
                            return indApuracao;
                        }

                        /**
                         * Define o valor da propriedade indApuracao.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *     
                         */
                        public void setIndApuracao(Byte value) {
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
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="cpfDep">
                         *                   &lt;simpleType>
                         *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR2">
                         *                     &lt;/restriction>
                         *                   &lt;/simpleType>
                         *                 &lt;/attribute>
                         *                 &lt;attribute name="vlrDepenSusp">
                         *                   &lt;simpleType>
                         *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
                         *                     &lt;/restriction>
                         *                   &lt;/simpleType>
                         *                 &lt;/attribute>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="indTpDeducao">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                         *             &lt;enumeration value="1"/>
                         *             &lt;enumeration value="5"/>
                         *             &lt;enumeration value="7"/>
                         *           &lt;/restriction>
                         *         &lt;/simpleType>
                         *       &lt;/attribute>
                         *       &lt;attribute name="vlrDedSusp">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
                         *           &lt;/restriction>
                         *         &lt;/simpleType>
                         *       &lt;/attribute>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "benefPen"
                        })
                        public static class DedSusp {

                            protected List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet.InfoValores.DedSusp.BenefPen> benefPen;
                            @XmlAttribute(name = "indTpDeducao")
                            protected Byte indTpDeducao;
                            @XmlAttribute(name = "vlrDedSusp")
                            protected BigDecimal vlrDedSusp;

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
                             * {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet.InfoValores.DedSusp.BenefPen }
                             * 
                             * 
                             */
                            public List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet.InfoValores.DedSusp.BenefPen> getBenefPen() {
                                if (benefPen == null) {
                                    benefPen = new ArrayList<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoProcRet.InfoValores.DedSusp.BenefPen>();
                                }
                                return this.benefPen;
                            }

                            /**
                             * Obtém o valor da propriedade indTpDeducao.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Byte }
                             *     
                             */
                            public Byte getIndTpDeducao() {
                                return indTpDeducao;
                            }

                            /**
                             * Define o valor da propriedade indTpDeducao.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Byte }
                             *     
                             */
                            public void setIndTpDeducao(Byte value) {
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
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;attribute name="cpfDep">
                             *         &lt;simpleType>
                             *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR2">
                             *           &lt;/restriction>
                             *         &lt;/simpleType>
                             *       &lt;/attribute>
                             *       &lt;attribute name="vlrDepenSusp">
                             *         &lt;simpleType>
                             *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario_positivo">
                             *           &lt;/restriction>
                             *         &lt;/simpleType>
                             *       &lt;/attribute>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class BenefPen {

                                @XmlAttribute(name = "cpfDep")
                                protected String cpfDep;
                                @XmlAttribute(name = "vlrDepenSusp")
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
                 *         &lt;element name="despProcJud" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="vlrDespCustas">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="vlrDespAdvogados">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ideAdv" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="tpInsc">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpInsc_1_2">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="nrInsc">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrInsc_11_14">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="vlrAdv">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="descRRA">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_descRRA">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="qtdMesesRRA">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_qtdMesesRRA">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "despProcJud",
                    "ideAdv"
                })
                public static class InfoRRA {

                    protected ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA.DespProcJud despProcJud;
                    protected List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA.IdeAdv> ideAdv;
                    @XmlAttribute(name = "descRRA")
                    protected String descRRA;
                    @XmlAttribute(name = "qtdMesesRRA")
                    protected BigDecimal qtdMesesRRA;

                    /**
                     * Obtém o valor da propriedade despProcJud.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA.DespProcJud }
                     *     
                     */
                    public ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA.DespProcJud getDespProcJud() {
                        return despProcJud;
                    }

                    /**
                     * Define o valor da propriedade despProcJud.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA.DespProcJud }
                     *     
                     */
                    public void setDespProcJud(ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA.DespProcJud value) {
                        this.despProcJud = value;
                    }

                    /**
                     * Gets the value of the ideAdv property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the ideAdv property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getIdeAdv().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA.IdeAdv }
                     * 
                     * 
                     */
                    public List<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA.IdeAdv> getIdeAdv() {
                        if (ideAdv == null) {
                            ideAdv = new ArrayList<ESocial.EvtContProc.IdeTrab.InfoCRIRRF.InfoRRA.IdeAdv>();
                        }
                        return this.ideAdv;
                    }

                    /**
                     * Obtém o valor da propriedade descRRA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescRRA() {
                        return descRRA;
                    }

                    /**
                     * Define o valor da propriedade descRRA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescRRA(String value) {
                        this.descRRA = value;
                    }

                    /**
                     * Obtém o valor da propriedade qtdMesesRRA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getQtdMesesRRA() {
                        return qtdMesesRRA;
                    }

                    /**
                     * Define o valor da propriedade qtdMesesRRA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setQtdMesesRRA(BigDecimal value) {
                        this.qtdMesesRRA = value;
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
                     *       &lt;attribute name="vlrDespCustas">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="vlrDespAdvogados">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class DespProcJud {

                        @XmlAttribute(name = "vlrDespCustas")
                        protected BigDecimal vlrDespCustas;
                        @XmlAttribute(name = "vlrDespAdvogados")
                        protected BigDecimal vlrDespAdvogados;

                        /**
                         * Obtém o valor da propriedade vlrDespCustas.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrDespCustas() {
                            return vlrDespCustas;
                        }

                        /**
                         * Define o valor da propriedade vlrDespCustas.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrDespCustas(BigDecimal value) {
                            this.vlrDespCustas = value;
                        }

                        /**
                         * Obtém o valor da propriedade vlrDespAdvogados.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrDespAdvogados() {
                            return vlrDespAdvogados;
                        }

                        /**
                         * Define o valor da propriedade vlrDespAdvogados.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrDespAdvogados(BigDecimal value) {
                            this.vlrDespAdvogados = value;
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
                     *       &lt;attribute name="tpInsc">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpInsc_1_2">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="nrInsc">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nrInsc_11_14">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="vlrAdv">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_valorMonetario">
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class IdeAdv {

                        @XmlAttribute(name = "tpInsc")
                        protected Byte tpInsc;
                        @XmlAttribute(name = "nrInsc")
                        protected String nrInsc;
                        @XmlAttribute(name = "vlrAdv")
                        protected BigDecimal vlrAdv;

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
                         * Obtém o valor da propriedade vlrAdv.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVlrAdv() {
                            return vlrAdv;
                        }

                        /**
                         * Define o valor da propriedade vlrAdv.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVlrAdv(BigDecimal value) {
                            this.vlrAdv = value;
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
                 *       &lt;attribute name="tpRend">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *             &lt;enumeration value="11"/>
                 *             &lt;enumeration value="12"/>
                 *             &lt;enumeration value="18"/>
                 *             &lt;enumeration value="79"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="cpfDep">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfPenAlim">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="vlrPensao">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_vlrDedPenAlim">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class PenAlim {

                    @XmlAttribute(name = "tpRend")
                    protected Byte tpRend;
                    @XmlAttribute(name = "cpfDep")
                    protected String cpfDep;
                    @XmlAttribute(name = "vlrPensao")
                    protected BigDecimal vlrPensao;

                    /**
                     * Obtém o valor da propriedade tpRend.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getTpRend() {
                        return tpRend;
                    }

                    /**
                     * Define o valor da propriedade tpRend.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setTpRend(Byte value) {
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
                     * Obtém o valor da propriedade vlrPensao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrPensao() {
                        return vlrPensao;
                    }

                    /**
                     * Define o valor da propriedade vlrPensao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrPensao(BigDecimal value) {
                        this.vlrPensao = value;
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
             *         &lt;element name="infoDep" maxOccurs="999" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="cpfDep">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="dtNascto">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_dtNascto">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="nome">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nmDep">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="depIRRF">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_depIRRF_IR">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="tpDep">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpDep">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="descrDep">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_descrDep">
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="dtLaudo">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "infoDep"
            })
            public static class InfoIRComplem {

                protected List<ESocial.EvtContProc.IdeTrab.InfoIRComplem.InfoDep> infoDep;
                @XmlAttribute(name = "dtLaudo")
                protected XMLGregorianCalendar dtLaudo;

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
                 * {@link ESocial.EvtContProc.IdeTrab.InfoIRComplem.InfoDep }
                 * 
                 * 
                 */
                public List<ESocial.EvtContProc.IdeTrab.InfoIRComplem.InfoDep> getInfoDep() {
                    if (infoDep == null) {
                        infoDep = new ArrayList<ESocial.EvtContProc.IdeTrab.InfoIRComplem.InfoDep>();
                    }
                    return this.infoDep;
                }

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
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="cpfDep">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_cpfDepIR">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="dtNascto">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_dtNascto">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="nome">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_nmDep">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="depIRRF">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_depIRRF_IR">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="tpDep">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_tpDep">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="descrDep">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_03_00}TS_descrDep">
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class InfoDep {

                    @XmlAttribute(name = "cpfDep")
                    protected String cpfDep;
                    @XmlAttribute(name = "dtNascto")
                    protected XMLGregorianCalendar dtNascto;
                    @XmlAttribute(name = "nome")
                    protected String nome;
                    @XmlAttribute(name = "depIRRF")
                    protected TSSim depIRRF;
                    @XmlAttribute(name = "tpDep")
                    protected String tpDep;
                    @XmlAttribute(name = "descrDep")
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

            }

        }

    }

}
