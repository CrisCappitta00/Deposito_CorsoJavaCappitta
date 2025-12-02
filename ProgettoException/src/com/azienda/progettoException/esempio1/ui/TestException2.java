package com.azienda.progettoException.esempio1.ui;

import java.util.Scanner;

public class TestException2 {

	public static void main(String[] args) {
		Scanner sc = null; //dobbiamo considerare che anche new scanner potrebbe crashare 
		try {
			sc = new Scanner(System.in);
			System.out.println("Inserire il primo numero");
			int x = sc.nextInt();
			System.out.println("Inserire il secondo numero");
			int y = sc.nextInt();
			int z = x / y;
			System.out.println(z);
		} catch (Exception e) {
			e.printStackTrace(); 
			int a = 3 / 0;
		}
		finally { //serve a chiudere le risorse
			sc.close();
		}
		System.out.println("Programma terminato");
	}

}
