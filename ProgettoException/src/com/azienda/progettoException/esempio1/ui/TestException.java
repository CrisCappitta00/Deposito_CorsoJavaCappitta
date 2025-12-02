package com.azienda.progettoException.esempio1.ui;

public class TestException {

	public static void main(String[] args) {
		try {
			int x = 2;
			int y = 0;
			int z = x / y ;
			System.out.println(z);
		} catch (Exception e) {
			System.out.println("Errore. ");
			e.printStackTrace(); // metodo non statico, devo chiamarlo sull'oggetto 'e' non sulla classe
		}
		System.out.println("Programma terminato");
	}

}
