package com.azienda.classiOggetti.esercizio.ui;

import java.util.Scanner;

import com.azienda.classiOggetti.esercizio.model.Libro; // import della classe Libro

public class TestLibro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("Inserire le informazioni del libro che si vuole creare");
		System.out.println("Inserire il titolo");
		String titolo = sc.nextLine();
		System.out.println("Inserire l'autore");
		String autore = sc.nextLine();
		System.out.println("Inserire il prezzo");
		float prezzo = sc.nextFloat();
		System.out.println("Inserire il numero di pagine");
		int numeroPagine = sc.nextInt();
		// Libro 
		Libro book = new Libro(titolo,autore,prezzo,numeroPagine);
		System.out.println(book.getInfo());
		//
		System.out.println("Inserire un aggiunta di prezzo");
		float secondoPrezzo = sc.nextFloat();
		book.incrementaPrezzo(secondoPrezzo);
		System.out.println("Informazioni libro aggiornate");
		System.out.println(book.getInfo());
		
		System.out.println("Programma Terminato");
		sc.close();

	}

}
