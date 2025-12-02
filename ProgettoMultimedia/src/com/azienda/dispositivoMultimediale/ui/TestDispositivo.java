package com.azienda.dispositivoMultimediale.ui;

import com.azienda.dispositivoMultimediale.model.Cellulare;
import com.azienda.dispositivoMultimediale.model.DispositivoMultimediale;
import com.azienda.dispositivoMultimediale.model.Televisore;

public class TestDispositivo {

	public static void main(String[] args) {
		Cellulare c = new Cellulare("Iphone", "15", 1100, 48);
		stampaInfo(c);

		Televisore t = new Televisore("Samsung", "X", 300.0f, 400);
		stampaInfo(t);


	}
	//metodo che stampa le info dei dispositivi
	public static void stampaInfo(DispositivoMultimediale dispositivo) {
		System.out.println(dispositivo);
		if(dispositivo instanceof Cellulare) {
			Cellulare c = (Cellulare) dispositivo;
			System.out.println("Cellulare:  " + c.getMegaPixelCamera() + "MP") ;
			simulazioni(c);
		}else if(dispositivo instanceof Televisore) {
			Televisore tv = (Televisore) dispositivo;
			System.out.println("Televisore specifiche: " + tv.getNumeroCanali() + " - canali disponibili");
			simulazioni(tv);
		}
	}
	public static void simulazioni(DispositivoMultimediale dispositivo) {
		if(dispositivo instanceof Cellulare) {
			Cellulare c = (Cellulare) dispositivo;
			c.chiama();
			c.rispondi();
			c.setFotocamera(true);
			c.chiudi();
			c.apri();
			c.chiudi();
		}else if(dispositivo instanceof Televisore) {
			Televisore tv = (Televisore) dispositivo;
			tv.spegni();
			tv.accendi();
			tv.cambiaCanale(5);
		}
	}
}
