# eSocial-JT TypeScript SDK

SDK oficial em TypeScript para integração com a API do eSocial-JT.

## Instalação

```bash
npm install @esocial-jt/sdk
```

## Configuração

```typescript
import { EsocialJTClient } from '@esocial-jt/sdk';

const client = new EsocialJTClient({
  baseUrl: 'http://localhost:8080',
  token: 'SEU_TOKEN_AQUI'
});
```

## Uso

### Listar Eventos

```typescript
import { EventosService } from '@esocial-jt/sdk';

const eventosService = new EventosService(client);

// Listar eventos com paginação
const eventos = await eventosService.listar({
  pagina: 0,
  tamanho: 10,
  tipoEvento: 'S-1200'
});

console.log(eventos);
```

### Enviar Evento

```typescript
const novoEvento = {
  tipoEvento: 'S-1200',
  cpfTrabalhador: '12345678900',
  competencia: '2024-01',
  dados: { /* ... */ }
};

const resultado = await eventosService.enviar(novoEvento);
console.log(`Evento enviado: ${resultado.id}`);
```

### Validar Folha de Pagamento

```typescript
import { RegrasService } from '@esocial-jt/sdk';

const regrasService = new RegrasService(client);

const dadosFolha = {
  cpfTrabalhador: '12345678900',
  salarioBruto: 5000.00,
  salarioMinimoVigente: 1412.00,
  tetoINSS: 7786.02,
  aliquotaFGTS: 8.0,
  baseFGTS: 5000.00,
  baseIRRF: 4500.00,
  dependentes: 2,
  competencia: '2024-01-15',
  vinculosAtivos: ['EMP001']
};

const validacoes = await regrasService.validarFolha(dadosFolha);

if (validacoes.length > 0) {
  console.warn('Erros de validação:', validacoes);
} else {
  console.log('Folha válida para envio!');
}
```

### Dashboard

```typescript
import { DashboardService } from '@esocial-jt/sdk';

const dashboardService = new DashboardService(client);

// Obter totais de apuração
const totais = await dashboardService.obterTotaisApuracao('2024-01');
console.log('Base FGTS:', totais.baseFgts);

// Obter histórico mensal
const historico = await dashboardService.obterHistoricoMensal(2024, 1);
console.log(historico);
```

### Relatórios

```typescript
import { RelatoriosService } from '@esocial-jt/sdk';

const relatoriosService = new RelatoriosService(client);

// Gerar PDF de apuração
const pdfBlob = await relatoriosService.gerarPdfApuracao('2024-01');

// Download do arquivo
const url = window.URL.createObjectURL(pdfBlob);
const a = document.createElement('a');
a.href = url;
a.download = `apuracao-2024-01.pdf`;
a.click();
```

### Auditoria

```typescript
import { AuditoriaService } from '@esocial-jt/sdk';

const auditoriaService = new AuditoriaService(client);

// Buscar logs de auditoria
const logs = await auditoriaService.buscarLogs({
  usuario: 'admin',
  acao: 'EXCLUIR',
  dataInicio: '2024-01-01',
  dataFim: '2024-01-31'
});

console.log(logs);
```

## Serviços Disponíveis

- `EventosService` - CRUD de eventos eSocial
- `LotesService` - Gerenciamento de lotes de envio
- `DashboardService` - Métricas e indicadores
- `RegrasService` - Validações e prioridades (Drools)
- `RelatoriosService` - Geração de PDF/CSV
- `AuditoriaService` - Logs de auditoria
- `WebhooksService` - Gerenciamento de webhooks
- `SandboxService` - Dados sintéticos para testes

## Tratamento de Erros

```typescript
import { ApiError } from '@esocial-jt/sdk';

try {
  await eventosService.enviar(dadosEvento);
} catch (error) {
  if (error instanceof ApiError) {
    console.error(`Erro ${error.status}: ${error.message}`);
    console.error('Detalhes:', error.detalhes);
  } else {
    console.error('Erro desconhecido:', error);
  }
}
```

## Ambiente Sandbox

Para testes, use o sandbox que gera dados sintéticos:

```typescript
import { SandboxService } from '@esocial-jt/sdk';

const sandboxService = new SandboxService(client);

// Gerar dados fictícios
await sandboxService.gerarDados({
  empresas: 5,
  eventos: 50,
  apuracoes: 10
});
```

## Mais Informações

- [Documentação da API](http://localhost:8080/swagger-ui.html)
- [Guia do Desenvolvedor](../docs/DEVELOPER_GUIDE.md)
- [Exemplos Completos](./examples/)

## License

MIT © eSocial-JT Team
