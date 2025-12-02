package com.azienda.progettoBottiglia.ui;

import com.azienda.progettoBottiglia.model.Bottiglia;
import com.azienda.progettoBottiglia.utility.Constants;

public class UsoBottiglia {

	public static void main(String[] args) {
		Bottiglia bottigliaUno = new Bottiglia(Constants.CONTENUTO_ACQUA, Constants.MATERIALE_PLASTICA, 2f, 0);
		if(bottigliaUno.aggiungi(10f)) {
			System.out.println("10 litri entrano nella bottiglia");
		}else {
			System.out.println("10 litri non entrano nella bottiglia");
		}
		bottigliaUno.stampaBottiglia();
		if(bottigliaUno.aggiungi(1f)) {
			System.out.println("1 litro entra nella bottiglia");
		}else {
			System.out.println("1 litro non entra nella bottiglia");
		}
		bottigliaUno.stampaBottiglia();
		Bottiglia bottigliaVino = new Bottiglia(Constants.CONTENUTO_VINO, Constants.MATERIALE_VETRO, 1.33f,0);
		if(bottigliaVino.aggiungi(10f)) {
			System.out.println("10 litri entrano nella bottiglia");
		}else {
			System.out.println("10 litri non entrano nella bottiglia");
		}
		bottigliaVino.stampaBottiglia();
		if(bottigliaVino.aggiungi(1f)) {
			System.out.println("1 litro entra nella bottiglia");
		}else {
			System.out.println("1 litro non entra nella bottiglia");
		}
		bottigliaVino.stampaBottiglia();

	}

}
