package br.jus.tst.esocialjt.webhook;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class WebhookService {

    @Autowired
    private WebhookRepository webhookRepository;

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Dispara webhook para todos os webhooks cadastrados que监听am o evento especificado.
     */
    public void dispararWebhook(String tenantId, String tipoEvento, Map<String, Object> payload) {
        List<Webhook> webhooks = webhookRepository.findByTenantIdAndEventosContainingAndAtivoTrue(tenantId, tipoEvento);
        
        for (Webhook webhook : webhooks) {
            try {
                enviarWebhook(webhook, tipoEvento, payload);
            } catch (Exception e) {
                // Log do erro e atualização do histórico de tentativas
                atualizarTentativa(webhook, false, e.getMessage());
            }
        }
    }

    private void enviarWebhook(Webhook webhook, String tipoEvento, Map<String, Object> dados) throws Exception {
        String url = webhook.getUrl();
        String secretKey = webhook.getSecretKey();

        // Monta payload padrão
        Map<String, Object> payload = new HashMap<>();
        payload.put("evento", tipoEvento);
        payload.put("timestamp", LocalDateTime.now().toString());
        payload.put("tenantId", webhook.getTenantId());
        payload.put("dados", dados);

        String jsonPayload = objectMapper.writeValueAsString(payload);
        String assinatura = gerarAssinaturaHMAC(jsonPayload, secretKey);

        // Headers com assinatura
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-Webhook-Signature", assinatura);
        headers.set("X-Webhook-Event", tipoEvento);
        headers.set("X-Webhook-Timestamp", payload.get("timestamp").toString());

        HttpEntity<String> entity = new HttpEntity<>(jsonPayload, headers);

        // Envia POST
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            atualizarTentativa(webhook, true, "Sucesso: " + response.getStatusCode());
        } else {
            atualizarTentativa(webhook, false, "Erro HTTP: " + response.getStatusCode());
        }
    }

    private String gerarAssinaturaHMAC(String payload, String secretKey) throws Exception {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
        sha256_HMAC.init(secret_key);
        byte[] hash = sha256_HMAC.doFinal(payload.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hash);
    }

    private void atualizarTentativa(Webhook webhook, boolean sucesso, String mensagem) {
        // Implementação simplificada - em produção salvaria no banco
        System.out.println("Webhook " + webhook.getId() + " - " + (sucesso ? "SUCESSO" : "ERRO") + ": " + mensagem);
    }

    public List<Webhook> listarWebhooks(String tenantId) {
        return webhookRepository.findByTenantIdAndAtivoTrue(tenantId);
    }

    public Webhook criarWebhook(Webhook webhook) {
        webhook.setDataCriacao(LocalDateTime.now());
        webhook.setDataAtualizacao(LocalDateTime.now());
        // Gera chave secreta aleatória se não fornecida
        if (webhook.getSecretKey() == null || webhook.getSecretKey().isEmpty()) {
            webhook.setSecretKey(UUID.randomUUID().toString());
        }
        return webhookRepository.save(webhook);
    }

    public Webhook atualizarWebhook(Long id, Webhook webhookAtualizado) {
        Webhook webhook = webhookRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Webhook não encontrado"));
        
        webhook.setUrl(webhookAtualizado.getUrl());
        webhook.setDescricao(webhookAtualizado.getDescricao());
        webhook.setEventos(webhookAtualizado.getEventos());
        webhook.setAtivo(webhookAtualizado.getAtivo());
        webhook.setDataAtualizacao(LocalDateTime.now());
        
        return webhookRepository.save(webhook);
    }

    public void deletarWebhook(Long id) {
        webhookRepository.deleteById(id);
    }
}
