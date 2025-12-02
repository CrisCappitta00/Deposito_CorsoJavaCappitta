package com.azienda.esercizi.ui;

import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) {
      /*
       * Creare una classe Operatori6 con un metodo main, che:

       * riceva in input da console un numero intero

       * incrementi il numero di 10 usando la notazione abbreviata
       * (+=)

       * stampi a console una stringa seguendo questa regola:

       * supponendo che il numero in ingresso sia 4, la stringa
       * stampata dovrà essere: «Incrementando 4 di 10 si ottiene 14»

       * attenzione al fatto che la notazione abbreviata modifica il
       * valore della variabile, quindi attenzione a non perdere il valore
       * del numero di partenza (nell’esempio 4)
       * 
       * */
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Assegnare un valore alla variabile");
		x = sc.nextInt();
		int x_iniziale = x;
		System.out.println("Incrementando " + x_iniziale + " di 10 si ottiene " + (x += 10));
		sc.close();
		
	}

}
