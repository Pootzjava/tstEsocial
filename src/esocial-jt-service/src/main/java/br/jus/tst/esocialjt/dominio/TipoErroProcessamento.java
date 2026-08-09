package br.jus.tst.esocialjt.dominio;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "EST_TIPO_ERRO_PROCESSAMENTO")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "TipoErroProcessamento.findAll", query = "SELECT e FROM TipoErroProcessamento e"),
		@NamedQuery(name = "TipoErroProcessamento.findByDescricao", query = "SELECT e FROM TipoErroProcessamento e WHERE e.descricao = :descricao") })
public class TipoErroProcessamento implements Serializable {

	private static final long serialVersionUID = 3675898429939256502L;

	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "COD_TIPO_ERRO_PROCESSAMENTO")
	private Long id;

	@Size(max = 15)
	@Column(name = "DES_TIPO_OCORRENCIA")
	private String descricao;

	public TipoErroProcessamento() {
	}

	public TipoErroProcessamento(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
