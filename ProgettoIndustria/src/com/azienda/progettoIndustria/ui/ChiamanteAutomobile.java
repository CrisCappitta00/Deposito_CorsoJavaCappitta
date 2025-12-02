package com.azienda.progettoIndustria.ui;

import com.azienda.progettoIndustria.model.Automobile;
import com.azienda.progettoIndustria.model.Fabbrica;
import com.azienda.progettoIndustria.model.Indirizzo;

public class ChiamanteAutomobile {

	public static void main(String[] args) {
		Indirizzo indirizzo = new Indirizzo("Italia", "Modena" , "Via Emilia Est 1163", "1163");	
		Fabbrica fabbrica = new Fabbrica("Ferrari", indirizzo);
		creaFerrari(fabbrica);
		System.out.println(" La fabbrica ha prodotto: " + fabbrica.getAutoProdotte() + " automobili");
		//
		Indirizzo indirizzoDue = new Indirizzo("Germania", "Stoccarda" , "Mercedesstraße 120", "70372");	
		Fabbrica fabbricaDue = new Fabbrica("Mercedes", indirizzoDue);
		creaMercedes(fabbricaDue);
		System.out.println(" La fabbrica ha prodotto: " + fabbricaDue.getAutoProdotte() + " automobili");
	}
	public static void creaFerrari(Fabbrica fabbrica) {
		for (int i = 000; i < 5; i++) {
			String targa = "AB" + String.format("%03d",i * 111) + "CD"; // AB000CD, AB111CD, ...
			Automobile auto = new Automobile("F488", "FERRARI", targa, 4500F, fabbrica);
			System.out.println(auto.infoAutomobile());
		}
	}
	public static void creaMercedes(Fabbrica mercedes) {
		for (int i = 0; i < 3; i++) {
			String targa = "EF" + String.format("%03d", i * 111) + "GH"; // EF000GH, EF111GH, ...
			Automobile auto = new Automobile("S", "Mercedes", targa, 3000F, mercedes);
			System.out.println(auto.infoAutomobile());
		}
	}

}
