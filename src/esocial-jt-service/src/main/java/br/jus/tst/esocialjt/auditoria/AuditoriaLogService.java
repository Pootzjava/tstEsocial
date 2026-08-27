package br.jus.tst.esocialjt.auditoria;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class AuditoriaLogService {

    @Autowired
    private AuditoriaLogRepository repository;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ObjectMapper objectMapper;

    public AuditoriaLog registrarAcao(String usuario, AcaoAuditoria acao, String entidade, 
                                       String entidadeId, Object dadosAntigos, Object dadosNovos) {
        AuditoriaLog log = new AuditoriaLog();
        log.setUsuario(usuario);
        log.setAcao(acao);
        log.setEntidade(entidade);
        log.setEntidadeId(entidadeId);
        
        try {
            log.setDadosAntigos(dadosAntigos != null ? objectMapper.writeValueAsString(dadosAntigos) : null);
            log.setDadosNovos(dadosNovos != null ? objectMapper.writeValueAsString(dadosNovos) : null);
        } catch (JsonProcessingException e) {
            log.setDadosAntigos("{\"erro\": \"Falha ao serializar dados antigos\"}");
            log.setDadosNovos("{\"erro\": \"Falha ao serializar dados novos\"}");
        }

        log.setIpOrigem(getIpCliente());
        log.setUserAgent(getUserAgent());
        log.setTimestamp(LocalDateTime.now());
        log.setTenantId(getTenantId());

        return repository.save(log);
    }

    public List<AuditoriaLog> buscarLogs(String usuario, AcaoAuditoria acao, String entidade,
                                          LocalDateTime inicio, LocalDateTime fim, String tenantId) {
        return repository.filtrarLogs(usuario, acao, entidade, inicio, fim, tenantId);
    }

    public List<AuditoriaLog> buscarPorEntidade(String entidade, String entidadeId) {
        return repository.findByEntidadeAndEntidadeIdOrderByTimestampDesc(entidade, entidadeId);
    }

    public long contarAcoesNoPeriodo(LocalDateTime inicio, LocalDateTime fim) {
        return repository.countByTimestampBetween(inicio, fim);
    }

    @Scheduled(cron = "0 0 2 * * ?") // Todo dia às 2h
    public void arquivarLogsAntigos() {
        LocalDateTime cincoAnosAtras = LocalDateTime.now().minusYears(5);
        List<AuditoriaLog> logsAntigos = repository.findByTimestampBetweenOrderByTimestampDesc(
            LocalDateTime.of(2000, 1, 1, 0, 0), cincoAnosAtras);
        
        // Em produção: migrar para tabela de histórico ou sistema de arquivamento
        if (!logsAntigos.isEmpty()) {
            System.out.println("Arquivando " + logsAntigos.size() + " logs antigos...");
            // repository.deleteAll(logsAntigos); // Cuidado: apenas se tiver backup
        }
    }

    private String getIpCliente() {
        if (request == null) return "unknown";
        String xfwd = request.getHeader("X-Forwarded-For");
        if (xfwd != null && !xfwd.isEmpty()) {
            return xfwd.split(",")[0].trim();
        }
        return request.getRemoteAddr();
    }

    private String getUserAgent() {
        if (request == null) return "unknown";
        String ua = request.getHeader("User-Agent");
        return ua != null ? ua.substring(0, Math.min(ua.length(), 500)) : "unknown";
    }

    private String getTenantId() {
        if (request == null) return null;
        return request.getHeader("X-Tenant-ID");
    }
}
