package com.azienda.progettoIndustria.model;

public class Fabbrica {
	private String nome;
	private Indirizzo indirizzo;
	private int autoProdotte;

	public Fabbrica(String nome, Indirizzo indirizzo) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.autoProdotte = 0; // parte sempre da 0
	}
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
	public int getAutoProdotte() {
		return autoProdotte;
	}
	public void produciAuto() {
		autoProdotte ++; // incremento di 1 
	}
	public String infoFabbrica() {
		return
				" Nome della Fabbrica: " + nome + " - " + indirizzo.infoIndirizzo();
	}

}
