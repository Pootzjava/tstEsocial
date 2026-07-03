package br.jus.tst.esocial.dominio.beneficio.alteracao;

import javax.validation.constraints.NotNull;

public class InstPenMorte {

	@NotNull
	private String tpDepInst;

	private String descrDepInst;

	public String getTpDepInst() {
		return tpDepInst;
	}

	public void setTpDepInst(String tpDepInst) {
		this.tpDepInst = tpDepInst;
	}

	public String getDescrDepInst() {
		return descrDepInst;
	}

	public void setDescrDepInst(String descrDepInst) {
		this.descrDepInst = descrDepInst;
	}
}
