package com.azienda.classiOggetti.esempio2.model;

public class Docente {
	private String nome;
	private String cognome;

	public Docente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCognome() {
		return cognome;
	}
	
}
