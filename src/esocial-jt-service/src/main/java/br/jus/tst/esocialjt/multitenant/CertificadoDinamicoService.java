package br.jus.tst.esocialjt.multitenant;

import br.jus.tst.esocialjt.negocio.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Serviço para gerenciamento dinâmico de certificados digitais por tenant.
 * 
 * Este serviço substitui a abordagem estática anterior, permitindo que cada tenant
 * tenha seu próprio certificado digital carregado dinamicamente durante o processamento.
 * 
 * @author eSocial-JT
 */
@Service("certificadoDinamicoServiceMultitenant")
@Deprecated
public class CertificadoDinamicoService {

    @Autowired
    private TenantCertificadoRepository repository;

    @Autowired
    private CriptografiaService criptografiaService;

    /**
     * Carrega o KeyStore com o certificado digital do tenant atual.
     * 
     * @return KeyStore configurado com o certificado do tenant
     * @throws BusinessException se não houver certificado ativo ou falha no carregamento
     */
    @Transactional(readOnly = true)
    public KeyStore loadKeyStoreForCurrentTenant() {
        String tenantId = TenantContextHolder.getTenantId();
        
        if (tenantId == null || tenantId.isEmpty()) {
            throw new BusinessException(
                "TENANT_NAO_IDENTIFICADO", 
                "Não foi possível identificar o tenant na requisição. Verifique o header X-Tenant-ID."
            );
        }

        Optional<TenantCertificado> certOpt = repository.findByTenantIdAndAtivo(tenantId);
        
        if (certOpt.isEmpty()) {
            throw new BusinessException(
                "CERTIFICADO_NAO_ENCONTRADO", 
                "Seu certificado digital não foi localizado ou está inativo. Contate o administrador do sistema."
            );
        }

        TenantCertificado certData = certOpt.get();

        // Verifica validade
        if (certData.getDataValidade() != null && certData.getDataValidade().isBefore(LocalDateTime.now())) {
            throw new BusinessException(
                "CERTIFICADO_VENCIDO", 
                "Seu certificado digital está vencido desde " + formatarData(certData.getDataValidade()) + 
                ". Renove seu certificado e atualize no sistema."
            );
        }

        try {
            KeyStore ks = KeyStore.getInstance("PKCS12");
            String senhaPlana = criptografiaService.decrypt(certData.getSenhaCriptografada());
            
            try (InputStream stream = new ByteArrayInputStream(certData.getConteudoCertificado())) {
                ks.load(stream, senhaPlana.toCharArray());
            }

            return ks;
            
        } catch (Exception e) {
            throw new BusinessException(
                "ERRO_CARREGAMENTO_CERT", 
                "Falha ao carregar o certificado digital. Verifique se o arquivo está íntegro e a senha está correta."
            );
        }
    }

    /**
     * Busca informações do certificado do tenant atual sem carregar o KeyStore.
     * 
     * @return DTO com informações do certificado
     */
    @Transactional(readOnly = true)
    public TenantCertificadoDTO getCertificadoInfo() {
        String tenantId = TenantContextHolder.getTenantId();
        
        if (tenantId == null) {
            throw new BusinessException(
                "TENANT_NAO_IDENTIFICADO", 
                "Não foi possível identificar o tenant na requisição."
            );
        }

        Optional<TenantCertificado> certOpt = repository.findByTenantIdAndAtivo(tenantId);
        
        if (certOpt.isEmpty()) {
            return null;
        }

        TenantCertificado cert = certOpt.get();
        return new TenantCertificadoDTO(
            cert.getId(),
            cert.getNomeCertificado(),
            cert.getTipoCertificado(),
            cert.getNumeroSerie(),
            cert.getDataValidade(),
            cert.isAtivo(),
            cert.getCriadoEm(),
            cert.getModificadoEm()
        );
    }

    /**
     * Lista todos os certificados de um tenant específico.
     * 
     * @param tenantId identificador do tenant
     * @return lista de certificados do tenant
     */
    @Transactional(readOnly = true)
    public List<TenantCertificado> listarCertificadosPorTenant(String tenantId) {
        return repository.findAllByTenantIdOrderByCriadoEmDesc(tenantId);
    }

    /**
     * Registra um novo certificado para um tenant.
     * 
     * @param tenantId identificador do tenant
     * @param nomeCertificado nome descritivo do certificado
     * @param tipo tipo do certificado (A1, A3, etc)
     * @param conteudo conteúdo do arquivo do certificado (bytes)
     * @param senha senha de acesso ao certificado
     * @param numeroSerie número de série do certificado
     * @return certificado salvo
     */
    @Transactional
    public TenantCertificado registrarCertificado(
            String tenantId,
            String nomeCertificado,
            TenantCertificado.TipoCertificado tipo,
            byte[] conteudo,
            String senha,
            String numeroSerie) {
        
        // Validações básicas
        if (conteudo == null || conteudo.length == 0) {
            throw new BusinessException(
                "CERTIFICADO_INVALIDO", 
                "O conteúdo do certificado não pode estar vazio."
            );
        }

        if (senha == null || senha.trim().isEmpty()) {
            throw new BusinessException(
                "SENHA_INVALIDA", 
                "A senha do certificado é obrigatória."
            );
        }

        // Extrai dados do certificado para validação
        LocalDateTime dataValidade = extrairDataValidade(conteudo, senha);
        
        // Desativa certificados anteriores do mesmo tenant
        desativarCertificadosAnteriores(tenantId);

        // Cria novo registro
        TenantCertificado cert = new TenantCertificado(tenantId, nomeCertificado, tipo);
        cert.setConteudoCertificado(conteudo);
        cert.setSenhaCriptografada(criptografiaService.encrypt(senha));
        cert.setNumeroSerie(numeroSerie);
        cert.setDataValidade(dataValidade);
        cert.setAtivo(true);

        return repository.save(cert);
    }

    /**
     * Ativa um certificado específico.
     * 
     * @param certId identificador do certificado
     * @param tenantId identificador do tenant (para validação de segurança)
     */
    @Transactional
    public void ativarCertificado(Long certId, String tenantId) {
        TenantCertificado cert = repository.findById(certId)
            .orElseThrow(() -> new BusinessException(
                "CERTIFICADO_NAO_ENCONTRADO", 
                "Certificado não encontrado com o ID informado."
            ));

        if (!cert.getTenantId().equals(tenantId)) {
            throw new BusinessException(
                "ACESSO_NEGADO", 
                "Você não tem permissão para gerenciar este certificado."
            );
        }

        // Desativa outros certificados do tenant
        desativarCertificadosAnteriores(tenantId);

        cert.setAtivo(true);
        repository.save(cert);
    }

    /**
     * Inativa um certificado específico.
     * 
     * @param certId identificador do certificado
     * @param tenantId identificador do tenant (para validação de segurança)
     */
    @Transactional
    public void inativarCertificado(Long certId, String tenantId) {
        TenantCertificado cert = repository.findById(certId)
            .orElseThrow(() -> new BusinessException(
                "CERTIFICADO_NAO_ENCONTRADO", 
                "Certificado não encontrado com o ID informado."
            ));

        if (!cert.getTenantId().equals(tenantId)) {
            throw new BusinessException(
                "ACESSO_NEGADO", 
                "Você não tem permissão para gerenciar este certificado."
            );
        }

        cert.setAtivo(false);
        repository.save(cert);
    }

    /**
     * Verifica se o tenant possui certificado ativo configurado.
     * 
     * @param tenantId identificador do tenant
     * @return true se possuir certificado ativo
     */
    @Transactional(readOnly = true)
    public boolean possuiCertificadoAtivo(String tenantId) {
        return repository.existsByTenantIdAndAtivo(tenantId);
    }

    // Métodos auxiliares privados

    private void desativarCertificadosAnteriores(String tenantId) {
        List<TenantCertificado> certificadosAtivos = repository.findAllByTenantIdOrderByCriadoEmDesc(tenantId);
        certificadosAtivos.forEach(cert -> {
            if (cert.isAtivo()) {
                cert.setAtivo(false);
                repository.save(cert);
            }
        });
    }

    private LocalDateTime extrairDataValidade(byte[] conteudo, String senha) {
        try {
            KeyStore ks = KeyStore.getInstance("PKCS12");
            try (InputStream stream = new ByteArrayInputStream(conteudo)) {
                ks.load(stream, senha.toCharArray());
            }
            
            // Pega a primeira entrada do keystore
            String alias = ks.aliases().nextElement();
            java.security.cert.Certificate cert = ks.getCertificate(alias);
            
            if (cert instanceof java.security.cert.X509Certificate) {
                java.security.cert.X509Certificate x509 = (java.security.cert.X509Certificate) cert;
                return LocalDateTime.ofInstant(x509.getNotAfter().toInstant(), java.time.ZoneId.systemDefault());
            }
        } catch (Exception e) {
            // Se não conseguir extrair, retorna null (validação será feita depois)
            return null;
        }
        
        return null;
    }

    private String formatarData(LocalDateTime data) {
        if (data == null) {
            return "";
        }
        return java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data);
    }
}
