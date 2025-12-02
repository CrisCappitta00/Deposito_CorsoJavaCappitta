package com.azienda.utilityJdk.esempio1.ui;

import java.util.Iterator;

public class TestString {

	public static void main(String[] args) {
		try {
			String s = "Ciao";
			// lunghezza stringa
			int l = s.length();
			//
			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.charAt(i) + "\t"); // char at mi dà il carattere
			}
			//se voglio concatenare 2 stringhe: 
			String s2 = "Ciao".concat(" Mario Rossi");
			// indexof restituisce una int
			int post = s.indexOf("ia");
			post = s.indexOf("IA");
			post = "dado".lastIndexOf("d");
			//contains -> ritorna una boolean, ricerca la stringa
			boolean d = "pippo".contains("pp"); // ritorna true 
			d = "pippo".contains("PP"); // ritorna false
			// contains riguarda le collection che va a vedere se un elemento è presente o meno
			// il contains della stringa si basa sulla logica di uguaglianza delle stringhe
			// to uppercase
			String s3 = "Mario".toUpperCase();
			// to lower case
			String s4 = "Mario".toLowerCase();
			//equals
			d = "Mario".equals("mario"); // per la logica delle stringhe restituisce false
			d = "Mario".equalsIgnoreCase("mario"); // restituisce true
			//trim per togliere spazi in testa e coda 
			String s5 = "  Mario Rossi  ";
			String s6 = s5.trim();
			System.out.println("Programma Terminato");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
