package com.azienda.classiOggetti.esempio2.model;

public class CorsoDue {
	private Docente docente;
	private String materia;
	int crediti;

	public CorsoDue(Docente doc, String materia, int crediti) {
		docente = doc;
		this.materia = materia;
		this.crediti = crediti;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getCrediti() {
		return crediti;
	}

	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}
	public String info() {
		return materia + " " + crediti + docente.getNome() + " " +docente.getCognome();
	}
	// metodi di utilities
	// metodo che modifica il nome di docente
	public void setNomeDocente(String nome) {
		// controllo se docente è diverso da null, se diverso cambio il nome 
		if(docente != null) {
			docente.setNome(nome);
		}
	}
	public String getNomeDocenteMaiuscolo() {
		if(docente != null && docente.getNome()!= null) {
			return docente.getNome().toUpperCase();
		}
		return null;
	}

}
