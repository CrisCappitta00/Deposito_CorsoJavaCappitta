package com.azienda.esercizi.ui;

import java.util.Scanner;

public class EsercizioDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Inserire un numero intero");
		number = sc.nextInt();
		if(number <= 0) {
       	 System.out.println("Si deve inputare un numero maggiore di 0");
 		 System.out.println("Programma Terminato");
       	 sc.close();
       	 return; //termino il programma
		}else {
			int contatore = 0;
			do {
				System.out.println(contatore++);
				
			}while(contatore < number);
		}
		
		System.out.println("Programma Terminato");
		sc.close();

	}

}
