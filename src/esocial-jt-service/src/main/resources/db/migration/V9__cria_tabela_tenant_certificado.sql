-- Migration V9: Cria tabela de certificados digitais por tenant
-- Suporte a multi-tenancy com certificados A1 (arquivo) e A3 (token/cartão)

CREATE TABLE tenant_certificado (
    id BIGSERIAL PRIMARY KEY,
    tenant_id VARCHAR(100) NOT NULL UNIQUE,
    
    -- Dados do certificado digital
    conteudo_certificado BYTEA NOT NULL,          -- Certificado criptografado (PKCS#12)
    senha_certificado VARCHAR(500) NOT NULL,      -- Senha criptografada (AES-256)
    tipo_certificado VARCHAR(20) DEFAULT 'pkcs12',-- pkcs12, jks, pem
    
    -- Metadados do certificado
    alias_certificado VARCHAR(200),               -- Alias específico (opcional)
    caminho_arquivo VARCHAR(500),                 -- Para certificados A3 (caminho físico)
    caminho_cacerts VARCHAR(500),                 -- Truststore customizado
    senha_cacerts VARCHAR(100) DEFAULT 'changeit',-- Senha do truststore
    data_validade DATE,                           -- Data de expiração do certificado
    
    -- Controle de estado
    ativo BOOLEAN DEFAULT TRUE,
    criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    criado_por VARCHAR(100),
    atualizado_por VARCHAR(100)
);

-- Índices para performance
CREATE INDEX idx_tenant_certificado_tenant_id ON tenant_certificado(tenant_id);
CREATE INDEX idx_tenant_certificado_ativo ON tenant_certificado(ativo) WHERE ativo = TRUE;
CREATE INDEX idx_tenant_certificado_data_validade ON tenant_certificado(data_validade);

-- Trigger para atualização automática do timestamp
CREATE OR REPLACE FUNCTION update_updated_at_column()
RETURNS TRIGGER AS $$
BEGIN
    NEW.atualizado_em = CURRENT_TIMESTAMP;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_tenant_certificado_updated_at
    BEFORE UPDATE ON tenant_certificado
    FOR EACH ROW
    EXECUTE FUNCTION update_updated_at_column();

-- Comentários na tabela
COMMENT ON TABLE tenant_certificado IS 'Armazena certificados digitais por tenant para comunicação com eSocial';
COMMENT ON COLUMN tenant_certificado.conteudo_certificado IS 'Conteúdo binário do certificado PKCS#12 criptografado';
COMMENT ON COLUMN tenant_certificado.senha_certificado IS 'Senha do certificado criptografada com AES-256';
COMMENT ON COLUMN tenant_certificado.caminho_arquivo IS 'Caminho para certificado A3 em token/cartão físico';
COMMENT ON COLUMN tenant_certificado.data_validade IS 'Data de expiração - usar para alertas de renovação';

-- Grants (ajustar conforme ambiente)
-- GRANT SELECT, INSERT, UPDATE, DELETE ON tenant_certificado TO esocial_user;
-- GRANT USAGE, SELECT ON SEQUENCE tenant_certificado_id_seq TO esocial_user;
