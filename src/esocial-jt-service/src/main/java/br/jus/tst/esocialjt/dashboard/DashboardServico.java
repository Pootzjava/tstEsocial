package br.jus.tst.esocialjt.dashboard;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.Lote;
import br.jus.tst.esocialjt.evento.ApuracaoEsocialRepository;
import br.jus.tst.esocialjt.certificado.negocio.CertificadoDinamicoService;
import br.jus.tst.esocialjt.negocio.ConsultaEvento;
import br.jus.tst.esocialjt.negocio.EventoServico;
import br.jus.tst.esocialjt.ret.eventos50xx.RetornoApuracaoDTO;
import br.jus.tst.esocialjt.tenant.TenantContext;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Serviço Premium para geração de estatísticas de dashboard multi-tenant.
 * Todas as consultas são filtradas automaticamente pelo tenant ativo no contexto.
 */
@Service
@Slf4j
public class DashboardServico {

    @Autowired
    private EventoServico eventoServico;

    @Autowired
    private CertificadoDinamicoService certificadoService;

    @Autowired
    private ApuracaoEsocialRepository apuracaoRepository;

    @PersistenceContext
    private EntityManager entityManager;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    /**
     * Gera estatísticas completas do dashboard para o tenant atual.
     * Método thread-safe e isolado por tenant via TenantContext.
     * 
     * @return DashboardEstatisticasDTO com todos os indicadores
     */
    @Transactional(readOnly = true)
    @Cacheable(value = "dashboard-estatisticas", key = "#root.target.tenantId", unless = "#result == null")
    public DashboardEstatisticasDTO gerarEstatisticas() {
        String tenantId = TenantContext.getTenantIdStatic();
        
        if (tenantId == null) {
            log.warn("Tentativa de acessar dashboard sem tenant definido");
            throw new IllegalStateException("Tenant não identificado. Informe o header X-Tenant-ID na requisição.");
        }

        log.info("Gerando dashboard para tenant: {}", tenantId);

        DashboardEstatisticasDTO dto = DashboardEstatisticasDTO.builder()
                .tenantId(tenantId)
                .dataHoraGeracao(LocalDateTime.now().format(FORMATTER))
                .build();

        // Carrega estatísticas de eventos
        carregarEstatisticasEventos(dto);

        // Carrega estatísticas de lotes
        carregarEstatisticasLotes(dto);

        // Carrega informações de certificados
        carregarInformacoesCertificado(dto);

        // Carrega dados de apuração S-50XX
        carregarDadosApuracao(dto);

        // Calcula indicadores de saúde
        calcularIndicadoresSaude(dto);

        return dto;
    }

    /**
     * Carrega todas as estatísticas de eventos do tenant.
     * As consultas usam implicitamente o schema do tenant via TenantContext.
     */
    private void carregarEstatisticasEventos(DashboardEstatisticasDTO dto) {
        // Total geral
        Long totalEventos = contarEventosSemFiltros();
        dto.setTotalEventos(totalEventos);

        // Por estado
        dto.setTotalEventosEmFila(contarEventosPorEstado(Estado.EM_FILA.getId()));
        dto.setTotalEventosEmProcessamento(contarEventosPorEstado(Estado.PROCESSAMENTO.getId()));
        dto.setTotalEventosSucesso(contarEventosPorEstado(Estado.PROCESSADO_COM_SUCESSO.getId()));
        dto.setTotalEventosErro(contarEventosPorEstado(Estado.ERRO.getId()));
        dto.setTotalEventosProcessadoComErro(contarEventosPorEstado(Estado.PROCESSADO_COM_ERRO.getId()));

        // Por grupo de evento
        dto.setTotalEventosTabela(contarEventosPorGrupo(1L));
        dto.setTotalEventosNaoPeriodico(contarEventosPorGrupo(2L));
        dto.setTotalEventosPeriodico(contarEventosPorGrupo(3L));

        // Por tipo de evento (principais)
        dto.setTotalEvento1000(contarEventosPorTipo(1000L));
        dto.setTotalEvento1010(contarEventosPorTipo(1010L));
        dto.setTotalEvento2200(contarEventosPorTipo(2200L));
        dto.setTotalEvento2300(contarEventosPorTipo(2300L));
        dto.setTotalEvento2400(contarEventosPorTipo(2400L));
        dto.setTotalEvento2500(contarEventosPorTipo(2500L));
        dto.setTotalEventoS5000(contarEventosPorTipo(5000L));
        dto.setTotalEventoS5010(contarEventosPorTipo(5010L));
        dto.setTotalEventoS5020(contarEventosPorTipo(5020L));
    }

    /**
     * Carrega estatísticas de lotes do tenant.
     */
    private void carregarEstatisticasLotes(DashboardEstatisticasDTO dto) {
        String jpql = "SELECT COUNT(l) FROM Lote l";
        Long totalLotes = (Long) entityManager.createQuery(jpql).getSingleResult();
        dto.setTotalLotes(totalLotes);

        jpql = "SELECT COUNT(l) FROM Lote l WHERE l.estado.id = :estado";
        
        // Lotes em processamento
        List<Long> emProcessamento = entityManager.createQuery(jpql, Long.class)
                .setParameter("estado", Estado.PROCESSAMENTO.getId())
                .getResultList();
        dto.setTotalLotesEmProcessamento(emProcessamento.isEmpty() ? 0L : emProcessamento.get(0));

        // Lotes com sucesso
        List<Long> sucesso = entityManager.createQuery(jpql, Long.class)
                .setParameter("estado", Estado.PROCESSADO_COM_SUCESSO.getId())
                .getResultList();
        dto.setTotalLotesSucesso(sucesso.isEmpty() ? 0L : sucesso.get(0));

        // Lotes com erro
        List<Long> erro = entityManager.createQuery(jpql, Long.class)
                .setParameter("estado", Estado.PROCESSADO_COM_ERRO.getId())
                .getResultList();
        dto.setTotalLotesErro(erro.isEmpty() ? 0L : erro.get(0));
    }

    /**
     * Carrega informações do certificado digital do tenant.
     */
    private void carregarInformacoesCertificado(DashboardEstatisticasDTO dto) {
        try {
            String tenantId = TenantContext.getTenantIdStatic();
            boolean existeCertificado = certificadoService.possuiCertificadoAtivo(tenantId);
            dto.setCertificadoAtivo(existeCertificado);

            if (existeCertificado) {
                var certInfo = certificadoService.getCertificadoInfo();
                if (certInfo != null) {
                    dto.setNumeroSerieCertificado(certInfo.getNumeroSerie());
                    
                    LocalDate dataVencimento = certInfo.getDataValidade() != null ? 
                        certInfo.getDataValidade().toLocalDate() : null;
                    if (dataVencimento != null) {
                        int diasParaVencimento = (int) java.time.temporal.ChronoUnit.DAYS.between(
                                LocalDate.now(), dataVencimento);
                        dto.setDiasParaVencimentoCertificado(diasParaVencimento);
                    }
                }
            }
        } catch (Exception e) {
            log.warn("Não foi possível recuperar informações do certificado: {}", e.getMessage());
            dto.setCertificadoAtivo(false);
        }
    }

    /**
     * Carrega dados consolidados de apuração S-50XX.
     * Busca informações reais de FGTS, IRRF e Contribuição Previdenciária
     * a partir dos eventos de retorno S-5010 e S-5020 processados.
     */
    private void carregarDadosApuracao(DashboardEstatisticasDTO dto) {
        String tenantId = TenantContext.getTenantIdStatic();
        
        try {
            // Conta retornos S-5010 processados com sucesso
            String jpqlS5010 = "SELECT COUNT(e) FROM Evento e " +
                              "WHERE e.tipoEvento.id = :tipo " +
                              "AND e.estado.id = :estado";
            
            Long totalS5010 = (Long) entityManager.createQuery(jpqlS5010)
                    .setParameter("tipo", 5010L)
                    .setParameter("estado", Estado.PROCESSADO_COM_SUCESSO.getId())
                    .getSingleResult();
            
            dto.setTotalRetornosS5010(totalS5010);
            
            // Conta retornos S-5020 processados com sucesso
            Long totalS5020 = (Long) entityManager.createQuery(jpqlS5010)
                    .setParameter("tipo", 5020L)
                    .setParameter("estado", Estado.PROCESSADO_COM_SUCESSO.getId())
                    .getSingleResult();
            
            dto.setTotalRetornosS5020(totalS5020);
            
            // Busca valores totais das apurações (se houver tabela de apuração)
            // Em implementação futura, buscar da tabela de apuração consolidada
            // Por enquanto, calcula baseado nos últimos eventos processados
            
            Double[] totais = calcularTotaisApuracao();
            dto.setValorTotalFGTS(totais[0]);
            dto.setValorTotalIRRF(totais[1]);
            dto.setValorTotalContribuicaoPrevidenciaria(totais[2]);
            
            log.info("Dados de apuração carregados para tenant {}: S5010={}, S5020={}, FGTS={}", 
                     tenantId, totalS5010, totalS5020, totais[0]);
            
        } catch (Exception e) {
            log.warn("Não foi possível recuperar dados de apuração S-50XX para tenant {}: {}", 
                     tenantId, e.getMessage());
            dto.setTotalRetornosS5010(0L);
            dto.setTotalRetornosS5020(0L);
            dto.setValorTotalFGTS(0.0);
            dto.setValorTotalIRRF(0.0);
            dto.setValorTotalContribuicaoPrevidenciaria(0.0);
        }
    }
    
    /**
     * Calcula totais de apuração a partir dos eventos processados.
     * Busca valores reais da tabela de apurações consolidadas.
     * @return Array [totalFGTS, totalIRRF, totalContribuicaoPrevidenciaria]
     */
    private Double[] calcularTotaisApuracao() {
        try {
            // Define período dos últimos 12 meses
            LocalDate hoje = LocalDate.now();
            LocalDate inicioPeriodo = hoje.minusMonths(12);
            
            // Busca totais consolidados do banco de dados
            List<Object[]> resultados = apuracaoRepository.buscarTotaisPorCompetencia(inicioPeriodo, hoje);
            
            BigDecimal totalFGTS = BigDecimal.ZERO;
            BigDecimal totalIRRF = BigDecimal.ZERO;
            BigDecimal totalContribPrev = BigDecimal.ZERO;
            
            for (Object[] resultado : resultados) {
                //resultado[0] = competencia
                BigDecimal baseFgts = (BigDecimal) resultado[1];
                BigDecimal fgtsMensal = (BigDecimal) resultado[2];
                BigDecimal irrf = (BigDecimal) resultado[4];
                BigDecimal contribPrevPatronal = (BigDecimal) resultado[6];
                
                if (baseFgts != null) {
                    totalFGTS = totalFGTS.add(baseFgts);
                }
                if (fgtsMensal != null) {
                    totalFGTS = totalFGTS.add(fgtsMensal);
                }
                if (irrf != null) {
                    totalIRRF = totalIRRF.add(irrf);
                }
                if (contribPrevPatronal != null) {
                    totalContribPrev = totalContribPrev.add(contribPrevPatronal);
                }
            }
            
            log.info("Totais de apuração calculados: FGTS={}, IRRF={}, ContribPrev={}", 
                     totalFGTS, totalIRRF, totalContribPrev);
            
            return new Double[]{
                totalFGTS.doubleValue(),
                totalIRRF.doubleValue(),
                totalContribPrev.doubleValue()
            };
            
        } catch (Exception e) {
            log.error("Erro ao calcular totais de apuração: {}", e.getMessage(), e);
            return new Double[]{0.0, 0.0, 0.0};
        }
    }

    /**
     * Gera histórico mensal de apurações para gráficos de evolução.
     * @param dataInicio Data inicial do período
     * @param dataFim Data final do período
     * @return DashboardHistoricoApuracaoDTO com série histórica
     */
    public DashboardHistoricoApuracaoDTO gerarHistoricoApuracao(LocalDate dataInicio, LocalDate dataFim) {
        String tenantId = TenantContext.getTenantIdStatic();
        
        log.info("Gerando histórico de apuração para tenant {} no período {} a {}", 
                 tenantId, dataInicio, dataFim);
        
        try {
            // Busca dados reais do banco
            List<Object[]> resultados = apuracaoRepository.buscarTotaisPorCompetencia(dataInicio, dataFim);
            
            BigDecimal totalGeralFGTS = BigDecimal.ZERO;
            BigDecimal totalGeralIRRF = BigDecimal.ZERO;
            BigDecimal totalGeralContribPrev = BigDecimal.ZERO;
            
            List<DashboardHistoricoApuracaoDTO.HistoricoMensalDTO> historicoMensal = new java.util.ArrayList<>();
            
            for (Object[] resultado : resultados) {
                LocalDate competencia = (LocalDate) resultado[0];
                BigDecimal baseFgts = (BigDecimal) resultado[1];
                BigDecimal fgtsMensal = (BigDecimal) resultado[2];
                BigDecimal baseIrrf = (BigDecimal) resultado[3];
                BigDecimal irrf = (BigDecimal) resultado[4];
                BigDecimal baseContribPrev = (BigDecimal) resultado[5];
                BigDecimal contribPrevPatronal = (BigDecimal) resultado[6];
                
                BigDecimal fgtsTotal = (baseFgts != null ? baseFgts : BigDecimal.ZERO)
                                     .add(fgtsMensal != null ? fgtsMensal : BigDecimal.ZERO);
                
                totalGeralFGTS = totalGeralFGTS.add(fgtsTotal);
                totalGeralIRRF = totalGeralIRRF.add(irrf != null ? irrf : BigDecimal.ZERO);
                totalGeralContribPrev = totalGeralContribPrev.add(contribPrevPatronal != null ? contribPrevPatronal : BigDecimal.ZERO);
                
                historicoMensal.add(DashboardHistoricoApuracaoDTO.HistoricoMensalDTO.builder()
                    .competencia(competencia.toString())
                    .valorFGTS(fgtsTotal.doubleValue())
                    .valorIRRF(irrf != null ? irrf.doubleValue() : 0.0)
                    .valorContribuicaoPrevidenciaria(contribPrevPatronal != null ? contribPrevPatronal.doubleValue() : 0.0)
                    .build());
            }
            
            return DashboardHistoricoApuracaoDTO.builder()
                    .tenantId(tenantId)
                    .historicoMensal(historicoMensal)
                    .totalGeralFGTS(totalGeralFGTS.doubleValue())
                    .totalGeralIRRF(totalGeralIRRF.doubleValue())
                    .totalGeralContribuicaoPrevidenciaria(totalGeralContribPrev.doubleValue())
                    .quantidadeMesesAnalisados(historicoMensal.size())
                    .periodoInicio(dataInicio != null ? dataInicio.toString() : "N/A")
                    .periodoFim(dataFim != null ? dataFim.toString() : "N/A")
                    .build();
                    
        } catch (Exception e) {
            log.error("Erro ao gerar histórico de apuração: {}", e.getMessage(), e);
            return DashboardHistoricoApuracaoDTO.builder()
                    .tenantId(tenantId)
                    .historicoMensal(List.of())
                    .totalGeralFGTS(0.0)
                    .totalGeralIRRF(0.0)
                    .totalGeralContribuicaoPrevidenciaria(0.0)
                    .quantidadeMesesAnalisados(0)
                    .periodoInicio(dataInicio != null ? dataInicio.toString() : "N/A")
                    .periodoFim(dataFim != null ? dataFim.toString() : "N/A")
                    .build();
        }
    }

    /**
     * Gera ranking das maiores apurações por competência.
     * @return Lista de rankings ordenada por valor
     */
    public List<DashboardHistoricoApuracaoDTO.HistoricoMensalDTO> gerarRankingApuracoes() {
        String tenantId = TenantContext.getTenantIdStatic();
        
        log.info("Gerando ranking de apurações para tenant {}", tenantId);
        
        try {
            // Define período dos últimos 12 meses
            LocalDate hoje = LocalDate.now();
            LocalDate inicioPeriodo = hoje.minusMonths(12);
            
            // Busca top 10 do banco usando query nativa otimizada
            List<Object[]> resultados = apuracaoRepository.buscarRankingApuracoes(inicioPeriodo, hoje);
            
            List<DashboardHistoricoApuracaoDTO.HistoricoMensalDTO> ranking = new java.util.ArrayList<>();
            
            for (Object[] resultado : resultados) {
                LocalDate competencia = (LocalDate) resultado[0];
                BigDecimal valorTotal = (BigDecimal) resultado[2];
                
                ranking.add(DashboardHistoricoApuracaoDTO.HistoricoMensalDTO.builder()
                    .competencia(competencia.toString())
                    .valorFGTS(valorTotal != null ? valorTotal.doubleValue() : 0.0)
                    .build());
            }
            
            return ranking;
            
        } catch (Exception e) {
            log.error("Erro ao gerar ranking de apurações: {}", e.getMessage(), e);
            return List.of();
        }
    }

    /**
     * Calcula indicadores de saúde do sistema baseado nas estatísticas.
     */
    private void calcularIndicadoresSaude(DashboardEstatisticasDTO dto) {
        Long total = dto.getTotalEventos();
        
        if (total == null || total == 0) {
            dto.setPercentualSucesso(0.0);
            dto.setPercentualErro(0.0);
            dto.setStatusSaude("SEM_DADOS");
            return;
        }

        Long sucesso = dto.getTotalEventosSucesso() != null ? dto.getTotalEventosSucesso() : 0L;
        Long erro = dto.getTotalEventosErro() != null ? dto.getTotalEventosErro() : 0L;
        Long procErro = dto.getTotalEventosProcessadoComErro() != null ? dto.getTotalEventosProcessadoComErro() : 0L;

        double percentualSucesso = (sucesso.doubleValue() / total.doubleValue()) * 100;
        double percentualErro = ((erro.doubleValue() + procErro.doubleValue()) / total.doubleValue()) * 100;

        dto.setPercentualSucesso(Math.round(percentualSucesso * 100.0) / 100.0);
        dto.setPercentualErro(Math.round(percentualErro * 100.0) / 100.0);

        // Define status de saúde
        if (percentualSucesso >= 95) {
            dto.setStatusSaude("SAUDAVEL");
        } else if (percentualSucesso >= 80) {
            dto.setStatusSaude("ATENCAO");
        } else {
            dto.setStatusSaude("CRITICO");
        }
    }

    // ==================== MÉTODOS AUXILIARES DE CONSULTA ====================

    private Long contarEventosSemFiltros() {
        String jpql = "SELECT COUNT(e) FROM Evento e";
        return (Long) entityManager.createQuery(jpql).getSingleResult();
    }

    private Long contarEventosPorEstado(Long codigoEstado) {
        String jpql = "SELECT COUNT(e) FROM Evento e WHERE e.estado.codigo = :estado";
        return (Long) entityManager.createQuery(jpql)
                .setParameter("estado", codigoEstado)
                .getSingleResult();
    }

    private Long contarEventosPorGrupo(Long codigoGrupo) {
        String jpql = "SELECT COUNT(e) FROM Evento e WHERE e.tipoEvento.grupoTipoEvento.id = :grupo";
        return (Long) entityManager.createQuery(jpql)
                .setParameter("grupo", codigoGrupo)
                .getSingleResult();
    }

    private Long contarEventosPorTipo(Long codigoTipo) {
        String jpql = "SELECT COUNT(e) FROM Evento e WHERE e.tipoEvento.id = :tipo";
        return (Long) entityManager.createQuery(jpql)
                .setParameter("tipo", codigoTipo)
                .getSingleResult();
    }
}
