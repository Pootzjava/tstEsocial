# 🚀 Fase 0: Preparação do Ambiente

**Objetivo:** Configurar ambiente de desenvolvimento, validar build atual e estabelecer baseline para testes.

**Duração Estimada:** 1 dia

---

## ✅ Checklist de Validação

### 1. Verificar Pré-requisitos

Execute os seguintes comandos para validar seu ambiente:

```bash
# Verificar Java (versão 17+)
java -version

# Verificar Maven
mvn -version

# Verificar Node.js (versão 18+)
node -v

# Verificar npm
npm -v

# Verificar Docker (opcional, para testes com banco)
docker --version

# Verificar Git
git --version
```

**Saída esperada:**
- Java: 17 ou superior
- Maven: 3.8+
- Node.js: 18+
- npm: 9+
- Docker: 20+ (se for usar containers)

---

### 2. Estrutura do Projeto

Verifique se a estrutura de diretórios está correta:

```bash
# Listar estrutura principal
ls -la /workspace

# Verificar módulos backend
ls -la /workspace/esocial-jt-service/

# Verificar módulo frontend
ls -la /workspace/esocial-jt-frontend/

# Contar arquivos Java (deve ter ~5000+)
find /workspace/esocial-jt-service -name "*.java" | wc -l
```

---

### 3. Build e Testes Atuais

#### Backend - Build Completo

```bash
cd /workspace/esocial-jt-service

# Limpar e compilar
mvn clean compile -DskipTests

# Executar testes unitários
mvn test

# Build completo com testes de integração (requer banco)
# mvn verify -Dspring.profiles.active=test
```

**Critério de Aceite:**
- ✅ Build sem erros
- ✅ Todos os testes passando (ou documentar falhas existentes)
- ✅ Tempo total de build anotado para comparação futura

#### Frontend - Build Completo

```bash
cd /workspace/esocial-jt-frontend

# Instalar dependências
npm install

# Build de produção
npm run build

# Testes (se houver)
# npm test
```

**Critério de Aceite:**
- ✅ `npm install` sem erros críticos
- ✅ Build gera pasta `dist/` ou `build/`
- ✅ Sem warnings críticos de dependências

---

### 4. Configurar Banco de Dados para Desenvolvimento

#### Opção A: Docker Compose (Recomendado)

Crie o arquivo `/workspace/docker-compose-dev.yml`:

```yaml
version: '3.8'

services:
  postgres-esocial:
    image: postgres:15-alpine
    container_name: esocial-postgres-dev
    environment:
      POSTGRES_DB: esocial_jt
      POSTGRES_USER: esocial_user
      POSTGRES_PASSWORD: esocial_pass_dev
    ports:
      - "5432:5432"
    volumes:
      - esocial_data_dev:/var/lib/postgresql/data
    healthcheck:
      test: ["CMD-SHELL", "pg_isready -U esocial_user -d esocial_jt"]
      interval: 5s
      timeout: 5s
      retries: 5

volumes:
  esocial_data_dev:
```

**Comandos:**
```bash
cd /workspace
docker-compose -f docker-compose-dev.yml up -d

# Aguardar banco ficar pronto (30 segundos)
sleep 30

# Testar conexão
docker exec esocial-postgres-dev psql -U esocial_user -d esocial_jt -c "SELECT version();"
```

#### Opção B: Banco Local

Se já tiver PostgreSQL instalado localmente:

```bash
# Criar banco e usuário
sudo -u postgres psql << EOF
CREATE DATABASE esocial_jt;
CREATE USER esocial_user WITH PASSWORD 'esocial_pass_dev';
GRANT ALL PRIVILEGES ON DATABASE esocial_jt TO esocial_user;
EOF
```

---

### 5. Configurar Application Properties para Dev

Crie/atualize `/workspace/esocial-jt-service/src/main/resources/application-dev.yml`:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/esocial_jt
    username: esocial_user
    password: esocial_pass_dev
    driver-class-name: org.postgresql.Driver
    hikari:
      maximum-pool-size: 10
      minimum-idle: 5
      idle-timeout: 300000
      connection-timeout: 20000
  
  jpa:
    hibernate:
      ddl-auto: validate  # Não criar tabelas automaticamente em dev
    show-sql: false
    properties:
      hibernate:
        format_sql: true
        dialect: org.hibernate.dialect.PostgreSQLDialect
  
  flyway:
    enabled: true
    locations: classpath:db/migration
    baseline-on-migrate: true

  cache:
    type: caffeine
    caffeine:
      spec: maximumSize=500,expireAfterAccess=600s

server:
  port: 8080
  compression:
    enabled: true

logging:
  level:
    root: INFO
    br.jus.tst.esocial: DEBUG
    org.hibernate.SQL: DEBUG
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE

management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics,prometheus
  endpoint:
    health:
      show-details: always
```

---

### 6. Script de Migração Inicial (Opcional)

Se precisar popular o banco com dados básicos:

Crie `/workspace/scripts/init-dev-data.sql`:

```sql
-- Script para dados iniciais de desenvolvimento
-- Execute apenas em ambiente de dev!

-- Exemplo: Criar tenant de teste
-- INSERT INTO tenants (id, name, schema_name, active) 
-- VALUES ('tenant-test', 'Tenant Teste', 'tenant_test', true);

-- Nota: As migrations do Flyway já criam a estrutura necessária
```

---

### 7. Validar Aplicação Subindo

```bash
cd /workspace/esocial-jt-service

# Iniciar aplicação em modo dev
mvn spring-boot:run -Dspring-boot.run.profiles=dev

# Aguardar inicialização completa (~60 segundos)
# Procure no log: "Started EsocialJtServiceApplication"
```

**Testes de Validação:**

Em outro terminal:

```bash
# Testar endpoint de saúde
curl -s http://localhost:8080/actuator/health | jq

# Testar endpoint de info
curl -s http://localhost:8080/actuator/info | jq

# Testar endpoint de métricas
curl -s http://localhost:8080/actuator/metrics | jq

# Testar API de dashboard (pode retornar vazio inicialmente)
curl -s http://localhost:8080/api/dashboard/resumo | jq
```

**Critério de Aceite:**
- ✅ Aplicação inicia sem erros
- ✅ `/actuator/health` retorna `{"status":"UP"}`
- ✅ Conexão com banco estabelecida
- ✅ Logs sem exceptions críticas

---

### 8. Documentar Baseline

Crie o arquivo `/workspace/FASE0_BASELINE.md`:

```markdown
# Baseline - Fase 0

**Data:** $(date +%Y-%m-%d)

## Ambiente
- Java: $(java -version 2>&1 | head -1)
- Maven: $(mvn -version | head -1)
- Node: $(node -v)
- PostgreSQL: $(docker exec esocial-postgres-dev psql -U esocial_user -d esocial_jt -t -c "SELECT version();")

## Build Times
- Backend (compile): __ segundos
- Backend (testes): __ segundos
- Frontend (install): __ segundos
- Frontend (build): __ segundos

## Status dos Testes
- Backend: __/__ passando
- Frontend: __/__ passando

## Issues Conhecidas
[Listar qualquer problema encontrado]

## Observações
[Anotações relevantes]
```

---

## 🎯 Critérios de Aceite da Fase 0

Marque como concluído quando TODOS os itens abaixo estiverem validados:

- [ ] Java 17+ instalado e configurado
- [ ] Maven 3.8+ funcionando
- [ ] Node.js 18+ e npm instalados
- [ ] PostgreSQL rodando (Docker ou local)
- [ ] Backend compila sem erros (`mvn clean compile`)
- [ ] Testes do backend rodam (documentar falhas existentes)
- [ ] Frontend instala dependências sem erros críticos
- [ ] Frontend builda com sucesso
- [ ] Aplicação sobe em perfil `dev`
- [ ] Endpoint `/actuator/health` retorna UP
- [ ] Arquivo `FASE0_BASELINE.md` criado e preenchido
- [ ] Branch git criada: `feature/fase0-preparacao`

---

## 🔧 Comandos Úteis para Debug

```bash
# Ver logs detalhados do Spring
tail -f /workspace/esocial-jt-service/target/*.log

# Monitorar uso de memória
watch -n 2 'ps aux | grep java | grep -v grep'

# Testar conexão com banco
psql -h localhost -U esocial_user -d esocial_jt

# Verificar portas em uso
lsof -i :8080
lsof -i :5432

# Limpar caches
mvn clean
rm -rf /workspace/esocial-jt-frontend/node_modules
```

---

## ⚠️ Problemas Comuns e Soluções

### Erro: "Port 8080 already in use"
```bash
# Matar processo na porta
lsof -ti:8080 | xargs kill -9

# Ou mudar porta no application-dev.yml
server.port=8081
```

### Erro: "Connection refused to PostgreSQL"
```bash
# Verificar se container está rodando
docker ps | grep postgres

# Ver logs do container
docker logs esocial-postgres-dev

# Reiniciar container
docker-compose -f docker-compose-dev.yml restart
```

### Erro: "Java heap space"
```bash
# Aumentar heap no Maven
export MAVEN_OPTS="-Xmx2G -XX:MaxMetaspaceSize=512M"
mvn clean install
```

### Erro: "Node Sass does not support your current environment"
```bash
cd /workspace/esocial-jt-frontend
npm rebuild node-sass
# Ou
npm uninstall node-sass && npm install sass
```

---

## 📝 Próximos Passos

Após concluir esta fase:

1. Commit das mudanças:
```bash
git checkout -b feature/fase0-preparacao
git add .
git commit -m "feat: Fase 0 - Preparação do ambiente concluída"
git push origin feature/fase0-preparacao
```

2. Revisar baseline documentada

3. **Iniciar Fase 1**: Dashboard Backend com Dados Reais

---

**Status:** ⏳ Aguardando execução dos passos acima

**Próximo Comando Sugerido:** Após validar todos os itens, digite `"fase 0 concluída"` para prosseguir para a Fase 1.
