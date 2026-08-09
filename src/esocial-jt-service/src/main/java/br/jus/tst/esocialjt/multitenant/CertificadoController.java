package br.jus.tst.esocialjt.multitenant;

import br.jus.tst.esocialjt.negocio.exception.BusinessException;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Controller REST para gerenciamento de certificados digitais por tenant.
 * 
 * @author eSocial-JT
 */
@RestController
@RequestMapping("/api/tenants/{tenantId}/certificados")
public class CertificadoController {

    @Autowired
    private CertificadoDinamicoService certificadoService;

    /**
     * Lista todos os certificados de um tenant.
     * 
     * GET /api/tenants/{tenantId}/certificados
     */
    @GetMapping
    public ResponseEntity<List<TenantCertificado>> listarCertificados(@PathVariable String tenantId) {
        List<TenantCertificado> certificados = certificadoService.listarCertificadosPorTenant(tenantId);
        return ResponseEntity.ok(certificados);
    }

    /**
     * Obtém informações do certificado ativo do tenant atual.
     * 
     * GET /api/tenants/{tenantId}/certificados/ativo/info
     */
    @GetMapping("/ativo/info")
    public ResponseEntity<TenantCertificadoDTO> obterCertificadoAtivo(@PathVariable String tenantId) {
        // Define o contexto do tenant para a requisição
        TenantContextHolder.setTenantId(tenantId);
        try {
            TenantCertificadoDTO info = certificadoService.getCertificadoInfo();
            if (info == null) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(info);
        } finally {
            TenantContextHolder.clear();
        }
    }

    /**
     * Verifica se o tenant possui certificado ativo.
     * 
     * GET /api/tenants/{tenantId}/certificados/verificar
     */
    @GetMapping("/verificar")
    public ResponseEntity<Map<String, Object>> verificarCertificado(@PathVariable String tenantId) {
        boolean possui = certificadoService.possuiCertificadoAtivo(tenantId);
        
        Map<String, Object> response = Map.of(
            "tenantId", tenantId,
            "possuiCertificadoAtivo", possui
        );
        
        return ResponseEntity.ok(response);
    }

    /**
     * Registra um novo certificado para o tenant.
     * 
     * POST /api/tenants/{tenantId}/certificados
     * Content-Type: multipart/form-data
     */
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<TenantCertificado> registrarCertificado(
            @PathVariable String tenantId,
            @RequestParam("nome") String nome,
            @RequestParam("tipo") String tipo,
            @RequestParam("arquivo") org.springframework.web.multipart.MultipartFile arquivo,
            @RequestParam("senha") String senha,
            @RequestParam(value = "numeroSerie", required = false) String numeroSerie) {
        
        try {
            byte[] conteudo = arquivo.getBytes();
            
            TenantCertificado.TipoCertificado tipoEnum = 
                TenantCertificado.TipoCertificado.valueOf(tipo.toUpperCase().replace("-", "_"));
            
            TenantCertificado cert = certificadoService.registrarCertificado(
                tenantId,
                nome,
                tipoEnum,
                conteudo,
                senha,
                numeroSerie
            );
            
            return ResponseEntity.ok(cert);
            
        } catch (BusinessException e) {
            throw e;
        } catch (Exception e) {
            throw new BusinessException(
                "ERRO_UPLOAD_CERTIFICADO",
                "Falha ao processar o arquivo do certificado. Verifique o formato e tente novamente."
            );
        }
    }

    /**
     * Ativa um certificado específico.
     * 
     * PUT /api/tenants/{tenantId}/certificados/{certId}/ativar
     */
    @PutMapping("/{certId}/ativar")
    public ResponseEntity<Void> ativarCertificado(
            @PathVariable String tenantId,
            @PathVariable Long certId) {
        
        certificadoService.ativarCertificado(certId, tenantId);
        return ResponseEntity.ok().build();
    }

    /**
     * Inativa um certificado específico.
     * 
     * PUT /api/tenants/{tenantId}/certificados/{certId}/inativar
     */
    @PutMapping("/{certId}/inativar")
    public ResponseEntity<Void> inativarCertificado(
            @PathVariable String tenantId,
            @PathVariable Long certId) {
        
        certificadoService.inativarCertificado(certId, tenantId);
        return ResponseEntity.ok().build();
    }

    /**
     * Gera uma nova chave de criptografia para uso em variável de ambiente.
     * 
     * POST /api/tenants/certificados/gerar-chave-cripto
     */
    @PostMapping("/gerar-chave-cripto")
    public ResponseEntity<Map<String, String>> gerarChaveCriptografia(@Autowired CriptografiaService criptoService) {
        
        String chave = criptoService.gerarChaveCriptografia();
        
        Map<String, String> response = Map.of(
            "chaveCriptografia", chave,
            "instrucao", "Armazene esta chave na variável de ambiente ESOCIAL_CHAVE_CRIPTOGRAFIA"
        );
        
        return ResponseEntity.ok(response);
    }
}
