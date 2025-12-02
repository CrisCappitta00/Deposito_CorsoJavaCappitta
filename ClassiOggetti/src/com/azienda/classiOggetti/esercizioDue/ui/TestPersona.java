package com.azienda.classiOggetti.esercizioDue.ui;

import java.util.Scanner;

import com.azienda.classiOggetti.esercizioDue.model.Persona;

public class TestPersona {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		archivio(sc);
		System.out.println("Programma Terminato");
		sc.close();
	}
	public static void archivio(Scanner sc) {
		Persona registraPersona = null; // nessun persona registrata
		int num;
		System.out.println("Benvenuto");
		do {
			System.out.println("0 = Chiudi programma");
			System.out.println("1 = Registra una Persona");
			System.out.println("2 = Modifica le informazioni");
			System.out.println("3 = Visualizza le informazioni");

			num = sc.nextInt();
			sc.nextLine(); // pulizia buffer

			if (num == 0) {
				System.out.println("Uscita...\n Arrivederci!");
				break;
			} 
			else if (num == 1) {
				registraPersona = creaPersona(sc); 
				System.out.println("La persona è stata registrata in archivio!");
			} 
			else if (num == 2) {
				if (registraPersona == null) {
					System.out.println("Nessuna persona registrata!");
				} else {
					modificaPersona(sc, registraPersona);
				}
			} 
			else if (num == 3) {
				if (registraPersona == null) {
					System.out.println("Nessuna persona registrata!");
				} else {
					System.out.println(registraPersona.getInfo());
				}
			}

		} while (true);		
	}

	public static Persona creaPersona(Scanner sc) {
		System.out.println("Inserire le informazioni della persona che si vuole registrare");
		String nome;
		String cognome;
		Boolean sposata = null;
		int numeroFigli;

		do {
			System.out.println("Inserire il nome");
			nome = sc.nextLine();
			if(nome.isEmpty()) {
				System.out.println("Errore: il nome non può essere vuoto!");
			}
		}while(nome.isEmpty());
		do {
			System.out.println("Inserire il cognome");
			cognome = sc.nextLine();
			if(cognome.isEmpty()) {
				System.out.println("Errore: il cognome non può essere vuoto!");
			}
		}while(cognome.isEmpty());

		while(sposata == null) {
			System.out.println("E' sposata? \nInserire true o false per indicarlo");
			//creo un ulteriore controllo per true o false 
			if (sc.hasNextBoolean()) {
				sposata = sc.nextBoolean();
				sc.nextLine();

				if (sposata) {
					System.out.println(nome + " risulta sposata");
				} else {
					System.out.println(nome + " non risulta sposata");
				}

			} else {
				System.out.println("Errore: devi inserire true o false!");
				sc.nextLine(); // rimuove input invalido
			}
		}

		sc.nextLine(); // pulizia buffer

		do {
			System.out.println("Inserire il numero di figli");
			numeroFigli = sc.nextInt();	
			if (numeroFigli < 0) {
				System.out.println("Errore: il numero dei figli non può essere negativo!");
			}
		}while(numeroFigli < 0);

		sc.nextLine(); // pulizia buffer
		return new Persona(nome, cognome, sposata, numeroFigli);
	}

	public static void modificaPersona(Scanner sc, Persona persona) {
		System.out.println("Cosa vuoi modificare?");
		System.out.println("1 = Nome");
		System.out.println("2 = Cognome");
		System.out.println("3 = Stato");
		System.out.println("4 = Numero dei figli");

		int scelta = sc.nextInt();
		sc.nextLine();


		switch (scelta) {
		case 1:
			String nuovoNome;
			do {
				System.out.println("Nuovo nome:");
				nuovoNome = sc.nextLine();
				if(nuovoNome.isEmpty()) {
					System.out.println("Errore: il nome non può essere vuoto!");
				}
			}while(nuovoNome.isEmpty());
			persona.setNome(nuovoNome);
			break;
		case 2:
			String nuovoCognome;
			do {
				System.out.println("Nuovo cognome:");
				nuovoCognome = sc.nextLine();
				if(nuovoCognome.isEmpty()) {
					System.out.println("Errore: il nome non può essere vuoto!");
				}
			}while(nuovoCognome.isEmpty());
			persona.setCognome(nuovoCognome);
			break;
		case 3: 
			System.out.println("Nuovo stato (true/false):");
			persona.setStato(sc.nextBoolean());
			System.out.println(persona.getNome() + (persona.getStato() ? " risulta sposato" : " non risulta sposato"));
			break;

		case 4:
			System.out.println("Aggiornare il numero dei figli:");
			modificaNumeroFigli(sc, persona);
			break;
		default:
			System.out.println("Scelta non valida!");
		}
	}

	public static void modificaNumeroFigli(Scanner sc, Persona persona) {
		System.out.println("Inserire variazione figli (non può essere negativa):");
		int numeroFigli = sc.nextInt();
		persona.incrementaFiglio(numeroFigli);
	}
}
