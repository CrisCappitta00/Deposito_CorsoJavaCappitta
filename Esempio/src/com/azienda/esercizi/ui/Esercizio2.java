package com.azienda.esercizi.ui;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		/*
		 * Creare una classe Operatori2 con un metodo main, che:
         *  riceva in input da console due numeri interi (chiedendo prima all’utente l’inserimento per ciascuno dei due)
         *  sommi i due numeri
         *  stampi a console il risultato della somma, con una stringa del tipo «la somma dei due numeri fa: » concatenata col risultato
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int somma;
		System.out.println("Assegnare un valore intero alla variabile x:");
		x = sc.nextInt();
		System.out.println("Assegnare un valore intero alla variabile y:");
		y = sc.nextInt();
		somma = x + y;
		System.out.println("La somma dei due numeri è: " + somma);		
		sc.close();
		 

	}

}
