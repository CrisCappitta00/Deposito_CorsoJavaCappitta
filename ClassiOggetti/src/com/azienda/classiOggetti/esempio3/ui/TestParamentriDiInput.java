package com.azienda.classiOggetti.esempio3.ui;

import com.azienda.classiOggetti.esempio3.model.Persona;

public class TestParamentriDiInput {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int risultato =  somma(a, b);
		System.out.println(risultato);
		Persona p = new Persona("Mario", "Rossi");
		cambiaNome(p);
		System.out.println("Programma Terminato");
	}
	private static int somma(int x, int y) {
		x = 5;
		y = 6;
		int z = x+y;
		return z;
	}
	private static void cambiaNome(Persona persona) {
		persona.setNome("Laura");
	}

}
