package com.azienda.classiOggetti.arredamento.model;

public class Tavolo {
	private String materiale;
	private float altezza;
	private float larghezza;
	private float spessore;
	private Stanza stanza;

	public Tavolo(String materia, float altezza, float larghezza, float spessore, Stanza stanza) {
		super();
		this.materiale = materia;
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.spessore = spessore;
		this.stanza = stanza;
	}
	public String getMateriale() {
		return materiale;
	}
	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}
	public float getAltezza() {
		return altezza;
	}
	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}
	public float getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(float larghezza) {
		this.larghezza = larghezza;
	}
	public float getSpessore() {
		return spessore;
	}
	public void setSpessore(float spessore) {
		this.spessore = spessore;
	}
	public Stanza getStanza() {
		return stanza;
	}
	public void setStanza(Stanza stanza) {
		this.stanza = stanza;
	}
	public String descrizioneTavolo() {
		return "=== Informazioni Tavolo ===\n" +
				"Materiale del tavolo " + materiale + 
				"\nAltezza: " + altezza + 
				"\nLarghezza: " + larghezza + 
				"\nSpessore: " + spessore + 
				"\n" + stanza.stampaStanza() + 
				"\n===========================";
	}
}
