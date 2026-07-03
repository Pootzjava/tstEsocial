//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:16 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.benprrp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_ideEstab_perApur complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_ideEstab_perApur">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEstab">
 *       &lt;sequence>
 *         &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_itensRemun_rpps_perApur" maxOccurs="200"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideEstab_perApur", propOrder = {
    "itensRemun"
})
public class TIdeEstabPerApur
    extends TIdeEstab
{

    @XmlElement(required = true)
    protected List<TItensRemunRppsPerApur> itensRemun;

    /**
     * Gets the value of the itensRemun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itensRemun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItensRemun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TItensRemunRppsPerApur }
     * 
     * 
     */
    public List<TItensRemunRppsPerApur> getItensRemun() {
        if (itensRemun == null) {
            itensRemun = new ArrayList<TItensRemunRppsPerApur>();
        }
        return this.itensRemun;
    }

}
