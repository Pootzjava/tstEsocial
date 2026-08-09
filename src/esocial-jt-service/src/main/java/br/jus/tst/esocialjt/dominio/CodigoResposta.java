package br.jus.tst.esocialjt.dominio;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import br.jus.tst.esocial.validacao.OneOf;

@Entity
@Table(name = "EST_RESPOSTA_GOV")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "CodigoRetorno.obterResposta", query = "SELECT c FROM CodigoResposta c WHERE c.codResposta = :codResposta AND c.codGrupoResposta = :codGrupoResposta") })
public class CodigoResposta implements Serializable {
	private static final long serialVersionUID = -4355034469986851475L;
	
	public static final int RESPOSTA_GOV_LOTE = 1;
	public static final int RESPOSTA_GOV_EVENTO = 2;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RESPOSTA_ID")
	@SequenceGenerator(name = "SEQ_RESPOSTA_ID", sequenceName = "SEQ_RESPOSTA_ID", allocationSize = 1, initialValue = 100)
	@Column(name = "COD_IDENTIFICADOR", unique = true, nullable = false, precision = 22, scale = 0)
	private Long id;

	@Size(max = 300)
	@Column(name = "DES_RESPOSTA")
	private String desResposta;

	@NotNull
	@OneOf({1, 2})
	@Column(name = "COD_GRUPO_RESPOSTA")
	private int codGrupoResposta;

	@NotNull
	@Column(name = "COD_RESPOSTA")
	private Long codResposta;

	public CodigoResposta() {
	}

	/**
	 * 
	 * @param codGrupoResposta
	 *            <a>Valor 1 para resposta de LOTE</a></br>
	 *            <a>Valor 2 para resposta de EVENTO</a></br>
	 * @param codResposta
	 * @param desTipoRetorno
	 */
	public CodigoResposta(int codGrupoResposta, Long codResposta, String desTipoRetorno) {
		this.codGrupoResposta = codGrupoResposta;
		this.codResposta = codResposta;
		this.desResposta = desTipoRetorno;
	}

	public int getCodGrupoResposta() {
		return codGrupoResposta;
	}

	/**
	 * <a>Valor 1 para resposta de LOTE</a></br>
	 * <a>Valor 2 para resposta de EVENTO</a></br>
	 * 
	 * @param codGrupoResposta
	 * @return CodigoRetorno
	 */
	public CodigoResposta setCodGrupoResposta(int codGrupoResposta) {
		this.codGrupoResposta = codGrupoResposta;
		return this;
	}

	public Long getCodResposta() {
		return codResposta;
	}

	public CodigoResposta setCodResposta(Long codResposta) {
		this.codResposta = codResposta;
		return this;
	}

	public Long getId() {
		return id;
	}

	public String getDesResposta() {
		return desResposta;
	}

	public void setDesResposta(String desTipoRetorno) {
		this.desResposta = desTipoRetorno;
	}
}
