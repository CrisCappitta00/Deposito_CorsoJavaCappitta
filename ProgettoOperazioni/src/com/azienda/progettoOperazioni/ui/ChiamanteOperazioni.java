package com.azienda.progettoOperazioni.ui;

import java.util.Scanner;

import com.azienda.progettoOperazioni.model.Differenza;
import com.azienda.progettoOperazioni.model.Divisione;
import com.azienda.progettoOperazioni.model.OperazioniAritmetiche;
import com.azienda.progettoOperazioni.model.Prodotto;
import com.azienda.progettoOperazioni.model.Somma;

public class ChiamanteOperazioni {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu(sc);
		sc.close();
	}
	public static void menu(Scanner sc) {
		int scelta;
		do {
			System.out.println("Effettuare una scelta tra i seguenti numeri di seguito elencati \n 1=somma \n 2= differenza \n 3 = prodotto \n 4 = divisione \n 5 = esci");
			scelta = sc.nextInt();
			operazioneScelta(scelta, sc);
		}while(scelta != 5);
	}
	public static void operazioneScelta(int scelta, Scanner sc) {

		switch (scelta) {
		case 1:
			System.out.println("E' stata scelta la somma");
			operazioneUno(sc);
			break;
		case 2:
			System.out.println("E' stata scelta la differenza");
			operazioneDue(sc);
			break;
		case 3:
			System.out.println("E' stato scelto il prodotto ");
			operazioneTre(sc);
			break;
		case 4 : 
			System.out.println("E' stata scelta la divisione");
			operazioneQuattro(sc);
			break;
		case 5:
			System.out.println("E' stato scelto di uscire dal programma \nChiusura in corso... \nProgramma Terminato");
		default:
			if(scelta > 5) {
				System.out.println("Per favore inserire un numero valido");
			}
			break;
		}
	}
	public static void operazioneUno(Scanner sc) {
		int num1;
		int num2;
		OperazioniAritmetiche object = new Somma();
		System.out.println("Inserire il primo valore numerico");
		num1 = sc.nextInt();
		System.out.println("Inserire il secondo valore numerico");
		num2 = sc.nextInt();
		object.printResult(object.operate(num1, num2));
	}
	public static void operazioneDue(Scanner sc) {
		int num1;
		int num2;
		OperazioniAritmetiche object = new Differenza();
		System.out.println("Inserire il primo valore numerico");
		num1 = sc.nextInt();
		System.out.println("Inserire il secondo valore numerico");
		num2 = sc.nextInt();
		object.printResult(object.operate(num1, num2));
	}
	public static void operazioneTre(Scanner sc) {
		int num1;
		int num2;
		OperazioniAritmetiche object = new Prodotto();
		System.out.println("Inserire il primo valore numerico");
		num1 = sc.nextInt();
		System.out.println("Inserire il secondo valore numerico");
		num2 = sc.nextInt();
		object.printResult(object.operate(num1, num2));
	}
	public static void operazioneQuattro(Scanner sc) {
		int num1;
		int num2;
		OperazioniAritmetiche object = new Divisione();
		System.out.println("Inserire il primo valore numerico");
		num1 = sc.nextInt();
		System.out.println("Inserire il secondo valore numerico");
		num2 = sc.nextInt();
		// Verifica la divisione per zero
		if (object instanceof Divisione && num2 == 0) {
			System.out.println("Errore: divisione per zero.");
			return;
		}
		object.printResult(object.operate(num1, num2));
	}
}
