package br.jus.tst.esocialjt.webhook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface WebhookRepository extends JpaRepository<Webhook, Long> {
    List<Webhook> findByTenantIdAndAtivoTrue(String tenantId);
    List<Webhook> findByTenantIdAndEventosContainingAndAtivoTrue(String tenantId, String evento);
}
