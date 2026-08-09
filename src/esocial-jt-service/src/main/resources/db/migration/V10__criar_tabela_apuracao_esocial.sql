-- Tabela para armazenar valores monetários extraídos dos eventos S-5010 e S-5020
-- Usada pelo Dashboard Premium para exibir informações gerenciais reais

CREATE TABLE apuracao_esocial (
    cod_apuracao BIGSERIAL PRIMARY KEY,
    txt_competencia DATE NOT NULL,
    txt_tipo_evento VARCHAR(6) NOT NULL,
    txt_numero_recibo VARCHAR(50) UNIQUE,
    
    -- Totais S-5010 (Remuneração)
    num_base_fgts NUMERIC(15,2) DEFAULT 0,
    num_fgts_mensal NUMERIC(15,2) DEFAULT 0,
    num_base_irrf NUMERIC(15,2) DEFAULT 0,
    num_irrf NUMERIC(15,2) DEFAULT 0,
    num_base_contrib_prev NUMERIC(15,2) DEFAULT 0,
    num_contrib_prev_patronal NUMERIC(15,2) DEFAULT 0,
    
    -- Totais S-5020 (Contribuições Patronais)
    num_contrib_sindical_patronal NUMERIC(15,2) DEFAULT 0,
    num_outras_contribuicoes NUMERIC(15,2) DEFAULT 0,
    
    -- Controle
    dth_processamento TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    dth_atualizacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Índices para performance das consultas do dashboard
CREATE INDEX idx_apuracao_competencia ON apuracao_esocial(txt_competencia);
CREATE INDEX idx_apuracao_tipo_evento ON apuracao_esocial(txt_tipo_evento);
CREATE INDEX idx_apuracao_recibo ON apuracao_esocial(txt_numero_recibo);

-- Trigger para atualizar timestamp automaticamente
CREATE OR REPLACE FUNCTION atualizar_timestamp_apuracao()
RETURNS TRIGGER AS $$
BEGIN
    NEW.dth_atualizacao = CURRENT_TIMESTAMP;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_atualizar_apuracao
    BEFORE UPDATE ON apuracao_esocial
    FOR EACH ROW
    EXECUTE FUNCTION atualizar_timestamp_apuracao();

-- Comentários na tabela
COMMENT ON TABLE apuracao_esocial IS 'Armazena valores monetários extraídos dos eventos S-5010 e S-5020 para dashboard premium';
COMMENT ON COLUMN apuracao_esocial.txt_competencia IS 'Competência da apuração (primeiro dia do mês)';
COMMENT ON COLUMN apuracao_esocial.txt_tipo_evento IS 'Tipo do evento: S-5010 ou S-5020';
COMMENT ON COLUMN apuracao_esocial.num_base_fgts IS 'Total de base de cálculo do FGTS';
COMMENT ON COLUMN apuracao_esocial.num_fgts_mensal IS 'Total de FGTS mensal a recolher';
COMMENT ON COLUMN apuracao_esocial.num_base_irrf IS 'Total de base de cálculo do IRRF';
COMMENT ON COLUMN apuracao_esocial.num_irrf IS 'Total de IRRF retido';
COMMENT ON COLUMN apuracao_esocial.num_base_contrib_prev IS 'Base de cálculo da contribuição previdenciária patronal';
COMMENT ON COLUMN apuracao_esocial.num_contrib_prev_patronal IS 'Contribuição previdenciária patronal';
COMMENT ON COLUMN apuracao_esocial.num_contrib_sindical_patronal IS 'Contribuição sindical patronal';
COMMENT ON COLUMN apuracao_esocial.num_outras_contribuicoes IS 'Outras contribuições (RAT/FAP, Terceiros, etc.)';
