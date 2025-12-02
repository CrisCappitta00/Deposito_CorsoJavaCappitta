package com.azienda.esercizi.ui;

import java.util.Scanner;

public class TestMinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		boolean check;
		do {
			//chiedo i tre numeri
			System.out.println("Inserire il primo valore intero, altrimenti 0 per terminare il programma");
			num1 = sc.nextInt();
			// se i num == 0 termino
			if(num1 == 0) {
				break;
			}
			System.out.println("Inserire il secondo valore intero, altrimenti 0 per terminare il programma");
			num2 = sc.nextInt();
			if(num2 == 0) {
				break;
			}
			System.out.println("Inserire il terzo valore intero, altrimenti 0 per terminare il programma");
			num3 = sc.nextInt();
			if(num3 == 0) {
				break;
			}
			// chiedo il valore booleano
			System.out.println("Assegnare un valore a scelta tra true o false alla variabile booleana");
			check = sc.nextBoolean();
			// invoco il metodo minMax
			int ritorno = minMax(num1,num2,num3, check);
			// invoco un ulteriore metodo per stampare il risultato 
			stampaRisultato(ritorno, check);
		}while(true); //continuo finché non inserisco 0

		System.out.println("Programma Terminato");
		sc.close();
	}

	public static int minMax(int a, int b, int c, boolean check) {
		int ris;
		
		if(check == true) {
			//controllo il minimo 
			if(a <= b && a <= c) {
				ris = a;
			}else if(b <= a && b <=c) {
				ris = b;
			}else {
				ris = c;
			}
		}else {
			// controllo il massimo
			if(a >= b && a >= c) {
				ris = a;
			}else if(b >= a && b >=c) {
				ris = b;
			}else {
				ris = c;
			}
		}
		return ris;
	}
	public static void stampaRisultato(int r, boolean c) {
		if(c == true) {
			System.out.println("Il minimo è: " + r);
		}else {
			System.out.println("Il massimo è: " + r );
		}

	}
}
