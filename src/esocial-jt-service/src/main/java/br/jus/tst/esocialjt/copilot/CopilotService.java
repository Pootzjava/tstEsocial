package br.jus.tst.esocialjt.copilot;

import br.jus.tst.esocialjt.evento.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CopilotService {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private CopilotNlpService copilotNlpService;

    /**
     * Conta eventos com erro nas últimas 24 horas para um tenant.
     */
    public int contarErrosRecentes(String tenantId) {
        LocalDateTime vinteQuatroHorasAtras = LocalDateTime.now().minusHours(24);
        // Nota: Ajustar query conforme estrutura real do repository
        return (int) eventoRepository.countByEstadoAndDataProcessamentoAfter("ERRO", vinteQuatroHorasAtras);
    }

    /**
     * Endpoint principal de chat que recebe texto e retorna resposta processada por NLP.
     */
    public ChatMessageDTO conversar(CopilotRequestDTO request) {
        return copilotNlpService.processarMensagem(request.getMensagem(), request.getTenantId());
    }
}
