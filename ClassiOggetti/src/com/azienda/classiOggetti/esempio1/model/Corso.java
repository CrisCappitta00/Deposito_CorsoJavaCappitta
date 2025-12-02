package com.azienda.classiOggetti.esempio1.model;

public class Corso {
	// tre attributi private -> PROTETTI COSI' NESSUNO DA ESTERNO PUO' ACCEDERVI
	private String docente = "Luigi"; // se l'attributo è pubblico il codice chiamante può riutilizzarlo
	private String materia;
	private int crediti;
	//blocco di inizializzazione in cui tocchiamo solo attributi
	{
		docente = "Claudia";
	}    
	//costruttori: HANNO SEMPRE L'ULTIMA PAROLA
	//creazione metodo costruttore privo di parametri
	// posso decidere io i valori di default degli attributi
	//altrimenti sono usati quelli di Java  
	public Corso () {
		System.out.println("Costruttore vuoto"); // costruttore privo di parametri di input
		docente = "Mario";
		// se non tocco materia rimane null e crediti rimane a 0
	}
	//nuovo costruttore (overloading - 2 o più metodi con lo stesso nome ma cambiano i parametri)
	public Corso(String doc, String materia, int crediti) {
		docente = doc;
		this.materia = materia; // per togliere ambiguità per il conflitto di nomi uso this.materia = alla materia parametro del costruttore
		this.crediti = crediti;
	}
	// metodi da creare se gli elementi sono private
	// metodo che mi dà l'accesso in scrittura all'attributo private
	public void setDocente(String docente) {
		this.docente = docente;                   //POSSO FARE CONTROLLI SUL SETTAGGIO DEL DOCENTE PER ESEMPIO SE NULL NON ACCETTO DOCENTI
	}
	// metodo che dà al chiamante l'accesso in lettura
	public String getDocente() {
		return docente; // altrimenti this.docente è uguale ci riferiamo sempre al docente di questa classe
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getMateria() {
		return materia;
	}
	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}
	public int getCrediti() {
		return crediti;
	}
	//Utile per cambiare tutte le info di un oggetto
	public void setAll(String docente, String materia, int crediti) {
		this.docente = docente;
		this.materia = materia;
		this.crediti = crediti;
	}
	// metodo che prende tutti gli attributi concatenati in una sola stringa -> conversione del mio oggetto corso a Stringa
	public String getAll() {
		return "Docente: " + docente + " materia: " + materia +  " crediti: " + crediti ;
	}
}
