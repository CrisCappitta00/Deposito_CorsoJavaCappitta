package com.azienda.classiOggetti.arredamento.model;

public class Stanza {
	private String nome;
	private String colore;
	private float metriQuadri;
	private float altezza;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public float getMetriQuadri() {
		return metriQuadri;
	}

	public void setMetriQuadri(float metriQuadri) {
		this.metriQuadri = metriQuadri;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	public Stanza(String nome, String colore, float metriQuadri, float altezza) {
		super();
		this.nome = nome;
		this.colore = colore;
		this.metriQuadri = metriQuadri;
		this.altezza = altezza;
	}
	public void incrementaMetriQuadri(float incr) {
		metriQuadri += incr;
	}
	public void decrementaMetriQuadri(float decr) {
		metriQuadri -= decr;
	}
	public float incrementaAltezza(float altezza) {
		return this.altezza += altezza; 
	}
	public float decrementaAltezza(float altezza) {
		return this.altezza -= altezza; 
	}
	public String stampaStanza() {
		return "=== Informazioni Stanza ===\n" +
				"Nome della stanza: " + nome + 
				"\nColore: " + colore + 
				"\nNumero dei metri quadra: " + metriQuadri + 
				"\nNumero dell'altezza: " + altezza + 
				"\n===========================";
	}
}
