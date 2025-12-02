package com.azienda.classiOggetti.conto.model;

public class ContoCorrente {
	private String numeroConto;
	private float saldo;
	private Banca banca;
	//costruttore parametrico
	public ContoCorrente(String numeroConto, float saldo, Banca banca) {
		super();
		this.numeroConto = numeroConto;
		this.saldo = saldo;
		this.banca = banca;
	}
	// getter and setter
	public String getNumeroConto() {
		return numeroConto;
	}
	public void setNumeroConto(String numeroConto) {
		this.numeroConto = numeroConto;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Banca getBanca() {
		return banca;
	}
	public void setBanca(Banca banca) {
		this.banca = banca;
	}
	public String descrizione() {
		return "=== Informazioni del conto corrente ===\n" +
				"Numero del conto: " + numeroConto + 
				"\n Saldo: " + saldo +
				"\n"+ banca.descrizione() +
				"\n===========================";
	}
	public String getNomeBanca() {
		if(banca != null) {
			return banca.getNome();
		}
        return null; // nessuna banca associata
	}
	public void setNomeBanca(String nome) {
		if(banca != null) {
			banca.setNome(nome);
		}
	}
	public String getCittaBanca() {
		if(banca != null && banca.getIndirizzo() != null) {
			return banca.getIndirizzo().getCitta();
		}
		return null; // nessuna banca o indirizzo associato

	}
	public void setCittaBanca(String citta) {
		if(banca != null && banca.getIndirizzo() != null) {
			banca.getIndirizzo().setCitta(citta);
		}
	}
}
