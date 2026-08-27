package br.jus.tst.esocialjt.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Configuração OpenAPI 3.0 (Swagger) para documentação enriquecida da API eSocial-JT.
 * Inclui exemplos, autenticação Bearer e descrição detalhada de todos os endpoints.
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI esocialOpenAPI() {
        final String securitySchemeName = "bearerAuth";

        return new OpenAPI()
                .info(new Info()
                        .title("eSocial-JT API Premium")
                        .version("2.0.0")
                        .description("API completa para gestão de eventos do eSocial com recursos premium: " +
                                "Dashboard em tempo real, Validações de Folha, Auditoria, Webhooks e Sandbox.\n\n" +
                                "**Recursos:**\n" +
                                "- Geração de eventos S-1000, S-1005, S-1200, S-2200, etc.\n" +
                                "- Envio de lotes para o eSocial\n" +
                                "- Dashboard analítico com KPIs\n" +
                                "- Validações preventivas de folha de pagamento\n" +
                                "- Audit Trail completo (LGPD)\n" +
                                "- Webhooks para integração assíncrona\n" +
                                "- Sandbox para testes com dados sintéticos")
                        .contact(new Contact()
                                .name("Equipe eSocial-JT")
                                .email("esocial@tst.jus.br")
                                .url("https://github.com/tst-esocial"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")))
                .addServersItem(new Server()
                        .url("http://localhost:8080")
                        .description("Servidor Local de Desenvolvimento"))
                .addServersItem(new Server()
                        .url("https://homologacao.esocial.jus.br")
                        .description("Ambiente de Homologação"))
                .schemaRequirement(securitySchemeName, new SecurityScheme()
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("bearer")
                        .bearerFormat("JWT")
                        .description("Token JWT obtido via Keycloak ou autenticação local"))
                .security(List.of(new SecurityRequirement().addList(securitySchemeName)));
    }
}
