package com.azienda.classiOggetti.esercizio.ui;

import java.util.Scanner;

import com.azienda.classiOggetti.esercizio.model.Libro;

public class TestoLibroAggiunta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu(sc);
		System.out.println("Programma Terminato");
		sc.close();
	}
	public static void menu(Scanner sc) {
		Libro libroRegistrato = null; // nessun libro registrato
		int num;
		System.out.println("Benvenuto");
		do {
			System.out.println("0 = Chiudi programma");
			System.out.println("1 = Registra un nuovo libro");
			System.out.println("2 = Modifica il libro");
			System.out.println("3 = Visualizza info del libro");

			num = sc.nextInt();
			sc.nextLine(); // pulizia buffer

			if (num == 0) {
				System.out.println("Uscita...\n Arrivederci!");
				break;
			} 
			else if (num == 1) {
				libroRegistrato = registraLibro(sc);   // SALVIAMO IL LIBRO
				System.out.println("Libro registrato!");
			} 
			else if (num == 2) {
				if (libroRegistrato == null) {
					System.out.println("Nessun libro registrato!");
				} else {
					modificaLibro(sc, libroRegistrato);
				}
			} 
			else if (num == 3) {
				if (libroRegistrato == null) {
					System.out.println("Nessun libro registrato!");
				} else {
					System.out.println(libroRegistrato.getInfo());
				}
			}

		} while (true);		
	}
	// creo un metodo di tipo libro che mi ritorna un nuovo oggetto di tipo libro
	public static Libro registraLibro(Scanner sc) {
		System.out.println("Inserire le informazioni del libro che si vuole creare");
		System.out.println("Inserire il titolo");
		String titolo = sc.nextLine();
		System.out.println("Inserire l'autore");
		String autore = sc.nextLine();
		System.out.println("Inserire il prezzo");
		float prezzo = sc.nextFloat();
		System.out.println("Inserire il numero di pagine");
		int numeroPagine = sc.nextInt();
		sc.nextLine();
		// Libro 
		return new Libro(titolo,autore,prezzo,numeroPagine);
	}
	public static void modificaPrezzo(Scanner sc, Libro book) {
		System.out.println("Quanto vuoi incrementare il prezzo ?");
		float secondoPrezzo = sc.nextFloat();
		book.incrementaPrezzo(secondoPrezzo);
	}

	public static void modificaLibro(Scanner sc, Libro book) {
		System.out.println("Cosa vuoi modificare?");
		System.out.println("1 = Titolo");
		System.out.println("2 = Autore");
		System.out.println("3 = Prezzo");
		System.out.println("4 = Numero pagine");

		int scelta = sc.nextInt();
		sc.nextLine();


		switch (scelta) {
		case 1:
			System.out.println("Nuovo titolo:");
			book.setTitolo(sc.nextLine());
			break;
		case 2:
			System.out.println("Nuovo Autore:");
			book.setAutore(sc.nextLine());
			break;
		case 3: 
			modificaPrezzo(sc,book);
			break;
		case 4:
			System.out.println("Nuovo Numero di Pagine:");
			book.setNumeroPagine(sc.nextInt());
			break;
		default:
			System.out.println("Scelta non valida!");
		}
	};
}
