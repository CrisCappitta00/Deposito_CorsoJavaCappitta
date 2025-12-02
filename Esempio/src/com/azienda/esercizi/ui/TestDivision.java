package com.azienda.esercizi.ui;

import java.util.Scanner;

public class TestDivision {

	public static void main(String[] args) {
		/*
		 * creare una classe TestDivisione con 2 metodi:
		 * main
		 * divisione
		 * il metodo divisione, dati due double, 
		 * deve stampare a video il risultato della divisione dei due numeri. 
		 * Però, prima di effettuare la divisione deve fare un controllo ( if ) 
		 * sul secondo numero: se questo è pari a zero deve stampare a video un 
		 * messaggio di errore altrimenti 
		 * deve procedere con la divisione e stampare il risultato 
		 * della divisione
		 * il metodo main deve invocare il metodo divisione passandogli 
		 * due numeri double richiesti all’utente tramite Scanner.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire il primo numero");
		double a = sc.nextDouble();
		System.out.println("Inserire il secondo numero");
		double b = sc.nextDouble();
		divisione(a,b);
		System.out.println("Programma Terminato");
		sc.close();
	}
	static void divisione(double a, double b) {
		if(b == 0) {
			System.out.println("Errore il secondo numero è pari a " + b + " impossibile effettuare la divisione");
		}else {
			double risultato = a / b;
			System.out.println("Risultato " + risultato);
		}
	}

}
