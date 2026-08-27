-- Script de criação da tabela de Auditoria (Fase 9)
-- Executar no banco de dados do eSocial-JT

CREATE TABLE IF NOT EXISTS auditoria_log (
    id BIGINT PRIMARY KEY,
    usuario VARCHAR(100) NOT NULL,
    acao VARCHAR(20) NOT NULL,
    entidade VARCHAR(100) NOT NULL,
    entidade_id VARCHAR(50),
    dados_antigos JSONB,
    dados_novos JSONB,
    ip_origem VARCHAR(45),
    user_agent VARCHAR(500),
    timestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    tenant_id VARCHAR(20)
);

-- Sequência para geração de IDs
CREATE SEQUENCE IF NOT EXISTS auditoria_seq START WITH 1 INCREMENT BY 1;

-- Índices para performance nas consultas
CREATE INDEX IF NOT EXISTS idx_auditoria_usuario ON auditoria_log(usuario);
CREATE INDEX IF NOT EXISTS idx_auditoria_data ON auditoria_log(timestamp);
CREATE INDEX IF NOT EXISTS idx_auditoria_entidade ON auditoria_log(entidade);
CREATE INDEX IF NOT EXISTS idx_auditoria_tenant ON auditoria_log(tenant_id);

-- Tabela de histórico para arquivamento (opcional - para logs > 5 anos)
CREATE TABLE IF NOT EXISTS auditoria_log_historico (
    id BIGINT PRIMARY KEY,
    usuario VARCHAR(100) NOT NULL,
    acao VARCHAR(20) NOT NULL,
    entidade VARCHAR(100) NOT NULL,
    entidade_id VARCHAR(50),
    dados_antigos JSONB,
    dados_novos JSONB,
    ip_origem VARCHAR(45),
    user_agent VARCHAR(500),
    timestamp TIMESTAMP NOT NULL,
    tenant_id VARCHAR(20),
    data_arquivamento TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Comentários nas colunas
COMMENT ON TABLE auditoria_log IS 'Registra todas as ações dos usuários para auditoria e compliance (LGPD)';
COMMENT ON COLUMN auditoria_log.usuario IS 'Nome do usuário que realizou a ação';
COMMENT ON COLUMN auditoria_log.acao IS 'Tipo de ação: CRIAR, ATUALIZAR, EXCLUIR, CONSULTAR, EXPORTAR, etc.';
COMMENT ON COLUMN auditoria_log.entidade IS 'Entidade afetada: Evento, Lote, Empregado, etc.';
COMMENT ON COLUMN auditoria_log.dados_antigos IS 'Estado anterior da entidade (JSON)';
COMMENT ON COLUMN auditoria_log.dados_novos IS 'Estado posterior da entidade (JSON)';
COMMENT ON COLUMN auditoria_log.ip_origem IS 'IP do cliente que fez a requisição';
COMMENT ON COLUMN auditoria_log.tenant_id IS 'Identificador do tenant (multi-tenancy)';

-- Grant de permissões (ajustar conforme necessidade)
-- GRANT SELECT, INSERT, UPDATE ON auditoria_log TO esocial_user;
-- GRANT SELECT ON auditoria_log_historico TO esocial_user;
