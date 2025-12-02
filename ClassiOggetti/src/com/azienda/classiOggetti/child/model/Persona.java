package com.azienda.classiOggetti.child.model;

public class Persona {
	public String nome;
	public String cognome;
	private float altezza;
	private static int contatorePersona = 0;
	
	public Persona(String nome, String cognome,float altezza) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.altezza = altezza;
		contatorePersona++;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public float getAltezza() {
		return altezza;
	}
	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}
	public static int getContatorePersona() {
		return contatorePersona;
	}
	public static void setContatorePersona(int contatorePersona) {
		Persona.contatorePersona = contatorePersona;
	}
	@Override
	public String toString() {
		return "Nome:" + nome + " - cognome: " + cognome + " - altezza: " + altezza ;
	}

}
