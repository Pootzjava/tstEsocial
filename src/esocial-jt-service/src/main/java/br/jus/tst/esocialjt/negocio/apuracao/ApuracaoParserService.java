package br.jus.tst.esocialjt.negocio.apuracao;

import br.jus.tst.esocialjt.dominio.ApuracaoEsocial;
import br.jus.tst.esocialjt.evento.ApuracaoEsocialRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Serviço responsável por fazer o parser dos XMLs de eventos totalizadores S-5010 e S-5020
 * e extrair os valores monetários para o dashboard premium.
 */
@Service
public class ApuracaoParserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApuracaoParserService.class);

    @Autowired
    private ApuracaoEsocialRepository apuracaoRepository;

    /**
     * Processa um XML de evento totalizador e extrai os valores para o dashboard.
     * Deve ser chamado após o recebimento do retorno do eSocial.
     */
    @Transactional
    public void processarXmlTotalizador(String tipoEvento, String xmlEvento, String nrRecibo) {
        try {
            if (tipoEvento == null || xmlEvento == null) {
                LOGGER.warn("XML ou tipo do evento nulo - ignorando processamento");
                return;
            }

            // Verifica se já existe registro para este recibo
            Optional<ApuracaoEsocial> existente = apuracaoRepository.findByNumeroRecibo(nrRecibo);
            if (existente.isPresent()) {
                LOGGER.debug("Apuração já processada para recibo: {}", nrRecibo);
                return;
            }

            ApuracaoEsocial apuracao = new ApuracaoEsocial();
            apuracao.setTipoEvento(tipoEvento);
            apuracao.setNumeroRecibo(nrRecibo);
            apuracao.setDataProcessamento(LocalDateTime.now());

            if ("S-5010".equals(tipoEvento)) {
                parseS5010(xmlEvento, apuracao);
            } else if ("S-5020".equals(tipoEvento)) {
                parseS5020(xmlEvento, apuracao);
            } else {
                LOGGER.debug("Tipo de evento {} não requer parser de valores monetários", tipoEvento);
                return;
            }

            apuracaoRepository.save(apuracao);
            LOGGER.info("Apuração processada com sucesso: tipo={}, competência={}, recibo={}", 
                       tipoEvento, apuracao.getCompetencia(), nrRecibo);

        } catch (Exception e) {
            LOGGER.error("Erro ao processar XML de apuração {}: {}", tipoEvento, e.getMessage(), e);
        }
    }

    /**
     * Parser específico para evento S-5010 (Consolidação das Bases de Cálculo e Retenções)
     * Extrai: Base FGTS, FGTS Mensal, Base IRRF, IRRF Retido, Base Contribuição Previdenciária
     */
    private void parseS5010(String xml, ApuracaoEsocial apuracao) {
        try {
            // Extrair período de apuração
            String perApuracao = extractTagContent(xml, "perApuracao");
            if (perApuracao != null && perApuracao.length() >= 7) {
                // Formato YYYY-MM
                LocalDate competencia = LocalDate.parse(perApuracao.substring(0, 7) + "-01", 
                                                       DateTimeFormatter.ISO_LOCAL_DATE);
                apuracao.setCompetencia(competencia);
            }

            // Extrair bases de cálculo do XML
            // Estrutura típica: <ideEstabLot><infoBaseCalc>...<baseFGTS>...</ideEstabLot>
            
            BigDecimal totalBaseFgts = BigDecimal.ZERO;
            BigDecimal totalFgtsMensal = BigDecimal.ZERO;
            BigDecimal totalBaseIrrf = BigDecimal.ZERO;
            BigDecimal totalIrrf = BigDecimal.ZERO;
            BigDecimal totalBaseContribPrev = BigDecimal.ZERO;
            BigDecimal totalContribPrevPatronal = BigDecimal.ZERO;

            // Pattern para encontrar todas as ocorrências de bases de cálculo
            Pattern baseFgtsPattern = Pattern.compile("<baseFGTS>([^<]+)</baseFGTS>");
            Matcher baseFgtsMatcher = baseFgtsPattern.matcher(xml);
            while (baseFgtsMatcher.find()) {
                String valor = baseFgtsMatcher.group(1).replaceAll("\\.", "").replace(",", ".");
                try {
                    totalBaseFgts = totalBaseFgts.add(new BigDecimal(valor));
                } catch (NumberFormatException e) {
                    LOGGER.warn("Erro ao parsear base FGTS: {}", baseFgtsMatcher.group(1));
                }
            }

            Pattern fgtsMensalPattern = Pattern.compile("<fgtsMensal>([^<]+)</fgtsMensal>");
            Matcher fgtsMensalMatcher = fgtsMensalPattern.matcher(xml);
            while (fgtsMensalMatcher.find()) {
                String valor = fgtsMensalMatcher.group(1).replaceAll("\\.", "").replace(",", ".");
                try {
                    totalFgtsMensal = totalFgtsMensal.add(new BigDecimal(valor));
                } catch (NumberFormatException e) {
                    LOGGER.warn("Erro ao parsear FGTS mensal: {}", fgtsMensalMatcher.group(1));
                }
            }

            Pattern baseIrrfPattern = Pattern.compile("<baseCalcIRRF>([^<]+)</baseCalcIRRF>");
            Matcher baseIrrfMatcher = baseIrrfPattern.matcher(xml);
            while (baseIrrfMatcher.find()) {
                String valor = baseIrrfMatcher.group(1).replaceAll("\\.", "").replace(",", ".");
                try {
                    totalBaseIrrf = totalBaseIrrf.add(new BigDecimal(valor));
                } catch (NumberFormatException e) {
                    LOGGER.warn("Erro ao parsear base IRRF: {}", baseIrrfMatcher.group(1));
                }
            }

            Pattern irrfPattern = Pattern.compile("<irrf>([^<]+)</irrf>");
            Matcher irrfMatcher = irrfPattern.matcher(xml);
            while (irrfMatcher.find()) {
                String valor = irrfMatcher.group(1).replaceAll("\\.", "").replace(",", ".");
                try {
                    totalIrrf = totalIrrf.add(new BigDecimal(valor));
                } catch (NumberFormatException e) {
                    LOGGER.warn("Erro ao parsear IRRF: {}", irrfMatcher.group(1));
                }
            }

            Pattern baseContribPrevPattern = Pattern.compile("<baseCalcContribPatronal>([^<]+)</baseCalcContribPatronal>");
            Matcher baseContribPrevMatcher = baseContribPrevPattern.matcher(xml);
            while (baseContribPrevMatcher.find()) {
                String valor = baseContribPrevMatcher.group(1).replaceAll("\\.", "").replace(",", ".");
                try {
                    totalBaseContribPrev = totalBaseContribPrev.add(new BigDecimal(valor));
                } catch (NumberFormatException e) {
                    LOGGER.warn("Erro ao parsear base contribuição patronal: {}", baseContribPrevMatcher.group(1));
                }
            }

            Pattern contribPrevPatronalPattern = Pattern.compile("<contribPatronal>([^<]+)</contribPatronal>");
            Matcher contribPrevPatronalMatcher = contribPrevPatronalPattern.matcher(xml);
            while (contribPrevPatronalMatcher.find()) {
                String valor = contribPrevPatronalMatcher.group(1).replaceAll("\\.", "").replace(",", ".");
                try {
                    totalContribPrevPatronal = totalContribPrevPatronal.add(new BigDecimal(valor));
                } catch (NumberFormatException e) {
                    LOGGER.warn("Erro ao parsear contribuição patronal: {}", contribPrevPatronalMatcher.group(1));
                }
            }

            apuracao.setTotalBaseFgts(totalBaseFgts);
            apuracao.setTotalFgtsMensal(totalFgtsMensal);
            apuracao.setTotalBaseIrrf(totalBaseIrrf);
            apuracao.setTotalIrrf(totalIrrf);
            apuracao.setTotalBaseContribPrev(totalBaseContribPrev);
            apuracao.setTotalContribPrevPatronal(totalContribPrevPatronal);

        } catch (Exception e) {
            LOGGER.error("Erro no parser S-5010: {}", e.getMessage(), e);
        }
    }

    /**
     * Parser específico para evento S-5020 (Consolidação das Contribuições Patronais)
     * Extrai: Contribuição Sindical Patronal, Outras Contribuições (RAT/FAP, Terceiros)
     */
    private void parseS5020(String xml, ApuracaoEsocial apuracao) {
        try {
            // Extrair período de apuração
            String perApuracao = extractTagContent(xml, "perApuracao");
            if (perApuracao != null && perApuracao.length() >= 7) {
                LocalDate competencia = LocalDate.parse(perApuracao.substring(0, 7) + "-01", 
                                                       DateTimeFormatter.ISO_LOCAL_DATE);
                apuracao.setCompetencia(competencia);
            }

            BigDecimal totalContribSindicalPatronal = BigDecimal.ZERO;
            BigDecimal totalOutrasContribuicoes = BigDecimal.ZERO;

            // Pattern para contribuição sindical patronal
            Pattern contribSindicalPattern = Pattern.compile("<contribSindPatronal>([^<]+)</contribSindPatronal>");
            Matcher contribSindicalMatcher = contribSindicalPattern.matcher(xml);
            while (contribSindicalMatcher.find()) {
                String valor = contribSindicalMatcher.group(1).replaceAll("\\.", "").replace(",", ".");
                try {
                    totalContribSindicalPatronal = totalContribSindicalPatronal.add(new BigDecimal(valor));
                } catch (NumberFormatException e) {
                    LOGGER.warn("Erro ao parsear contribuição sindical patronal: {}", contribSindicalMatcher.group(1));
                }
            }

            // Pattern para outras contribuições (RAT/FAP, Terceiros, etc.)
            Pattern outrasContribPattern = Pattern.compile("<outrasContrib>([^<]+)</outrasContrib>");
            Matcher outrasContribMatcher = outrasContribPattern.matcher(xml);
            while (outrasContribMatcher.find()) {
                String valor = outrasContribMatcher.group(1).replaceAll("\\.", "").replace(",", ".");
                try {
                    totalOutrasContribuicoes = totalOutrasContribuicoes.add(new BigDecimal(valor));
                } catch (NumberFormatException e) {
                    LOGGER.warn("Erro ao parsear outras contribuições: {}", outrasContribMatcher.group(1));
                }
            }

            // Somar também contribuições específicas se existirem
            Pattern ratFapPattern = Pattern.compile("<valorRatFap>([^<]+)</valorRatFap>");
            Matcher ratFapMatcher = ratFapPattern.matcher(xml);
            while (ratFapMatcher.find()) {
                String valor = ratFapMatcher.group(1).replaceAll("\\.", "").replace(",", ".");
                try {
                    totalOutrasContribuicoes = totalOutrasContribuicoes.add(new BigDecimal(valor));
                } catch (NumberFormatException e) {
                    LOGGER.warn("Erro ao parsear RAT/FAP: {}", ratFapMatcher.group(1));
                }
            }

            apuracao.setTotalContribSindicalPatronal(totalContribSindicalPatronal);
            apuracao.setTotalOutrasContribuicoes(totalOutrasContribuicoes);

        } catch (Exception e) {
            LOGGER.error("Erro no parser S-5020: {}", e.getMessage(), e);
        }
    }

    /**
     * Extrai o conteúdo de uma tag XML específica
     */
    private String extractTagContent(String xml, String tagName) {
        String regex = "<" + Pattern.quote(tagName) + ">([^<]+)</" + Pattern.quote(tagName) + ">";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(xml);
        return matcher.find() ? matcher.group(1) : null;
    }

    /**
     * Método utilitário para obter totais consolidados por competência
     * Usado pelo DashboardServico para popular os valores reais
     */
    public List<ApuracaoEsocial> buscarPorCompetencia(LocalDate competenciaInicio, LocalDate competenciaFim) {
        return apuracaoRepository.findByCompetenciaBetweenOrderByCompetenciaDesc(competenciaInicio, competenciaFim);
    }
}
