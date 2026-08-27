package br.jus.tst.esocialjt.regras;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DroolsEngineService {

    private final KieContainer kieContainer;

    public DroolsEngineService() {
        this.kieContainer = KieServices.Factory.get().getKieClasspathContainer();
    }

    /**
     * Executa regras de prioridade para uma lista de eventos
     */
    public List<EventoPrioritarioDTO> calcularPrioridades(List<EventoParaEnvioDTO> eventos) {
        List<EventoPrioritarioDTO> resultados = new ArrayList<>();
        
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
        
        try {
            for (EventoParaEnvioDTO evento : eventos) {
                EventoPrioritarioDTO resultado = new EventoPrioritarioDTO();
                resultado.setIdEvento(evento.getIdEvento());
                resultado.setTipoEvento(evento.getTipoEvento());
                resultado.setPrioridade(5); // Prioridade padrão (baixa)
                resultado.setJustificativa("Prioridade padrão");
                
                kieSession.insert(evento);
                kieSession.insert(resultado);
                
                kieSession.fireAllRules();
                
                resultados.add(resultado);
            }
        } finally {
            kieSession.dispose();
        }
        
        return resultados;
    }

    /**
     * Executa regras de validação de folha de pagamento
     */
    public List<ValidacaoErroDTO> validarFolhaPagamento(DadosFolhaDTO dadosFolha) {
        List<ValidacaoErroDTO> erros = new ArrayList<>();
        
        KieSession kieSession = kieContainer.newKieSession("validationSession");
        
        try {
            ValidacaoContexto contexto = new ValidacaoContexto();
            contexto.setDadosFolha(dadosFolha);
            contexto.setErros(erros);
            
            kieSession.insert(contexto);
            kieSession.insert(dadosFolha);
            
            kieSession.fireAllRules();
        } finally {
            kieSession.dispose();
        }
        
        return erros;
    }
}
