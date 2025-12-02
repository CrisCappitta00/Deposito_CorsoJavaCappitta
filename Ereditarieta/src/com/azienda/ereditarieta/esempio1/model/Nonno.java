package com.azienda.ereditarieta.esempio1.model;

public class Nonno extends Object{
	private String nomeNonno;
	public Nonno() {
		super();
		System.out.println("Costruttore di nonno");
		nomeNonno = "Luigi";
	}
	public String getNomeNonno() {
		return nomeNonno;
	}
	public void setNomeNonno(String nomeNonno) {
		this.nomeNonno = nomeNonno;
	}
	
}
