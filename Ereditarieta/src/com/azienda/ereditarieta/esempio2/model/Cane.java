package com.azienda.ereditarieta.esempio2.model;

public class Cane extends Animale {
	private String sesso;	
	public Cane() {
		super("Pluto");
	}
	public Cane(String nome) {
		super(nome);
	}
	public Cane(String nome, String sesso) {
		super(nome);
		this.sesso = sesso;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
}
