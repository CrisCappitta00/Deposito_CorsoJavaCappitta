package com.azienda.classiOggetti.arredamento.ui;

import java.util.Scanner;

import com.azienda.classiOggetti.arredamento.model.Stanza;
import com.azienda.classiOggetti.arredamento.model.Tavolo;


public class ChiamanteArredamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//		Stanza stanza = new Stanza("Camera da letto", "Lilla", 4.5f, 2.10f);
		//		System.out.println(stanza.stampaStanza());
		//		stanza.incrementaMetriQuadri(2.5f);
		//		System.out.println(stanza.stampaStanza());
		//		stanza.incrementaAltezza(1.5f);
		//		System.out.println(stanza.stampaStanza());
		//		Tavolo t = new Tavolo("Quercia", 1.30f, 2.5f, 4.5f, stanza);
		//		System.out.println(t.descrizioneTavolo());
		//		Tavolo tavolo = new Tavolo("Vetro", 50.0f, 1.20f, 2.1f, stanza);
		//		System.out.println(tavolo.descrizioneTavolo());
		menuPrincipale(sc);
		System.out.println("Programma Terminato");
		sc.close();
	}
	//Aggiornamenti
	public static void menuPrincipale(Scanner sc) {
		Stanza registraStanza = null;  //nessuna stanza registrata
		Tavolo registraTavolo = null;
		int num;
		System.out.println("Benvenuto, scegliere una delle seguenti opzioni:");
		do {
			System.out.println("0 = Chiudi programma");
			System.out.println("1 = Registra una stanza");
			System.out.println("2 = Registra un tavolo");
			System.out.println("3 = Visualizza le informazioni della stanza");
			System.out.println("4 = Visualizza le informazioni del tavolo");
			System.out.println("5 = Modifica le informazioni della stanza");
			System.out.println("6 = Modifica le informazioni del tavolo");
			num = sc.nextInt();
			sc.nextLine(); // pulizia buffer
			if(num == 0) {
				System.out.println("Uscita...\n Arrivederci!");
				break;
			}else if(num == 1) {
				registraStanza = creaStanza(sc);
				System.out.println("La stanza è stata registrata");
			}else if(num == 2) {
				if (registraStanza == null) {
					System.out.println("Devi prima registrare una stanza!");
				} else {
					registraTavolo = creaTavolo(sc, registraStanza);
					System.out.println("Il tavolo è stato registrato");
				}
			}else if(num == 3) {
				if(registraStanza == null) {
					System.out.println("Nessuna stanza registrata!");
				}else {
					System.out.println(registraStanza.stampaStanza());
				}
			}else if(num == 4) {
				if(registraTavolo == null) {
					System.out.println("Nessun tavolo registrato!");
				}else {
					System.out.println(registraTavolo.descrizioneTavolo());
				}
			}else if(num == 5) {
				if (registraStanza == null) {
					System.out.println("Nessuna stanza registrata!");
				} else {
					System.out.println("Accesso al metodo modifica stanza");
					modificaStanza(sc, registraStanza);
				}				
			}else if(num == 6) {
				if (registraTavolo == null) {
					System.out.println("Nessun tavolo registrato!");
				} else {
					System.out.println("Accesso al metodo modifica tavolo");
					modificaTavolo(sc, registraTavolo);
				}	
			}
		}while(true);
	}
	public static Stanza creaStanza(Scanner sc) {
		System.out.println("Registrazione stanza");
		String nome = leggiStringaNonVuota(sc, "Inserire il nome della stanza");
		String colore = leggiStringaNonVuota(sc, "Inserire il colore della stanza");
		float metriQuadri = leggiFloatNonNegativo(sc, "Inserire i metri quadri");
		float altezza = leggiFloatNonNegativo(sc, "Inserire il valore dell'altezza");
		return new Stanza(nome,colore,metriQuadri, altezza);
	}
	public static Tavolo creaTavolo(Scanner sc, Stanza stanzaCollegata) {
		System.out.println("Registrazione tavolo:");
		String materiale = leggiStringaNonVuota(sc, "Inserire il tipo di materiale");
		float altezza = leggiFloatNonNegativo(sc, "Inserire il valore dell'altezza");
		float larghezza = leggiFloatNonNegativo(sc, "Inserire il valore della larghezza");
		float spessore = leggiFloatNonNegativo(sc, "Inserire il valore dello spessore");
		if (stanzaCollegata == null) {
			System.out.println("Errore: devi prima registrare una stanza!");
			return null;
		}
		return new Tavolo(materiale, altezza, larghezza, spessore, stanzaCollegata);
	}
	public static void modificaStanza(Scanner sc, Stanza stanza) {
		System.out.println("Cosa vuoi modificare?");
		System.out.println("1 = Nome");
		System.out.println("2 = Colore");
		System.out.println("3 = Metri Quadri");
		System.out.println("4 = Altezza");

		int scelta = sc.nextInt();
		int sceltaOperazione;
		sc.nextLine();


		switch (scelta) {
		case 1:
			stanza.setNome(leggiStringaNonVuota(sc, "Nuovo nome della stanza:"));
			break;
		case 2:

			stanza.setColore(leggiStringaNonVuota(sc, "Nuovo colore:"));
			break;
		case 3: 
			System.out.println("Scegliere se si vuole aumentare o diminuire il metro quadro:");
			System.out.println("1 = incrementa");
			System.out.println("2 = decrementa");
			sceltaOperazione = sc.nextInt();
			sc.nextLine();
			if(sceltaOperazione == 1) {
				incrementaMetriQuadrati(sc, stanza);
			}else if(sceltaOperazione == 2) {
				decrementaMetriQuadrati(sc, stanza);
			}
			break;

		case 4:
			System.out.println("Scegliere se si vuole aumentare o diminuire l'altezza:");
			System.out.println("1 = incrementa");
			System.out.println("2 = decrementa");
			sceltaOperazione = sc.nextInt();
			sc.nextLine();
			if(sceltaOperazione == 1) {
				incrementaAlt(sc, stanza);
			}else if(sceltaOperazione == 2) {
				decrementaAlt(sc, stanza);
			}
			break;
		default:
			System.out.println("Scelta non valida!");
		}
	}
	public static void modificaTavolo(Scanner sc, Tavolo table) {
		System.out.println("Cosa vuoi modificare?");
		System.out.println("1 = Materiale");
		System.out.println("2 = Altezza");
		System.out.println("3 = Larghezza");
		System.out.println("4 = Spessore");
		System.out.println("5 = Stanza");

		int scelta = sc.nextInt();
		sc.nextLine();


		switch (scelta) {
		case 1:
			table.setMateriale(leggiStringaNonVuota(sc, "Nuovo materiale:"));
			break;
		case 2:
			table.setAltezza(leggiFloatNonNegativo(sc, "Nuova altezza:"));
			break;
		case 3:
			table.setLarghezza(leggiFloatNonNegativo(sc, "Nuova larghezza:"));
			break;
		case 4:
			table.setSpessore(leggiFloatNonNegativo(sc, "Nuovo spessore:"));
			break;
		case 5:
			System.out.println("Collega una nuova stanza al tavolo.");
			table.setStanza(creaStanza(sc));
			break;
		default:
			System.out.println("Scelta non valida!");
		}
	}
	public static void incrementaMetriQuadrati(Scanner sc, Stanza stanza) {
		System.out.println("Inserire il nuovo valore");
		float numero = sc.nextFloat();
		stanza.incrementaMetriQuadri(numero);
	}
	public static void decrementaMetriQuadrati(Scanner sc,Stanza stanza) {
		System.out.println("Inserire il nuovo valore");
		float numero = sc.nextFloat();
		sc.nextLine();
		stanza.decrementaMetriQuadri(numero);
	}
	public static void incrementaAlt(Scanner sc, Stanza stanza) {
		System.out.println("Inserire il nuovo valore");
		float numero = sc.nextFloat();
		sc.nextLine();
		stanza.incrementaAltezza(numero);
	}
	public static void decrementaAlt(Scanner sc,Stanza stanza) {
		System.out.println("Inserire il nuovo valore");
		float numero = sc.nextFloat();
		sc.nextLine();
		stanza.decrementaAltezza(numero);
	}
	public static String leggiStringaNonVuota(Scanner sc, String messaggio) {
		String input;
		do {
			System.out.println(messaggio);
			input = sc.nextLine();
			if (input.isEmpty()) {
				System.out.println("Errore: il valore non può essere vuoto!");
			}
		} while (input.isEmpty());
		return input;
	}
	public static float leggiFloatNonNegativo(Scanner sc, String messaggio) {
		float numero;
		do {
			System.out.println(messaggio);
			numero = sc.nextFloat();
			sc.nextLine();
			if (numero < 0) {
				System.out.println("Errore: il valore non può essere negativo!");
			}
		} while (numero < 0 );
		return numero;
	}
}
