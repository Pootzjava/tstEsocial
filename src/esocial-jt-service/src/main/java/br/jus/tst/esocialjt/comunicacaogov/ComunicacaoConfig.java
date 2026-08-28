package br.jus.tst.esocialjt.comunicacaogov;

import javax.net.ssl.SSLSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender;

import br.jus.tst.esocialjt.TipoAmbiente;
import br.jus.tst.esocialjt.certificado.negocio.CertificadoDinamicoService;

import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;

@Configuration
public class ComunicacaoConfig {
	
	@Autowired
	CertificadoDinamicoService certificadoDinamicoService;
	
	@Value("${esocialjt.ambiente}")
	TipoAmbiente ambiente;
	
	@Bean
	public ComunicacaoServico criarComunicacaoServico(Jaxb2Marshaller marshaller) {
		ComunicacaoServico servico = new ComunicacaoServico();
		servico.setMarshaller(marshaller);
		servico.setUnmarshaller(marshaller);
		
		// Agora usa o serviço dinâmico de certificados por tenant
		servico.setMessageSender(getHttpsMessageSender());
		
		servico.setActionEnviarLoteGov(ComunicacaoParametros.ENVIAR_ACTION);
		servico.setActionConsultaLoteGov(ComunicacaoParametros.CONSULTAR_ACTION);
		if(ambiente == TipoAmbiente.PRODUCAO_RESTRITA) {
			servico.setUrlEnviarLoteGov(ComunicacaoParametros.URL_ENVIAR_LOTE_EVENTOS_PRODUCAO_RESTRITA);
			servico.setUrlConsultaLoteGov(ComunicacaoParametros.URL_CONSULTAR_LOTE_EVENTOS_PRODUCAO_RESTRITA);
		}
		
		if(ambiente == TipoAmbiente.PRODUCAO) {
			servico.setUrlEnviarLoteGov(ComunicacaoParametros.URL_ENVIAR_LOTE_EVENTOS_PRODUCAO);
			servico.setUrlConsultaLoteGov(ComunicacaoParametros.URL_CONSULTAR_LOTE_EVENTOS_PRODUCAO);
		}
		
		return servico;
	}
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setCheckForXmlRootElement(false);
		marshaller.setContextPaths(
				br.jus.esocialjt.comunicacao.wsdl.EnviarLoteEventos.class.getPackage().getName(),
				br.jus.esocialjt.comunicacao.lote.eventos.consulta.ESocial.class.getPackage().getName()
			);
		return marshaller;
	}
	
	private WebServiceMessageSender getHttpsMessageSender() {
		HttpsUrlConnectionMessageSender messageSender = new HttpsUrlConnectionMessageSender();
		
		// Carrega certificado dinamicamente baseado no tenant atual
		KeyStore keyStore = certificadoDinamicoService.loadKeyStoreForCurrentTenant();
		
		try {
			// Extrai KeyManagers do KeyStore
			String keyPassword = ""; // A senha já está protegida no próprio keystore
			KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
			kmf.init(keyStore, keyPassword.toCharArray());
			messageSender.setKeyManagers(kmf.getKeyManagers());
			
			// TrustManagers padrão (confia nas CAs do sistema)
			TrustManagerFactory tmf = TrustManagerFactory.getInstance(
				TrustManagerFactory.getDefaultAlgorithm());
			tmf.init((KeyStore)null);
			messageSender.setTrustManagers(tmf.getTrustManagers());
			
		} catch (Exception e) {
			throw new br.jus.tst.esocialjt.negocio.exception.BusinessException(
				"ERRO_CONFIGURACAO_SSL",
				"Falha ao configurar conexão SSL com certificado digital. Verifique se o certificado está válido."
			);
		}
		
		messageSender.setHostnameVerifier((String hostname, SSLSession session) -> true);
		return messageSender;
	}
}
