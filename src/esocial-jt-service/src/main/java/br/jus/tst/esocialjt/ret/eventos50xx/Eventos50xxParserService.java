package br.jus.tst.esocialjt.ret.eventos50xx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Serviço responsável por fazer parse dos eventos de retorno S-50XX do eSocial.
 * Transforma XML bruto em informações gerenciais para DCTFWeb e FGTS.
 */
@Service
public class Eventos50xxParserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Eventos50xxParserService.class);
    
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM");

    /**
     * Processa o XML de retorno contendo eventos totalizadores S-50XX.
     * Extrai informações de apuração de FGTS e DCTFWeb.
     */
    public RetornoApuracaoDTO processarRetornoApuracao(String xmlRetorno) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new ByteArrayInputStream(xmlRetorno.getBytes("UTF-8")));

            RetornoApuracaoDTO retorno = new RetornoApuracaoDTO();
            
            // Extrai evento totalizador de remuneração (S-5010)
            NodeList s5010Nodes = doc.getElementsByTagName("evtTotRemun");
            if (s5010Nodes.getLength() > 0) {
                retorno.setRemuneracaoTotal(extrairDadosRemuneracao((Element) s5010Nodes.item(0)));
            }
            
            // Extrai evento totalizador de contribuições (S-5020)
            NodeList s5020Nodes = doc.getElementsByTagName("evtTotContrib");
            if (s5020Nodes.getLength() > 0) {
                retorno.setContribuicaoTotal(extrairDadosContribuicao((Element) s5020Nodes.item(0)));
            }
            
            retorno.setXmlProcessado(xmlRetorno);
            retorno.setDataProcessamento(LocalDate.now());
            
            LOGGER.info("Retorno S-50XX processado com sucesso. Período: {}", 
                       retorno.getPeriodoApuracao());
            
            return retorno;
            
        } catch (Exception e) {
            LOGGER.error("Erro ao processar retorno S-50XX: {}", e.getMessage(), e);
            throw new RuntimeException("ERRO_PROCESSAMENTO_RETORNO", 
                new Exception("Falha ao interpretar os dados de apuração do eSocial.", e));
        }
    }

    /**
     * Extrai dados de remuneração do evento S-5010.
     */
    private RemuneracaoTotalDTO extrairDadosRemuneracao(Element evtTotRemun) {
        RemuneracaoTotalDTO remuneracao = new RemuneracaoTotalDTO();
        
        Element ideEvento = getElement(evtTotRemun, "ideEvento");
        if (ideEvento != null) {
            String perApur = getTextContent(ideEvento, "perApur");
            remuneracao.setPeriodoApuracao(perApur);
            
            if (perApur != null) {
                try {
                    remuneracao.setPeriodoApuracaoFormatado(
                        LocalDate.parse(perApur + "-01", DATE_FORMATTER)
                    );
                } catch (Exception e) {
                    LOGGER.warn("Período de apuração em formato inesperado: {}", perApur);
                }
            }
        }
        
        Element infoRemun = getElement(evtTotRemun, "infoRemun");
        if (infoRemun != null) {
            Element dvApur = getElement(infoRemun, "dvApur");
            if (dvApur != null) {
                remuneracao.setValorRemuneracaoBruta(
                    parseDecimal(getTextContent(dvApur, "remunBRuta"))
                );
                remuneracao.setValorRemuneracaoLiquida(
                    parseDecimal(getTextContent(dvApur, "remunLiq"))
                );
                remuneracao.setValorFGTS(
                    parseDecimal(getTextContent(dvApur, "vrFGTS"))
                );
            }
        }
        
        return remuneracao;
    }

    /**
     * Extrai dados de contribuição do evento S-5020.
     */
    private ContribuicaoTotalDTO extrairDadosContribuicao(Element evtTotContrib) {
        ContribuicaoTotalDTO contribuicao = new ContribuicaoTotalDTO();
        
        Element ideEvento = getElement(evtTotContrib, "ideEvento");
        if (ideEvento != null) {
            String perApur = getTextContent(ideEvento, "perApur");
            contribuicao.setPeriodoApuracao(perApur);
        }
        
        Element infoContrib = getElement(evtTotContrib, "infoContrib");
        if (infoContrib != null) {
            Element dvApur = getElement(infoContrib, "dvApur");
            if (dvApur != null) {
                contribuicao.setValorCPREmpresa(
                    parseDecimal(getTextContent(dvApur, "cprEmp"))
                );
                contribuicao.setValorCPRSegurado(
                    parseDecimal(getTextContent(dvApur, "cprSeg"))
                );
                contribuicao.setValorTerceiros(
                    parseDecimal(getTextContent(dvApur, "terceiros"))
                );
                contribuicao.setValorGILRAT(
                    parseDecimal(getTextContent(dvApur, "gilrat"))
                );
            }
        }
        
        return contribuicao;
    }

    /**
     * Valida se o retorno contém eventos de apuração válidos.
     */
    public boolean isValidarRetornoApuracao(RetornoApuracaoDTO retorno) {
        if (retorno == null || retorno.getPeriodoApuracao() == null) {
            return false;
        }
        
        boolean temRemuneracao = retorno.getRemuneracaoTotal() != null &&
                                retorno.getRemuneracaoTotal().getValorFGTS() != null;
        boolean temContribuicao = retorno.getContribuicaoTotal() != null &&
                                 retorno.getContribuicaoTotal().getValorCPREmpresa() != null;
        
        return temRemuneracao || temContribuicao;
    }

    // Helpers
    private Element getElement(Element parent, String tagName) {
        NodeList nodes = parent.getElementsByTagName(tagName);
        return nodes.getLength() > 0 ? (Element) nodes.item(0) : null;
    }

    private String getTextContent(Element parent, String tagName) {
        Element element = getElement(parent, tagName);
        return element != null ? element.getTextContent() : null;
    }

    private java.math.BigDecimal parseDecimal(String value) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        try {
            return new java.math.BigDecimal(value.replace(",", "."));
        } catch (Exception e) {
            LOGGER.warn("Valor decimal inválido: {}", value);
            return null;
        }
    }
}
