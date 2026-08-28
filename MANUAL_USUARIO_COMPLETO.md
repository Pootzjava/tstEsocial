# 📘 Manual Completo de Utilização - eSocial-JT Premium
**Versão 2.0.0 | Solução Empresarial Multi-tenant**

---

## 📑 Sumário
1. [Introdução](#1-introdução)
2. [Primeiros Passos](#2-primeiros-passos)
3. [Guia do Usuário Operacional (RH/Folha)](#3-guia-do-usuário-operacional)
4. [Guia do Administrador do Sistema](#4-guia-do-administrador-do-sistema)
5. [Guia do Auditor/Compliance](#5-guia-do-auditorcompliance)
6. [Guia do Desenvolvedor (API & Integração)](#6-guia-do-desenvolvedor)
7. [Operações Avançadas e Troubleshooting](#7-operações-avançadas-e-troubleshooting)
8. [Anexos: Tabela de Eventos e Códigos](#8-anexos)

---

## 1. Introdução

### 1.1 O que é o eSocial-JT Premium?
Plataforma empresarial para gestão completa do **eSocial**, projetada para departamentos de RH, contabilidade e TI. Diferencia-se por:
- ✅ **Multi-tenant nativo**: Uma instalação atende múltiplas empresas com isolamento total.
- ✅ **Validação Preventiva**: Detecta erros na folha *antes* do envio ao governo.
- ✅ **Inteligência de Filas**: Prioriza automaticamente eventos críticos.
- ✅ **Auditoria Completa**: Rastreio de quem fez o quê (LGPD compliant).

### 1.2 Perfis de Acesso (Roles)
| Perfil | Permissões | Indicado para |
|--------|------------|---------------|
| `ADMIN` | Acesso total, gestão de tenants, configurações globais | TI / Gestor de TI |
| `GESTOR_RH` | Envio de eventos, validações, relatórios de folha | Gerente de RH / Contador |
| `OPERADOR` | Cadastro de eventos básicos, consulta de status | Assistente de RH |
| `AUDITOR` | Leitura de logs, auditoria, exportação de dados (sem escrita) | Auditor Interno/Externo |

---

## 2. Primeiros Passos

### 2.1 Login e Troca de Tenant
1. Acesse `https://seu-dominio.com`.
2. Insira suas credenciais (integradas com Keycloak/LDAP ou banco local).
3. **Seleção de Empresa (Tenant)**:
   - Se você tem acesso a múltiplas empresas, clique no avatar (canto superior direito) > **"Trocar Empresa"**.
   - O sistema recarrega o contexto isolado da empresa selecionada.

### 2.2 Configuração Inicial Obrigatória
Antes de enviar eventos, configure:
1. **Certificado Digital**:
   - Menu: `Configurações` > `Certificados`.
   - Upload do arquivo `.pfx` (A1) ou configuração de caminho (A3).
   - *Nota*: O sistema alerta 30 dias antes da expiração.
2. **Parâmetros da Empresa**:
   - Menu: `Configurações` > `Dados da Empresa`.
   - Preencha CNPJ, CAEPF (se houver) e código de terceiros.

---

## 3. Guia do Usuário Operacional (RH/Folha)

### 3.1 Dashboard Inteligente
Ao logar, você vê o **Painel de Controle**:
- **Cards de Status**: Total de eventos pendentes, erros críticos, próximos vencimentos.
- **Gráficos**: Evolução de envios nos últimos 30 dias.
- **Filtros Rápidos**: Clique em "Últimos 7 dias" ou selecione um período personalizado.
- **Modo Escuro**: Ícone de lua/sol no topo para alternar temas.

### 3.2 Validação Preventiva de Folha (Recurso Premium)
Evite multas validando antes de enviar:
1. Vá para `Folha de Pagamento` > `Validar Lote`.
2. Faça upload do JSON/XML da sua folha ou cole os dados.
3. Clique em **"Executar Validação"**.
4. **Resultado**:
   - ✅ **Verde**: Sem erros. Pronto para envio.
   - ⚠️ **Amarelo**: Avisos (ex: salário abaixo da média do setor).
   - ❌ **Vermelho**: Erros impeditivos (ex: CPF inválido, salário < mínimo).
   - *Ação*: Corrija os itens listados e valide novamente.

### 3.3 Envio de Eventos
#### Envio Unitário
1. Menu `Eventos` > `Novo Evento`.
2. Selecione o tipo (ex: S-2200 Admissão).
3. Preencha o formulário (campos obrigatórios marcados com *).
4. Clique em **Salvar e Enviar**.

#### Envio em Lote (Recomendado)
1. Menu `Lotes` > `Importar Lote`.
2. Arraste o arquivo JSON/XML gerado pelo seu sistema de folha.
3. O sistema aplica as **Regras de Prioridade** automaticamente:
   - Eventos tabulares (S-1000) são enviados primeiro.
   - Eventos periódicos (S-1200) são enfileirados após.
4. Acompanhe a barra de progresso em tempo real.

### 3.4 Monitoramento de Envios
- **Fila de Processamento**: Visualize eventos em "Pendente", "Processando" e "Erro".
- **Retry Automático**: Em caso de instabilidade do eSocial, o sistema tenta reenviar automaticamente (até 3 vezes com backoff exponencial).
- **Detalhes do Erro**: Clique no evento com erro para ver a mensagem traduzida (ex: "Rejeição 501: Certificado vencido").

### 3.5 Relatórios e Exportação
- **Apuração Mensal**: Menu `Relatórios` > `Apuração`. Selecione a competência e baixe o **PDF oficial**.
- **Exportação Excel**: Em qualquer tabela (ex: lista de eventos), clique no botão **"Exportar CSV"** para analisar no Excel.

---

## 4. Guia do Administrador do Sistema

### 4.1 Gestão Multi-tenant
*Apenas perfil ADMIN*
1. **Criar Novo Tenant**:
   - Menu `Administração` > `Tenants` > `Novo`.
   - Defina: Nome, Schema DB (ex: `cliente_x`), Plano (Basic/Premium).
   - O sistema cria o schema e usuários automaticamente.
2. **Bloqueio de Tenant**: Suspenda o acesso em caso de inadimplência.

### 4.2 Configuração de Webhooks
Para integrar com outros sistemas (ex: ERP):
1. Menu `Integrações` > `Webhooks`.
2. `Novo Webhook`:
   - URL: `https://seu-erp.com.br/api/esocial/callback`
   - Eventos: Marque `evento.processado`, `lote.enviado`.
   - Secret: Chave para assinatura HMAC (gerada automaticamente).
3. Teste a conexão com o botão **"Disparar Teste"**.

### 4.3 Gestão de Certificados
- **Renovação**: Substitua o arquivo `.pfx` antes da expiração. O sistema mantém o histórico.
- **Múltiplos Certificados**: Configure certificados diferentes para matrizes e filiais no mesmo tenant.

---

## 5. Guia do Auditor/Compliance

### 5.1 Audit Trail (Rastreamento Completo)
Todas as ações são registradas imutavelmente.
1. Menu `Auditoria` > `Logs de Atividades`.
2. **Filtros Avançados**:
   - Por usuário: "Quem excluiu o evento X?"
   - Por data: "O que foi feito dia 15/03?"
   - Por ação: "Listar todas as exclusões".
3. **Visualização de Diff**: Clique em um log para ver o "Antes" e "Depois" dos dados alterados (destaque em vermelho/verde).

### 5.2 Exportação para Fiscalização
- Gere o relatório **"Log de Auditoria Completo"** em PDF/CSV para entregar a auditores externos.
- Os dados sensíveis (CPF) são mascarados automaticamente conforme LGPD, salvo permissão explícita.

---

## 6. Guia do Desenvolvedor (API & Integração)

### 6.1 Acessando a Documentação (Swagger)
- URL: `https://api.seu-dominio.com/swagger-ui.html`
- Autentique-se clicando no cadeado e inserindo o Token JWT (obtido no login).

### 6.2 Usando o SDK TypeScript
Instale o SDK oficial:
```bash
npm install @esocial-jt/sdk
```
Exemplo de uso:
```typescript
import { EsocialClient } from '@esocial-jt/sdk';

const client = new EsocialClient({
  baseUrl: 'https://api.seu-dominio.com',
  token: 'SEU_TOKEN_JWT'
});

// Validar folha programaticamente
const validacao = await client.regras.validarFolha(dadosFolha);
if (!validacao.aprovado) {
  console.error('Erros:', validacao.erros);
}
```

### 6.3 Ambiente Sandbox
Para testes sem sujar a produção:
1. Use o header `X-Tenant-ID: sandbox`.
2. Endpoint `POST /api/sandbox/gerar-dados` popula o ambiente com 50 eventos fictícios em segundos.

---

## 7. Operações Avançadas e Troubleshooting

### 7.1 Comandos Úteis (CLI/Docker)
| Ação | Comando |
|------|---------|
| Reiniciar serviço | `docker-compose restart app` |
| Ver logs de erro (tempo real) | `docker-compose logs -f app \| grep ERROR` |
| Backup do Banco | `docker exec pg_container pg_dump -U postgres esocialjt > backup.sql` |
| Forçar reprocessamento | `curl -X POST http://localhost:8080/api/eventos/{id}/reprocessar` |

### 7.2 Problemas Comuns e Soluções

#### ❌ Erro: "Certificado Inválido ou Vencido"
- **Causa**: Arquivo `.pfx` corrompido ou data expirada.
- **Solução**: Renove o certificado no menu `Configurações` e reinicie o serviço de envio.

#### ❌ Erro: "Timeout na Conexão com eSocial"
- **Causa**: Instabilidade no servidor do governo.
- **Solução**: O sistema tentará reenviar automaticamente. Se persistir, verifique o firewall de saída (porta 443).

#### ❌ Erro: "Dados inconsistentes na Apuração"
- **Causa**: Eventos de tabela (S-1000/S-1005) não enviados antes dos eventos periódicos.
- **Solução**: Use a função **"Reordenar Fila"** no dashboard para priorizar eventos tabulares.

---

## 8. Anexos

### 8.1 Tabela de Eventos Suportados
| Grupo | Eventos | Status |
|-------|---------|--------|
| Tabulares | S-1000, S-1005, S-1010, S-1020, S-1030, S-1035, S-1037, S-1040, S-1050, S-1060, S-1070 | ✅ Produzido |
| Cadastrais | S-2200, S-2205, S-2206, S-2210, S-2220, S-2221, S-2230, S-2231, S-2240, S-2298, S-2299, S-2300, S-2306, S-2307, S-2310, S-2311, S-2399 | ✅ Produzido |
| Periódicos | S-1200, S-1202, S-1207, S-1280, S-1298, S-1299, S-2299, S-2399, S-5001, S-5002, S-5003 | ✅ Produzido |
| Apuração | S-5010, S-5020 | ✅ Produzido |

### 8.2 Glossário
- **Tenant**: Unidade isolada de cliente (empresa) dentro do sistema.
- **Hash de Evento**: Código único gerado pelo eSocial para cada evento enviado.
- **Backoff Exponencial**: Estratégia de retry que aumenta o tempo de espera entre tentativas (1min, 2min, 4min...).

---

**Suporte Técnico**: suporte@esocial-jt.com.br  
**Documentação Técnica**: `/docs`  
**Última Atualização**: Março/2025
