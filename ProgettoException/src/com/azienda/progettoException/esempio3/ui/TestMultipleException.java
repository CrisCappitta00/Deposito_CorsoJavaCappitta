package com.azienda.progettoException.esempio3.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMultipleException {

	public static void main(String[] args) {
		// a livello strutturale i codici che gestiscono le gestioni devono essere in questo modo
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Inserisci primo numero");
			int x = sc.nextInt();
			System.out.println("Inserisci secondo numero");
			int y = sc.nextInt();
			int z = x / y ; 
			System.out.println(z);
		}catch (InputMismatchException e) {
			System.out.println("Dovevi inserire un numero");
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.out.println("Dovevi mettere un numero diverso da 0");
			e.printStackTrace();
		}catch (Exception e) { // il catch più generico in fondo 
			System.out.println("Errore imprevisto.");
			e.printStackTrace();
		}
	}

}
