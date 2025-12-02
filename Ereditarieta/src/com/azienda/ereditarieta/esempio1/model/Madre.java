package com.azienda.ereditarieta.esempio1.model;

public class Madre extends Nonno {
	private String nomeMadre;
	public Madre() {
		super();
		System.out.println("Costruttore madre");
	}
	public String getNomeMadre() {
		return nomeMadre;
	}
	public void setNomeMadre(String nomeMadre) {
		this.nomeMadre = nomeMadre;
	}
	
}
