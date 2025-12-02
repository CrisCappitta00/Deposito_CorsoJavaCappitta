package com.azienda.progettoIndustria.model;

public class Automobile {
	private String modello;
	private String marca;
	private String targa;
	private float cilindrata;
	private Fabbrica fabbrica;

	public Automobile(String modello, String marca, String targa, float cilindrata, Fabbrica fabbrica) {
		super();
		this.modello = modello;
		this.marca = marca;
		this.targa = targa;
		this.cilindrata = cilindrata;
		this.fabbrica = fabbrica;
		fabbrica.produciAuto(); // incremento il numero di auto prodotte
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public float getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(float cilindrata) {
		this.cilindrata = cilindrata;
	}
	public Fabbrica getFabbrica() {
		return fabbrica;
	}
	public void setFabbrica(Fabbrica fabbrica) {
		this.fabbrica = fabbrica;
	}
	public String infoAutomobile() {
		return  " Modello: " + modello + " - " +
				"marca: " + marca + " - " +
				"targa: " + targa + " - " +
				"cilindrata: " + cilindrata +
				" - fabbrica: " + fabbrica.infoFabbrica();
	}

}
