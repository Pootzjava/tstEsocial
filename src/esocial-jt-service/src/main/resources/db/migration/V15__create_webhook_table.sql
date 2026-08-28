-- Cria tabela de webhooks para notificações assíncronas
CREATE TABLE IF NOT EXISTS webhook (
    id BIGSERIAL PRIMARY KEY,
    url VARCHAR(500) NOT NULL,
    descricao VARCHAR(200),
    eventos TEXT[] NOT NULL, -- Array de tipos de evento: ['evento.processado', 'lote.enviado']
    ativo BOOLEAN DEFAULT true,
    secret_key VARCHAR(100) NOT NULL, -- Chave para assinatura HMAC-SHA256
    tenant_id VARCHAR(50) NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_atualizacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    ultimas_tentativas JSONB DEFAULT '[]'::jsonb, -- Histórico das últimas 3 tentativas de disparo
    CONSTRAINT chk_url_valida CHECK (url ~ '^https?://'),
    CONSTRAINT chk_eventos_nao_vazio CHECK (array_length(eventos, 1) > 0)
);

-- Índices para consultas frequentes
CREATE INDEX idx_webhook_tenant ON webhook(tenant_id);
CREATE INDEX idx_webhook_ativo ON webhook(ativo);
CREATE INDEX idx_webhook_eventos ON webhook USING GIN(eventos);

-- Trigger para atualizar data_atualizacao
CREATE OR REPLACE FUNCTION update_webhook_updated_at()
RETURNS TRIGGER AS $$
BEGIN
    NEW.data_atualizacao = CURRENT_TIMESTAMP;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_webhook_updated_at
BEFORE UPDATE ON webhook
FOR EACH ROW
EXECUTE FUNCTION update_webhook_updated_at();

-- Comentário na tabela
COMMENT ON TABLE webhook IS 'Armazena configurações de webhooks para notificações assíncronas de eventos do eSocial';
COMMENT ON COLUMN webhook.eventos IS 'Lista de tipos de evento que disparam o webhook: evento.processado, lote.enviado, erro.validacao, apuracao.gerada';
COMMENT ON COLUMN webhook.secret_key IS 'Chave secreta usada para assinar payloads com HMAC-SHA256';
COMMENT ON COLUMN webhook.ultimas_tentativas IS 'Histórico JSON das últimas 3 tentativas de disparo com status, timestamp e mensagem de erro';
