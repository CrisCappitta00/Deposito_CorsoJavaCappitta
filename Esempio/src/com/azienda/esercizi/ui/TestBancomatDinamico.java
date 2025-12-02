package com.azienda.esercizi.ui;

import java.util.Scanner;

public class TestBancomatDinamico {

	public static void main(String[] args) {
		double saldo;
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserire il saldo iniziale");
		saldo = sc.nextDouble();
		menu(sc, saldo);

		System.out.println("Programma Terminato");
		sc.close();
	}
	public static void menu(Scanner sc, double saldo) {
		int numero;
		System.out.println("Benvenuto utente");
		do {
			System.out.println("Per proseguire scegliere: \n0 = Esci");
			if(saldo > 0) {
				System.out.println("1 = Preleva"); //solo se saldo > 0 mostro preleva
			}
			System.out.println("2 = Versa");
			
			numero = sc.nextInt();
			if(numero == 0) {
				System.out.println("Uscita...\nArrivederci!");
				break;
			}
			//chiamo il metodo che gestisce l'operazione scelta
			saldo = esecuzioneOperazioni(numero, saldo, sc);
			
		}while(true);
	}

	public static double esecuzioneOperazioni(int num, double saldo, Scanner sc) {
		if(num == 1) {
			// prelievo
			if(saldo > 0) {
				System.out.println("Inserisci l'importo da prelevare");
				double importo = sc.nextDouble();

				if(importo <= saldo) {
					saldo -= importo;
					System.out.println("Prelievo effettuato, il saldo attuale è: " + saldo);
				}else {
					System.out.println("Non ci sono fondi sufficienti");
				}
			}else {
				System.out.println("Il saldo è zero non puoi prelevare");
			}

		} else if(num == 2) {
			// versamento
			System.out.println("Inserire l'importo da versare");
			double importo = sc.nextInt();
			saldo += importo;
			System.out.println("Versamento effettuato, il saldo attuale è: " + saldo);
		}
		return saldo; //ritorno il saldo
	}

}
