package com.azienda.progettoException.esempio3.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMultipleException2 {

	public static void main(String[] args) {
		// a livello strutturale i codici che gestiscono le gestioni devono essere in questo modo
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Inserisci primo numero");
			int x = sc.nextInt();
			System.out.println("Inserisci secondo numero");
			int y = sc.nextInt();
			int z = x / y ; 
			System.out.println(z);
		}catch (InputMismatchException | ArithmeticException e) { // possiamo anche fare una or nella catch
			// questo accorpamento non si può fare se le classi sono padre e figlia
			System.out.println("Dovevi inserire un numero");
			e.printStackTrace();
		}catch (Exception e) { // il catch più generico in fondo 
			System.out.println("Errore imprevisto.");
			e.printStackTrace();
		}
	}

}
