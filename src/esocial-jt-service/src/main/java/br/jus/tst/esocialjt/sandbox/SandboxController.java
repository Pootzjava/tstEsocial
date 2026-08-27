package br.jus.tst.esocialjt.sandbox;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Controller para operações de Sandbox e geração de dados sintéticos.
 * Permite criar dados fictícios para testes, demonstrações e desenvolvimento.
 */
@RestController
@RequestMapping("/api/sandbox")
@Tag(name = "Sandbox", description = "Operações para geração de dados sintéticos e ambiente de testes")
public class SandboxController {

    @Autowired
    private SandboxDataGenerator dataGenerator;

    /**
     * Gera dados sintéticos completos (empresas, eventos, apurações).
     * Ideal para popular o ambiente de desenvolvimento rapidamente.
     * 
     * @return Resumo dos dados gerados
     */
    @PostMapping("/gerar-dados")
    @Operation(
        summary = "Gerar Dados Sintéticos",
        description = "Gera automaticamente empresas, eventos e apurações fictícias para testes.\n\n" +
                      "**Dados gerados:**\n" +
                      "- 5 empresas com CNPJs válidos\n" +
                      "- 50 eventos variados (S-1000, S-1005, S-1200, S-2200, etc.)\n" +
                      "- Apurações de competência variada\n" +
                      "- Logs de auditoria simulados\n\n" +
                      "**Importante:** Esta operação só funciona em ambientes de desenvolvimento/homologação."
    )
    public ResponseEntity<Map<String, Object>> gerarDadosSinteticos() {
        try {
            Map<String, Object> resumo = dataGenerator.gerarDadosSinteticos();
            return ResponseEntity.ok(resumo);
        } catch (IllegalStateException e) {
            return ResponseEntity.badRequest().body(Map.of(
                "erro", e.getMessage(),
                "solucao", "Habilite o sandbox configurando: esocial.sandbox.enabled=true"
            ));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(Map.of(
                "erro", "Falha ao gerar dados sintéticos",
                "detalhe", e.getMessage()
            ));
        }
    }

    /**
     * Limpa todos os dados sintéticos gerados.
     * Útil para resetar o ambiente de testes.
     */
    @DeleteMapping("/limpar-dados")
    @Operation(
        summary = "Limpar Dados Sintéticos",
        description = "Remove todos os dados gerados pelo sandbox. Use com cuidado!"
    )
    public ResponseEntity<Map<String, String>> limparDadosSinteticos() {
        // Implementação futura: método para limpar dados
        return ResponseEntity.ok(Map.of(
            "mensagem", "Funcionalidade de limpeza será implementada na próxima versão",
            "status", "pendente"
        ));
    }

    /**
     * Retorna status atual do sandbox.
     */
    @GetMapping("/status")
    @Operation(summary = "Status do Sandbox", description = "Verifica se o sandbox está habilitado e configurações atuais")
    public ResponseEntity<Map<String, Object>> getStatusSandbox() {
        return ResponseEntity.ok(Map.of(
            "habilitado", dataGenerator.isEnabled(),
            "empresasConfiguradas", dataGenerator.getQtdEmpresas(),
            "eventosPorEmpresa", dataGenerator.getQtdEventosPorEmpresa(),
            "totalEventosEsperado", dataGenerator.getQtdEmpresas() * dataGenerator.getQtdEventosPorEmpresa()
        ));
    }
}
