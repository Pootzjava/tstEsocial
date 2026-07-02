//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:27 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.proctrab;

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
 *         &lt;element name="evtProcTrab">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}T_ideEvento_trab"/>
 *                   &lt;element name="ideEmpregador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpInsc_1_2"/>
 *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrInsc_8_11_14"/>
 *                             &lt;element name="ideResp" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpInsc_1_2"/>
 *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrInsc_11_14"/>
 *                                       &lt;element name="dtAdmRespDir" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="matRespDir" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
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
 *                   &lt;element name="infoProcesso">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="origem" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_origem"/>
 *                             &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrProcTrab"/>
 *                             &lt;element name="obsProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
 *                             &lt;element name="dadosCompl">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="infoProcJud">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="dtSent" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                   &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_uf"/>
 *                                                   &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codMunic"/>
 *                                                   &lt;element name="idVara">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                         &lt;pattern value="\d{1,4}"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="infoPatPrec" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="infoCCP">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="dtCCP" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                   &lt;element name="tpCCP">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                         &lt;enumeration value="1"/>
 *                                                         &lt;enumeration value="2"/>
 *                                                         &lt;enumeration value="3"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="cnpjCCP" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
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
 *                   &lt;element name="ideTrab">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_cpfTrab"/>
 *                             &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nmTrab" minOccurs="0"/>
 *                             &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_dtNascto" minOccurs="0"/>
 *                             &lt;element name="ideSeqTrab" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                                   &lt;pattern value="\d{1,3}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="infoContr" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpContr">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                             &lt;enumeration value="4"/>
 *                                             &lt;enumeration value="5"/>
 *                                             &lt;enumeration value="6"/>
 *                                             &lt;enumeration value="7"/>
 *                                             &lt;enumeration value="8"/>
 *                                             &lt;enumeration value="9"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="indContr" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
 *                                       &lt;element name="dtAdmOrig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="indReint" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
 *                                       &lt;element name="indCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
 *                                       &lt;element name="indNatAtiv" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
 *                                       &lt;element name="indMotDeslig" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
 *                                       &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
 *                                       &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
 *                                       &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="infoCompl" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_cbo" minOccurs="0"/>
 *                                                 &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_natAtividade" minOccurs="0"/>
 *                                                 &lt;element name="remuneracao" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="dtRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                           &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_vrSalFx"/>
 *                                                           &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_undSalFixo"/>
 *                                                           &lt;element name="dscSalVar" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoVinc" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpRegTrab"/>
 *                                                           &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpRegPrev_1_2_3"/>
 *                                                           &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                           &lt;element name="tmpParc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tmpParc" minOccurs="0"/>
 *                                                           &lt;element name="duracao" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpContr"/>
 *                                                                     &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_dtTerm" minOccurs="0"/>
 *                                                                     &lt;element name="clauAssec" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
 *                                                                     &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_objDet" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_observacao"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="sucessaoVinc" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="tpInsc">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                           &lt;enumeration value="1"/>
 *                                                                           &lt;enumeration value="2"/>
 *                                                                           &lt;enumeration value="5"/>
 *                                                                           &lt;enumeration value="6"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="nrInsc">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;pattern value="\d{8,14}|[A-Z0-9]{12}\d{2}"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
 *                                                                     &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="infoDeslig" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                                     &lt;element name="mtvDeslig">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;pattern value="\d{2}"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="dtProjFimAPI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                                     &lt;element name="pensAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_pensAlim" minOccurs="0"/>
 *                                                                     &lt;element name="percAliment" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_percAliment" minOccurs="0"/>
 *                                                                     &lt;element name="vrAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_vrAlim" minOccurs="0"/>
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
 *                                                 &lt;element name="infoTerm" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                           &lt;element name="mtvDesligTSV" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;enumeration value="01"/>
 *                                                                 &lt;enumeration value="02"/>
 *                                                                 &lt;enumeration value="03"/>
 *                                                                 &lt;enumeration value="04"/>
 *                                                                 &lt;enumeration value="05"/>
 *                                                                 &lt;enumeration value="06"/>
 *                                                                 &lt;enumeration value="99"/>
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
 *                                       &lt;element name="mudCategAtiv" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg"/>
 *                                                 &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_natAtividade" minOccurs="0"/>
 *                                                 &lt;element name="dtMudCategAtiv" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="unicContr" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="matUnic" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
 *                                                 &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
 *                                                 &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ideEstab">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpInsc_EstabLot"/>
 *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrInsc_EstabLot"/>
 *                                                 &lt;element name="infoVlr">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="compIni" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
 *                                                           &lt;element name="compFim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
 *                                                           &lt;element name="indReperc">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                 &lt;enumeration value="1"/>
 *                                                                 &lt;enumeration value="2"/>
 *                                                                 &lt;enumeration value="3"/>
 *                                                                 &lt;enumeration value="4"/>
 *                                                                 &lt;enumeration value="5"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="indenSD" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim" minOccurs="0"/>
 *                                                           &lt;element name="indenAbono" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim" minOccurs="0"/>
 *                                                           &lt;element name="abono" maxOccurs="9" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="anoBase">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                                           &lt;pattern value="\d{4}"/>
 *                                                                           &lt;minInclusive value="1900"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="idePeriodo" maxOccurs="999" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
 *                                                                     &lt;element name="baseCalculo" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="vrBcCpMensal" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
 *                                                                               &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
 *                                                                               &lt;element name="infoAgNocivo" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="grauExp" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_grauExp"/>
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
 *                                                                     &lt;element name="infoFGTS" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="vrBcFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
 *                                                                               &lt;element name="vrBcFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                                               &lt;element name="vrBcFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="baseMudCateg" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg"/>
 *                                                                               &lt;element name="vrBcCPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="infoInterm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}T_infoIntermProcTrab" maxOccurs="31" minOccurs="0"/>
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
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_Id" />
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
    "evtProcTrab",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtProcTrab evtProcTrab;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtProcTrab.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtProcTrab }
     *     
     */
    public ESocial.EvtProcTrab getEvtProcTrab() {
        return evtProcTrab;
    }

    /**
     * Define o valor da propriedade evtProcTrab.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtProcTrab }
     *     
     */
    public void setEvtProcTrab(ESocial.EvtProcTrab value) {
        this.evtProcTrab = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}T_ideEvento_trab"/>
     *         &lt;element name="ideEmpregador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpInsc_1_2"/>
     *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrInsc_8_11_14"/>
     *                   &lt;element name="ideResp" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpInsc_1_2"/>
     *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrInsc_11_14"/>
     *                             &lt;element name="dtAdmRespDir" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="matRespDir" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
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
     *         &lt;element name="infoProcesso">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="origem" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_origem"/>
     *                   &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrProcTrab"/>
     *                   &lt;element name="obsProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
     *                   &lt;element name="dadosCompl">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="infoProcJud">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="dtSent" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                         &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_uf"/>
     *                                         &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codMunic"/>
     *                                         &lt;element name="idVara">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                               &lt;pattern value="\d{1,4}"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="infoPatPrec" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="infoCCP">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="dtCCP" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                         &lt;element name="tpCCP">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                               &lt;enumeration value="1"/>
     *                                               &lt;enumeration value="2"/>
     *                                               &lt;enumeration value="3"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="cnpjCCP" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
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
     *         &lt;element name="ideTrab">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_cpfTrab"/>
     *                   &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nmTrab" minOccurs="0"/>
     *                   &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_dtNascto" minOccurs="0"/>
     *                   &lt;element name="ideSeqTrab" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *                         &lt;pattern value="\d{1,3}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="infoContr" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpContr">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="3"/>
     *                                   &lt;enumeration value="4"/>
     *                                   &lt;enumeration value="5"/>
     *                                   &lt;enumeration value="6"/>
     *                                   &lt;enumeration value="7"/>
     *                                   &lt;enumeration value="8"/>
     *                                   &lt;enumeration value="9"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="indContr" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
     *                             &lt;element name="dtAdmOrig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="indReint" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
     *                             &lt;element name="indCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
     *                             &lt;element name="indNatAtiv" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
     *                             &lt;element name="indMotDeslig" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
     *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
     *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
     *                             &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="infoCompl" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_cbo" minOccurs="0"/>
     *                                       &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_natAtividade" minOccurs="0"/>
     *                                       &lt;element name="remuneracao" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="dtRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                                 &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_vrSalFx"/>
     *                                                 &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_undSalFixo"/>
     *                                                 &lt;element name="dscSalVar" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="infoVinc" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpRegTrab"/>
     *                                                 &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpRegPrev_1_2_3"/>
     *                                                 &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                                 &lt;element name="tmpParc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tmpParc" minOccurs="0"/>
     *                                                 &lt;element name="duracao" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpContr"/>
     *                                                           &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_dtTerm" minOccurs="0"/>
     *                                                           &lt;element name="clauAssec" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
     *                                                           &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_objDet" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_observacao"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="sucessaoVinc" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="tpInsc">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                                 &lt;enumeration value="1"/>
     *                                                                 &lt;enumeration value="2"/>
     *                                                                 &lt;enumeration value="5"/>
     *                                                                 &lt;enumeration value="6"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="nrInsc">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;pattern value="\d{8,14}|[A-Z0-9]{12}\d{2}"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
     *                                                           &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="infoDeslig" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                                           &lt;element name="mtvDeslig">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;pattern value="\d{2}"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="dtProjFimAPI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                           &lt;element name="pensAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_pensAlim" minOccurs="0"/>
     *                                                           &lt;element name="percAliment" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_percAliment" minOccurs="0"/>
     *                                                           &lt;element name="vrAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_vrAlim" minOccurs="0"/>
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
     *                                       &lt;element name="infoTerm" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                                 &lt;element name="mtvDesligTSV" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;enumeration value="01"/>
     *                                                       &lt;enumeration value="02"/>
     *                                                       &lt;enumeration value="03"/>
     *                                                       &lt;enumeration value="04"/>
     *                                                       &lt;enumeration value="05"/>
     *                                                       &lt;enumeration value="06"/>
     *                                                       &lt;enumeration value="99"/>
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
     *                             &lt;element name="mudCategAtiv" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg"/>
     *                                       &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_natAtividade" minOccurs="0"/>
     *                                       &lt;element name="dtMudCategAtiv" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="unicContr" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="matUnic" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
     *                                       &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
     *                                       &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ideEstab">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpInsc_EstabLot"/>
     *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrInsc_EstabLot"/>
     *                                       &lt;element name="infoVlr">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="compIni" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
     *                                                 &lt;element name="compFim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
     *                                                 &lt;element name="indReperc">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                       &lt;enumeration value="1"/>
     *                                                       &lt;enumeration value="2"/>
     *                                                       &lt;enumeration value="3"/>
     *                                                       &lt;enumeration value="4"/>
     *                                                       &lt;enumeration value="5"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="indenSD" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim" minOccurs="0"/>
     *                                                 &lt;element name="indenAbono" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim" minOccurs="0"/>
     *                                                 &lt;element name="abono" maxOccurs="9" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="anoBase">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                                 &lt;pattern value="\d{4}"/>
     *                                                                 &lt;minInclusive value="1900"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="idePeriodo" maxOccurs="999" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
     *                                                           &lt;element name="baseCalculo" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="vrBcCpMensal" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
     *                                                                     &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
     *                                                                     &lt;element name="infoAgNocivo" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="grauExp" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_grauExp"/>
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
     *                                                           &lt;element name="infoFGTS" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="vrBcFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
     *                                                                     &lt;element name="vrBcFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                                     &lt;element name="vrBcFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="baseMudCateg" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg"/>
     *                                                                     &lt;element name="vrBcCPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="infoInterm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}T_infoIntermProcTrab" maxOccurs="31" minOccurs="0"/>
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
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_Id" />
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
        "ideTrab"
    })
    public static class EvtProcTrab {

        @XmlElement(required = true)
        protected TIdeEventoTrab ideEvento;
        @XmlElement(required = true)
        protected ESocial.EvtProcTrab.IdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtProcTrab.InfoProcesso infoProcesso;
        @XmlElement(required = true)
        protected ESocial.EvtProcTrab.IdeTrab ideTrab;
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
         *     {@link ESocial.EvtProcTrab.IdeEmpregador }
         *     
         */
        public ESocial.EvtProcTrab.IdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtProcTrab.IdeEmpregador }
         *     
         */
        public void setIdeEmpregador(ESocial.EvtProcTrab.IdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade infoProcesso.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtProcTrab.InfoProcesso }
         *     
         */
        public ESocial.EvtProcTrab.InfoProcesso getInfoProcesso() {
            return infoProcesso;
        }

        /**
         * Define o valor da propriedade infoProcesso.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtProcTrab.InfoProcesso }
         *     
         */
        public void setInfoProcesso(ESocial.EvtProcTrab.InfoProcesso value) {
            this.infoProcesso = value;
        }

        /**
         * Obtém o valor da propriedade ideTrab.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtProcTrab.IdeTrab }
         *     
         */
        public ESocial.EvtProcTrab.IdeTrab getIdeTrab() {
            return ideTrab;
        }

        /**
         * Define o valor da propriedade ideTrab.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtProcTrab.IdeTrab }
         *     
         */
        public void setIdeTrab(ESocial.EvtProcTrab.IdeTrab value) {
            this.ideTrab = value;
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
         *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpInsc_1_2"/>
         *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrInsc_8_11_14"/>
         *         &lt;element name="ideResp" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpInsc_1_2"/>
         *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrInsc_11_14"/>
         *                   &lt;element name="dtAdmRespDir" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="matRespDir" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
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
            "ideResp"
        })
        public static class IdeEmpregador {

            protected byte tpInsc;
            @XmlElement(required = true)
            protected String nrInsc;
            protected ESocial.EvtProcTrab.IdeEmpregador.IdeResp ideResp;

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
             * Obtém o valor da propriedade ideResp.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtProcTrab.IdeEmpregador.IdeResp }
             *     
             */
            public ESocial.EvtProcTrab.IdeEmpregador.IdeResp getIdeResp() {
                return ideResp;
            }

            /**
             * Define o valor da propriedade ideResp.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtProcTrab.IdeEmpregador.IdeResp }
             *     
             */
            public void setIdeResp(ESocial.EvtProcTrab.IdeEmpregador.IdeResp value) {
                this.ideResp = value;
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
             *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpInsc_1_2"/>
             *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrInsc_11_14"/>
             *         &lt;element name="dtAdmRespDir" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="matRespDir" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
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
                "dtAdmRespDir",
                "matRespDir"
            })
            public static class IdeResp {

                protected byte tpInsc;
                @XmlElement(required = true)
                protected String nrInsc;
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtAdmRespDir;
                protected String matRespDir;

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
                 * Obtém o valor da propriedade dtAdmRespDir.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtAdmRespDir() {
                    return dtAdmRespDir;
                }

                /**
                 * Define o valor da propriedade dtAdmRespDir.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtAdmRespDir(XMLGregorianCalendar value) {
                    this.dtAdmRespDir = value;
                }

                /**
                 * Obtém o valor da propriedade matRespDir.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMatRespDir() {
                    return matRespDir;
                }

                /**
                 * Define o valor da propriedade matRespDir.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMatRespDir(String value) {
                    this.matRespDir = value;
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
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_cpfTrab"/>
         *         &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nmTrab" minOccurs="0"/>
         *         &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_dtNascto" minOccurs="0"/>
         *         &lt;element name="ideSeqTrab" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
         *               &lt;pattern value="\d{1,3}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="infoContr" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpContr">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                         &lt;enumeration value="4"/>
         *                         &lt;enumeration value="5"/>
         *                         &lt;enumeration value="6"/>
         *                         &lt;enumeration value="7"/>
         *                         &lt;enumeration value="8"/>
         *                         &lt;enumeration value="9"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="indContr" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
         *                   &lt;element name="dtAdmOrig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="indReint" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
         *                   &lt;element name="indCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
         *                   &lt;element name="indNatAtiv" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
         *                   &lt;element name="indMotDeslig" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
         *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
         *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
         *                   &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="infoCompl" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_cbo" minOccurs="0"/>
         *                             &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_natAtividade" minOccurs="0"/>
         *                             &lt;element name="remuneracao" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="dtRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                                       &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_vrSalFx"/>
         *                                       &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_undSalFixo"/>
         *                                       &lt;element name="dscSalVar" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="infoVinc" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpRegTrab"/>
         *                                       &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpRegPrev_1_2_3"/>
         *                                       &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                                       &lt;element name="tmpParc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tmpParc" minOccurs="0"/>
         *                                       &lt;element name="duracao" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpContr"/>
         *                                                 &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_dtTerm" minOccurs="0"/>
         *                                                 &lt;element name="clauAssec" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
         *                                                 &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_objDet" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_observacao"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="sucessaoVinc" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="tpInsc">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                                       &lt;enumeration value="1"/>
         *                                                       &lt;enumeration value="2"/>
         *                                                       &lt;enumeration value="5"/>
         *                                                       &lt;enumeration value="6"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="nrInsc">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;pattern value="\d{8,14}|[A-Z0-9]{12}\d{2}"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
         *                                                 &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="infoDeslig" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                                                 &lt;element name="mtvDeslig">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;pattern value="\d{2}"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="dtProjFimAPI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                                 &lt;element name="pensAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_pensAlim" minOccurs="0"/>
         *                                                 &lt;element name="percAliment" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_percAliment" minOccurs="0"/>
         *                                                 &lt;element name="vrAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_vrAlim" minOccurs="0"/>
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
         *                             &lt;element name="infoTerm" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                                       &lt;element name="mtvDesligTSV" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;enumeration value="01"/>
         *                                             &lt;enumeration value="02"/>
         *                                             &lt;enumeration value="03"/>
         *                                             &lt;enumeration value="04"/>
         *                                             &lt;enumeration value="05"/>
         *                                             &lt;enumeration value="06"/>
         *                                             &lt;enumeration value="99"/>
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
         *                   &lt;element name="mudCategAtiv" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg"/>
         *                             &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_natAtividade" minOccurs="0"/>
         *                             &lt;element name="dtMudCategAtiv" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="unicContr" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="matUnic" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
         *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
         *                             &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ideEstab">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpInsc_EstabLot"/>
         *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrInsc_EstabLot"/>
         *                             &lt;element name="infoVlr">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="compIni" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
         *                                       &lt;element name="compFim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
         *                                       &lt;element name="indReperc">
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
         *                                       &lt;element name="indenSD" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim" minOccurs="0"/>
         *                                       &lt;element name="indenAbono" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim" minOccurs="0"/>
         *                                       &lt;element name="abono" maxOccurs="9" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="anoBase">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                                       &lt;pattern value="\d{4}"/>
         *                                                       &lt;minInclusive value="1900"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="idePeriodo" maxOccurs="999" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
         *                                                 &lt;element name="baseCalculo" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="vrBcCpMensal" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
         *                                                           &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
         *                                                           &lt;element name="infoAgNocivo" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="grauExp" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_grauExp"/>
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
         *                                                 &lt;element name="infoFGTS" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="vrBcFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
         *                                                           &lt;element name="vrBcFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                                           &lt;element name="vrBcFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="baseMudCateg" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg"/>
         *                                                           &lt;element name="vrBcCPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="infoInterm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}T_infoIntermProcTrab" maxOccurs="31" minOccurs="0"/>
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
            "cpfTrab",
            "nmTrab",
            "dtNascto",
            "ideSeqTrab",
            "infoContr"
        })
        public static class IdeTrab {

            @XmlElement(required = true)
            protected String cpfTrab;
            protected String nmTrab;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtNascto;
            protected BigInteger ideSeqTrab;
            @XmlElement(required = true)
            protected List<ESocial.EvtProcTrab.IdeTrab.InfoContr> infoContr;

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
             * Obtém o valor da propriedade ideSeqTrab.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getIdeSeqTrab() {
                return ideSeqTrab;
            }

            /**
             * Define o valor da propriedade ideSeqTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIdeSeqTrab(BigInteger value) {
                this.ideSeqTrab = value;
            }

            /**
             * Gets the value of the infoContr property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoContr property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoContr().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtProcTrab.IdeTrab.InfoContr }
             * 
             * 
             */
            public List<ESocial.EvtProcTrab.IdeTrab.InfoContr> getInfoContr() {
                if (infoContr == null) {
                    infoContr = new ArrayList<ESocial.EvtProcTrab.IdeTrab.InfoContr>();
                }
                return this.infoContr;
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
             *         &lt;element name="tpContr">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *               &lt;enumeration value="4"/>
             *               &lt;enumeration value="5"/>
             *               &lt;enumeration value="6"/>
             *               &lt;enumeration value="7"/>
             *               &lt;enumeration value="8"/>
             *               &lt;enumeration value="9"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="indContr" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
             *         &lt;element name="dtAdmOrig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="indReint" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
             *         &lt;element name="indCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
             *         &lt;element name="indNatAtiv" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
             *         &lt;element name="indMotDeslig" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao"/>
             *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
             *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
             *         &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="infoCompl" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_cbo" minOccurs="0"/>
             *                   &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_natAtividade" minOccurs="0"/>
             *                   &lt;element name="remuneracao" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="dtRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                             &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_vrSalFx"/>
             *                             &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_undSalFixo"/>
             *                             &lt;element name="dscSalVar" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="infoVinc" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpRegTrab"/>
             *                             &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpRegPrev_1_2_3"/>
             *                             &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                             &lt;element name="tmpParc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tmpParc" minOccurs="0"/>
             *                             &lt;element name="duracao" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpContr"/>
             *                                       &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_dtTerm" minOccurs="0"/>
             *                                       &lt;element name="clauAssec" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
             *                                       &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_objDet" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_observacao"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="sucessaoVinc" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="tpInsc">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                             &lt;enumeration value="1"/>
             *                                             &lt;enumeration value="2"/>
             *                                             &lt;enumeration value="5"/>
             *                                             &lt;enumeration value="6"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="nrInsc">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;pattern value="\d{8,14}|[A-Z0-9]{12}\d{2}"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
             *                                       &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="infoDeslig" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                                       &lt;element name="mtvDeslig">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;pattern value="\d{2}"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="dtProjFimAPI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                                       &lt;element name="pensAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_pensAlim" minOccurs="0"/>
             *                                       &lt;element name="percAliment" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_percAliment" minOccurs="0"/>
             *                                       &lt;element name="vrAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_vrAlim" minOccurs="0"/>
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
             *                   &lt;element name="infoTerm" minOccurs="0">
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
             *                                   &lt;enumeration value="99"/>
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
             *         &lt;element name="mudCategAtiv" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg"/>
             *                   &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_natAtividade" minOccurs="0"/>
             *                   &lt;element name="dtMudCategAtiv" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="unicContr" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="matUnic" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
             *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
             *                   &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ideEstab">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpInsc_EstabLot"/>
             *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrInsc_EstabLot"/>
             *                   &lt;element name="infoVlr">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="compIni" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
             *                             &lt;element name="compFim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
             *                             &lt;element name="indReperc">
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
             *                             &lt;element name="indenSD" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim" minOccurs="0"/>
             *                             &lt;element name="indenAbono" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim" minOccurs="0"/>
             *                             &lt;element name="abono" maxOccurs="9" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="anoBase">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                                             &lt;pattern value="\d{4}"/>
             *                                             &lt;minInclusive value="1900"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="idePeriodo" maxOccurs="999" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
             *                                       &lt;element name="baseCalculo" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="vrBcCpMensal" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
             *                                                 &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
             *                                                 &lt;element name="infoAgNocivo" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="grauExp" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_grauExp"/>
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
             *                                       &lt;element name="infoFGTS" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="vrBcFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
             *                                                 &lt;element name="vrBcFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                                                 &lt;element name="vrBcFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="baseMudCateg" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg"/>
             *                                                 &lt;element name="vrBcCPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="infoInterm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}T_infoIntermProcTrab" maxOccurs="31" minOccurs="0"/>
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
                "tpContr",
                "indContr",
                "dtAdmOrig",
                "indReint",
                "indCateg",
                "indNatAtiv",
                "indMotDeslig",
                "matricula",
                "codCateg",
                "dtInicio",
                "infoCompl",
                "mudCategAtiv",
                "unicContr",
                "ideEstab"
            })
            public static class InfoContr {

                protected byte tpContr;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao indContr;
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtAdmOrig;
                @XmlSchemaType(name = "string")
                protected TSSimNao indReint;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao indCateg;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao indNatAtiv;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao indMotDeslig;
                protected String matricula;
                protected BigInteger codCateg;
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtInicio;
                protected ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl infoCompl;
                protected List<ESocial.EvtProcTrab.IdeTrab.InfoContr.MudCategAtiv> mudCategAtiv;
                protected List<ESocial.EvtProcTrab.IdeTrab.InfoContr.UnicContr> unicContr;
                @XmlElement(required = true)
                protected ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab ideEstab;

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
                 * Obtém o valor da propriedade indContr.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getIndContr() {
                    return indContr;
                }

                /**
                 * Define o valor da propriedade indContr.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setIndContr(TSSimNao value) {
                    this.indContr = value;
                }

                /**
                 * Obtém o valor da propriedade dtAdmOrig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtAdmOrig() {
                    return dtAdmOrig;
                }

                /**
                 * Define o valor da propriedade dtAdmOrig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtAdmOrig(XMLGregorianCalendar value) {
                    this.dtAdmOrig = value;
                }

                /**
                 * Obtém o valor da propriedade indReint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getIndReint() {
                    return indReint;
                }

                /**
                 * Define o valor da propriedade indReint.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setIndReint(TSSimNao value) {
                    this.indReint = value;
                }

                /**
                 * Obtém o valor da propriedade indCateg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getIndCateg() {
                    return indCateg;
                }

                /**
                 * Define o valor da propriedade indCateg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setIndCateg(TSSimNao value) {
                    this.indCateg = value;
                }

                /**
                 * Obtém o valor da propriedade indNatAtiv.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getIndNatAtiv() {
                    return indNatAtiv;
                }

                /**
                 * Define o valor da propriedade indNatAtiv.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setIndNatAtiv(TSSimNao value) {
                    this.indNatAtiv = value;
                }

                /**
                 * Obtém o valor da propriedade indMotDeslig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getIndMotDeslig() {
                    return indMotDeslig;
                }

                /**
                 * Define o valor da propriedade indMotDeslig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setIndMotDeslig(TSSimNao value) {
                    this.indMotDeslig = value;
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
                 * Obtém o valor da propriedade dtInicio.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtInicio() {
                    return dtInicio;
                }

                /**
                 * Define o valor da propriedade dtInicio.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtInicio(XMLGregorianCalendar value) {
                    this.dtInicio = value;
                }

                /**
                 * Obtém o valor da propriedade infoCompl.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl }
                 *     
                 */
                public ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl getInfoCompl() {
                    return infoCompl;
                }

                /**
                 * Define o valor da propriedade infoCompl.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl }
                 *     
                 */
                public void setInfoCompl(ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl value) {
                    this.infoCompl = value;
                }

                /**
                 * Gets the value of the mudCategAtiv property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the mudCategAtiv property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMudCategAtiv().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.MudCategAtiv }
                 * 
                 * 
                 */
                public List<ESocial.EvtProcTrab.IdeTrab.InfoContr.MudCategAtiv> getMudCategAtiv() {
                    if (mudCategAtiv == null) {
                        mudCategAtiv = new ArrayList<ESocial.EvtProcTrab.IdeTrab.InfoContr.MudCategAtiv>();
                    }
                    return this.mudCategAtiv;
                }

                /**
                 * Gets the value of the unicContr property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the unicContr property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUnicContr().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.UnicContr }
                 * 
                 * 
                 */
                public List<ESocial.EvtProcTrab.IdeTrab.InfoContr.UnicContr> getUnicContr() {
                    if (unicContr == null) {
                        unicContr = new ArrayList<ESocial.EvtProcTrab.IdeTrab.InfoContr.UnicContr>();
                    }
                    return this.unicContr;
                }

                /**
                 * Obtém o valor da propriedade ideEstab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab }
                 *     
                 */
                public ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab getIdeEstab() {
                    return ideEstab;
                }

                /**
                 * Define o valor da propriedade ideEstab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab }
                 *     
                 */
                public void setIdeEstab(ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab value) {
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
                 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpInsc_EstabLot"/>
                 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrInsc_EstabLot"/>
                 *         &lt;element name="infoVlr">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="compIni" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
                 *                   &lt;element name="compFim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
                 *                   &lt;element name="indReperc">
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
                 *                   &lt;element name="indenSD" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim" minOccurs="0"/>
                 *                   &lt;element name="indenAbono" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim" minOccurs="0"/>
                 *                   &lt;element name="abono" maxOccurs="9" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="anoBase">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *                                   &lt;pattern value="\d{4}"/>
                 *                                   &lt;minInclusive value="1900"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="idePeriodo" maxOccurs="999" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
                 *                             &lt;element name="baseCalculo" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="vrBcCpMensal" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
                 *                                       &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
                 *                                       &lt;element name="infoAgNocivo" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="grauExp" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_grauExp"/>
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
                 *                             &lt;element name="infoFGTS" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="vrBcFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
                 *                                       &lt;element name="vrBcFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                                       &lt;element name="vrBcFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="baseMudCateg" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg"/>
                 *                                       &lt;element name="vrBcCPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="infoInterm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}T_infoIntermProcTrab" maxOccurs="31" minOccurs="0"/>
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
                    "tpInsc",
                    "nrInsc",
                    "infoVlr"
                })
                public static class IdeEstab {

                    protected byte tpInsc;
                    @XmlElement(required = true)
                    protected String nrInsc;
                    @XmlElement(required = true)
                    protected ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr infoVlr;

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
                     * Obtém o valor da propriedade infoVlr.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr }
                     *     
                     */
                    public ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr getInfoVlr() {
                        return infoVlr;
                    }

                    /**
                     * Define o valor da propriedade infoVlr.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr }
                     *     
                     */
                    public void setInfoVlr(ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr value) {
                        this.infoVlr = value;
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
                     *         &lt;element name="compIni" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
                     *         &lt;element name="compFim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
                     *         &lt;element name="indReperc">
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
                     *         &lt;element name="indenSD" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim" minOccurs="0"/>
                     *         &lt;element name="indenAbono" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim" minOccurs="0"/>
                     *         &lt;element name="abono" maxOccurs="9" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="anoBase">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                     *                         &lt;pattern value="\d{4}"/>
                     *                         &lt;minInclusive value="1900"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="idePeriodo" maxOccurs="999" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
                     *                   &lt;element name="baseCalculo" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="vrBcCpMensal" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
                     *                             &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
                     *                             &lt;element name="infoAgNocivo" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="grauExp" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_grauExp"/>
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
                     *                   &lt;element name="infoFGTS" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="vrBcFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
                     *                             &lt;element name="vrBcFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *                             &lt;element name="vrBcFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="baseMudCateg" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg"/>
                     *                             &lt;element name="vrBcCPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="infoInterm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}T_infoIntermProcTrab" maxOccurs="31" minOccurs="0"/>
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
                        "compIni",
                        "compFim",
                        "indReperc",
                        "indenSD",
                        "indenAbono",
                        "abono",
                        "idePeriodo"
                    })
                    public static class InfoVlr {

                        @XmlElement(required = true)
                        protected String compIni;
                        @XmlElement(required = true)
                        protected String compFim;
                        protected byte indReperc;
                        @XmlSchemaType(name = "string")
                        protected TSSim indenSD;
                        @XmlSchemaType(name = "string")
                        protected TSSim indenAbono;
                        protected List<ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.Abono> abono;
                        protected List<ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo> idePeriodo;

                        /**
                         * Obtém o valor da propriedade compIni.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCompIni() {
                            return compIni;
                        }

                        /**
                         * Define o valor da propriedade compIni.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCompIni(String value) {
                            this.compIni = value;
                        }

                        /**
                         * Obtém o valor da propriedade compFim.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCompFim() {
                            return compFim;
                        }

                        /**
                         * Define o valor da propriedade compFim.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCompFim(String value) {
                            this.compFim = value;
                        }

                        /**
                         * Obtém o valor da propriedade indReperc.
                         * 
                         */
                        public byte getIndReperc() {
                            return indReperc;
                        }

                        /**
                         * Define o valor da propriedade indReperc.
                         * 
                         */
                        public void setIndReperc(byte value) {
                            this.indReperc = value;
                        }

                        /**
                         * Obtém o valor da propriedade indenSD.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TSSim }
                         *     
                         */
                        public TSSim getIndenSD() {
                            return indenSD;
                        }

                        /**
                         * Define o valor da propriedade indenSD.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TSSim }
                         *     
                         */
                        public void setIndenSD(TSSim value) {
                            this.indenSD = value;
                        }

                        /**
                         * Obtém o valor da propriedade indenAbono.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TSSim }
                         *     
                         */
                        public TSSim getIndenAbono() {
                            return indenAbono;
                        }

                        /**
                         * Define o valor da propriedade indenAbono.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TSSim }
                         *     
                         */
                        public void setIndenAbono(TSSim value) {
                            this.indenAbono = value;
                        }

                        /**
                         * Gets the value of the abono property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the abono property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAbono().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.Abono }
                         * 
                         * 
                         */
                        public List<ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.Abono> getAbono() {
                            if (abono == null) {
                                abono = new ArrayList<ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.Abono>();
                            }
                            return this.abono;
                        }

                        /**
                         * Gets the value of the idePeriodo property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the idePeriodo property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIdePeriodo().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo }
                         * 
                         * 
                         */
                        public List<ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo> getIdePeriodo() {
                            if (idePeriodo == null) {
                                idePeriodo = new ArrayList<ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo>();
                            }
                            return this.idePeriodo;
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
                         *         &lt;element name="anoBase">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                         *               &lt;pattern value="\d{4}"/>
                         *               &lt;minInclusive value="1900"/>
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
                            "anoBase"
                        })
                        public static class Abono {

                            @XmlElement(required = true)
                            protected BigInteger anoBase;

                            /**
                             * Obtém o valor da propriedade anoBase.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getAnoBase() {
                                return anoBase;
                            }

                            /**
                             * Define o valor da propriedade anoBase.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setAnoBase(BigInteger value) {
                                this.anoBase = value;
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
                         *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_periodo_mensal"/>
                         *         &lt;element name="baseCalculo" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="vrBcCpMensal" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
                         *                   &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
                         *                   &lt;element name="infoAgNocivo" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="grauExp" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_grauExp"/>
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
                         *         &lt;element name="infoFGTS" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="vrBcFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
                         *                   &lt;element name="vrBcFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                         *                   &lt;element name="vrBcFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="baseMudCateg" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg"/>
                         *                   &lt;element name="vrBcCPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="infoInterm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}T_infoIntermProcTrab" maxOccurs="31" minOccurs="0"/>
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
                            "baseCalculo",
                            "infoFGTS",
                            "baseMudCateg",
                            "infoInterm"
                        })
                        public static class IdePeriodo {

                            @XmlElement(required = true)
                            protected String perRef;
                            protected ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseCalculo baseCalculo;
                            protected ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.InfoFGTS infoFGTS;
                            protected ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseMudCateg baseMudCateg;
                            protected List<TInfoIntermProcTrab> infoInterm;

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
                             * Obtém o valor da propriedade baseCalculo.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseCalculo }
                             *     
                             */
                            public ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseCalculo getBaseCalculo() {
                                return baseCalculo;
                            }

                            /**
                             * Define o valor da propriedade baseCalculo.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseCalculo }
                             *     
                             */
                            public void setBaseCalculo(ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseCalculo value) {
                                this.baseCalculo = value;
                            }

                            /**
                             * Obtém o valor da propriedade infoFGTS.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.InfoFGTS }
                             *     
                             */
                            public ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.InfoFGTS getInfoFGTS() {
                                return infoFGTS;
                            }

                            /**
                             * Define o valor da propriedade infoFGTS.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.InfoFGTS }
                             *     
                             */
                            public void setInfoFGTS(ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.InfoFGTS value) {
                                this.infoFGTS = value;
                            }

                            /**
                             * Obtém o valor da propriedade baseMudCateg.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseMudCateg }
                             *     
                             */
                            public ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseMudCateg getBaseMudCateg() {
                                return baseMudCateg;
                            }

                            /**
                             * Define o valor da propriedade baseMudCateg.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseMudCateg }
                             *     
                             */
                            public void setBaseMudCateg(ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseMudCateg value) {
                                this.baseMudCateg = value;
                            }

                            /**
                             * Gets the value of the infoInterm property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the infoInterm property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getInfoInterm().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link TInfoIntermProcTrab }
                             * 
                             * 
                             */
                            public List<TInfoIntermProcTrab> getInfoInterm() {
                                if (infoInterm == null) {
                                    infoInterm = new ArrayList<TInfoIntermProcTrab>();
                                }
                                return this.infoInterm;
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
                             *         &lt;element name="vrBcCpMensal" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
                             *         &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
                             *         &lt;element name="infoAgNocivo" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="grauExp" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_grauExp"/>
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
                                "vrBcCpMensal",
                                "vrBcCp13",
                                "infoAgNocivo"
                            })
                            public static class BaseCalculo {

                                @XmlElement(required = true)
                                protected BigDecimal vrBcCpMensal;
                                protected BigDecimal vrBcCp13;
                                protected ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseCalculo.InfoAgNocivo infoAgNocivo;

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
                                 * Obtém o valor da propriedade infoAgNocivo.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseCalculo.InfoAgNocivo }
                                 *     
                                 */
                                public ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseCalculo.InfoAgNocivo getInfoAgNocivo() {
                                    return infoAgNocivo;
                                }

                                /**
                                 * Define o valor da propriedade infoAgNocivo.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseCalculo.InfoAgNocivo }
                                 *     
                                 */
                                public void setInfoAgNocivo(ESocial.EvtProcTrab.IdeTrab.InfoContr.IdeEstab.InfoVlr.IdePeriodo.BaseCalculo.InfoAgNocivo value) {
                                    this.infoAgNocivo = value;
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
                                 *         &lt;element name="grauExp" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_grauExp"/>
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
                                    "grauExp"
                                })
                                public static class InfoAgNocivo {

                                    protected byte grauExp;

                                    /**
                                     * Obtém o valor da propriedade grauExp.
                                     * 
                                     */
                                    public byte getGrauExp() {
                                        return grauExp;
                                    }

                                    /**
                                     * Define o valor da propriedade grauExp.
                                     * 
                                     */
                                    public void setGrauExp(byte value) {
                                        this.grauExp = value;
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
                             *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg"/>
                             *         &lt;element name="vrBcCPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo"/>
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
                                "codCateg",
                                "vrBcCPrev"
                            })
                            public static class BaseMudCateg {

                                @XmlElement(required = true)
                                protected BigInteger codCateg;
                                @XmlElement(required = true)
                                protected BigDecimal vrBcCPrev;

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
                                 * Obtém o valor da propriedade vrBcCPrev.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getVrBcCPrev() {
                                    return vrBcCPrev;
                                }

                                /**
                                 * Define o valor da propriedade vrBcCPrev.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setVrBcCPrev(BigDecimal value) {
                                    this.vrBcCPrev = value;
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
                             *         &lt;element name="vrBcFGTSProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario"/>
                             *         &lt;element name="vrBcFGTSSefip" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
                             *         &lt;element name="vrBcFGTSDecAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
                                "vrBcFGTSProcTrab",
                                "vrBcFGTSSefip",
                                "vrBcFGTSDecAnt"
                            })
                            public static class InfoFGTS {

                                @XmlElement(required = true)
                                protected BigDecimal vrBcFGTSProcTrab;
                                protected BigDecimal vrBcFGTSSefip;
                                protected BigDecimal vrBcFGTSDecAnt;

                                /**
                                 * Obtém o valor da propriedade vrBcFGTSProcTrab.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getVrBcFGTSProcTrab() {
                                    return vrBcFGTSProcTrab;
                                }

                                /**
                                 * Define o valor da propriedade vrBcFGTSProcTrab.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setVrBcFGTSProcTrab(BigDecimal value) {
                                    this.vrBcFGTSProcTrab = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vrBcFGTSSefip.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getVrBcFGTSSefip() {
                                    return vrBcFGTSSefip;
                                }

                                /**
                                 * Define o valor da propriedade vrBcFGTSSefip.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setVrBcFGTSSefip(BigDecimal value) {
                                    this.vrBcFGTSSefip = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vrBcFGTSDecAnt.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getVrBcFGTSDecAnt() {
                                    return vrBcFGTSDecAnt;
                                }

                                /**
                                 * Define o valor da propriedade vrBcFGTSDecAnt.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setVrBcFGTSDecAnt(BigDecimal value) {
                                    this.vrBcFGTSDecAnt = value;
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
                 *         &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_cbo" minOccurs="0"/>
                 *         &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_natAtividade" minOccurs="0"/>
                 *         &lt;element name="remuneracao" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="dtRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *                   &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_vrSalFx"/>
                 *                   &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_undSalFixo"/>
                 *                   &lt;element name="dscSalVar" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="infoVinc" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpRegTrab"/>
                 *                   &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpRegPrev_1_2_3"/>
                 *                   &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *                   &lt;element name="tmpParc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tmpParc" minOccurs="0"/>
                 *                   &lt;element name="duracao" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpContr"/>
                 *                             &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_dtTerm" minOccurs="0"/>
                 *                             &lt;element name="clauAssec" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
                 *                             &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_objDet" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_observacao"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="sucessaoVinc" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="tpInsc">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                                   &lt;enumeration value="1"/>
                 *                                   &lt;enumeration value="2"/>
                 *                                   &lt;enumeration value="5"/>
                 *                                   &lt;enumeration value="6"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="nrInsc">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;pattern value="\d{8,14}|[A-Z0-9]{12}\d{2}"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
                 *                             &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="infoDeslig" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *                             &lt;element name="mtvDeslig">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;pattern value="\d{2}"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="dtProjFimAPI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                             &lt;element name="pensAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_pensAlim" minOccurs="0"/>
                 *                             &lt;element name="percAliment" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_percAliment" minOccurs="0"/>
                 *                             &lt;element name="vrAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_vrAlim" minOccurs="0"/>
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
                 *         &lt;element name="infoTerm" minOccurs="0">
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
                 *                         &lt;enumeration value="99"/>
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
                    "codCBO",
                    "natAtividade",
                    "remuneracao",
                    "infoVinc",
                    "infoTerm"
                })
                public static class InfoCompl {

                    protected String codCBO;
                    protected Byte natAtividade;
                    protected List<ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.Remuneracao> remuneracao;
                    protected ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc infoVinc;
                    protected ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoTerm infoTerm;

                    /**
                     * Obtém o valor da propriedade codCBO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodCBO() {
                        return codCBO;
                    }

                    /**
                     * Define o valor da propriedade codCBO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodCBO(String value) {
                        this.codCBO = value;
                    }

                    /**
                     * Obtém o valor da propriedade natAtividade.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getNatAtividade() {
                        return natAtividade;
                    }

                    /**
                     * Define o valor da propriedade natAtividade.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setNatAtividade(Byte value) {
                        this.natAtividade = value;
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
                     * {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.Remuneracao }
                     * 
                     * 
                     */
                    public List<ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.Remuneracao> getRemuneracao() {
                        if (remuneracao == null) {
                            remuneracao = new ArrayList<ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.Remuneracao>();
                        }
                        return this.remuneracao;
                    }

                    /**
                     * Obtém o valor da propriedade infoVinc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc }
                     *     
                     */
                    public ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc getInfoVinc() {
                        return infoVinc;
                    }

                    /**
                     * Define o valor da propriedade infoVinc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc }
                     *     
                     */
                    public void setInfoVinc(ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc value) {
                        this.infoVinc = value;
                    }

                    /**
                     * Obtém o valor da propriedade infoTerm.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoTerm }
                     *     
                     */
                    public ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoTerm getInfoTerm() {
                        return infoTerm;
                    }

                    /**
                     * Define o valor da propriedade infoTerm.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoTerm }
                     *     
                     */
                    public void setInfoTerm(ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoTerm value) {
                        this.infoTerm = value;
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
                     *               &lt;enumeration value="99"/>
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
                        "dtTerm",
                        "mtvDesligTSV"
                    })
                    public static class InfoTerm {

                        @XmlElement(required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar dtTerm;
                        protected String mtvDesligTSV;

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
                     *         &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpRegTrab"/>
                     *         &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpRegPrev_1_2_3"/>
                     *         &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
                     *         &lt;element name="tmpParc" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tmpParc" minOccurs="0"/>
                     *         &lt;element name="duracao" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpContr"/>
                     *                   &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_dtTerm" minOccurs="0"/>
                     *                   &lt;element name="clauAssec" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
                     *                   &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_objDet" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_observacao"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="sucessaoVinc" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="tpInsc">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *                         &lt;enumeration value="1"/>
                     *                         &lt;enumeration value="2"/>
                     *                         &lt;enumeration value="5"/>
                     *                         &lt;enumeration value="6"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="nrInsc">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;pattern value="\d{8,14}|[A-Z0-9]{12}\d{2}"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
                     *                   &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="infoDeslig" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
                     *                   &lt;element name="mtvDeslig">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;pattern value="\d{2}"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="dtProjFimAPI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *                   &lt;element name="pensAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_pensAlim" minOccurs="0"/>
                     *                   &lt;element name="percAliment" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_percAliment" minOccurs="0"/>
                     *                   &lt;element name="vrAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_vrAlim" minOccurs="0"/>
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
                        "tpRegTrab",
                        "tpRegPrev",
                        "dtAdm",
                        "tmpParc",
                        "duracao",
                        "observacoes",
                        "sucessaoVinc",
                        "infoDeslig"
                    })
                    public static class InfoVinc {

                        protected byte tpRegTrab;
                        protected byte tpRegPrev;
                        @XmlElement(required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar dtAdm;
                        protected Byte tmpParc;
                        protected ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.Duracao duracao;
                        protected List<ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.Observacoes> observacoes;
                        protected ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.SucessaoVinc sucessaoVinc;
                        protected ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.InfoDeslig infoDeslig;

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
                         * Obtém o valor da propriedade tmpParc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *     
                         */
                        public Byte getTmpParc() {
                            return tmpParc;
                        }

                        /**
                         * Define o valor da propriedade tmpParc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *     
                         */
                        public void setTmpParc(Byte value) {
                            this.tmpParc = value;
                        }

                        /**
                         * Obtém o valor da propriedade duracao.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.Duracao }
                         *     
                         */
                        public ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.Duracao getDuracao() {
                            return duracao;
                        }

                        /**
                         * Define o valor da propriedade duracao.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.Duracao }
                         *     
                         */
                        public void setDuracao(ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.Duracao value) {
                            this.duracao = value;
                        }

                        /**
                         * Gets the value of the observacoes property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the observacoes property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getObservacoes().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.Observacoes }
                         * 
                         * 
                         */
                        public List<ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.Observacoes> getObservacoes() {
                            if (observacoes == null) {
                                observacoes = new ArrayList<ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.Observacoes>();
                            }
                            return this.observacoes;
                        }

                        /**
                         * Obtém o valor da propriedade sucessaoVinc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.SucessaoVinc }
                         *     
                         */
                        public ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.SucessaoVinc getSucessaoVinc() {
                            return sucessaoVinc;
                        }

                        /**
                         * Define o valor da propriedade sucessaoVinc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.SucessaoVinc }
                         *     
                         */
                        public void setSucessaoVinc(ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.SucessaoVinc value) {
                            this.sucessaoVinc = value;
                        }

                        /**
                         * Obtém o valor da propriedade infoDeslig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.InfoDeslig }
                         *     
                         */
                        public ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.InfoDeslig getInfoDeslig() {
                            return infoDeslig;
                        }

                        /**
                         * Define o valor da propriedade infoDeslig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.InfoDeslig }
                         *     
                         */
                        public void setInfoDeslig(ESocial.EvtProcTrab.IdeTrab.InfoContr.InfoCompl.InfoVinc.InfoDeslig value) {
                            this.infoDeslig = value;
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
                         *         &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_tpContr"/>
                         *         &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_dtTerm" minOccurs="0"/>
                         *         &lt;element name="clauAssec" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_sim_nao" minOccurs="0"/>
                         *         &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_objDet" minOccurs="0"/>
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
                            "tpContr",
                            "dtTerm",
                            "clauAssec",
                            "objDet"
                        })
                        public static class Duracao {

                            protected byte tpContr;
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar dtTerm;
                            @XmlSchemaType(name = "string")
                            protected TSSimNao clauAssec;
                            protected String objDet;

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
                             * Obtém o valor da propriedade clauAssec.
                             * 
                             * @return
                             *     possible object is
                             *     {@link TSSimNao }
                             *     
                             */
                            public TSSimNao getClauAssec() {
                                return clauAssec;
                            }

                            /**
                             * Define o valor da propriedade clauAssec.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link TSSimNao }
                             *     
                             */
                            public void setClauAssec(TSSimNao value) {
                                this.clauAssec = value;
                            }

                            /**
                             * Obtém o valor da propriedade objDet.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getObjDet() {
                                return objDet;
                            }

                            /**
                             * Define o valor da propriedade objDet.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setObjDet(String value) {
                                this.objDet = value;
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
                         *         &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
                         *         &lt;element name="mtvDeslig">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;pattern value="\d{2}"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="dtProjFimAPI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                         *         &lt;element name="pensAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_pensAlim" minOccurs="0"/>
                         *         &lt;element name="percAliment" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_percAliment" minOccurs="0"/>
                         *         &lt;element name="vrAlim" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_vrAlim" minOccurs="0"/>
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
                            "dtDeslig",
                            "mtvDeslig",
                            "dtProjFimAPI",
                            "pensAlim",
                            "percAliment",
                            "vrAlim"
                        })
                        public static class InfoDeslig {

                            @XmlElement(required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar dtDeslig;
                            @XmlElement(required = true)
                            protected String mtvDeslig;
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar dtProjFimAPI;
                            protected Byte pensAlim;
                            protected BigDecimal percAliment;
                            protected BigDecimal vrAlim;

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
                         *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_observacao"/>
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
                            "observacao"
                        })
                        public static class Observacoes {

                            @XmlElement(required = true)
                            protected String observacao;

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
                         *         &lt;element name="tpInsc">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                         *               &lt;enumeration value="1"/>
                         *               &lt;enumeration value="2"/>
                         *               &lt;enumeration value="5"/>
                         *               &lt;enumeration value="6"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="nrInsc">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;pattern value="\d{8,14}|[A-Z0-9]{12}\d{2}"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
                         *         &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                            "matricAnt",
                            "dtTransf"
                        })
                        public static class SucessaoVinc {

                            protected byte tpInsc;
                            @XmlElement(required = true)
                            protected String nrInsc;
                            protected String matricAnt;
                            @XmlElement(required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar dtTransf;

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
                             * Obtém o valor da propriedade matricAnt.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getMatricAnt() {
                                return matricAnt;
                            }

                            /**
                             * Define o valor da propriedade matricAnt.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setMatricAnt(String value) {
                                this.matricAnt = value;
                            }

                            /**
                             * Obtém o valor da propriedade dtTransf.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public XMLGregorianCalendar getDtTransf() {
                                return dtTransf;
                            }

                            /**
                             * Define o valor da propriedade dtTransf.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public void setDtTransf(XMLGregorianCalendar value) {
                                this.dtTransf = value;
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
                     *         &lt;element name="dtRemun" type="{http://www.w3.org/2001/XMLSchema}date"/>
                     *         &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_vrSalFx"/>
                     *         &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_undSalFixo"/>
                     *         &lt;element name="dscSalVar" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
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
                 *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg"/>
                 *         &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_natAtividade" minOccurs="0"/>
                 *         &lt;element name="dtMudCategAtiv" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                    "codCateg",
                    "natAtividade",
                    "dtMudCategAtiv"
                })
                public static class MudCategAtiv {

                    @XmlElement(required = true)
                    protected BigInteger codCateg;
                    protected Byte natAtividade;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtMudCategAtiv;

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
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getNatAtividade() {
                        return natAtividade;
                    }

                    /**
                     * Define o valor da propriedade natAtividade.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setNatAtividade(Byte value) {
                        this.natAtividade = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtMudCategAtiv.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtMudCategAtiv() {
                        return dtMudCategAtiv;
                    }

                    /**
                     * Define o valor da propriedade dtMudCategAtiv.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtMudCategAtiv(XMLGregorianCalendar value) {
                        this.dtMudCategAtiv = value;
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
                 *         &lt;element name="matUnic" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_matricula" minOccurs="0"/>
                 *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
                 *         &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
                    "matUnic",
                    "codCateg",
                    "dtInicio"
                })
                public static class UnicContr {

                    protected String matUnic;
                    protected BigInteger codCateg;
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtInicio;

                    /**
                     * Obtém o valor da propriedade matUnic.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMatUnic() {
                        return matUnic;
                    }

                    /**
                     * Define o valor da propriedade matUnic.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMatUnic(String value) {
                        this.matUnic = value;
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
                     * Obtém o valor da propriedade dtInicio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtInicio() {
                        return dtInicio;
                    }

                    /**
                     * Define o valor da propriedade dtInicio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtInicio(XMLGregorianCalendar value) {
                        this.dtInicio = value;
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
         *         &lt;element name="origem" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_origem"/>
         *         &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_nrProcTrab"/>
         *         &lt;element name="obsProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_texto_999" minOccurs="0"/>
         *         &lt;element name="dadosCompl">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="infoProcJud">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="dtSent" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                               &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_uf"/>
         *                               &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codMunic"/>
         *                               &lt;element name="idVara">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                     &lt;pattern value="\d{1,4}"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="infoPatPrec" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="infoCCP">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="dtCCP" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                               &lt;element name="tpCCP">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                     &lt;enumeration value="1"/>
         *                                     &lt;enumeration value="2"/>
         *                                     &lt;enumeration value="3"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="cnpjCCP" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
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
            "origem",
            "nrProcTrab",
            "obsProcTrab",
            "dadosCompl"
        })
        public static class InfoProcesso {

            protected byte origem;
            @XmlElement(required = true)
            protected String nrProcTrab;
            protected String obsProcTrab;
            @XmlElement(required = true)
            protected ESocial.EvtProcTrab.InfoProcesso.DadosCompl dadosCompl;

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

            /**
             * Obtém o valor da propriedade obsProcTrab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObsProcTrab() {
                return obsProcTrab;
            }

            /**
             * Define o valor da propriedade obsProcTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObsProcTrab(String value) {
                this.obsProcTrab = value;
            }

            /**
             * Obtém o valor da propriedade dadosCompl.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtProcTrab.InfoProcesso.DadosCompl }
             *     
             */
            public ESocial.EvtProcTrab.InfoProcesso.DadosCompl getDadosCompl() {
                return dadosCompl;
            }

            /**
             * Define o valor da propriedade dadosCompl.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtProcTrab.InfoProcesso.DadosCompl }
             *     
             */
            public void setDadosCompl(ESocial.EvtProcTrab.InfoProcesso.DadosCompl value) {
                this.dadosCompl = value;
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
             *         &lt;choice>
             *           &lt;element name="infoProcJud">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="dtSent" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                     &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_uf"/>
             *                     &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codMunic"/>
             *                     &lt;element name="idVara">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                           &lt;pattern value="\d{1,4}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="infoPatPrec" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="infoCCP">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="dtCCP" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                     &lt;element name="tpCCP">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                           &lt;enumeration value="1"/>
             *                           &lt;enumeration value="2"/>
             *                           &lt;enumeration value="3"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="cnpjCCP" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
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
                "infoProcJud",
                "infoCCP"
            })
            public static class DadosCompl {

                protected ESocial.EvtProcTrab.InfoProcesso.DadosCompl.InfoProcJud infoProcJud;
                protected ESocial.EvtProcTrab.InfoProcesso.DadosCompl.InfoCCP infoCCP;

                /**
                 * Obtém o valor da propriedade infoProcJud.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtProcTrab.InfoProcesso.DadosCompl.InfoProcJud }
                 *     
                 */
                public ESocial.EvtProcTrab.InfoProcesso.DadosCompl.InfoProcJud getInfoProcJud() {
                    return infoProcJud;
                }

                /**
                 * Define o valor da propriedade infoProcJud.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtProcTrab.InfoProcesso.DadosCompl.InfoProcJud }
                 *     
                 */
                public void setInfoProcJud(ESocial.EvtProcTrab.InfoProcesso.DadosCompl.InfoProcJud value) {
                    this.infoProcJud = value;
                }

                /**
                 * Obtém o valor da propriedade infoCCP.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtProcTrab.InfoProcesso.DadosCompl.InfoCCP }
                 *     
                 */
                public ESocial.EvtProcTrab.InfoProcesso.DadosCompl.InfoCCP getInfoCCP() {
                    return infoCCP;
                }

                /**
                 * Define o valor da propriedade infoCCP.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtProcTrab.InfoProcesso.DadosCompl.InfoCCP }
                 *     
                 */
                public void setInfoCCP(ESocial.EvtProcTrab.InfoProcesso.DadosCompl.InfoCCP value) {
                    this.infoCCP = value;
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
                 *         &lt;element name="dtCCP" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="tpCCP">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cnpjCCP" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
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
                    "dtCCP",
                    "tpCCP",
                    "cnpjCCP"
                })
                public static class InfoCCP {

                    @XmlElement(required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtCCP;
                    protected byte tpCCP;
                    protected String cnpjCCP;

                    /**
                     * Obtém o valor da propriedade dtCCP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtCCP() {
                        return dtCCP;
                    }

                    /**
                     * Define o valor da propriedade dtCCP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtCCP(XMLGregorianCalendar value) {
                        this.dtCCP = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpCCP.
                     * 
                     */
                    public byte getTpCCP() {
                        return tpCCP;
                    }

                    /**
                     * Define o valor da propriedade tpCCP.
                     * 
                     */
                    public void setTpCCP(byte value) {
                        this.tpCCP = value;
                    }

                    /**
                     * Obtém o valor da propriedade cnpjCCP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjCCP() {
                        return cnpjCCP;
                    }

                    /**
                     * Define o valor da propriedade cnpjCCP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjCCP(String value) {
                        this.cnpjCCP = value;
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
                 *         &lt;element name="dtSent" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="ufVara" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_uf"/>
                 *         &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_codMunic"/>
                 *         &lt;element name="idVara">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *               &lt;pattern value="\d{1,4}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="infoPatPrec" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
                    "dtSent",
                    "ufVara",
                    "codMunic",
                    "idVara",
                    "infoPatPrec"
                })
                public static class InfoProcJud {

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
                    protected BigDecimal infoPatPrec;

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

                    /**
                     * Obtém o valor da propriedade infoPatPrec.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getInfoPatPrec() {
                        return infoPatPrec;
                    }

                    /**
                     * Define o valor da propriedade infoPatPrec.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setInfoPatPrec(BigDecimal value) {
                        this.infoPatPrec = value;
                    }

                }

            }

        }

    }

}
