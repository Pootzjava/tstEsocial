package br.jus.tst.esocialjt.auditoria;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class AuditoriaAspect {

    @Autowired
    private AuditoriaLogService auditoriaService;

    private Object estadoAnterior = null;

    @Pointcut("@annotation(auditable)")
    public void metodoAuditable(Auditable auditable) {}

    @Before("metodoAuditable(auditable)")
    public void capturarEstadoAnterior(JoinPoint joinPoint, Auditable auditable) {
        if (auditable.acao() == AcaoAuditoria.ATUALIZAR || auditable.acao() == AcaoAuditoria.EXCLUIR) {
            Object[] args = joinPoint.getArgs();
            if (args.length > 0) {
                // Tenta capturar o primeiro argumento como estado anterior
                this.estadoAnterior = args[0];
            }
        }
    }

    @AfterReturning(pointcut = "metodoAuditable(auditable)", returning = "resultado")
    public void registrarAuditoria(JoinPoint joinPoint, Auditable auditable, Object resultado) {
        String usuario = getUsuarioAtual();
        AcaoAuditoria acao = auditable.acao();
        String entidade = auditable.entidade();
        
        Object dadosAntigos = this.estadoAnterior;
        Object dadosNovos = resultado;

        // Extrair ID da entidade se possível
        String entidadeId = extrairId(resultado);

        auditoriaService.registrarAcao(usuario, acao, entidade, entidadeId, dadosAntigos, dadosNovos);
        
        this.estadoAnterior = null; // Limpa para próxima chamada
    }

    private String getUsuarioAtual() {
        try {
            if (SecurityContextHolder.getContext().getAuthentication() != null) {
                return SecurityContextHolder.getContext().getAuthentication().getName();
            }
        } catch (Exception e) {
            // Ignora se não houver contexto de segurança
        }
        return "sistema";
    }

    private String extrairId(Object obj) {
        if (obj == null) return null;
        try {
            // Tenta chamar getId() se existir
            java.lang.reflect.Method getIdMethod = obj.getClass().getMethod("getId");
            Object id = getIdMethod.invoke(obj);
            return id != null ? id.toString() : null;
        } catch (Exception e) {
            return null;
        }
    }
}
