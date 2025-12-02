package com.azienda.ereditarieta.esempio5.model;

public class Automobile {
	private String modello;
	private float cilindrata;
	private int prezzo;
	public Automobile(String modello, float cilindrata, int prezzo) {
		super();
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.prezzo = prezzo;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public float getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(float cilindrata) {
		this.cilindrata = cilindrata;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return modello + " " + cilindrata + " " + prezzo;
	}
//	@Override // fatto da eclipse
//	public String toString() {
//		return "Automobile [modello=" + modello + ", cilindrata=" + cilindrata + ", prezzo=" + prezzo + "]";
//	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
	
	

}
