package com.azienda.interfacce.esempio1.model;

public interface DbConnection {
	//per la connessione al database
	public void open(String url, String user, String password); //parametri necessari
	public void close();
	//può avere attributi costanti o metodi astratti, scrivo la firma del metodo senza il corpo
}
