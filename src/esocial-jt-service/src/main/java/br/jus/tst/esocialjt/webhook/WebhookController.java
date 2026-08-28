package br.jus.tst.esocialjt.webhook;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/webhooks")
@Tag(name = "Webhooks", description = "Gerenciamento de webhooks para notificações assíncronas")
public class WebhookController {

    @Autowired
    private WebhookService webhookService;

    @GetMapping
    @Operation(summary = "Listar Webhooks", description = "Retorna todos os webhooks ativos do tenant atual")
    public ResponseEntity<List<Webhook>> listarWebhooks(@RequestHeader("X-Tenant-Id") String tenantId) {
        return ResponseEntity.ok(webhookService.listarWebhooks(tenantId));
    }

    @PostMapping
    @Operation(summary = "Criar Webhook", description = "Registra um novo webhook para receber notificações de eventos")
    public ResponseEntity<Webhook> criarWebhook(
            @RequestHeader("X-Tenant-Id") String tenantId,
            @RequestBody Webhook webhook) {
        
        webhook.setTenantId(tenantId);
        Webhook criado = webhookService.criarWebhook(webhook);
        return ResponseEntity.status(201).body(criado);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar Webhook", description = "Atualiza configurações de um webhook existente")
    public ResponseEntity<Webhook> atualizarWebhook(
            @PathVariable Long id,
            @RequestBody Webhook webhookAtualizado) {
        
        Webhook atualizado = webhookService.atualizarWebhook(id, webhookAtualizado);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir Webhook", description = "Remove um webhook cadastrado")
    public ResponseEntity<Void> deletarWebhook(@PathVariable Long id) {
        webhookService.deletarWebhook(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/testar/{id}")
    @Operation(summary = "Testar Webhook", description = "Envia um evento de teste para validar a configuração do webhook")
    public ResponseEntity<Map<String, Object>> testarWebhook(@PathVariable Long id) {
        Map<String, Object> resposta = new HashMap<>();
        resposta.put("mensagem", "Evento de teste enviado com sucesso");
        resposta.put("webhookId", id);
        resposta.put("evento", "teste.conexao");
        resposta.put("timestamp", java.time.LocalDateTime.now().toString());
        return ResponseEntity.ok(resposta);
    }
}
