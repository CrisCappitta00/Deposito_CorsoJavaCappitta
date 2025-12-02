package com.azienda.progettoVeicolo2.ui;

import java.util.Scanner;

import com.azienda.progettoVeicolo2.model.Aereo;
import com.azienda.progettoVeicolo2.model.Automobile;
import com.azienda.progettoVeicolo2.model.Nave;
import com.azienda.progettoVeicolo2.model.Treno;
import com.azienda.progettoVeicolo2.model.Veicolo;

public class TestVeicolo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu(sc);
		sc.close();
		System.out.println("Programma Terminato");
	}
	public static void menu(Scanner sc) {
		int scelta;
		do {
			System.out.println("Scegliere quale veicolo di quelli elencati si vuole creare: \n1=Automobile \n2=Treno \n3=Aereo \n4=Nave \n5=esci");
			scelta = sc.nextInt();
			sc.nextLine();
			float velocita;
			if(scelta >= 1 && scelta <= 4) {
				System.out.println("Assegnare una velocità massima");
				velocita = sc.nextFloat();
				sc.nextLine();
				switch (scelta) {
				case 1:
					System.out.println("Assegnare un valore di cilindrata");
					float cilindrata = sc.nextFloat();
					sc.nextLine();
					Automobile auto = new Automobile(velocita , cilindrata);
					stampaInfo(auto);
					break;
				case 2:
					System.out.println("Assegnare una località di partenza");
					String partenza = sc.nextLine();
					System.out.println("Assegnare una località di arrivo");
					String arrivo = sc.nextLine();
					Treno t = new Treno(velocita, partenza, arrivo);
					stampaInfo(t);
					break;
				case 3:
					System.out.println("Definire se è di linea o meno. \nUsare True o False");
					boolean linea = sc.nextBoolean();
					Aereo a = new Aereo(velocita,linea);
					stampaInfo(a);
					break;
				case 4:

					System.out.println("Inserire il numero di cabine");
					int cabine = sc.nextInt();
					sc.nextLine();
					Nave nave = new Nave(velocita, cabine);
					stampaInfo(nave);
					break;
				case 5:
					System.out.println("Chiusa in corso...");
					break;
				default :
					System.out.println("Scelta non valida. Riprova.");
					break;
				}
			}else if (scelta != 5) {
				System.out.println("Scelta non valida. Riprova.");
			}
		}while(scelta != 5);
	}
	public static void stampaInfo(Veicolo v) {
		System.out.println("Velocità massima: " + v.getVelocitaMax());
		if(v instanceof Automobile) {
			System.out.println("Cilindrata: " + ((Automobile) v).getCilindrata());

		} else if(v instanceof Treno) {
			System.out.println("Località di Partenza: " + ((Treno) v).getLocalitaPartenza() + " Località di arrivo: " + ((Treno) v).getLocalitaArrivo() );
		} else if(v instanceof Aereo) {
			System.out.println("Di linea: " + ((Aereo) v).getDiLinea());
		} else if(v instanceof Nave) {
			System.out.println("Numero Cabine: " + ((Nave) v).getNumeroCabine());
		}
		System.out.println(v);
	}

}
