package br.jus.tst.esocialjt.filaprioritaria;

import org.drools.core.base.RuleNamesEndsWith;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.stereotype.Service;
import org.springframework.core.io.ClassPathResource;

import jakarta.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
 * Serviço responsável por gerenciar as regras Drools para priorização de eventos.
 * 
 * Regras implementadas:
 * 1. Eventos com prazo < 24h → Prioridade CRÍTICA
 * 2. Eventos S-2200 (Admissão) e S-2299 (Demissão) → Prioridade ALTA
 * 3. Eventos de folha (S-1200, S-2300) → Prioridade MEDIA
 * 4. Eventos cadastrais (S-1000, S-1010, S-1020) → Prioridade BAIXA
 * 5. Eventos com múltiplos erros → Incrementar prioridade
 */
@Service
public class RegrasPrioridadeService {

    private KieContainer kieContainer;
    private KieBase kieBase;

    @PostConstruct
    public void init() {
        try {
            // Carregar regras do arquivo DRL
            ClassPathResource resource = new ClassPathResource("rules/prioridade-eventos.drl");
            
            KieServices kieServices = KieServices.Factory.get();
            KieFileSystem kfs = kieServices.newKieFileSystem();
            
            // Ler conteúdo do arquivo DRL
            String rulesContent = new String(resource.getInputStream().readAllBytes());
            kfs.write("src/main/resources/rules/prioridade-eventos.drl", 
                     kieServices.getResources().newByteArrayResource(rulesContent.getBytes()));
            
            KieBuilder kieBuilder = kieServices.newKieBuilder(kfs);
            kieBuilder.buildAll();
            
            kieContainer = kieServices.newKieContainer(kieBuilder.getKieModule().getReleaseId());
            kieBase = kieContainer.getKieBase();
            
            System.out.println("✅ Regras Drools carregadas com sucesso!");
            
        } catch (IOException e) {
            System.err.println("⚠️ Aviso: Arquivo de regras não encontrado. Usando regras padrão em código.");
            inicializarRegrasPadrao();
        }
    }

    /**
     * Inicializa regras padrão caso o arquivo DRL não esteja disponível
     */
    private void inicializarRegrasPadrao() {
        // Implementação fallback em Java puro
        kieBase = null; // Será usado o método avaliarPrioridadeManual
    }

    /**
     * Avalia a prioridade de um evento baseado nas regras de negócio
     * 
     * @param eventoFila DTO do evento na fila
     * @return Prioridade calculada
     */
    public PrioridadeEvento avaliarPrioridade(EventoFilaDTO eventoFila) {
        if (kieBase != null) {
            return avaliarComDrools(eventoFila);
        } else {
            return avaliarPrioridadeManual(eventoFila);
        }
    }

    /**
     * Executa regras Drools para determinar prioridade
     */
    private PrioridadeEvento avaliarComDrools(EventoFilaDTO eventoFila) {
        KieSession kieSession = kieBase.newKieSession();
        
        try {
            List<PrioridadeEvento> resultado = new ArrayList<>();
            kieSession.setGlobal("prioridadeResultado", resultado);
            kieSession.insert(eventoFila);
            kieSession.fireAllRules();
            
            if (!resultado.isEmpty()) {
                return resultado.get(0);
            }
            
            return PrioridadeEvento.MEDIA; // Default
            
        } finally {
            kieSession.dispose();
        }
    }

    /**
     * Implementação manual das regras de prioridade (fallback)
     */
    private PrioridadeEvento avaliarPrioridadeManual(EventoFilaDTO eventoFila) {
        String tipoEvento = eventoFila.getTipoEvento();
        int tentativas = eventoFila.getTentativasProcessamento();
        
        // Regra 1: Múltiplas falhas → Aumentar prioridade
        if (tentativas >= 5) {
            return PrioridadeEvento.CRITICA;
        }
        
        // Regra 2: Eventos críticos específicos
        if (isEventoCritico(tipoEvento)) {
            return PrioridadeEvento.CRITICA;
        }
        
        // Regra 3: Admissão/Demissão → Alta prioridade
        if ("S-2200".equals(tipoEvento) || "S-2299".equals(tipoEvento) || 
            "S-2300".equals(tipoEvento)) {
            return PrioridadeEvento.ALTA;
        }
        
        // Regra 4: Eventos de folha → Prioridade média
        if ("S-1200".equals(tipoEvento) || "S-1202".equals(tipoEvento) ||
            "S-1207".equals(tipoEvento) || "S-1280".equals(tipoEvento)) {
            return PrioridadeEvento.MEDIA;
        }
        
        // Regra 5: Eventos cadastrais → Baixa prioridade
        if ("S-1000".equals(tipoEvento) || "S-1010".equals(tipoEvento) ||
            "S-1020".equals(tipoEvento) || "S-1030".equals(tipoEvento)) {
            return PrioridadeEvento.BAIXA;
        }
        
        // Default
        return PrioridadeEvento.MEDIA;
    }

    /**
     * Verifica se é um evento crítico baseado no tipo ou contexto
     */
    private boolean isEventoCritico(String tipoEvento) {
        // Eventos de fechamento de folha com prazo vencendo
        // Eventos de exclusão que impactam obrigações
        // Pode ser expandido conforme necessidade
        return false;
    }

    /**
     * Reavalia a prioridade de uma lista de eventos
     */
    public List<EventoFilaDTO> reavaliarPrioridades(List<EventoFilaDTO> eventos) {
        for (EventoFilaDTO evento : eventos) {
            PrioridadeEvento novaPrioridade = avaliarPrioridade(evento);
            // Atualizar apenas se mudou
            if (novaPrioridade != evento.getPrioridade()) {
                evento.setPrioridade(novaPrioridade);
            }
        }
        
        // Ordenar por prioridade (mais crítico primeiro)
        eventos.sort((e1, e2) -> 
            Integer.compare(e1.getPrioridade().getNivel(), e2.getPrioridade().getNivel())
        );
        
        return eventos;
    }
}
