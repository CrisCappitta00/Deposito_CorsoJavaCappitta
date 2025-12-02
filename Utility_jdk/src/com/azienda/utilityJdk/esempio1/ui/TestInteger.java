package com.azienda.utilityJdk.esempio1.ui;

import java.util.Scanner;

public class TestInteger {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int primitivo = 10;
			Integer oggetto = primitivo; // autoboxing -> conversione automatica da primitivo ad oggetto
			oggetto = 11;
			primitivo = oggetto;
			Integer oggetto2 = 10;
			try {
				int x = Integer.parseInt("15s");

			} catch (Exception e) {
				System.out.println("Errore conversione");	
			}
			System.out.println("Inserisci un numero");
			String message = sc.nextLine();
			try {
				int x = Integer.parseInt(message); // per evitare il problema del next int , ed evitare di introdurre next line usiamo parseInt 
				//NB INTEGER può tornare null se crea un oggetto e può tornare una null pointer exception
			} catch (Exception e) {
				System.out.println("Errore conversione");	
			}
			System.out.println("Programma Terminato");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
