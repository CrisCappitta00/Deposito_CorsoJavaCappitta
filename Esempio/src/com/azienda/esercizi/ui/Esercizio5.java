package com.azienda.esercizi.ui;

import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {
		/*
		 * Creare una classe Operatori5 con un metodo main, che:

         * riceva in input da console due booleani (chiedendo prima
         * all’utente l’inserimento per ciascuno dei due)

         * stampi a console la and dei due booleani

         * stampi a console la or dei due booleani

         * stampi a console il not del primo booleano

         * stampi a console il not del secondo booleano

         * le stampe a console devono venire così (supponendo di ricevere
         * in input true e false):

         * La and di true e false vale: false

         * L'or di true e false vale: true

         * Il not di true vale: false

         * Il not di false vale: true
		 * 
		 * 
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		boolean x;
		boolean y;
		System.out.println("Assegnare a x un valore booleano tra true o false");
		x = sc.nextBoolean();
		System.out.println("Assegnare a y un valore booleano tra true o false");
		y = sc.nextBoolean();
		boolean c = x && y;
		boolean d = x || y;
		boolean a = !x;
		boolean b = !y;
		System.out.println("And di " + x + " e " + y + " vale: " + c);
		System.out.println("Or di " + x + " e " + y + " vale: " + d);
		System.out.println("Il not di " + x + " vale: " + a);
		System.out.println("Il not di " + y + " vale: " + b);
		sc.close();
		
	}

}
