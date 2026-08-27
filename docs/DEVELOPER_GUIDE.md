# Guia do Desenvolvedor - eSocial-JT API Premium

## 🚀 Quick Start

### 1. Configuração do Ambiente

```bash
# Clonar repositório
git clone https://github.com/tst-esocial/esocial-jt.git
cd esocial-jt

# Configurar variáveis de ambiente
cp .env.example .env
# Edite .env com suas credenciais

# Subir serviços com Docker
docker-compose up -d
```

### 2. Acessar Documentação Interativa

- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **OpenAPI JSON**: http://localhost:8080/v3/api-docs

### 3. Gerar Dados Sintéticos (Sandbox)

```bash
curl -X POST http://localhost:8080/api/sandbox/gerar-dados \
  -H "X-Tenant-Id: meu-tenant" \
  -H "Authorization: Bearer SEU_TOKEN"
```

## 📚 SDK TypeScript

### Instalação

```bash
npm install @esocial-jt/sdk
```

### Uso Básico

```typescript
import { EventosService, WebhooksService } from '@esocial-jt/sdk';

// Configurar cliente
const eventos = new EventosService('http://localhost:8080', 'SEU_TOKEN');
const webhooks = new WebhooksService('http://localhost:8080', 'SEU_TOKEN');

// Listar eventos
const lista = await eventos.listarEventos({ pagina: 0, tamanho: 10 });

// Criar webhook
const webhook = await webhooks.criarWebhook({
  url: 'https://meu-app.com/webhook',
  eventos: ['evento.processado', 'lote.enviado'],
  ativo: true
});
```

## 🔔 Webhooks

### Eventos Disponíveis

| Evento | Descrição | Payload |
|--------|-----------|---------|
| `evento.processado` | Evento processado com sucesso | `{evento, id, tenantId, dataProcessamento}` |
| `lote.enviado` | Lote enviado ao eSocial | `{lote, qtdEventos, tenantId}` |
| `erro.validacao` | Erro na validação de folha | `{tipoErro, cpf, descricao, severidade}` |
| `apuracao.gerada` | Apuração de competência gerada | `{competencia, totais, tenantId}` |

### Exemplo de Payload

```json
{
  "evento": "evento.processado",
  "timestamp": "2024-01-15T10:30:00",
  "tenantId": "empresa-xyz",
  "dados": {
    "id": 12345,
    "tipoEvento": "S-1200",
    "cpf": "123.456.789-00",
    "estado": "PROCESSADO_COM_SUCESSO"
  }
}
```

### Validar Assinatura HMAC

```javascript
const crypto = require('crypto');

function validarAssinatura(payload, signature, secretKey) {
  const hmac = crypto.createHmac('sha256', secretKey);
  const digest = hmac.update(payload).digest('base64');
  return crypto.timingSafeEqual(
    Buffer.from(signature),
    Buffer.from(digest)
  );
}
```

## 🧪 Postman Collection

1. Importar collection: `docs/postman-collection.json`
2. Configurar ambiente (dev/homolog/prod)
3. Executar testes automatizados

## 📊 Métricas e Monitoramento

- **Prometheus**: http://localhost:9090
- **Grafana**: http://localhost:3000 (admin/admin)
- **Health Check**: http://localhost:8080/actuator/health

## 🔐 Segurança

- Autenticação via JWT (Keycloak)
- Multi-tenant com isolamento de dados
- Webhooks assinados com HMAC-SHA256
- Audit Trail de todas as operações

## 📝 Próximos Passos

1. Explorar Swagger UI para conhecer todos os endpoints
2. Gerar dados sintéticos no Sandbox
3. Configurar webhooks para integração
4. Implementar SDK no seu frontend
