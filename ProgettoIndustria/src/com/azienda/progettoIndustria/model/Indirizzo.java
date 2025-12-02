package com.azienda.progettoIndustria.model;

public class Indirizzo {
    private String nazione;
    private String citta;
    private String stradaPiazza;
    private String cap;
    
	public Indirizzo(String nazione, String citta, String stradaPiazza, String cap) {
		super();
		this.nazione = nazione;
		this.citta = citta;
		this.stradaPiazza = stradaPiazza;
		this.cap = cap;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getStradaPiazza() {
		return stradaPiazza;
	}

	public void setStradaPiazza(String stradaPiazza) {
		this.stradaPiazza = stradaPiazza;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}
    public String infoIndirizzo() {
		return "Nazione: " + nazione + " - " + "città: " + citta + " - " + "Strada-Piazza: " + stradaPiazza +" - " + "CAP: "  + cap;
    }
   
}
