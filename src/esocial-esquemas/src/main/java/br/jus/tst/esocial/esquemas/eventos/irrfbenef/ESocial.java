//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:25 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.irrfbenef;

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
 *         &lt;element name="evtIrrfBenef">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrRecibo"/>
 *                             &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_perApur_mensal"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}T_ideEmpregador"/>
 *                   &lt;element name="ideTrabalhador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpf"/>
 *                             &lt;element name="dmDev" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_perApur"/>
 *                                       &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codigo_esocial"/>
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
 *                                       &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codCateg"/>
 *                                       &lt;element name="infoIR" maxOccurs="999" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpInfoIR">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                       &lt;enumeration value="11"/>
 *                                                       &lt;enumeration value="12"/>
 *                                                       &lt;enumeration value="14"/>
 *                                                       &lt;enumeration value="31"/>
 *                                                       &lt;enumeration value="32"/>
 *                                                       &lt;enumeration value="34"/>
 *                                                       &lt;enumeration value="41"/>
 *                                                       &lt;enumeration value="42"/>
 *                                                       &lt;enumeration value="46"/>
 *                                                       &lt;enumeration value="47"/>
 *                                                       &lt;enumeration value="51"/>
 *                                                       &lt;enumeration value="52"/>
 *                                                       &lt;enumeration value="54"/>
 *                                                       &lt;enumeration value="61"/>
 *                                                       &lt;enumeration value="62"/>
 *                                                       &lt;enumeration value="63"/>
 *                                                       &lt;enumeration value="64"/>
 *                                                       &lt;enumeration value="67"/>
 *                                                       &lt;enumeration value="68"/>
 *                                                       &lt;enumeration value="70"/>
 *                                                       &lt;enumeration value="71"/>
 *                                                       &lt;enumeration value="72"/>
 *                                                       &lt;enumeration value="73"/>
 *                                                       &lt;enumeration value="74"/>
 *                                                       &lt;enumeration value="75"/>
 *                                                       &lt;enumeration value="76"/>
 *                                                       &lt;enumeration value="77"/>
 *                                                       &lt;enumeration value="700"/>
 *                                                       &lt;enumeration value="701"/>
 *                                                       &lt;enumeration value="702"/>
 *                                                       &lt;enumeration value="703"/>
 *                                                       &lt;enumeration value="704"/>
 *                                                       &lt;enumeration value="79"/>
 *                                                       &lt;enumeration value="7900"/>
 *                                                       &lt;enumeration value="7950"/>
 *                                                       &lt;enumeration value="7951"/>
 *                                                       &lt;enumeration value="7952"/>
 *                                                       &lt;enumeration value="7953"/>
 *                                                       &lt;enumeration value="7954"/>
 *                                                       &lt;enumeration value="7955"/>
 *                                                       &lt;enumeration value="7956"/>
 *                                                       &lt;enumeration value="7957"/>
 *                                                       &lt;enumeration value="7958"/>
 *                                                       &lt;enumeration value="7959"/>
 *                                                       &lt;enumeration value="7960"/>
 *                                                       &lt;enumeration value="7961"/>
 *                                                       &lt;enumeration value="7962"/>
 *                                                       &lt;enumeration value="7963"/>
 *                                                       &lt;enumeration value="7964"/>
 *                                                       &lt;enumeration value="9011"/>
 *                                                       &lt;enumeration value="9012"/>
 *                                                       &lt;enumeration value="9014"/>
 *                                                       &lt;enumeration value="9031"/>
 *                                                       &lt;enumeration value="9032"/>
 *                                                       &lt;enumeration value="9034"/>
 *                                                       &lt;enumeration value="9831"/>
 *                                                       &lt;enumeration value="9832"/>
 *                                                       &lt;enumeration value="9834"/>
 *                                                       &lt;enumeration value="9041"/>
 *                                                       &lt;enumeration value="9042"/>
 *                                                       &lt;enumeration value="9046"/>
 *                                                       &lt;enumeration value="9047"/>
 *                                                       &lt;enumeration value="9051"/>
 *                                                       &lt;enumeration value="9052"/>
 *                                                       &lt;enumeration value="9054"/>
 *                                                       &lt;enumeration value="9061"/>
 *                                                       &lt;enumeration value="9062"/>
 *                                                       &lt;enumeration value="9063"/>
 *                                                       &lt;enumeration value="9064"/>
 *                                                       &lt;enumeration value="9067"/>
 *                                                       &lt;enumeration value="9082"/>
 *                                                       &lt;enumeration value="9083"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="descRendimento" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="100"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoProcJudRub" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProcJud_1"/>
 *                                                           &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_uf"/>
 *                                                           &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codMunic"/>
 *                                                           &lt;element name="idVara">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                                 &lt;pattern value="\d{1,4}"/>
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
 *                                       &lt;element name="totApurMen" maxOccurs="50" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRMen"/>
 *                                                 &lt;element name="vlrRendTrib" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrRendTrib13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrPrevOficial" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrPrevOficial13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrCR13Men" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrParcIsenta65" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrParcIsenta65Dec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrDiarias" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrAjudaCusto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrIndResContrato" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrAbonoPec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrRendMoleGrave" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrRendMoleGrave13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrAuxMoradia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrBolsaMedico" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrBolsaMedico13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrJurosMora" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="vlrIsenOutros" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
 *                                                 &lt;element name="descRendimento" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="totApurDia" maxOccurs="350" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="perApurDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_dia"/>
 *                                                 &lt;element name="CRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRDia"/>
 *                                                 &lt;element name="frmTribut">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="\d{2}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_pais"/>
 *                                                 &lt;element name="vlrPagoDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrCRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoRRA" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpProc_1_2"/>
 *                                                 &lt;element name="nrProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProc_17_20_21" minOccurs="0"/>
 *                                                 &lt;element name="descRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_descRRA"/>
 *                                                 &lt;element name="qtdMesesRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_qtdMesesRRA"/>
 *                                                 &lt;element name="despProcJud" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="vlrDespCustas" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                           &lt;element name="vlrDespAdvogados" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ideAdv" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpInsc_1_2"/>
 *                                                           &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrInsc_11_14"/>
 *                                                           &lt;element name="vlrAdv" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
 *                                       &lt;element name="infoPgtoExt" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_pais"/>
 *                                                 &lt;element name="indNIF" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indNIF"/>
 *                                                 &lt;element name="nifBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codigo_esocial" minOccurs="0"/>
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
 *                                                           &lt;element name="endNrLograd" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrLograd" minOccurs="0"/>
 *                                                           &lt;element name="endComplem" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_complemento" minOccurs="0"/>
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
 *                             &lt;element name="totInfoIR" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="consolidApurMen" maxOccurs="50" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRMen"/>
 *                                                 &lt;element name="vlrRendTrib" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrRendTrib13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrPrevOficial" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrPrevOficial13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrCR13Men" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrParcIsenta65" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrParcIsenta65Dec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrDiarias" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrAjudaCusto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrIndResContrato" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrAbonoPec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrRendMoleGrave" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrRendMoleGrave13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrAuxMoradia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrBolsaMedico" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrBolsaMedico13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrJurosMora" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vlrIsenOutros" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="descRendimento" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="999"/>
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
 *                                                 &lt;element name="perRefAjuste" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_perApur_mensal"/>
 *                                                 &lt;element name="nrRec1210Orig" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrRecibo"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ideDep" maxOccurs="999" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR"/>
 *                                                 &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
 *                                                 &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_dtNascto" minOccurs="0"/>
 *                                                 &lt;element name="nome" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nmDep" minOccurs="0"/>
 *                                                 &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpDep" minOccurs="0"/>
 *                                                 &lt;element name="descrDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_descrDep" minOccurs="0"/>
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
 *                                                 &lt;element name="tpCR" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CR_IR"/>
 *                                                 &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpRendDep"/>
 *                                                           &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
 *                                                           &lt;element name="vlrDedDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDedDep"/>
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
 *                                                           &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpRendPenAlim"/>
 *                                                           &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfPenAlim"/>
 *                                                           &lt;element name="vlrDedPenAlim" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDedPenAlim"/>
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
 *                                                           &lt;element name="tpPrev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpPrevCompl"/>
 *                                                           &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj"/>
 *                                                           &lt;element name="vlrDedPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                           &lt;element name="vlrDedPC13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                           &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
 *                                                           &lt;element name="vlrPatrocFunp13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
 *                                                           &lt;element name="tpProcRet" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpProc_1_2"/>
 *                                                           &lt;element name="nrProcRet" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProcRet"/>
 *                                                           &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codSuspIR" minOccurs="0"/>
 *                                                           &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indApuracao"/>
 *                                                                     &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
 *                                                                     &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
 *                                                                     &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
 *                                                                     &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
 *                                                                     &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
 *                                                                     &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indTpDeducao"/>
 *                                                                               &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                                               &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
 *                                                                               &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
 *                                                                               &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
 *                                                                                         &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
 *                                                 &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj"/>
 *                                                 &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_regANS" minOccurs="0"/>
 *                                                 &lt;element name="vlrSaudeTit" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
 *                                                 &lt;element name="infoDepSau" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
 *                                                           &lt;element name="vlrSaudeDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
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
 *                                                 &lt;element name="indOrgReemb" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indOrgReemb"/>
 *                                                 &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
 *                                                 &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_regANS" minOccurs="0"/>
 *                                                 &lt;element name="detReembTit" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}T_detReemb_Tot" maxOccurs="99" minOccurs="0"/>
 *                                                 &lt;element name="infoReembDep" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
 *                                                           &lt;element name="detReembDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}T_detReemb_Tot" maxOccurs="99" minOccurs="0"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_Id_retorno" />
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
    "evtIrrfBenef",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtIrrfBenef evtIrrfBenef;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtIrrfBenef.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtIrrfBenef }
     *     
     */
    public ESocial.EvtIrrfBenef getEvtIrrfBenef() {
        return evtIrrfBenef;
    }

    /**
     * Define o valor da propriedade evtIrrfBenef.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtIrrfBenef }
     *     
     */
    public void setEvtIrrfBenef(ESocial.EvtIrrfBenef value) {
        this.evtIrrfBenef = value;
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
     *                   &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrRecibo"/>
     *                   &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_perApur_mensal"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}T_ideEmpregador"/>
     *         &lt;element name="ideTrabalhador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpf"/>
     *                   &lt;element name="dmDev" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_perApur"/>
     *                             &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codigo_esocial"/>
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
     *                             &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codCateg"/>
     *                             &lt;element name="infoIR" maxOccurs="999" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpInfoIR">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                             &lt;enumeration value="11"/>
     *                                             &lt;enumeration value="12"/>
     *                                             &lt;enumeration value="14"/>
     *                                             &lt;enumeration value="31"/>
     *                                             &lt;enumeration value="32"/>
     *                                             &lt;enumeration value="34"/>
     *                                             &lt;enumeration value="41"/>
     *                                             &lt;enumeration value="42"/>
     *                                             &lt;enumeration value="46"/>
     *                                             &lt;enumeration value="47"/>
     *                                             &lt;enumeration value="51"/>
     *                                             &lt;enumeration value="52"/>
     *                                             &lt;enumeration value="54"/>
     *                                             &lt;enumeration value="61"/>
     *                                             &lt;enumeration value="62"/>
     *                                             &lt;enumeration value="63"/>
     *                                             &lt;enumeration value="64"/>
     *                                             &lt;enumeration value="67"/>
     *                                             &lt;enumeration value="68"/>
     *                                             &lt;enumeration value="70"/>
     *                                             &lt;enumeration value="71"/>
     *                                             &lt;enumeration value="72"/>
     *                                             &lt;enumeration value="73"/>
     *                                             &lt;enumeration value="74"/>
     *                                             &lt;enumeration value="75"/>
     *                                             &lt;enumeration value="76"/>
     *                                             &lt;enumeration value="77"/>
     *                                             &lt;enumeration value="700"/>
     *                                             &lt;enumeration value="701"/>
     *                                             &lt;enumeration value="702"/>
     *                                             &lt;enumeration value="703"/>
     *                                             &lt;enumeration value="704"/>
     *                                             &lt;enumeration value="79"/>
     *                                             &lt;enumeration value="7900"/>
     *                                             &lt;enumeration value="7950"/>
     *                                             &lt;enumeration value="7951"/>
     *                                             &lt;enumeration value="7952"/>
     *                                             &lt;enumeration value="7953"/>
     *                                             &lt;enumeration value="7954"/>
     *                                             &lt;enumeration value="7955"/>
     *                                             &lt;enumeration value="7956"/>
     *                                             &lt;enumeration value="7957"/>
     *                                             &lt;enumeration value="7958"/>
     *                                             &lt;enumeration value="7959"/>
     *                                             &lt;enumeration value="7960"/>
     *                                             &lt;enumeration value="7961"/>
     *                                             &lt;enumeration value="7962"/>
     *                                             &lt;enumeration value="7963"/>
     *                                             &lt;enumeration value="7964"/>
     *                                             &lt;enumeration value="9011"/>
     *                                             &lt;enumeration value="9012"/>
     *                                             &lt;enumeration value="9014"/>
     *                                             &lt;enumeration value="9031"/>
     *                                             &lt;enumeration value="9032"/>
     *                                             &lt;enumeration value="9034"/>
     *                                             &lt;enumeration value="9831"/>
     *                                             &lt;enumeration value="9832"/>
     *                                             &lt;enumeration value="9834"/>
     *                                             &lt;enumeration value="9041"/>
     *                                             &lt;enumeration value="9042"/>
     *                                             &lt;enumeration value="9046"/>
     *                                             &lt;enumeration value="9047"/>
     *                                             &lt;enumeration value="9051"/>
     *                                             &lt;enumeration value="9052"/>
     *                                             &lt;enumeration value="9054"/>
     *                                             &lt;enumeration value="9061"/>
     *                                             &lt;enumeration value="9062"/>
     *                                             &lt;enumeration value="9063"/>
     *                                             &lt;enumeration value="9064"/>
     *                                             &lt;enumeration value="9067"/>
     *                                             &lt;enumeration value="9082"/>
     *                                             &lt;enumeration value="9083"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="descRendimento" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="100"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="infoProcJudRub" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProcJud_1"/>
     *                                                 &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_uf"/>
     *                                                 &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codMunic"/>
     *                                                 &lt;element name="idVara">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                       &lt;pattern value="\d{1,4}"/>
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
     *                             &lt;element name="totApurMen" maxOccurs="50" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRMen"/>
     *                                       &lt;element name="vlrRendTrib" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrRendTrib13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrPrevOficial" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrPrevOficial13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrCR13Men" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrParcIsenta65" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrParcIsenta65Dec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrDiarias" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrAjudaCusto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrIndResContrato" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrAbonoPec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrRendMoleGrave" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrRendMoleGrave13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrAuxMoradia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrBolsaMedico" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrBolsaMedico13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrJurosMora" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="vlrIsenOutros" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
     *                                       &lt;element name="descRendimento" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="255"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="totApurDia" maxOccurs="350" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="perApurDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_dia"/>
     *                                       &lt;element name="CRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRDia"/>
     *                                       &lt;element name="frmTribut">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="\d{2}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_pais"/>
     *                                       &lt;element name="vlrPagoDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrCRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoRRA" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpProc_1_2"/>
     *                                       &lt;element name="nrProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProc_17_20_21" minOccurs="0"/>
     *                                       &lt;element name="descRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_descRRA"/>
     *                                       &lt;element name="qtdMesesRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_qtdMesesRRA"/>
     *                                       &lt;element name="despProcJud" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="vlrDespCustas" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                                 &lt;element name="vlrDespAdvogados" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ideAdv" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpInsc_1_2"/>
     *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrInsc_11_14"/>
     *                                                 &lt;element name="vlrAdv" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
     *                             &lt;element name="infoPgtoExt" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_pais"/>
     *                                       &lt;element name="indNIF" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indNIF"/>
     *                                       &lt;element name="nifBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codigo_esocial" minOccurs="0"/>
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
     *                                                 &lt;element name="endNrLograd" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrLograd" minOccurs="0"/>
     *                                                 &lt;element name="endComplem" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_complemento" minOccurs="0"/>
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
     *                   &lt;element name="totInfoIR" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="consolidApurMen" maxOccurs="50" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRMen"/>
     *                                       &lt;element name="vlrRendTrib" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrRendTrib13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrPrevOficial" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrPrevOficial13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrCR13Men" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrParcIsenta65" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrParcIsenta65Dec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrDiarias" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrAjudaCusto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrIndResContrato" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrAbonoPec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrRendMoleGrave" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrRendMoleGrave13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrAuxMoradia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrBolsaMedico" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrBolsaMedico13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrJurosMora" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="vlrIsenOutros" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="descRendimento" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="999"/>
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
     *                                       &lt;element name="perRefAjuste" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_perApur_mensal"/>
     *                                       &lt;element name="nrRec1210Orig" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrRecibo"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ideDep" maxOccurs="999" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR"/>
     *                                       &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
     *                                       &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_dtNascto" minOccurs="0"/>
     *                                       &lt;element name="nome" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nmDep" minOccurs="0"/>
     *                                       &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpDep" minOccurs="0"/>
     *                                       &lt;element name="descrDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_descrDep" minOccurs="0"/>
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
     *                                       &lt;element name="tpCR" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CR_IR"/>
     *                                       &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpRendDep"/>
     *                                                 &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
     *                                                 &lt;element name="vlrDedDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDedDep"/>
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
     *                                                 &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpRendPenAlim"/>
     *                                                 &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfPenAlim"/>
     *                                                 &lt;element name="vlrDedPenAlim" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDedPenAlim"/>
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
     *                                                 &lt;element name="tpPrev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpPrevCompl"/>
     *                                                 &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj"/>
     *                                                 &lt;element name="vlrDedPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                 &lt;element name="vlrDedPC13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                 &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
     *                                                 &lt;element name="vlrPatrocFunp13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
     *                                                 &lt;element name="tpProcRet" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpProc_1_2"/>
     *                                                 &lt;element name="nrProcRet" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProcRet"/>
     *                                                 &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codSuspIR" minOccurs="0"/>
     *                                                 &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indApuracao"/>
     *                                                           &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
     *                                                           &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
     *                                                           &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
     *                                                           &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
     *                                                           &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
     *                                                           &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indTpDeducao"/>
     *                                                                     &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                                     &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
     *                                                                     &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
     *                                                                     &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
     *                                                                               &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
     *                                       &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj"/>
     *                                       &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_regANS" minOccurs="0"/>
     *                                       &lt;element name="vlrSaudeTit" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
     *                                       &lt;element name="infoDepSau" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
     *                                                 &lt;element name="vlrSaudeDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
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
     *                                       &lt;element name="indOrgReemb" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indOrgReemb"/>
     *                                       &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
     *                                       &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_regANS" minOccurs="0"/>
     *                                       &lt;element name="detReembTit" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}T_detReemb_Tot" maxOccurs="99" minOccurs="0"/>
     *                                       &lt;element name="infoReembDep" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
     *                                                 &lt;element name="detReembDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}T_detReemb_Tot" maxOccurs="99" minOccurs="0"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_Id_retorno" />
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
        "ideTrabalhador"
    })
    public static class EvtIrrfBenef {

        @XmlElement(required = true)
        protected ESocial.EvtIrrfBenef.IdeEvento ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtIrrfBenef.IdeTrabalhador ideTrabalhador;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtIrrfBenef.IdeEvento }
         *     
         */
        public ESocial.EvtIrrfBenef.IdeEvento getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtIrrfBenef.IdeEvento }
         *     
         */
        public void setIdeEvento(ESocial.EvtIrrfBenef.IdeEvento value) {
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
         * Obtém o valor da propriedade ideTrabalhador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador }
         *     
         */
        public ESocial.EvtIrrfBenef.IdeTrabalhador getIdeTrabalhador() {
            return ideTrabalhador;
        }

        /**
         * Define o valor da propriedade ideTrabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador }
         *     
         */
        public void setIdeTrabalhador(ESocial.EvtIrrfBenef.IdeTrabalhador value) {
            this.ideTrabalhador = value;
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
         *         &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrRecibo"/>
         *         &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_perApur_mensal"/>
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
         *         &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpf"/>
         *         &lt;element name="dmDev" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_perApur"/>
         *                   &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codigo_esocial"/>
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
         *                   &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codCateg"/>
         *                   &lt;element name="infoIR" maxOccurs="999" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpInfoIR">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                   &lt;enumeration value="11"/>
         *                                   &lt;enumeration value="12"/>
         *                                   &lt;enumeration value="14"/>
         *                                   &lt;enumeration value="31"/>
         *                                   &lt;enumeration value="32"/>
         *                                   &lt;enumeration value="34"/>
         *                                   &lt;enumeration value="41"/>
         *                                   &lt;enumeration value="42"/>
         *                                   &lt;enumeration value="46"/>
         *                                   &lt;enumeration value="47"/>
         *                                   &lt;enumeration value="51"/>
         *                                   &lt;enumeration value="52"/>
         *                                   &lt;enumeration value="54"/>
         *                                   &lt;enumeration value="61"/>
         *                                   &lt;enumeration value="62"/>
         *                                   &lt;enumeration value="63"/>
         *                                   &lt;enumeration value="64"/>
         *                                   &lt;enumeration value="67"/>
         *                                   &lt;enumeration value="68"/>
         *                                   &lt;enumeration value="70"/>
         *                                   &lt;enumeration value="71"/>
         *                                   &lt;enumeration value="72"/>
         *                                   &lt;enumeration value="73"/>
         *                                   &lt;enumeration value="74"/>
         *                                   &lt;enumeration value="75"/>
         *                                   &lt;enumeration value="76"/>
         *                                   &lt;enumeration value="77"/>
         *                                   &lt;enumeration value="700"/>
         *                                   &lt;enumeration value="701"/>
         *                                   &lt;enumeration value="702"/>
         *                                   &lt;enumeration value="703"/>
         *                                   &lt;enumeration value="704"/>
         *                                   &lt;enumeration value="79"/>
         *                                   &lt;enumeration value="7900"/>
         *                                   &lt;enumeration value="7950"/>
         *                                   &lt;enumeration value="7951"/>
         *                                   &lt;enumeration value="7952"/>
         *                                   &lt;enumeration value="7953"/>
         *                                   &lt;enumeration value="7954"/>
         *                                   &lt;enumeration value="7955"/>
         *                                   &lt;enumeration value="7956"/>
         *                                   &lt;enumeration value="7957"/>
         *                                   &lt;enumeration value="7958"/>
         *                                   &lt;enumeration value="7959"/>
         *                                   &lt;enumeration value="7960"/>
         *                                   &lt;enumeration value="7961"/>
         *                                   &lt;enumeration value="7962"/>
         *                                   &lt;enumeration value="7963"/>
         *                                   &lt;enumeration value="7964"/>
         *                                   &lt;enumeration value="9011"/>
         *                                   &lt;enumeration value="9012"/>
         *                                   &lt;enumeration value="9014"/>
         *                                   &lt;enumeration value="9031"/>
         *                                   &lt;enumeration value="9032"/>
         *                                   &lt;enumeration value="9034"/>
         *                                   &lt;enumeration value="9831"/>
         *                                   &lt;enumeration value="9832"/>
         *                                   &lt;enumeration value="9834"/>
         *                                   &lt;enumeration value="9041"/>
         *                                   &lt;enumeration value="9042"/>
         *                                   &lt;enumeration value="9046"/>
         *                                   &lt;enumeration value="9047"/>
         *                                   &lt;enumeration value="9051"/>
         *                                   &lt;enumeration value="9052"/>
         *                                   &lt;enumeration value="9054"/>
         *                                   &lt;enumeration value="9061"/>
         *                                   &lt;enumeration value="9062"/>
         *                                   &lt;enumeration value="9063"/>
         *                                   &lt;enumeration value="9064"/>
         *                                   &lt;enumeration value="9067"/>
         *                                   &lt;enumeration value="9082"/>
         *                                   &lt;enumeration value="9083"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="descRendimento" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="100"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="infoProcJudRub" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProcJud_1"/>
         *                                       &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_uf"/>
         *                                       &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codMunic"/>
         *                                       &lt;element name="idVara">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                             &lt;pattern value="\d{1,4}"/>
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
         *                   &lt;element name="totApurMen" maxOccurs="50" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRMen"/>
         *                             &lt;element name="vlrRendTrib" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrRendTrib13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrPrevOficial" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrPrevOficial13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrCR13Men" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrParcIsenta65" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrParcIsenta65Dec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrDiarias" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrAjudaCusto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrIndResContrato" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrAbonoPec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrRendMoleGrave" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrRendMoleGrave13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrAuxMoradia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrBolsaMedico" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrBolsaMedico13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrJurosMora" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="vlrIsenOutros" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
         *                             &lt;element name="descRendimento" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="255"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="totApurDia" maxOccurs="350" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="perApurDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_dia"/>
         *                             &lt;element name="CRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRDia"/>
         *                             &lt;element name="frmTribut">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="\d{2}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_pais"/>
         *                             &lt;element name="vlrPagoDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrCRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoRRA" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpProc_1_2"/>
         *                             &lt;element name="nrProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProc_17_20_21" minOccurs="0"/>
         *                             &lt;element name="descRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_descRRA"/>
         *                             &lt;element name="qtdMesesRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_qtdMesesRRA"/>
         *                             &lt;element name="despProcJud" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="vlrDespCustas" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                                       &lt;element name="vlrDespAdvogados" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ideAdv" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpInsc_1_2"/>
         *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrInsc_11_14"/>
         *                                       &lt;element name="vlrAdv" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
         *                   &lt;element name="infoPgtoExt" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_pais"/>
         *                             &lt;element name="indNIF" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indNIF"/>
         *                             &lt;element name="nifBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codigo_esocial" minOccurs="0"/>
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
         *                                       &lt;element name="endNrLograd" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrLograd" minOccurs="0"/>
         *                                       &lt;element name="endComplem" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_complemento" minOccurs="0"/>
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
         *         &lt;element name="totInfoIR" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="consolidApurMen" maxOccurs="50" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRMen"/>
         *                             &lt;element name="vlrRendTrib" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrRendTrib13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrPrevOficial" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrPrevOficial13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrCR13Men" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrParcIsenta65" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrParcIsenta65Dec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrDiarias" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrAjudaCusto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrIndResContrato" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrAbonoPec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrRendMoleGrave" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrRendMoleGrave13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrAuxMoradia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrBolsaMedico" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrBolsaMedico13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrJurosMora" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="vlrIsenOutros" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="descRendimento" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="999"/>
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
         *                             &lt;element name="perRefAjuste" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_perApur_mensal"/>
         *                             &lt;element name="nrRec1210Orig" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrRecibo"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ideDep" maxOccurs="999" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR"/>
         *                             &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
         *                             &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_dtNascto" minOccurs="0"/>
         *                             &lt;element name="nome" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nmDep" minOccurs="0"/>
         *                             &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpDep" minOccurs="0"/>
         *                             &lt;element name="descrDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_descrDep" minOccurs="0"/>
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
         *                             &lt;element name="tpCR" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CR_IR"/>
         *                             &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpRendDep"/>
         *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
         *                                       &lt;element name="vlrDedDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDedDep"/>
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
         *                                       &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpRendPenAlim"/>
         *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfPenAlim"/>
         *                                       &lt;element name="vlrDedPenAlim" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDedPenAlim"/>
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
         *                                       &lt;element name="tpPrev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpPrevCompl"/>
         *                                       &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj"/>
         *                                       &lt;element name="vlrDedPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                       &lt;element name="vlrDedPC13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                       &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
         *                                       &lt;element name="vlrPatrocFunp13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
         *                                       &lt;element name="tpProcRet" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpProc_1_2"/>
         *                                       &lt;element name="nrProcRet" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProcRet"/>
         *                                       &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codSuspIR" minOccurs="0"/>
         *                                       &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indApuracao"/>
         *                                                 &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
         *                                                 &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
         *                                                 &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
         *                                                 &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
         *                                                 &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
         *                                                 &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indTpDeducao"/>
         *                                                           &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                                           &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
         *                                                           &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
         *                                                           &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
         *                                                                     &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
         *                             &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj"/>
         *                             &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_regANS" minOccurs="0"/>
         *                             &lt;element name="vlrSaudeTit" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
         *                             &lt;element name="infoDepSau" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
         *                                       &lt;element name="vlrSaudeDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
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
         *                             &lt;element name="indOrgReemb" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indOrgReemb"/>
         *                             &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
         *                             &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_regANS" minOccurs="0"/>
         *                             &lt;element name="detReembTit" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}T_detReemb_Tot" maxOccurs="99" minOccurs="0"/>
         *                             &lt;element name="infoReembDep" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
         *                                       &lt;element name="detReembDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}T_detReemb_Tot" maxOccurs="99" minOccurs="0"/>
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
            "dmDev",
            "totInfoIR",
            "infoIRComplem"
        })
        public static class IdeTrabalhador {

            @XmlElement(required = true)
            protected String cpfBenef;
            protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev> dmDev;
            protected ESocial.EvtIrrfBenef.IdeTrabalhador.TotInfoIR totInfoIR;
            protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem> infoIRComplem;

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
             * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev }
             * 
             * 
             */
            public List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev> getDmDev() {
                if (dmDev == null) {
                    dmDev = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev>();
                }
                return this.dmDev;
            }

            /**
             * Obtém o valor da propriedade totInfoIR.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador.TotInfoIR }
             *     
             */
            public ESocial.EvtIrrfBenef.IdeTrabalhador.TotInfoIR getTotInfoIR() {
                return totInfoIR;
            }

            /**
             * Define o valor da propriedade totInfoIR.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador.TotInfoIR }
             *     
             */
            public void setTotInfoIR(ESocial.EvtIrrfBenef.IdeTrabalhador.TotInfoIR value) {
                this.totInfoIR = value;
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
             * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem }
             * 
             * 
             */
            public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem> getInfoIRComplem() {
                if (infoIRComplem == null) {
                    infoIRComplem = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem>();
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
             *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_perApur"/>
             *         &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codigo_esocial"/>
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
             *         &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codCateg"/>
             *         &lt;element name="infoIR" maxOccurs="999" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpInfoIR">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                         &lt;enumeration value="11"/>
             *                         &lt;enumeration value="12"/>
             *                         &lt;enumeration value="14"/>
             *                         &lt;enumeration value="31"/>
             *                         &lt;enumeration value="32"/>
             *                         &lt;enumeration value="34"/>
             *                         &lt;enumeration value="41"/>
             *                         &lt;enumeration value="42"/>
             *                         &lt;enumeration value="46"/>
             *                         &lt;enumeration value="47"/>
             *                         &lt;enumeration value="51"/>
             *                         &lt;enumeration value="52"/>
             *                         &lt;enumeration value="54"/>
             *                         &lt;enumeration value="61"/>
             *                         &lt;enumeration value="62"/>
             *                         &lt;enumeration value="63"/>
             *                         &lt;enumeration value="64"/>
             *                         &lt;enumeration value="67"/>
             *                         &lt;enumeration value="68"/>
             *                         &lt;enumeration value="70"/>
             *                         &lt;enumeration value="71"/>
             *                         &lt;enumeration value="72"/>
             *                         &lt;enumeration value="73"/>
             *                         &lt;enumeration value="74"/>
             *                         &lt;enumeration value="75"/>
             *                         &lt;enumeration value="76"/>
             *                         &lt;enumeration value="77"/>
             *                         &lt;enumeration value="700"/>
             *                         &lt;enumeration value="701"/>
             *                         &lt;enumeration value="702"/>
             *                         &lt;enumeration value="703"/>
             *                         &lt;enumeration value="704"/>
             *                         &lt;enumeration value="79"/>
             *                         &lt;enumeration value="7900"/>
             *                         &lt;enumeration value="7950"/>
             *                         &lt;enumeration value="7951"/>
             *                         &lt;enumeration value="7952"/>
             *                         &lt;enumeration value="7953"/>
             *                         &lt;enumeration value="7954"/>
             *                         &lt;enumeration value="7955"/>
             *                         &lt;enumeration value="7956"/>
             *                         &lt;enumeration value="7957"/>
             *                         &lt;enumeration value="7958"/>
             *                         &lt;enumeration value="7959"/>
             *                         &lt;enumeration value="7960"/>
             *                         &lt;enumeration value="7961"/>
             *                         &lt;enumeration value="7962"/>
             *                         &lt;enumeration value="7963"/>
             *                         &lt;enumeration value="7964"/>
             *                         &lt;enumeration value="9011"/>
             *                         &lt;enumeration value="9012"/>
             *                         &lt;enumeration value="9014"/>
             *                         &lt;enumeration value="9031"/>
             *                         &lt;enumeration value="9032"/>
             *                         &lt;enumeration value="9034"/>
             *                         &lt;enumeration value="9831"/>
             *                         &lt;enumeration value="9832"/>
             *                         &lt;enumeration value="9834"/>
             *                         &lt;enumeration value="9041"/>
             *                         &lt;enumeration value="9042"/>
             *                         &lt;enumeration value="9046"/>
             *                         &lt;enumeration value="9047"/>
             *                         &lt;enumeration value="9051"/>
             *                         &lt;enumeration value="9052"/>
             *                         &lt;enumeration value="9054"/>
             *                         &lt;enumeration value="9061"/>
             *                         &lt;enumeration value="9062"/>
             *                         &lt;enumeration value="9063"/>
             *                         &lt;enumeration value="9064"/>
             *                         &lt;enumeration value="9067"/>
             *                         &lt;enumeration value="9082"/>
             *                         &lt;enumeration value="9083"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="descRendimento" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="100"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="infoProcJudRub" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProcJud_1"/>
             *                             &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_uf"/>
             *                             &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codMunic"/>
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
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="totApurMen" maxOccurs="50" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRMen"/>
             *                   &lt;element name="vlrRendTrib" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrRendTrib13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrPrevOficial" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrPrevOficial13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrCR13Men" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrParcIsenta65" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrParcIsenta65Dec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrDiarias" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrAjudaCusto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrIndResContrato" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrAbonoPec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrRendMoleGrave" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrRendMoleGrave13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrAuxMoradia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrBolsaMedico" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrBolsaMedico13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrJurosMora" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="vlrIsenOutros" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
             *                   &lt;element name="descRendimento" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="255"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="totApurDia" maxOccurs="350" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="perApurDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_dia"/>
             *                   &lt;element name="CRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRDia"/>
             *                   &lt;element name="frmTribut">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="\d{2}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_pais"/>
             *                   &lt;element name="vlrPagoDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrCRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoRRA" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpProc_1_2"/>
             *                   &lt;element name="nrProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProc_17_20_21" minOccurs="0"/>
             *                   &lt;element name="descRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_descRRA"/>
             *                   &lt;element name="qtdMesesRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_qtdMesesRRA"/>
             *                   &lt;element name="despProcJud" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="vlrDespCustas" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                             &lt;element name="vlrDespAdvogados" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ideAdv" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpInsc_1_2"/>
             *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrInsc_11_14"/>
             *                             &lt;element name="vlrAdv" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
             *         &lt;element name="infoPgtoExt" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_pais"/>
             *                   &lt;element name="indNIF" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indNIF"/>
             *                   &lt;element name="nifBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codigo_esocial" minOccurs="0"/>
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
             *                             &lt;element name="endNrLograd" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrLograd" minOccurs="0"/>
             *                             &lt;element name="endComplem" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_complemento" minOccurs="0"/>
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
                "perRef",
                "ideDmDev",
                "tpPgto",
                "dtPgto",
                "codCateg",
                "infoIR",
                "totApurMen",
                "totApurDia",
                "infoRRA",
                "infoPgtoExt"
            })
            public static class DmDev {

                @XmlElement(required = true)
                protected String perRef;
                @XmlElement(required = true)
                protected String ideDmDev;
                protected byte tpPgto;
                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtPgto;
                @XmlElement(required = true)
                protected BigInteger codCateg;
                protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoIR> infoIR;
                protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.TotApurMen> totApurMen;
                protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.TotApurDia> totApurDia;
                protected ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA infoRRA;
                protected ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoPgtoExt infoPgtoExt;

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
                 * Gets the value of the infoIR property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoIR property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoIR().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoIR }
                 * 
                 * 
                 */
                public List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoIR> getInfoIR() {
                    if (infoIR == null) {
                        infoIR = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoIR>();
                    }
                    return this.infoIR;
                }

                /**
                 * Gets the value of the totApurMen property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the totApurMen property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTotApurMen().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.TotApurMen }
                 * 
                 * 
                 */
                public List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.TotApurMen> getTotApurMen() {
                    if (totApurMen == null) {
                        totApurMen = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.TotApurMen>();
                    }
                    return this.totApurMen;
                }

                /**
                 * Gets the value of the totApurDia property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the totApurDia property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTotApurDia().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.TotApurDia }
                 * 
                 * 
                 */
                public List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.TotApurDia> getTotApurDia() {
                    if (totApurDia == null) {
                        totApurDia = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.TotApurDia>();
                    }
                    return this.totApurDia;
                }

                /**
                 * Obtém o valor da propriedade infoRRA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA }
                 *     
                 */
                public ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA getInfoRRA() {
                    return infoRRA;
                }

                /**
                 * Define o valor da propriedade infoRRA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA }
                 *     
                 */
                public void setInfoRRA(ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA value) {
                    this.infoRRA = value;
                }

                /**
                 * Obtém o valor da propriedade infoPgtoExt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoPgtoExt }
                 *     
                 */
                public ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoPgtoExt getInfoPgtoExt() {
                    return infoPgtoExt;
                }

                /**
                 * Define o valor da propriedade infoPgtoExt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoPgtoExt }
                 *     
                 */
                public void setInfoPgtoExt(ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoPgtoExt value) {
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
                 *         &lt;element name="tpInfoIR">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *               &lt;enumeration value="11"/>
                 *               &lt;enumeration value="12"/>
                 *               &lt;enumeration value="14"/>
                 *               &lt;enumeration value="31"/>
                 *               &lt;enumeration value="32"/>
                 *               &lt;enumeration value="34"/>
                 *               &lt;enumeration value="41"/>
                 *               &lt;enumeration value="42"/>
                 *               &lt;enumeration value="46"/>
                 *               &lt;enumeration value="47"/>
                 *               &lt;enumeration value="51"/>
                 *               &lt;enumeration value="52"/>
                 *               &lt;enumeration value="54"/>
                 *               &lt;enumeration value="61"/>
                 *               &lt;enumeration value="62"/>
                 *               &lt;enumeration value="63"/>
                 *               &lt;enumeration value="64"/>
                 *               &lt;enumeration value="67"/>
                 *               &lt;enumeration value="68"/>
                 *               &lt;enumeration value="70"/>
                 *               &lt;enumeration value="71"/>
                 *               &lt;enumeration value="72"/>
                 *               &lt;enumeration value="73"/>
                 *               &lt;enumeration value="74"/>
                 *               &lt;enumeration value="75"/>
                 *               &lt;enumeration value="76"/>
                 *               &lt;enumeration value="77"/>
                 *               &lt;enumeration value="700"/>
                 *               &lt;enumeration value="701"/>
                 *               &lt;enumeration value="702"/>
                 *               &lt;enumeration value="703"/>
                 *               &lt;enumeration value="704"/>
                 *               &lt;enumeration value="79"/>
                 *               &lt;enumeration value="7900"/>
                 *               &lt;enumeration value="7950"/>
                 *               &lt;enumeration value="7951"/>
                 *               &lt;enumeration value="7952"/>
                 *               &lt;enumeration value="7953"/>
                 *               &lt;enumeration value="7954"/>
                 *               &lt;enumeration value="7955"/>
                 *               &lt;enumeration value="7956"/>
                 *               &lt;enumeration value="7957"/>
                 *               &lt;enumeration value="7958"/>
                 *               &lt;enumeration value="7959"/>
                 *               &lt;enumeration value="7960"/>
                 *               &lt;enumeration value="7961"/>
                 *               &lt;enumeration value="7962"/>
                 *               &lt;enumeration value="7963"/>
                 *               &lt;enumeration value="7964"/>
                 *               &lt;enumeration value="9011"/>
                 *               &lt;enumeration value="9012"/>
                 *               &lt;enumeration value="9014"/>
                 *               &lt;enumeration value="9031"/>
                 *               &lt;enumeration value="9032"/>
                 *               &lt;enumeration value="9034"/>
                 *               &lt;enumeration value="9831"/>
                 *               &lt;enumeration value="9832"/>
                 *               &lt;enumeration value="9834"/>
                 *               &lt;enumeration value="9041"/>
                 *               &lt;enumeration value="9042"/>
                 *               &lt;enumeration value="9046"/>
                 *               &lt;enumeration value="9047"/>
                 *               &lt;enumeration value="9051"/>
                 *               &lt;enumeration value="9052"/>
                 *               &lt;enumeration value="9054"/>
                 *               &lt;enumeration value="9061"/>
                 *               &lt;enumeration value="9062"/>
                 *               &lt;enumeration value="9063"/>
                 *               &lt;enumeration value="9064"/>
                 *               &lt;enumeration value="9067"/>
                 *               &lt;enumeration value="9082"/>
                 *               &lt;enumeration value="9083"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="descRendimento" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="100"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="infoProcJudRub" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProcJud_1"/>
                 *                   &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_uf"/>
                 *                   &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codMunic"/>
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
                    "tpInfoIR",
                    "valor",
                    "descRendimento",
                    "infoProcJudRub"
                })
                public static class InfoIR {

                    @XmlElement(required = true)
                    protected BigInteger tpInfoIR;
                    @XmlElement(required = true)
                    protected BigDecimal valor;
                    protected String descRendimento;
                    protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoIR.InfoProcJudRub> infoProcJudRub;

                    /**
                     * Obtém o valor da propriedade tpInfoIR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getTpInfoIR() {
                        return tpInfoIR;
                    }

                    /**
                     * Define o valor da propriedade tpInfoIR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setTpInfoIR(BigInteger value) {
                        this.tpInfoIR = value;
                    }

                    /**
                     * Obtém o valor da propriedade valor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValor() {
                        return valor;
                    }

                    /**
                     * Define o valor da propriedade valor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValor(BigDecimal value) {
                        this.valor = value;
                    }

                    /**
                     * Obtém o valor da propriedade descRendimento.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescRendimento() {
                        return descRendimento;
                    }

                    /**
                     * Define o valor da propriedade descRendimento.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescRendimento(String value) {
                        this.descRendimento = value;
                    }

                    /**
                     * Gets the value of the infoProcJudRub property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infoProcJudRub property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfoProcJudRub().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoIR.InfoProcJudRub }
                     * 
                     * 
                     */
                    public List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoIR.InfoProcJudRub> getInfoProcJudRub() {
                        if (infoProcJudRub == null) {
                            infoProcJudRub = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoIR.InfoProcJudRub>();
                        }
                        return this.infoProcJudRub;
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
                     *         &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProcJud_1"/>
                     *         &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_uf"/>
                     *         &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codMunic"/>
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
                        "nrProc",
                        "ufVara",
                        "codMunic",
                        "idVara"
                    })
                    public static class InfoProcJudRub {

                        @XmlElement(required = true)
                        protected String nrProc;
                        @XmlElement(required = true)
                        @XmlSchemaType(name = "string")
                        protected TSUf ufVara;
                        @XmlElement(required = true)
                        protected BigInteger codMunic;
                        @XmlElement(required = true)
                        protected BigInteger idVara;

                        /**
                         * Obtém o valor da propriedade nrProc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNrProc() {
                            return nrProc;
                        }

                        /**
                         * Define o valor da propriedade nrProc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNrProc(String value) {
                            this.nrProc = value;
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
                 *         &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_pais"/>
                 *         &lt;element name="indNIF" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indNIF"/>
                 *         &lt;element name="nifBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codigo_esocial" minOccurs="0"/>
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
                 *                   &lt;element name="endNrLograd" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrLograd" minOccurs="0"/>
                 *                   &lt;element name="endComplem" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_complemento" minOccurs="0"/>
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
                    "paisResidExt",
                    "indNIF",
                    "nifBenef",
                    "frmTribut",
                    "endExt"
                })
                public static class InfoPgtoExt {

                    @XmlElement(required = true)
                    protected String paisResidExt;
                    protected byte indNIF;
                    protected String nifBenef;
                    @XmlElement(required = true)
                    protected String frmTribut;
                    protected ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoPgtoExt.EndExt endExt;

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
                     *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoPgtoExt.EndExt }
                     *     
                     */
                    public ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoPgtoExt.EndExt getEndExt() {
                        return endExt;
                    }

                    /**
                     * Define o valor da propriedade endExt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoPgtoExt.EndExt }
                     *     
                     */
                    public void setEndExt(ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoPgtoExt.EndExt value) {
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
                     *         &lt;element name="endNrLograd" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrLograd" minOccurs="0"/>
                     *         &lt;element name="endComplem" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_complemento" minOccurs="0"/>
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
                 *         &lt;element name="tpProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpProc_1_2"/>
                 *         &lt;element name="nrProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProc_17_20_21" minOccurs="0"/>
                 *         &lt;element name="descRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_descRRA"/>
                 *         &lt;element name="qtdMesesRRA" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_qtdMesesRRA"/>
                 *         &lt;element name="despProcJud" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="vlrDespCustas" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *                   &lt;element name="vlrDespAdvogados" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ideAdv" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpInsc_1_2"/>
                 *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrInsc_11_14"/>
                 *                   &lt;element name="vlrAdv" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
                    "tpProcRRA",
                    "nrProcRRA",
                    "descRRA",
                    "qtdMesesRRA",
                    "despProcJud",
                    "ideAdv"
                })
                public static class InfoRRA {

                    protected byte tpProcRRA;
                    protected String nrProcRRA;
                    @XmlElement(required = true)
                    protected String descRRA;
                    @XmlElement(required = true)
                    protected BigDecimal qtdMesesRRA;
                    protected ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA.DespProcJud despProcJud;
                    protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA.IdeAdv> ideAdv;

                    /**
                     * Obtém o valor da propriedade tpProcRRA.
                     * 
                     */
                    public byte getTpProcRRA() {
                        return tpProcRRA;
                    }

                    /**
                     * Define o valor da propriedade tpProcRRA.
                     * 
                     */
                    public void setTpProcRRA(byte value) {
                        this.tpProcRRA = value;
                    }

                    /**
                     * Obtém o valor da propriedade nrProcRRA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNrProcRRA() {
                        return nrProcRRA;
                    }

                    /**
                     * Define o valor da propriedade nrProcRRA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNrProcRRA(String value) {
                        this.nrProcRRA = value;
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
                     * Obtém o valor da propriedade despProcJud.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA.DespProcJud }
                     *     
                     */
                    public ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA.DespProcJud getDespProcJud() {
                        return despProcJud;
                    }

                    /**
                     * Define o valor da propriedade despProcJud.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA.DespProcJud }
                     *     
                     */
                    public void setDespProcJud(ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA.DespProcJud value) {
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
                     * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA.IdeAdv }
                     * 
                     * 
                     */
                    public List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA.IdeAdv> getIdeAdv() {
                        if (ideAdv == null) {
                            ideAdv = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoRRA.IdeAdv>();
                        }
                        return this.ideAdv;
                    }


                    /**
                     * CONDICAO_GRUPO: OC
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
                     *         &lt;element name="vlrDespCustas" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                     *         &lt;element name="vlrDespAdvogados" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
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
                        "vlrDespCustas",
                        "vlrDespAdvogados"
                    })
                    public static class DespProcJud {

                        @XmlElement(required = true)
                        protected BigDecimal vlrDespCustas;
                        @XmlElement(required = true)
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
                     *       &lt;sequence>
                     *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpInsc_1_2"/>
                     *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrInsc_11_14"/>
                     *         &lt;element name="vlrAdv" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
                        "vlrAdv"
                    })
                    public static class IdeAdv {

                        protected byte tpInsc;
                        @XmlElement(required = true)
                        protected String nrInsc;
                        protected BigDecimal vlrAdv;

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
                 *       &lt;sequence>
                 *         &lt;element name="perApurDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_dia"/>
                 *         &lt;element name="CRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRDia"/>
                 *         &lt;element name="frmTribut">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="\d{2}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="paisResidExt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_pais"/>
                 *         &lt;element name="vlrPagoDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrCRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
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
                    "frmTribut",
                    "paisResidExt",
                    "vlrPagoDia",
                    "vlrCRDia"
                })
                public static class TotApurDia {

                    protected byte perApurDia;
                    @XmlElement(name = "CRDia", required = true)
                    protected String crDia;
                    @XmlElement(required = true)
                    protected String frmTribut;
                    @XmlElement(required = true)
                    protected String paisResidExt;
                    @XmlElement(required = true)
                    protected BigDecimal vlrPagoDia;
                    @XmlElement(required = true)
                    protected BigDecimal vlrCRDia;

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
                     * Obtém o valor da propriedade vlrPagoDia.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrPagoDia() {
                        return vlrPagoDia;
                    }

                    /**
                     * Define o valor da propriedade vlrPagoDia.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrPagoDia(BigDecimal value) {
                        this.vlrPagoDia = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrCRDia.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrCRDia() {
                        return vlrCRDia;
                    }

                    /**
                     * Define o valor da propriedade vlrCRDia.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrCRDia(BigDecimal value) {
                        this.vlrCRDia = value;
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
                 *         &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRMen"/>
                 *         &lt;element name="vlrRendTrib" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrRendTrib13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrPrevOficial" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrPrevOficial13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrCR13Men" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrParcIsenta65" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrParcIsenta65Dec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrDiarias" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrAjudaCusto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrIndResContrato" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrAbonoPec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrRendMoleGrave" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrRendMoleGrave13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrAuxMoradia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrBolsaMedico" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrBolsaMedico13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrJurosMora" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="vlrIsenOutros" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valor"/>
                 *         &lt;element name="descRendimento" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="255"/>
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
                    "crMen",
                    "vlrRendTrib",
                    "vlrRendTrib13",
                    "vlrPrevOficial",
                    "vlrPrevOficial13",
                    "vlrCRMen",
                    "vlrCR13Men",
                    "vlrParcIsenta65",
                    "vlrParcIsenta65Dec",
                    "vlrDiarias",
                    "vlrAjudaCusto",
                    "vlrIndResContrato",
                    "vlrAbonoPec",
                    "vlrRendMoleGrave",
                    "vlrRendMoleGrave13",
                    "vlrAuxMoradia",
                    "vlrBolsaMedico",
                    "vlrBolsaMedico13",
                    "vlrJurosMora",
                    "vlrIsenOutros",
                    "descRendimento"
                })
                public static class TotApurMen {

                    @XmlElement(name = "CRMen", required = true)
                    protected String crMen;
                    @XmlElement(required = true)
                    protected BigDecimal vlrRendTrib;
                    @XmlElement(required = true)
                    protected BigDecimal vlrRendTrib13;
                    @XmlElement(required = true)
                    protected BigDecimal vlrPrevOficial;
                    @XmlElement(required = true)
                    protected BigDecimal vlrPrevOficial13;
                    @XmlElement(required = true)
                    protected BigDecimal vlrCRMen;
                    @XmlElement(required = true)
                    protected BigDecimal vlrCR13Men;
                    @XmlElement(required = true)
                    protected BigDecimal vlrParcIsenta65;
                    @XmlElement(required = true)
                    protected BigDecimal vlrParcIsenta65Dec;
                    @XmlElement(required = true)
                    protected BigDecimal vlrDiarias;
                    @XmlElement(required = true)
                    protected BigDecimal vlrAjudaCusto;
                    @XmlElement(required = true)
                    protected BigDecimal vlrIndResContrato;
                    @XmlElement(required = true)
                    protected BigDecimal vlrAbonoPec;
                    @XmlElement(required = true)
                    protected BigDecimal vlrRendMoleGrave;
                    @XmlElement(required = true)
                    protected BigDecimal vlrRendMoleGrave13;
                    @XmlElement(required = true)
                    protected BigDecimal vlrAuxMoradia;
                    @XmlElement(required = true)
                    protected BigDecimal vlrBolsaMedico;
                    @XmlElement(required = true)
                    protected BigDecimal vlrBolsaMedico13;
                    @XmlElement(required = true)
                    protected BigDecimal vlrJurosMora;
                    @XmlElement(required = true)
                    protected BigDecimal vlrIsenOutros;
                    protected String descRendimento;

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
                     * Obtém o valor da propriedade vlrRendTrib.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrRendTrib() {
                        return vlrRendTrib;
                    }

                    /**
                     * Define o valor da propriedade vlrRendTrib.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrRendTrib(BigDecimal value) {
                        this.vlrRendTrib = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrRendTrib13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrRendTrib13() {
                        return vlrRendTrib13;
                    }

                    /**
                     * Define o valor da propriedade vlrRendTrib13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrRendTrib13(BigDecimal value) {
                        this.vlrRendTrib13 = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrPrevOficial.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrPrevOficial() {
                        return vlrPrevOficial;
                    }

                    /**
                     * Define o valor da propriedade vlrPrevOficial.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrPrevOficial(BigDecimal value) {
                        this.vlrPrevOficial = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrPrevOficial13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrPrevOficial13() {
                        return vlrPrevOficial13;
                    }

                    /**
                     * Define o valor da propriedade vlrPrevOficial13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrPrevOficial13(BigDecimal value) {
                        this.vlrPrevOficial13 = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrCRMen.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrCRMen() {
                        return vlrCRMen;
                    }

                    /**
                     * Define o valor da propriedade vlrCRMen.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrCRMen(BigDecimal value) {
                        this.vlrCRMen = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrCR13Men.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrCR13Men() {
                        return vlrCR13Men;
                    }

                    /**
                     * Define o valor da propriedade vlrCR13Men.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrCR13Men(BigDecimal value) {
                        this.vlrCR13Men = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrParcIsenta65.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrParcIsenta65() {
                        return vlrParcIsenta65;
                    }

                    /**
                     * Define o valor da propriedade vlrParcIsenta65.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrParcIsenta65(BigDecimal value) {
                        this.vlrParcIsenta65 = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrParcIsenta65Dec.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrParcIsenta65Dec() {
                        return vlrParcIsenta65Dec;
                    }

                    /**
                     * Define o valor da propriedade vlrParcIsenta65Dec.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrParcIsenta65Dec(BigDecimal value) {
                        this.vlrParcIsenta65Dec = value;
                    }

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
                     * Obtém o valor da propriedade vlrRendMoleGrave.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrRendMoleGrave() {
                        return vlrRendMoleGrave;
                    }

                    /**
                     * Define o valor da propriedade vlrRendMoleGrave.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrRendMoleGrave(BigDecimal value) {
                        this.vlrRendMoleGrave = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrRendMoleGrave13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrRendMoleGrave13() {
                        return vlrRendMoleGrave13;
                    }

                    /**
                     * Define o valor da propriedade vlrRendMoleGrave13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrRendMoleGrave13(BigDecimal value) {
                        this.vlrRendMoleGrave13 = value;
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

                    /**
                     * Obtém o valor da propriedade vlrBolsaMedico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrBolsaMedico() {
                        return vlrBolsaMedico;
                    }

                    /**
                     * Define o valor da propriedade vlrBolsaMedico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrBolsaMedico(BigDecimal value) {
                        this.vlrBolsaMedico = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrBolsaMedico13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrBolsaMedico13() {
                        return vlrBolsaMedico13;
                    }

                    /**
                     * Define o valor da propriedade vlrBolsaMedico13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrBolsaMedico13(BigDecimal value) {
                        this.vlrBolsaMedico13 = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrJurosMora.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrJurosMora() {
                        return vlrJurosMora;
                    }

                    /**
                     * Define o valor da propriedade vlrJurosMora.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrJurosMora(BigDecimal value) {
                        this.vlrJurosMora = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrIsenOutros.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrIsenOutros() {
                        return vlrIsenOutros;
                    }

                    /**
                     * Define o valor da propriedade vlrIsenOutros.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrIsenOutros(BigDecimal value) {
                        this.vlrIsenOutros = value;
                    }

                    /**
                     * Obtém o valor da propriedade descRendimento.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescRendimento() {
                        return descRendimento;
                    }

                    /**
                     * Define o valor da propriedade descRendimento.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescRendimento(String value) {
                        this.descRendimento = value;
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
             *         &lt;element name="dtLaudo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="perAnt" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="perRefAjuste" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_perApur_mensal"/>
             *                   &lt;element name="nrRec1210Orig" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrRecibo"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ideDep" maxOccurs="999" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR"/>
             *                   &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
             *                   &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_dtNascto" minOccurs="0"/>
             *                   &lt;element name="nome" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nmDep" minOccurs="0"/>
             *                   &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpDep" minOccurs="0"/>
             *                   &lt;element name="descrDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_descrDep" minOccurs="0"/>
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
             *                   &lt;element name="tpCR" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CR_IR"/>
             *                   &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpRendDep"/>
             *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
             *                             &lt;element name="vlrDedDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDedDep"/>
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
             *                             &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpRendPenAlim"/>
             *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfPenAlim"/>
             *                             &lt;element name="vlrDedPenAlim" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDedPenAlim"/>
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
             *                             &lt;element name="tpPrev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpPrevCompl"/>
             *                             &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj"/>
             *                             &lt;element name="vlrDedPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                             &lt;element name="vlrDedPC13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                             &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
             *                             &lt;element name="vlrPatrocFunp13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
             *                             &lt;element name="tpProcRet" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpProc_1_2"/>
             *                             &lt;element name="nrProcRet" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProcRet"/>
             *                             &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codSuspIR" minOccurs="0"/>
             *                             &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indApuracao"/>
             *                                       &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
             *                                       &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
             *                                       &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
             *                                       &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
             *                                       &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
             *                                       &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indTpDeducao"/>
             *                                                 &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                                                 &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
             *                                                 &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
             *                                                 &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
             *                                                           &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
             *                   &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj"/>
             *                   &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_regANS" minOccurs="0"/>
             *                   &lt;element name="vlrSaudeTit" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="infoDepSau" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
             *                             &lt;element name="vlrSaudeDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
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
             *                   &lt;element name="indOrgReemb" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indOrgReemb"/>
             *                   &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
             *                   &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_regANS" minOccurs="0"/>
             *                   &lt;element name="detReembTit" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}T_detReemb_Tot" maxOccurs="99" minOccurs="0"/>
             *                   &lt;element name="infoReembDep" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
             *                             &lt;element name="detReembDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}T_detReemb_Tot" maxOccurs="99" minOccurs="0"/>
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
                "ideDep",
                "infoIRCR",
                "planSaude",
                "infoReembMed"
            })
            public static class InfoIRComplem {

                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtLaudo;
                protected ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.PerAnt perAnt;
                protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.IdeDep> ideDep;
                protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR> infoIRCR;
                protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.PlanSaude> planSaude;
                protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoReembMed> infoReembMed;

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
                 *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.PerAnt }
                 *     
                 */
                public ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.PerAnt getPerAnt() {
                    return perAnt;
                }

                /**
                 * Define o valor da propriedade perAnt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.PerAnt }
                 *     
                 */
                public void setPerAnt(ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.PerAnt value) {
                    this.perAnt = value;
                }

                /**
                 * Gets the value of the ideDep property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ideDep property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getIdeDep().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.IdeDep }
                 * 
                 * 
                 */
                public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.IdeDep> getIdeDep() {
                    if (ideDep == null) {
                        ideDep = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.IdeDep>();
                    }
                    return this.ideDep;
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
                 * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR }
                 * 
                 * 
                 */
                public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR> getInfoIRCR() {
                    if (infoIRCR == null) {
                        infoIRCR = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR>();
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
                 * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.PlanSaude }
                 * 
                 * 
                 */
                public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.PlanSaude> getPlanSaude() {
                    if (planSaude == null) {
                        planSaude = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.PlanSaude>();
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
                 * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoReembMed }
                 * 
                 * 
                 */
                public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoReembMed> getInfoReembMed() {
                    if (infoReembMed == null) {
                        infoReembMed = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoReembMed>();
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
                 *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR"/>
                 *         &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
                 *         &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_dtNascto" minOccurs="0"/>
                 *         &lt;element name="nome" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nmDep" minOccurs="0"/>
                 *         &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpDep" minOccurs="0"/>
                 *         &lt;element name="descrDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_descrDep" minOccurs="0"/>
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
                    "depIRRF",
                    "dtNascto",
                    "nome",
                    "tpDep",
                    "descrDep"
                })
                public static class IdeDep {

                    @XmlElement(required = true)
                    protected String cpfDep;
                    @XmlSchemaType(name = "string")
                    protected TSSimNao depIRRF;
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtNascto;
                    protected String nome;
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
                     * Obtém o valor da propriedade depIRRF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public TSSimNao getDepIRRF() {
                        return depIRRF;
                    }

                    /**
                     * Define o valor da propriedade depIRRF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public void setDepIRRF(TSSimNao value) {
                        this.depIRRF = value;
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
                 *         &lt;element name="tpCR" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CR_IR"/>
                 *         &lt;element name="dedDepen" maxOccurs="999" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpRendDep"/>
                 *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
                 *                   &lt;element name="vlrDedDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDedDep"/>
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
                 *                   &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpRendPenAlim"/>
                 *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfPenAlim"/>
                 *                   &lt;element name="vlrDedPenAlim" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDedPenAlim"/>
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
                 *                   &lt;element name="tpPrev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpPrevCompl"/>
                 *                   &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj"/>
                 *                   &lt;element name="vlrDedPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                   &lt;element name="vlrDedPC13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                   &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
                 *                   &lt;element name="vlrPatrocFunp13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
                 *                   &lt;element name="tpProcRet" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpProc_1_2"/>
                 *                   &lt;element name="nrProcRet" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProcRet"/>
                 *                   &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codSuspIR" minOccurs="0"/>
                 *                   &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indApuracao"/>
                 *                             &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
                 *                             &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
                 *                             &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
                 *                             &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
                 *                             &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
                 *                             &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indTpDeducao"/>
                 *                                       &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                                       &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
                 *                                       &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
                 *                                       &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
                 *                                                 &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                    protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.DedDepen> dedDepen;
                    protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.PenAlim> penAlim;
                    protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.PrevidCompl> previdCompl;
                    protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet> infoProcRet;

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
                     * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.DedDepen }
                     * 
                     * 
                     */
                    public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.DedDepen> getDedDepen() {
                        if (dedDepen == null) {
                            dedDepen = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.DedDepen>();
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
                     * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.PenAlim }
                     * 
                     * 
                     */
                    public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.PenAlim> getPenAlim() {
                        if (penAlim == null) {
                            penAlim = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.PenAlim>();
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
                     * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.PrevidCompl }
                     * 
                     * 
                     */
                    public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.PrevidCompl> getPrevidCompl() {
                        if (previdCompl == null) {
                            previdCompl = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.PrevidCompl>();
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
                     * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet }
                     * 
                     * 
                     */
                    public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet> getInfoProcRet() {
                        if (infoProcRet == null) {
                            infoProcRet = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet>();
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
                     *         &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpRendDep"/>
                     *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
                     *         &lt;element name="vlrDedDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDedDep"/>
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
                     *         &lt;element name="tpProcRet" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpProc_1_2"/>
                     *         &lt;element name="nrProcRet" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrProcRet"/>
                     *         &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_codSuspIR" minOccurs="0"/>
                     *         &lt;element name="infoValores" maxOccurs="2" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indApuracao"/>
                     *                   &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
                     *                   &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
                     *                   &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
                     *                   &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
                     *                   &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
                     *                   &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indTpDeducao"/>
                     *                             &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *                             &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
                     *                             &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
                     *                             &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
                     *                                       &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                        protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores> infoValores;

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
                         * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores }
                         * 
                         * 
                         */
                        public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores> getInfoValores() {
                            if (infoValores == null) {
                                infoValores = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores>();
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
                         *         &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indApuracao"/>
                         *         &lt;element name="vlrNRetido" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrNRetido" minOccurs="0"/>
                         *         &lt;element name="vlrDepJud" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDepJud" minOccurs="0"/>
                         *         &lt;element name="vlrCmpAnoCal" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoCal" minOccurs="0"/>
                         *         &lt;element name="vlrCmpAnoAnt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrCmpAnoAnt" minOccurs="0"/>
                         *         &lt;element name="vlrRendSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrRendSusp" minOccurs="0"/>
                         *         &lt;element name="dedSusp" maxOccurs="25" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indTpDeducao"/>
                         *                   &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                         *                   &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
                         *                   &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
                         *                   &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
                         *                             &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                            protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp> dedSusp;

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
                             * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp }
                             * 
                             * 
                             */
                            public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp> getDedSusp() {
                                if (dedSusp == null) {
                                    dedSusp = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp>();
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
                             *         &lt;element name="indTpDeducao" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indTpDeducao"/>
                             *         &lt;element name="vlrDedSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                             *         &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
                             *         &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
                             *         &lt;element name="benefPen" maxOccurs="99" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
                             *                   &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                                protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp.BenefPen> benefPen;

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
                                 * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp.BenefPen }
                                 * 
                                 * 
                                 */
                                public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp.BenefPen> getBenefPen() {
                                    if (benefPen == null) {
                                        benefPen = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoIRCR.InfoProcRet.InfoValores.DedSusp.BenefPen>();
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
                                 *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
                                 *         &lt;element name="vlrDepenSusp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                     *         &lt;element name="tpRend" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpRendPenAlim"/>
                     *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfPenAlim"/>
                     *         &lt;element name="vlrDedPenAlim" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_vlrDedPenAlim"/>
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
                     *         &lt;element name="tpPrev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_tpPrevCompl"/>
                     *         &lt;element name="cnpjEntidPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj"/>
                     *         &lt;element name="vlrDedPC" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *         &lt;element name="vlrDedPC13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *         &lt;element name="vlrPatrocFunp" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
                     *         &lt;element name="vlrPatrocFunp13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
                 *         &lt;element name="indOrgReemb" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_indOrgReemb"/>
                 *         &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
                 *         &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_regANS" minOccurs="0"/>
                 *         &lt;element name="detReembTit" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}T_detReemb_Tot" maxOccurs="99" minOccurs="0"/>
                 *         &lt;element name="infoReembDep" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
                 *                   &lt;element name="detReembDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}T_detReemb_Tot" maxOccurs="99" minOccurs="0"/>
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
                    protected List<TDetReembTot> detReembTit;
                    protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoReembMed.InfoReembDep> infoReembDep;

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
                     * {@link TDetReembTot }
                     * 
                     * 
                     */
                    public List<TDetReembTot> getDetReembTit() {
                        if (detReembTit == null) {
                            detReembTit = new ArrayList<TDetReembTot>();
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
                     * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoReembMed.InfoReembDep }
                     * 
                     * 
                     */
                    public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoReembMed.InfoReembDep> getInfoReembDep() {
                        if (infoReembDep == null) {
                            infoReembDep = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.InfoReembMed.InfoReembDep>();
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
                     *         &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
                     *         &lt;element name="detReembDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}T_detReemb_Tot" maxOccurs="99" minOccurs="0"/>
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
                        protected List<TDetReembTot> detReembDep;

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
                         * {@link TDetReembTot }
                         * 
                         * 
                         */
                        public List<TDetReembTot> getDetReembDep() {
                            if (detReembDep == null) {
                                detReembDep = new ArrayList<TDetReembTot>();
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
                 *         &lt;element name="perRefAjuste" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_perApur_mensal"/>
                 *         &lt;element name="nrRec1210Orig" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_nrRecibo"/>
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
                 *         &lt;element name="cnpjOper" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cnpj"/>
                 *         &lt;element name="regANS" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_regANS" minOccurs="0"/>
                 *         &lt;element name="vlrSaudeTit" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="infoDepSau" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
                 *                   &lt;element name="vlrSaudeDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
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
                    protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.PlanSaude.InfoDepSau> infoDepSau;

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
                     * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.PlanSaude.InfoDepSau }
                     * 
                     * 
                     */
                    public List<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.PlanSaude.InfoDepSau> getInfoDepSau() {
                        if (infoDepSau == null) {
                            infoDepSau = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.InfoIRComplem.PlanSaude.InfoDepSau>();
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
                     *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_cpfDepIR2"/>
                     *         &lt;element name="vlrSaudeDep" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
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
             *         &lt;element name="consolidApurMen" maxOccurs="50" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRMen"/>
             *                   &lt;element name="vlrRendTrib" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrRendTrib13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrPrevOficial" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrPrevOficial13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrCR13Men" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrParcIsenta65" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrParcIsenta65Dec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrDiarias" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrAjudaCusto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrIndResContrato" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrAbonoPec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrRendMoleGrave" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrRendMoleGrave13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrAuxMoradia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrBolsaMedico" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrBolsaMedico13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrJurosMora" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="vlrIsenOutros" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
             *                   &lt;element name="descRendimento" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="999"/>
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
                "consolidApurMen"
            })
            public static class TotInfoIR {

                protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.TotInfoIR.ConsolidApurMen> consolidApurMen;

                /**
                 * Gets the value of the consolidApurMen property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the consolidApurMen property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConsolidApurMen().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.TotInfoIR.ConsolidApurMen }
                 * 
                 * 
                 */
                public List<ESocial.EvtIrrfBenef.IdeTrabalhador.TotInfoIR.ConsolidApurMen> getConsolidApurMen() {
                    if (consolidApurMen == null) {
                        consolidApurMen = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.TotInfoIR.ConsolidApurMen>();
                    }
                    return this.consolidApurMen;
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
                 *         &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_CRMen"/>
                 *         &lt;element name="vlrRendTrib" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrRendTrib13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrPrevOficial" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrPrevOficial13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrCR13Men" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrParcIsenta65" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrParcIsenta65Dec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrDiarias" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrAjudaCusto" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrIndResContrato" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrAbonoPec" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrRendMoleGrave" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrRendMoleGrave13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrAuxMoradia" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrBolsaMedico" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrBolsaMedico13" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrJurosMora" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="vlrIsenOutros" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_03_00}TS_valorMonetario"/>
                 *         &lt;element name="descRendimento" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="999"/>
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
                    "crMen",
                    "vlrRendTrib",
                    "vlrRendTrib13",
                    "vlrPrevOficial",
                    "vlrPrevOficial13",
                    "vlrCRMen",
                    "vlrCR13Men",
                    "vlrParcIsenta65",
                    "vlrParcIsenta65Dec",
                    "vlrDiarias",
                    "vlrAjudaCusto",
                    "vlrIndResContrato",
                    "vlrAbonoPec",
                    "vlrRendMoleGrave",
                    "vlrRendMoleGrave13",
                    "vlrAuxMoradia",
                    "vlrBolsaMedico",
                    "vlrBolsaMedico13",
                    "vlrJurosMora",
                    "vlrIsenOutros",
                    "descRendimento"
                })
                public static class ConsolidApurMen {

                    @XmlElement(name = "CRMen", required = true)
                    protected String crMen;
                    @XmlElement(required = true)
                    protected BigDecimal vlrRendTrib;
                    @XmlElement(required = true)
                    protected BigDecimal vlrRendTrib13;
                    @XmlElement(required = true)
                    protected BigDecimal vlrPrevOficial;
                    @XmlElement(required = true)
                    protected BigDecimal vlrPrevOficial13;
                    @XmlElement(required = true)
                    protected BigDecimal vlrCRMen;
                    @XmlElement(required = true)
                    protected BigDecimal vlrCR13Men;
                    @XmlElement(required = true)
                    protected BigDecimal vlrParcIsenta65;
                    @XmlElement(required = true)
                    protected BigDecimal vlrParcIsenta65Dec;
                    @XmlElement(required = true)
                    protected BigDecimal vlrDiarias;
                    @XmlElement(required = true)
                    protected BigDecimal vlrAjudaCusto;
                    @XmlElement(required = true)
                    protected BigDecimal vlrIndResContrato;
                    @XmlElement(required = true)
                    protected BigDecimal vlrAbonoPec;
                    @XmlElement(required = true)
                    protected BigDecimal vlrRendMoleGrave;
                    @XmlElement(required = true)
                    protected BigDecimal vlrRendMoleGrave13;
                    @XmlElement(required = true)
                    protected BigDecimal vlrAuxMoradia;
                    @XmlElement(required = true)
                    protected BigDecimal vlrBolsaMedico;
                    @XmlElement(required = true)
                    protected BigDecimal vlrBolsaMedico13;
                    @XmlElement(required = true)
                    protected BigDecimal vlrJurosMora;
                    @XmlElement(required = true)
                    protected BigDecimal vlrIsenOutros;
                    protected String descRendimento;

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
                     * Obtém o valor da propriedade vlrRendTrib.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrRendTrib() {
                        return vlrRendTrib;
                    }

                    /**
                     * Define o valor da propriedade vlrRendTrib.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrRendTrib(BigDecimal value) {
                        this.vlrRendTrib = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrRendTrib13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrRendTrib13() {
                        return vlrRendTrib13;
                    }

                    /**
                     * Define o valor da propriedade vlrRendTrib13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrRendTrib13(BigDecimal value) {
                        this.vlrRendTrib13 = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrPrevOficial.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrPrevOficial() {
                        return vlrPrevOficial;
                    }

                    /**
                     * Define o valor da propriedade vlrPrevOficial.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrPrevOficial(BigDecimal value) {
                        this.vlrPrevOficial = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrPrevOficial13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrPrevOficial13() {
                        return vlrPrevOficial13;
                    }

                    /**
                     * Define o valor da propriedade vlrPrevOficial13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrPrevOficial13(BigDecimal value) {
                        this.vlrPrevOficial13 = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrCRMen.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrCRMen() {
                        return vlrCRMen;
                    }

                    /**
                     * Define o valor da propriedade vlrCRMen.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrCRMen(BigDecimal value) {
                        this.vlrCRMen = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrCR13Men.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrCR13Men() {
                        return vlrCR13Men;
                    }

                    /**
                     * Define o valor da propriedade vlrCR13Men.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrCR13Men(BigDecimal value) {
                        this.vlrCR13Men = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrParcIsenta65.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrParcIsenta65() {
                        return vlrParcIsenta65;
                    }

                    /**
                     * Define o valor da propriedade vlrParcIsenta65.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrParcIsenta65(BigDecimal value) {
                        this.vlrParcIsenta65 = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrParcIsenta65Dec.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrParcIsenta65Dec() {
                        return vlrParcIsenta65Dec;
                    }

                    /**
                     * Define o valor da propriedade vlrParcIsenta65Dec.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrParcIsenta65Dec(BigDecimal value) {
                        this.vlrParcIsenta65Dec = value;
                    }

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
                     * Obtém o valor da propriedade vlrRendMoleGrave.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrRendMoleGrave() {
                        return vlrRendMoleGrave;
                    }

                    /**
                     * Define o valor da propriedade vlrRendMoleGrave.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrRendMoleGrave(BigDecimal value) {
                        this.vlrRendMoleGrave = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrRendMoleGrave13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrRendMoleGrave13() {
                        return vlrRendMoleGrave13;
                    }

                    /**
                     * Define o valor da propriedade vlrRendMoleGrave13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrRendMoleGrave13(BigDecimal value) {
                        this.vlrRendMoleGrave13 = value;
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

                    /**
                     * Obtém o valor da propriedade vlrBolsaMedico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrBolsaMedico() {
                        return vlrBolsaMedico;
                    }

                    /**
                     * Define o valor da propriedade vlrBolsaMedico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrBolsaMedico(BigDecimal value) {
                        this.vlrBolsaMedico = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrBolsaMedico13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrBolsaMedico13() {
                        return vlrBolsaMedico13;
                    }

                    /**
                     * Define o valor da propriedade vlrBolsaMedico13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrBolsaMedico13(BigDecimal value) {
                        this.vlrBolsaMedico13 = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrJurosMora.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrJurosMora() {
                        return vlrJurosMora;
                    }

                    /**
                     * Define o valor da propriedade vlrJurosMora.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrJurosMora(BigDecimal value) {
                        this.vlrJurosMora = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrIsenOutros.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrIsenOutros() {
                        return vlrIsenOutros;
                    }

                    /**
                     * Define o valor da propriedade vlrIsenOutros.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrIsenOutros(BigDecimal value) {
                        this.vlrIsenOutros = value;
                    }

                    /**
                     * Obtém o valor da propriedade descRendimento.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescRendimento() {
                        return descRendimento;
                    }

                    /**
                     * Define o valor da propriedade descRendimento.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescRendimento(String value) {
                        this.descRendimento = value;
                    }

                }

            }

        }

    }

}
