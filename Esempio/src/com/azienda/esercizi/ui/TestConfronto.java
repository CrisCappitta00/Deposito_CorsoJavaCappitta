package com.azienda.esercizi.ui;

import java.util.Scanner;

public class TestConfronto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Dichiarazione variabili e richiesta dei valori all'utente
		System.out.println("Inserire il primo numero intero");
		int a = sc.nextInt();
		System.out.println("Inserire il secondo numero intero");
		int b = sc.nextInt();
		int risultato = confronta(a, b);
		//Controllo risultato
		if(risultato == -1) {
			System.out.println("Il primo numero è minore del secondo");
		}else if(risultato == 0) {
			System.out.println("I due numeri sono uguali " + a + " " + b);
		}else if(risultato == 1) {
			System.out.println("Il primo numero è maggiore del secondo");
		}

		System.out.println("Programma Terminato");
		sc.close();

	}
	public static int confronta(int a, int b) {

		if(a < b) {
			return -1;
		}else if(a == b) {
			return 0;
		}else {
			return 1;
		}
	}

}
