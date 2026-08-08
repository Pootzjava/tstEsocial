package br.jus.tst.esocial.dominio.afasttemp;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class InfoMandSind {

	@NotNull
	@Pattern(regexp = "\\d{8,14}")
	private String cnpjSind;

	private byte infOnusRemun;

	public String getCnpjSind() {
		return cnpjSind;
	}

	public void setCnpjSind(String cnpjSind) {
		this.cnpjSind = cnpjSind;
	}

	public byte getInfOnusRemun() {
		return infOnusRemun;
	}

	public void setInfOnusRemun(byte infOnusRemun) {
		this.infOnusRemun = infOnusRemun;
	}
}
