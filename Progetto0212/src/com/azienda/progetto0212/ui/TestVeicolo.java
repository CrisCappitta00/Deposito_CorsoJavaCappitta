package com.azienda.progetto0212.ui;


import java.util.Scanner;

import com.azienda.progetto0212.customException.VeicoloNonValidoException;
import com.azienda.progetto0212.factory.VeicoloFactory;
import com.azienda.progetto0212.model.Aereo;
import com.azienda.progetto0212.model.CalcolaTempi;
import com.azienda.progetto0212.model.CalcoloTempiAereo;
import com.azienda.progetto0212.model.CalcoloTempiTreno;
import com.azienda.progetto0212.model.Treno;
import com.azienda.progetto0212.model.Veicolo;
import com.azienda.progetto0212.utility.Controller;

public class TestVeicolo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String inputTipo;

        System.out.println("=== Benvenuto nel sistema Veicoli ===");
        System.out.println("Per uscire digita 'ESC'");
        while (true) {
            System.out.println("\nInserisci il tipo di veicolo (AEREO/TRENO):");
            inputTipo = scanner.nextLine().trim();

            if (inputTipo.equalsIgnoreCase("ESC")) {
                System.out.println("Programma terminato.");
                break;
            }

            try {
                // Creazione del veicolo tramite la factory
                Veicolo veicolo = VeicoloFactory.creaVeicolo(inputTipo, scanner);

                // Chiede la distanza
                float distanza = Controller.leggiFloat(scanner, "Inserisci la distanza da percorrere:");

                // Calcola tempi e informazioni di movimento
                if (veicolo instanceof Aereo) {
                    CalcolaTempi calcolo = new CalcoloTempiAereo();
                    System.out.println("\nTempo di percorrenza: " + calcolo.calcolaTempiPercorrenza(veicolo, distanza) + " ore");
                    calcolo.informazioniMovimento(veicolo);
                    System.out.println(veicolo.toString());

                } else if (veicolo instanceof Treno) {
                    CalcolaTempi calcolo = new CalcoloTempiTreno();
                    System.out.println("\nTempo di percorrenza: " + calcolo.calcolaTempiPercorrenza(veicolo, distanza) + " ore");
                    calcolo.informazioniMovimento(veicolo);
                    System.out.println(veicolo.toString());
                }

            } catch (VeicoloNonValidoException e) {
                System.out.println("ERRORE: " + e.getMessage());
                // continua il loop senza uscire
            }
        }
        scanner.close();
	}
}
