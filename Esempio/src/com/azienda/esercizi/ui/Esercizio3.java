package com.azienda.esercizi.ui;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		/*
		 * Creare una classe Operatori3 con un metodo main, che:
         *   riceva in input da console un numero intero
         *   stampi a console il numero effettuando contemporaneamente un
         *   post-incremento del numero
         *   stampi a console il valore del numero (quindi successivamente
         *   rispetto al post-incremento)
         *   stampi a console il numero effettuando contemporaneamente un
         *   pre-incremento del numero
         *   stampi a console il valore del numero (quindi successivamente
         *   rispetto al pre-incremento)
         *   per le 4 stampe a console si concatenino i valori dei numeri con
         *   delle stringhe esplicative*/
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("Assegnare un valore intero alla variabile x");
		x = sc.nextInt();
		System.out.println("Valore assegnato: " + x++ ); // post incremento
		System.out.println("Valore attuale: " + x);
		System.out.println("Valore preincremento: " + ++x); // preincremento
		System.out.println("Valore attuale: " + x);
		
		sc.close();

	}

}
