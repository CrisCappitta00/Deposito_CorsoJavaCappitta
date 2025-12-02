package com.azienda.esercizi.ui;

import java.util.Scanner;

public class EsercizioCiclo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire il primo numero");
		int a = sc.nextInt();
		if (a <= 0) {
			System.out.println("Si deve inputare un numero maggiore di 0");
			sc.close();
			return; //termino il programma
		}else {
			System.out.println("Inserire il secondo numero");
			int b = sc.nextInt();
			if(b <= 0) {
				System.out.println("Si deve inputare un numero maggiore di 0");
				sc.close();
				return; //termino il programma
			}else if(b >= a) {
				System.out.println("Si deve inputare un numero minore di " + a);
				sc.close();
				return; //termino il programma
			}else {
				for (int i = 0; i < a; i++) {
					if(i == b) {
						continue; //salto se i = b
					}
					System.out.println(i);
				}	
			}
		}
		System.out.println("Programma Terminato");
		sc.close();
	}

}
