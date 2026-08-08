package br.jus.tst.esocialjt.certificado.negocio;

import br.jus.tst.esocialjt.certificado.Certificado;
import br.jus.tst.esocialjt.negocio.exception.EntidadeNaoExisteException;
import br.jus.tst.esocialjt.tenant.TenantContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Serviço responsável por gerenciar certificados digitais de forma dinâmica por tenant.
 * Substitui o modelo estático global por um modelo onde cada tenant possui seu próprio certificado.
 */
@Service
public class CertificadoDinamicoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CertificadoDinamicoService.class);

    private final TenantContext tenantContext;

    public CertificadoDinamicoService(TenantContext tenantContext) {
        this.tenantContext = tenantContext;
    }

    /**
     * Carrega o certificado digital associado ao tenant ativo na requisição.
     * 
     * @return Certificado configurado para o tenant atual
     * @throws EntidadeNaoExisteException se não houver certificado configurado para o tenant
     */
    public Certificado carregarCertificadoParaTenantAtual() {
        String tenantId = tenantContext.getTenantId();
        
        if (tenantId == null) {
            throw new IllegalStateException("Não há tenant ativo no contexto. Certifique-se de que o header X-Tenant-ID foi informado.");
        }

        // Em produção, buscar do banco de dados ou vault
        // Aqui simulamos a busca pelos metadados do tenant
        TenantCertificadoDTO certDTO = buscarCertificadoDoTenant(tenantId);
        
        if (certDTO == null || !certDTO.temCertificadoValido()) {
            throw new EntidadeNaoExisteException(
                "CERTIFICADO_NAO_ENCONTRADO", 
                "Seu certificado digital não foi localizado. Contate o administrador do sistema para configurar o certificado do seu tenant."
            );
        }

        try {
            return criarCertificado(certDTO);
        } catch (Exception e) {
            LOGGER.error("Erro ao carregar certificado para tenant {}: {}", tenantId, e.getMessage());
            throw new RuntimeException(
                "ERRO_CARREGAMENTO_CERT", 
                new Exception("Falha ao ler o certificado digital. Verifique se ele está válido e se a senha está correta.", e)
            );
        }
    }

    /**
     * Busca os dados do certificado associados ao tenant.
     * EM PRODUÇÃO: Implementar repositório para buscar do banco PostgreSQL
     * 
     * @param tenantId identificador do tenant
     * @return DTO com dados do certificado
     */
    private TenantCertificadoDTO buscarCertificadoDoTenant(String tenantId) {
        // TODO: Implementar chamada ao repository
        // TenantCertificadoRepository.findByTenantId(tenantId)
        
        // Simulação para desenvolvimento - em produção virá do banco
        // Este código deve ser substituído por chamada ao banco de dados
        LOGGER.warn("Busca de certificado em modo simulação. Implementar repository em produção.");
        
        // Exemplo de como será em produção:
        // return tenantCertificadoRepository.findByTenantId(tenantId)
        //     .orElseThrow(() -> new EntidadeNaoExisteException(...));
        
        return null; // Retorna null para forçar implementação do repository
    }

    /**
     * Cria instância de Certificado a partir dos dados recuperados.
     */
    private Certificado criarCertificado(TenantCertificadoDTO dto) throws IOException, KeyStoreException, 
            CertificateException, NoSuchAlgorithmException, UnrecoverableKeyException {
        
        byte[] certificadoBytes = dto.getConteudoCertificado();
        char[] senha = dto.getSenhaCertificado().toCharArray();
        
        // Valida o certificado antes de retornar
        KeyStore keyStore = KeyStore.getInstance(dto.getTipoCertificado());
        try (InputStream stream = new ByteArrayInputStream(certificadoBytes)) {
            keyStore.load(stream, senha);
            
            // Verifica se o certificado não está expirado
            String alias = dto.getAliasCertificado();
            if (alias == null || alias.trim().isEmpty()) {
                alias = keyStore.aliases().nextElement();
            }
            
            X509Certificate cert = (X509Certificate) keyStore.getCertificate(alias);
            cert.checkValidity(); // Lança exception se expirado
            
            LOGGER.info("Certificado válido até: {}", cert.getNotAfter());
        }

        return new Certificado(
            dto.getCaminhoArquivo(),
            dto.getCaminhoCacerts(),
            senha,
            dto.getSenhaCacerts().toCharArray(),
            dto.getTipoCertificado(),
            dto.getAliasCertificado()
        );
    }

    /**
     * Verifica se o tenant possui certificado válido configurado.
     */
    public boolean tenantPossuiCertificadoValido(String tenantId) {
        try {
            TenantCertificadoDTO certDTO = buscarCertificadoDoTenant(tenantId);
            return certDTO != null && certDTO.temCertificadoValido();
        } catch (Exception e) {
            LOGGER.debug("Tenant {} não possui certificado válido: {}", tenantId, e.getMessage());
            return false;
        }
    }
}
