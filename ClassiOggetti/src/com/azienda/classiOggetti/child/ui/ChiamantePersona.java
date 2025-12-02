package com.azienda.classiOggetti.child.ui;

import com.azienda.classiOggetti.child.model.Bambino;
import com.azienda.classiOggetti.child.model.Persona;


public class ChiamantePersona {

	public static void main(String[] args) {
		personeCreate();
		bambiniNati();
		System.out.println("Persone nate: " + Persona.getContatorePersona() );
		System.out.println("Bambini nati: " + Bambino.getContatore() );
	}
	public static void bambiniNati() {
		//creo 10 bambini con nomi e cognome
		for (int i = 0; i < 10; i++) {
			Bambino b = new Bambino(" Nome_" + i ,"Cognome_" + i , 110.0f);
			//b.cresce(10f);
			System.out.println(b);
		}
	}
	public static void personeCreate() {
		//creo 10 persone con nomi e cognome
		for (int i = 0; i < 10; i++) {
			Persona p = new Persona(" Nome_" + i, "Cognome_" + i, 180.0f);
			System.out.println(p);

		}
	}

}
