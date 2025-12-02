package com.azienda.classiOggetti.conto.model;

public class Indirizzo {
	private String citta;
	private String stradaPiazza;
	private int numeroCivico;
	//costruttore parametrico
	public Indirizzo(String citta, String stradaPiazza, int numeroCivico) {
		this.citta = citta;
		this.stradaPiazza = stradaPiazza;
		this.numeroCivico = numeroCivico;
	}
	// getter and setter
	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getStradaPiazza() {
		return stradaPiazza;
	}

	public void setStradaPiazza(String stradaPiazza) {
		this.stradaPiazza = stradaPiazza;
	}

	public int getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(int numeroCivico) {
		this.numeroCivico = numeroCivico;
	}
	public String descrizione() {
		return "=== Informazioni dell'indirizzo ===\n" +
				"Nome della citta: " + citta + 
				"\nStrada o Piazza: " + stradaPiazza + 
				"\nNumero civico: " + numeroCivico + 
				"\n===========================";
	}

}
