//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:29 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.remun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_itensRemun_descFolha complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_itensRemun_descFolha">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_03_00}T_itensRemun">
 *       &lt;sequence>
 *         &lt;element name="descFolha" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_03_00}T_descFolha" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_itensRemun_descFolha", propOrder = {
    "descFolha"
})
public class TItensRemunDescFolha
    extends TItensRemun
{

    protected TDescFolha descFolha;

    /**
     * Obtém o valor da propriedade descFolha.
     * 
     * @return
     *     possible object is
     *     {@link TDescFolha }
     *     
     */
    public TDescFolha getDescFolha() {
        return descFolha;
    }

    /**
     * Define o valor da propriedade descFolha.
     * 
     * @param value
     *     allowed object is
     *     {@link TDescFolha }
     *     
     */
    public void setDescFolha(TDescFolha value) {
        this.descFolha = value;
    }

}
