package com.azienda.esercizi.ui;

import java.util.Scanner;

public class EsercizioCicloBloccante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		do {
			System.out.println("Inserire il primo numero");
			a = sc.nextInt();
			if (a <= 0) {
				System.out.println("Si deve inputare un numero maggiore di 0");
			}
		}while(a <= 0);
		do {
			System.out.println("Inserire il secondo numero");
			b = sc.nextInt();
			if (b <= 0) {
				System.out.println("Si deve inputare un numero maggiore di 0");
			}else if(b >=a) {
				System.out.println("Si deve inputare un numero minore di " + a);
			}
		}while(b <= 0 || b >= a);
		for (int i = 0; i < a; i++) {
			if(i == b) {
				continue; //salto se i = b
			}
			System.out.println(i);
		}	
		System.out.println("Programma Terminato");	
		sc.close();
	}

}
