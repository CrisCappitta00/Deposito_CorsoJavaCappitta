package com.azienda.interfacce.esempio1.ui;

import com.azienda.interfacce.esempio1.model.DbConnection;
import com.azienda.interfacce.esempio1.model.OracleDbConnection;
import com.azienda.interfacce.esempio1.model.postGresDbConnection;

public class TestDbConnection {

	public static void main(String[] args) {
		// Essendo un interfaccia non possiamo fare = new interfaccia perché è incompleta
		// dobbiamo scegliare quale tra le due classi che la implementano usare
		DbConnection database = new OracleDbConnection() ; //polimorfismo
		database.open("", "", "");
		database.close();
		if(database instanceof OracleDbConnection) {
			//faccio il cast e poi chiamo il metodo 
			((OracleDbConnection)database).oracleInsert();
		}
		database = new postGresDbConnection();
		database.open("", "", "");
		database.close();
		if(database instanceof postGresDbConnection) {
			//faccio il cast e poi chiamo il metodo 
			((postGresDbConnection)database).postGresInsert();;
		}
	}
	//se lavoro su parti comuni devo andare sul genitore, perché i metodi sono già presenti nel padre
	private static void metodo(DbConnection db) {
		db.open(null, null, null);
		db.close();
	}
	//il secondo metodo è sempre sbagliato meglio il primo, i metodi interni sono entrambi nell'interfaccia 
	private static void metodo2(OracleDbConnection db) {
		db.open(null, null, null);
		db.close();
	}
	// in input lavoro con interface 
	// flessibile, tendenzialmente è preferibile usarlo
	//questo metodo è utile per ogni possibilità di connessione al database
	// è un problema quando diventa troppo complicato
	private static void metodo3(DbConnection db) {
		db.open(null, null, null);
		db.close();
		if(db instanceof OracleDbConnection) {
			//faccio il cast e poi chiamo il metodo 
			((OracleDbConnection)db).oracleInsert();
		}
	}
	//elastico
	//il metodo lavora senza bisogno dell'interfaccia direttamente con la classe 
	private static void metodo4(OracleDbConnection db) {
		db.open(null, null, null);
		db.close();
		db.oracleInsert();
	}
}
