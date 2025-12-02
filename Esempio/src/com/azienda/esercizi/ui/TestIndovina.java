package com.azienda.esercizi.ui;

import java.util.Random;
import java.util.Scanner;

public class TestIndovina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int numScelto;
		do {
			System.out.println("Inserire un numero compreso tra 0 e 4(6: per terminare)");
			numero = sc.nextInt();
			if(numero != 6) {
				controlla(numero);
			}

		}while(numero != 6);
		//se ho inserito 6 il ciclo si interrompe e passo al secondo gioco
		System.out.println("Scegli un numero massimo diverso da 0");
		numScelto = sc.nextInt();
        
        // Verifica che il numero scelto sia maggiore di 0
        while (numScelto <= 0) {
            System.out.println("Errore: il numero massimo deve essere maggiore di 0. Riprova:");
            numScelto = sc.nextInt();
        }
		do {
			System.out.println("Inserire un numero compreso tra 0 e " + numScelto + " (16: per terminare)");
			numero = sc.nextInt();
			if(numero != 16) {
				controllaMax(numero);
			}

		}while(numero != 16);
		// ho inserito 16 termino direttamente il programma
		System.out.println("Programma Terminato");
		sc.close();
	}

	public static void controlla(int num) {
		//istanzio la classe
		Random random = new Random();
		int numero = random.nextInt(5);
		if(num == numero) {
			System.out.println("Hai indovinato: " + numero + " = " + num);
		}else {
			System.out.println("Hai sbagliato, il numero da indovinare era: " + numero);
		}
	}

	public static void controllaMax(int num) {
		Random r = new Random();
		int numero = r.nextInt(num + 1); // numero random tra 0 e max inclusi
		if(num == numero) {
			System.out.println("Hai indovinato: " + numero + " = " + num);
		}else {
			System.out.println("Hai sbagliato, il numero da indovinare era: " + numero);
		}
	}

}
