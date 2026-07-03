//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:19 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cessao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * CONDICAO_GRUPO: O (se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 = [03]); N (nos demais casos)
 * 
 * <p>Classe Java de T_infoSimples_S-2399 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_infoSimples_S-2399">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}TS_indSimples"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_infoSimples_S-2399", propOrder = {
    "indSimples"
})
public class TInfoSimplesS2399 {

    protected byte indSimples;

    /**
     * Obtém o valor da propriedade indSimples.
     * 
     */
    public byte getIndSimples() {
        return indSimples;
    }

    /**
     * Define o valor da propriedade indSimples.
     * 
     */
    public void setIndSimples(byte value) {
        this.indSimples = value;
    }

}
