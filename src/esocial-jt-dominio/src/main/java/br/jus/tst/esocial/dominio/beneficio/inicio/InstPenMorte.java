package br.jus.tst.esocial.dominio.beneficio.inicio;

import java.util.Calendar;

import jakarta.validation.constraints.NotNull;

public class InstPenMorte {
	@NotNull
	private String cpfInst;
	
	@NotNull
	private Calendar dtInst;

	private String tpDepInst;

	private String descrDepInst;

	public String getCpfInst() {
		return cpfInst;
	}

	public void setCpfInst(String cpfInst) {
		this.cpfInst = cpfInst;
	}

	public Calendar getDtInst() {
		return dtInst;
	}

	public void setDtInst(Calendar dtInst) {
		this.dtInst = dtInst;
	}

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
