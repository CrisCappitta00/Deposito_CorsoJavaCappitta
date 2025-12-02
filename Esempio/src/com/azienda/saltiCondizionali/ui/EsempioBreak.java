package com.azienda.saltiCondizionali.ui;

public class EsempioBreak {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break; // al tre break esce
			}
			System.out.println(i);
		}
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue; //continue salta il 3 in questo case
			}
			System.out.println(i);
		}
		System.out.println("Programma Terminato");
	}
}
