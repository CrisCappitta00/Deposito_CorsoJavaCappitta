package com.azienda.classiOggetti.conto.model;

public class Banca {
	private String nome;
	private Indirizzo indirizzo;
	//costruttore parametrico
	public Banca(String nome, Indirizzo indirizzo) {
		this.nome = nome;
		this.indirizzo = indirizzo;
	}
	// getter and setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String descrizione() {
		return "=== Informazioni della Banca===\n" +
				"Nome della banca: " + nome + 
				"\n"+ indirizzo.descrizione() +
				"\n===========================";
	}

}
