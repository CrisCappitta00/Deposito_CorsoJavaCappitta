package com.azienda.progettoBottiglia.model;

public class Bottiglia {
	private String contenutoUno;
	private String materialeUno;
	private float capacitaMassima;
	private float quantitaAttualeLiquido;

	public Bottiglia(String contenutoUno, String materialeUno, float capacitaMassima, float quantitaAttualeLiquido) {
		super();
		this.contenutoUno = contenutoUno;
		this.materialeUno = materialeUno;
		this.capacitaMassima = capacitaMassima;
		this.quantitaAttualeLiquido = quantitaAttualeLiquido;
	}
	public String getContenutoUno() {
		return contenutoUno;
	}
	public void setContenutoUno(String contenutoUno) {
		this.contenutoUno = contenutoUno;
	}
	public String getMaterialeUno() {
		return materialeUno;
	}
	public void setMaterialeUno(String materialeUno) {
		this.materialeUno = materialeUno;
	}
	public float getCapacitaMassima() {
		return capacitaMassima;
	}
	public void setCapacitaMassima(float capacitaMassima) {
		this.capacitaMassima = capacitaMassima;
	}
	public float getQuantitaAttualeLiquido() {
		return quantitaAttualeLiquido;
	}
	public void setQuantitaAttualeLiquido(float quantitaAttualeLiquido) {
		this.quantitaAttualeLiquido = quantitaAttualeLiquido;
	}
	public boolean isEmpty() {
		return quantitaAttualeLiquido <= 0; // ritorna true se la quantità del liquido è < 0 
	}
	// se pieno
	public boolean isFull() {
		return quantitaAttualeLiquido >= capacitaMassima;
	}
	public void stampaBottiglia() {
		System.out.println( "Questa è una bottiglia di " + materialeUno + 
				" da " + capacitaMassima + " litri e contiene " + 
				quantitaAttualeLiquido + " litri di " + contenutoUno );
	}
	public boolean aggiungi(float incr) {
		//se bottiglia piena non aggiungo
		if(quantitaAttualeLiquido >= capacitaMassima) {
			return false;
		}
		// se non c'è capienza sufficiente, non aggiungo
		if(quantitaAttualeLiquido + incr > capacitaMassima) {
			return false;
		}
		quantitaAttualeLiquido += incr;
		return true;
	}
	public boolean preleva(float prelievo) {
		//se bottiglia vuota non prelevo
		if(quantitaAttualeLiquido <= 0) {
			return false;
		}
		// se non c'è liquido sufficiente, non prelevo
		if(quantitaAttualeLiquido < prelievo) {
			return false;
		}
		quantitaAttualeLiquido -= prelievo;
		return true;
	}

}
