package com.azienda.classiOggetti.esercizio.model;

public class Libro {
	/*
	 * attributi:
	 * titolo e autore di tipo String
	 * prezzo float
	 * numeroPagine int
	 * */
	private String titolo;
	private String autore;
	private float prezzo;
	private int numeroPagine;

	//Costruttore 
	public Libro() {
    System.out.println("Costruttore vuoto creato");
	}
	//Costruttore parametrico
	public Libro(String titolo, String autore, float prezzo, int numeroPagine) {
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
		this.numeroPagine = numeroPagine;
	}
	// set - get titolo
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getTitolo() {
		return titolo;
	}
	// set - get autore
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getAutore() {
		return autore;
	}
	// set - get prezzo
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	public float getPrezzo() {
		return prezzo;
	}
	// set - get numeroPagine
	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	public int getNumeroPagine() {
		return numeroPagine;
	}
	//metodo incrementaPrezzo
	public void incrementaPrezzo(float incrementa) {
		if (incrementa > 0) {
			this.prezzo += incrementa; // se incrementa > 0 cioè positivo allora prezzo += incrementa(prezzo = prezzo + incrementa)
		}else {
			System.out.println("Aumento prezzo non valido deve essere positivo");
		}
	}
	//metodo setinfo
	//	public void setInfo(String titolo, String autore, float prezzo, int numeroPagine) {
	//		this.titolo = titolo;
	//		this.autore = autore;
	//		this.prezzo = prezzo;
	//		this.numeroPagine = numeroPagine;
	//	}
	//metodo getInfo
	public String getInfo() {
		return "Titolo: " + titolo + " Autore: " + autore + " Prezzo: " + prezzo + " Numero delle Pagine: " + numeroPagine;
	}
}
