package com.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conta {
	
	@Column(name = "conta_numero")
	private Long numero;
	
	@Column(name = "conta_saldo")
	private Double valor;
	
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
