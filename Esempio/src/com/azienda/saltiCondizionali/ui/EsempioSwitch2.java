package com.azienda.saltiCondizionali.ui;

import java.util.Scanner;

public class EsempioSwitch2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //tirare fuori il numero di giorni a seconda del mese inserito dall'utente
        String mese;
        int giorni = -1;
        System.out.println("Inserire il mese");
        mese = sc.nextLine();
        
        boolean errore = false;
        switch (mese) {
        case "Gennaio": case "Marzo": case "Maggio": case "Luglio": case "Agosto": case "Ottobre": case "Dicembre": {
			giorni = 31;
			break;
		}
		case "Aprile": case "Giugno": case "Settembre": case "Novembre": {
	        giorni = 30;
			break;
			}
		case "Febbraio" :{
			System.out.println("L'anno è bisestile? ");
			boolean bisestile = sc.nextBoolean();
			if(bisestile) {
				giorni = 29;
			} else {
				giorni = 28;
			}
			break;
		}
		default:
			System.out.println("Mese non valido");
			errore = true;
        }
        //
        //        if(giorni != -1) {
        //        	System.out.println("Il mese di " + mese + "ha " + giorni + " giorni");
        //        }
        if(!errore) {
        	System.out.println("Il mese di " + mese + " ha " + giorni + " giorni");
        }
	    System.out.println("Programma terminato");
        sc.close();
		
	}

}
