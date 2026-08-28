package br.jus.tst.esocialjt.connector;

import br.jus.tst.esocialjt.connector.IntegracaoConfig.StatusIntegracao;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/connectors")
public class ConnectorController {

    @Autowired
    private IntegracaoConfigRepository repository;

    @Autowired
    private MapeamentoEngine mapeamentoEngine;

    private final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Lista todas as integrações cadastradas
     */
    @GetMapping
    public List<IntegracaoConfig> listarTodos() {
        return repository.findAll();
    }

    /**
     * Busca integrações por sistema de origem (ex: TOTVS, SAP)
     */
    @GetMapping("/origem/{sistema}")
    public List<IntegracaoConfig> buscarPorOrigem(@PathVariable String sistema) {
        return repository.findBySistemaOrigem(sistema);
    }

    /**
     * Cria nova configuração de integração
     */
    @PostMapping
    public IntegracaoConfig criar(@RequestBody IntegracaoConfig config) {
        config.setStatus(StatusIntegracao.ATIVO);
        config.setUltimaExecucao(null);
        return repository.save(config);
    }

    /**
     * Testa o mapeamento com um payload de exemplo
     */
    @PostMapping("/{id}/testar")
    public ResponseEntity<?> testarMapeamento(
            @PathVariable Long id,
            @RequestBody Map<String, Object> payloadExemplo) throws Exception {
        
        IntegracaoConfig config = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Configuração não encontrada"));

        String jsonPayload = objectMapper.writeValueAsString(payloadExemplo);
        
        try {
            Map<String, Object> resultado = mapeamentoEngine.executarMapeamento(
                jsonPayload, 
                config.getMapeamentoCampos(), 
                config.getTransformacoes()
            );
            
            return ResponseEntity.ok(Map.of(
                "sucesso", true,
                "dadosMapeados", resultado
            ));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of(
                "sucesso", false,
                "erro", e.getMessage()
            ));
        }
    }

    /**
     * Executa a integração real (disparo)
     */
    @PostMapping("/{id}/executar")
    public ResponseEntity<?> executarIntegracao(
            @PathVariable Long id,
            @RequestBody Map<String, Object> dadosOrigem) {
        
        IntegracaoConfig config = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Configuração não encontrada"));

        try {
            String jsonDados = objectMapper.writeValueAsString(dadosOrigem);
            
            // Executa mapeamento
            Map<String, Object> dadosMapeados = mapeamentoEngine.executarMapeamento(
                jsonDados,
                config.getMapeamentoCampos(),
                config.getTransformacoes()
            );

            // Aqui entraria a lógica de envio para o destino (ex: chamar API do eSocial)
            // Para este exemplo, apenas simulamos o sucesso
            
            config.setUltimaExecucao(LocalDateTime.now());
            config.setStatus(StatusIntegracao.ATIVO);
            repository.save(config);

            return ResponseEntity.ok(Map.of(
                "sucesso", true,
                "mensagem", "Integração executada com sucesso",
                "dadosProcessados", dadosMapeados
            ));

        } catch (Exception e) {
            config.setStatus(StatusIntegracao.ERRO);
            repository.save(config);
            
            return ResponseEntity.internalServerError().body(Map.of(
                "sucesso", false,
                "erro", e.getMessage()
            ));
        }
    }

    /**
     * Atualiza status da integração
     */
    @PatchMapping("/{id}/status")
    public IntegracaoConfig atualizarStatus(
            @PathVariable Long id,
            @RequestParam StatusIntegracao status) {
        
        IntegracaoConfig config = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Configuração não encontrada"));
        
        config.setStatus(status);
        return repository.save(config);
    }
}
