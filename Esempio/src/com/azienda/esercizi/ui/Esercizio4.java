package com.azienda.esercizi.ui;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		/*
		 * Creare una classe Operatori4 con un metodo main, che:
         * riceva in input da console due numeri interi (chiedendo prima all’utente l’inserimento per ciascuno dei due) a e b
         * sfruttando l’operatore ternario () ? :  confronti a e b e 
         * assegni ad una stringa s il valore «a maggiore o uguale di b», oppure «b maggiore di a» a seconda dei casi
         * stampi a console la stringa s
		 * 
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Assegnare un valore intero alla variabile a");
		a = sc.nextInt();
		System.out.println("Assegnare un valore intero alla variabile b");
		b = sc.nextInt();
		
		String s = (a >= b) ? "a maggiore o uguale di b" : "b maggiore di a";
		System.out.println(s);
		
		sc.close();

	}

}
