package com.azienda.classiOggetti.esercizioDue.model;

public class Persona {

	private String nome;
	private String cognome;
	private boolean sposata;
	private int numeroFigli;


	//Costruttore 
	public Persona() {
		System.out.println("Costruttore vuoto creato");
	}
	//Costruttore parametrico
	public Persona(String nome, String cognome, boolean sposata, int numeroFigli) {
		this.nome = nome;
		this.cognome = cognome;
		this.sposata = sposata;
		this.numeroFigli = numeroFigli;
	}
	// set - get nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	// set - get cognome
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCognome() {
		return cognome;
	}
	// set - get sposata
	public void setStato(boolean sposata) {
		this.sposata = sposata;
	}
	public boolean getStato() {
		return sposata;
	}
	// set - get numerofigli
	public void setNumeroFigli(int numeroFigli) {
		this.numeroFigli = numeroFigli;
	}
	public int getNumeroFigli() {
		return numeroFigli;
	}
	//metodo incrementaFigli
	public void incrementaFiglio(int incrementa) {
		if (numeroFigli + incrementa < 0) {
			System.out.println("Errore: il numero di figli non può diventare negativo.");
		} else {
			this.numeroFigli += incrementa;

		}
	}
	//metodo getInfo
	public String getInfo() {
		return "=== Informazioni Persona ===\n" +
	               "Nome: " + nome + 
		           "\nCognome: " + cognome + 
		           "\nSposata: " + (sposata ? "Sì" : "No") + 
		           "\nNumero di figli: " + numeroFigli + 
		           "\n===========================";
	}
}
