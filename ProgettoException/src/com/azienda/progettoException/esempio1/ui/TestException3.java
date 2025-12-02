package com.azienda.progettoException.esempio1.ui;

import java.util.Scanner;

public class TestException3 {

	public static void main(String[] args) {
		//creazione più compatta, il blocco finally c'è ma lo fa java in automatico 
		try(Scanner sc =  new Scanner(System.in) ) {
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
		System.out.println("Programma terminato");
	}

}
