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

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "EST_GRUPO_TIPO_EVENTO")
@NamedQueries({ @NamedQuery(name = "GrupoTipoEvento.findAll", query = "SELECT e FROM GrupoTipoEvento e"),
		@NamedQuery(name = "GrupoTipoEvento.findByDescricao", query = "SELECT e FROM GrupoTipoEvento e WHERE e.descricao = :descricao") })
public class GrupoTipoEvento implements Serializable {

	private static final long serialVersionUID = -9079287043407466600L;

	public static final GrupoTipoEvento TABELA = new GrupoTipoEvento(1l);
	public static final GrupoTipoEvento NAO_PERIODICO = new GrupoTipoEvento(2l);
	public static final GrupoTipoEvento PERIODICO = new GrupoTipoEvento(3l);

	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "COD_GRUPO_TIPO")
	private Long id;

	@Size(max = 100)
	@Column(name = "TXT_DESCRICAO")
	private String descricao;

	public GrupoTipoEvento() {
	}

	public GrupoTipoEvento(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public GrupoTipoEvento setId(Long id) {
		this.id = id;
		return this;
	}

	public String getDescricao() {
		return descricao;
	}

	public GrupoTipoEvento setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof GrupoTipoEvento)) {
			return false;
		}
		GrupoTipoEvento castOther = (GrupoTipoEvento) other;
		return new EqualsBuilder().append(id, castOther.id).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).toHashCode();
	}
}
