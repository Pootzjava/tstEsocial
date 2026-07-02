//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.07.02 às 04:36:13 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.altcadastral;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TS_tpAcConv.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TS_tpAcConv">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="J"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TS_tpAcConv")
@XmlEnum
public enum TSTpAcConv {


    /**
     * Acordo Coletivo de Trabalho
     * 
     */
    A,

    /**
     * Legislação federal, estadual, municipal ou distrital
     * 
     */
    B,

    /**
     * Convenção Coletiva de Trabalho
     * 
     */
    C,

    /**
     * Sentença normativa - Dissídio
     * 
     */
    D,

    /**
     * Conversão de licença saúde em acidente de trabalho
     * 
     */
    E,

    /**
     * Outras verbas de natureza salarial ou não salarial devidas após o desligamento
     * 
     */
    F,

    /**
     * Antecipação de diferenças de acordo, convenção ou dissídio coletivo
     * 
     */
    G,

    /**
     * Declaração de base de cálculo de FGTS anterior ao início do FGTS Digital
     * 
     */
    H,

    /**
     * Sentença judicial (exceto reclamatória trabalhista)
     * 
     */
    I,

    /**
     * Parcelas complementares conhecidas após o fechamento da folha
     * 
     */
    J;

    public String value() {
        return name();
    }

    public static TSTpAcConv fromValue(String v) {
        return valueOf(v);
    }

}
