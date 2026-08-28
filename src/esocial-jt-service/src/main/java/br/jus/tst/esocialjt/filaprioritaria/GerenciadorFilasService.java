package br.jus.tst.esocialjt.filaprioritaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Gerenciador de filas com backoff exponencial e retry automático.
 * 
 * Funcionalidades:
 * - Processa eventos por ordem de prioridade
 * - Implementa backoff exponencial para retries
 * - Reavalia prioridades periodicamente
 * - Move eventos com erro permanente para fila de quarentena
 */
@Service
@Slf4j
public class GerenciadorFilasService {

    @Autowired
    private RegrasPrioridadeService regrasPrioridadeService;

    /**
     * Lista simulada de eventos na fila (em produção, viria do banco/Redis/RabbitMQ)
     */
    private List<EventoFilaDTO> filaEventos;

    public GerenciadorFilasService() {
        this.filaEventos = new java.util.ArrayList<>();
    }

    /**
     * Adiciona um evento à fila com prioridade calculada automaticamente
     */
    @Transactional
    public EventoFilaDTO adicionarEvento(EventoFilaDTO evento) {
        evento.setDataCriacao(LocalDateTime.now());
        evento.setEstado(EventoFilaDTO.EstadoFila.AGUARDANDO);
        evento.setTentativasProcessamento(0);
        
        // Calcular prioridade inicial baseada nas regras
        PrioridadeEvento prioridade = regrasPrioridadeService.avaliarPrioridade(evento);
        evento.setPrioridade(prioridade);
        
        filaEventos.add(evento);
        
        log.info("✅ Evento {} adicionado à fila com prioridade {}", 
                 evento.getTipoEvento(), prioridade.getDescricao());
        
        return evento;
    }

    /**
     * Obtém próximo evento elegível para processamento (ordenado por prioridade)
     */
    public EventoFilaDTO obterProximoEvento() {
        // Filtrar eventos elegíveis
        List<EventoFilaDTO> elegiveis = filaEventos.stream()
            .filter(e -> e.getEstado() == EventoFilaDTO.EstadoFila.AGUARDANDO ||
                        (e.getEstado() == EventoFilaDTO.EstadoFila.AGUARDANDO_RETRY && 
                         e.isElegivelParaRetry()))
            .sorted((e1, e2) -> Integer.compare(
                e1.getPrioridade().getNivel(),
                e2.getPrioridade().getNivel()
            ))
            .collect(Collectors.toList());

        if (elegiveis.isEmpty()) {
            return null;
        }

        EventoFilaDTO proximo = elegiveis.get(0);
        proximo.setEstado(EventoFilaDTO.EstadoFila.PROCESSANDO);
        
        log.debug("📤 Evento {} selecionado para processamento (prioridade: {})", 
                  proximo.getTipoEvento(), proximo.getPrioridade().getDescricao());
        
        return proximo;
    }

    /**
     * Marca evento como processado com sucesso
     */
    @Transactional
    public void marcarSucesso(EventoFilaDTO evento) {
        evento.setEstado(EventoFilaDTO.EstadoFila.SUCESSO);
        log.info("✅ Evento {} processado com sucesso", evento.getTipoEvento());
    }

    /**
     * Trata falha no processamento com backoff exponencial
     */
    @Transactional
    public void tratarFalha(EventoFilaDTO evento, String motivoErro) {
        int tentativas = evento.getTentativasProcessamento() + 1;
        evento.setTentativasProcessamento(tentativas);
        evento.setMotivoErro(motivoErro);
        evento.setUltimaTentativa(LocalDateTime.now());
        
        long backoffSegundos = evento.calcularBackoffSegundos();
        LocalDateTime proximaTentativa = LocalDateTime.now().plusSeconds(backoffSegundos);
        evento.setProximaTentativa(proximaTentativa);
        
        // Reavaliar prioridade após falha
        PrioridadeEvento novaPrioridade = regrasPrioridadeService.avaliarPrioridade(evento);
        evento.setPrioridade(novaPrioridade);
        
        if (tentativas >= 10) {
            // Erro permanente após 10 tentativas
            evento.setEstado(EventoFilaDTO.EstadoFila.ERRO_PERMANENTE);
            log.error("❌ Evento {} movido para erro permanente após {} tentativas. Erro: {}", 
                     evento.getTipoEvento(), tentativas, motivoErro);
        } else {
            evento.setEstado(EventoFilaDTO.EstadoFila.AGUARDANDO_RETRY);
            log.warn("⚠️ Evento {} falhou (tentativa {}/{}). Próxima tentativa em {} segundos", 
                    evento.getTipoEvento(), tentativas, 10, backoffSegundos);
        }
    }

    /**
     * Task agendada para reavaliar prioridades da fila a cada 5 minutos
     */
    @Scheduled(fixedRate = 300000) // 5 minutos
    @Transactional
    public void reavaliarPrioridadesPeriodico() {
        log.debug("🔄 Reavaliando prioridades da fila...");
        
        List<EventoFilaDTO> eventosAtualizados = 
            regrasPrioridadeService.reavaliarPrioridades(filaEventos);
        
        int atualizacoes = (int) eventosAtualizados.stream()
            .filter(e -> e.getEstado() == EventoFilaDTO.EstadoFila.AGUARDANDO ||
                        e.getEstado() == EventoFilaDTO.EstadoFila.AGUARDANDO_RETRY)
            .count();
        
        if (atualizacoes > 0) {
            log.info("📊 Prioridades reavaliadas: {} eventos na fila", atualizacoes);
        }
    }

    /**
     * Task agendada para mover eventos de retry para aguardando quando elegíveis
     */
    @Scheduled(fixedRate = 60000) // 1 minuto
    @Transactional
    public void processarRetriesElegiveis() {
        List<EventoFilaDTO> retriesElegiveis = filaEventos.stream()
            .filter(EventoFilaDTO::isElegivelParaRetry)
            .collect(Collectors.toList());
        
        for (EventoFilaDTO evento : retriesElegiveis) {
            evento.setEstado(EventoFilaDTO.EstadoFila.AGUARDANDO);
            log.debug("🔄 Evento {} movido de RETRY para AGUARDANDO", evento.getTipoEvento());
        }
        
        if (!retriesElegiveis.isEmpty()) {
            log.info("♻️ {} eventos movidos para retry", retriesElegiveis.size());
        }
    }

    /**
     * Retorna estatísticas da fila
     */
    public EstatisticasFilaDTO getEstatisticas() {
        long aguardando = filaEventos.stream()
            .filter(e -> e.getEstado() == EventoFilaDTO.EstadoFila.AGUARDANDO)
            .count();
            
        long processando = filaEventos.stream()
            .filter(e -> e.getEstado() == EventoFilaDTO.EstadoFila.PROCESSANDO)
            .count();
            
        long retry = filaEventos.stream()
            .filter(e -> e.getEstado() == EventoFilaDTO.EstadoFila.AGUARDANDO_RETRY)
            .count();
            
        long erroPermanente = filaEventos.stream()
            .filter(e -> e.getEstado() == EventoFilaDTO.EstadoFila.ERRO_PERMANENTE)
            .count();
            
        long sucesso = filaEventos.stream()
            .filter(e -> e.getEstado() == EventoFilaDTO.EstadoFila.SUCESSO)
            .count();
        
        return EstatisticasFilaDTO.builder()
            .total(filaEventos.size())
            .aguardando(aguardando)
            .processando(processando)
            .aguardandoRetry(retry)
            .erroPermanente(erroPermanente)
            .sucesso(sucesso)
            .build();
    }

    /**
     * Limpa eventos finalizados (sucesso ou erro permanente) com mais de 24h
     */
    @Scheduled(fixedRate = 3600000) // 1 hora
    @Transactional
    public void limparEventosFinalizados() {
        LocalDateTime corte = LocalDateTime.now().minusHours(24);
        
        int removidos = filaEventos.removeIf(e -> 
            (e.getEstado() == EventoFilaDTO.EstadoFila.SUCESSO ||
             e.getEstado() == EventoFilaDTO.EstadoFila.ERRO_PERMANENTE) &&
            e.getUltimaTentativa() != null &&
            e.getUltimaTentativa().isBefore(corte)
        );
        
        if (removidos > 0) {
            log.info("🧹 {} eventos finalizados removidos da fila", removidos);
        }
    }
}
