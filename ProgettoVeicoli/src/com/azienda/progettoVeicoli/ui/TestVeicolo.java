package com.azienda.progettoVeicoli.ui;

import java.util.Scanner;

import com.azienda.progettoVeicoli.model.Automobile;
import com.azienda.progettoVeicoli.model.Treno;

public class TestVeicolo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		creaVeicolo(sc);
		sc.close();
	}
	public static void creaVeicolo(Scanner sc) {
		int scelta;
		do {
			// Mostra il menu
			System.out.println("\nScegli il tipo di veicolo:");
			System.out.println("1. Treno");
			System.out.println("2. Automobile");
			System.out.println("0. Esci");
			System.out.print("La tua scelta: ");
			scelta = sc.nextInt();
			sc.nextLine(); 

			if(scelta == 1){
				//creazione treno
				System.out.println("E' stato scelto di creare il treno ");
				newTreno();
			} else if(scelta == 2) {
				//creazione auto
				System.out.println("E' stato scelto di creare un automobile");
				newAuto();
			}else if(scelta == 0) {
				System.out.println("Chiusura programma");
			} else {
				System.out.println("Scelta non valida riprova");
			}
		}while(scelta != 0);

	}
	public static void newAuto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire il tipo di modello");
		String modello = sc.nextLine();
		System.out.println("Inserire la cilindrata");
		float cilindrata= sc.nextFloat();
		float velocita = controllaVelocita(sc);

		// Crea l'oggetto Automobile senza impostare la velocità
		Automobile a = new Automobile(velocita, modello, cilindrata); // Passa velocita 0 al costruttore

		// Imposta la velocità usando il setter
		//a.setVelocitaMax(velocita);

		// Mostra le informazioni dell'auto
		infoAuto(a);
	}
	public static void infoAuto(Automobile a) {
		System.out.println(a);
	}
	public static void newTreno() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire la località di partenza");
		String partenza = sc.nextLine();
		System.out.println("Inserire la località di arrivo");
		String arrivo = sc.nextLine();
		float velocita = controllaVelocita(sc);
		// Crea l'oggetto Automobile senza impostare la velocità
		Treno t = new Treno(velocita,partenza,arrivo);
		// Imposta la velocità usando il setter
		//t.setVelocitaMax(velocita);
		infoTreno(t);
	}
	public static void infoTreno(Treno t) {
		System.out.println(t);
	}
	public static float controllaVelocita(Scanner sc) {
		// Richiedi la velocità e imposta il valore con il setter
		float velocita = 0;
		while (velocita <= 0) {
			System.out.println("Inserire la velocità (numero positivo):");
			while (!sc.hasNextFloat()) {
				System.out.println("Per favore inserisci un numero valido per la velocità.");
				sc.next(); // Consuma l'input errato
			}
			velocita = sc.nextFloat();
			sc.nextLine(); // Consuma il newline residuo
		}
		return velocita;
	}
}
