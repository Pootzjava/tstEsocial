#!/bin/bash

# Script para gerar SDK TypeScript a partir da especificação OpenAPI
# Requer: Node.js, npm e openapi-typescript-codegen instalados

set -e

echo "🚀 Gerando SDK TypeScript para eSocial-JT API..."

# Verificar se openapi-typescript-codegen está instalado
if ! command -v openapi &> /dev/null; then
    echo "⚠️  openapi-typescript-codegen não encontrado. Instalando..."
    npm install -g openapi-typescript-codegen
fi

# Diretórios
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
API_SPEC_URL="http://localhost:8080/v3/api-docs"
SDK_OUTPUT_DIR="${SCRIPT_DIR}/sdk-typescript"

# Baixar especificação OpenAPI
echo "📥 Baixando especificação OpenAPI de ${API_SPEC_URL}..."
curl -s "${API_SPEC_URL}" -o "${SCRIPT_DIR}/openapi-spec.json"

if [ ! -f "${SCRIPT_DIR}/openapi-spec.json" ] || [ ! -s "${SCRIPT_DIR}/openapi-spec.json" ]; then
    echo "❌ Erro: Não foi possível baixar a especificação OpenAPI."
    echo "💡 Certifique-se de que o backend está rodando em http://localhost:8080"
    exit 1
fi

# Criar diretório de saída
mkdir -p "${SDK_OUTPUT_DIR}"

# Gerar SDK
echo "🔨 Gerando SDK TypeScript..."
openapi \
    --input "${SCRIPT_DIR}/openapi-spec.json" \
    --output "${SDK_OUTPUT_DIR}" \
    --client fetch \
    --useOptions \
    --useUnionTypes \
    --exportCore true

# Criar package.json
cat > "${SDK_OUTPUT_DIR}/package.json" << 'PACKAGE_EOF'
{
  "name": "@esocial-jt/sdk",
  "version": "2.0.0",
  "description": "SDK TypeScript para integração com eSocial-JT API Premium",
  "main": "index.js",
  "types": "index.d.ts",
  "scripts": {
    "build": "tsc",
    "test": "jest",
    "publish": "npm publish --access public"
  },
  "keywords": [
    "esocial",
    "sdk",
    "typescript",
    "api",
    "gov"
  ],
  "author": "Equipe eSocial-JT",
  "license": "Apache-2.0",
  "repository": {
    "type": "git",
    "url": "https://github.com/tst-esocial/esocial-jt.git"
  },
  "peerDependencies": {
    "node-fetch": "^2.6.0"
  },
  "devDependencies": {
    "@types/node": "^18.0.0",
    "typescript": "^5.0.0"
  }
}
PACKAGE_EOF

# Criar README
cat > "${SDK_OUTPUT_DIR}/README.md" << 'README_EOF'
# @esocial-jt/sdk

SDK TypeScript oficial para integração com a API eSocial-JT Premium.

## Instalação

```bash
npm install @esocial-jt/sdk
```

## Uso

```typescript
import { EventosService, WebhooksService, RelatoriosService } from '@esocial-jt/sdk';

// Configurar cliente
const BASE_URL = 'http://localhost:8080';
const TOKEN = 'SEU_JWT_TOKEN';

const eventosService = new EventosService(BASE_URL, TOKEN);
const webhooksService = new WebhooksService(BASE_URL, TOKEN);

// Listar eventos
async function listarEventos() {
  const response = await eventosService.listarEventos({
    pagina: 0,
    tamanho: 10,
    tipoEvento: 'S-1200'
  });
  console.log(response);
}

// Criar webhook
async function criarWebhook() {
  const webhook = await webhooksService.criarWebhook({
    url: 'https://meu-app.com/webhook',
    eventos: ['evento.processado', 'lote.enviado'],
    ativo: true
  });
  console.log('Webhook criado:', webhook.id);
}

listarEventos();
criarWebhook();
```

## Serviços Disponíveis

- `EventosService` - Gestão de eventos do eSocial
- `LotesService` - Envio e acompanhamento de lotes
- `DashboardService` - Métricas e KPIs em tempo real
- `WebhooksService` - Configuração de notificações assíncronas
- `RelatoriosService` - Geração de relatórios PDF/CSV
- `AuditoriaService` - Consulta de logs de auditoria

## Documentação Completa

https://github.com/tst-esocial/esocial-jt/tree/main/docs

## License

Apache-2.0
README_EOF

echo "✅ SDK gerado com sucesso em ${SDK_OUTPUT_DIR}"
echo ""
echo "📦 Para usar o SDK:"
echo "   cd ${SDK_OUTPUT_DIR}"
echo "   npm install"
echo "   npm link  # Para desenvolvimento local"
echo ""
echo "📚 Veja exemplos em: ${SDK_OUTPUT_DIR}/README.md"

# Limpar arquivo temporário
rm -f "${SCRIPT_DIR}/openapi-spec.json"
