package com.azienda.classiOggetti.esempio2.ui;

import com.azienda.classiOggetti.esempio2.model.CorsoDue;
import com.azienda.classiOggetti.esempio2.model.Docente;

public class TestCorsoDue {

	public static void main(String[] args) {
		Docente doc = new Docente("Mario", "Rossi");
		CorsoDue c = new CorsoDue(doc, "Java", 10);
		c.getDocente().setNome("Anna");
		// per evitare la null pointer faccio: 
//		if(c != null && c.getDocente()!= null && c.getDocente().getNome()!=null) {
//			System.out.println(c.getDocente().getNome().toUpperCase());
//		}
		//altrimenti il tutto può essere fatto sfruttando: 
		c.getNomeDocenteMaiuscolo();
		//		c.getDocente().setNome(null);
		//		System.out.println(c.getDocente().getNome().toUpperCase());
		c.setDocente(null);
		//		if(c.getDocente() != null) {
		//			c.getDocente().setNome("Anna");
		//		} questo diventa: 
		c.setNomeDocente("Anna");
		System.out.println("Programma Terminato");
	}
}
