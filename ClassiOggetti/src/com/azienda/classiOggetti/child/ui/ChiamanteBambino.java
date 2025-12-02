//package com.azienda.classiOggetti.child.ui;
//
//import com.azienda.classiOggetti.child.model.Bambino;
//
//public class ChiamanteBambino {
//
//	public static void main(String[] args) {
//	  //creazione child 1
//      Bambino bambino1 = new Bambino("Carlo", "Rossi", 110.5f);
//      //incremento l'altezza
//      bambino1.cresce(9.5f);
//      //stampo a video le info
//      System.out.println("Le informazioni del bambino sono: " + bambino1.infoBambino());
//      System.out.println("Numero di bambini nati: " + Bambino.getContatore() );
//      Bambino bambino2 = new Bambino("Gianni", "Verdi", 98.2f);
//      bambino2.cresce(0.8f);
//      System.out.println("Le informazioni del bambino sono: " + bambino2.infoBambino());
//      //chiamata metodo bambini nati
//      bambiniNati();
//      // stampo a video il numero dei nati
//      System.out.println("Numero di bambini nati: " + Bambino.getContatore() );
//      System.out.println("Programma Terminato");
//	}
//	public static void bambiniNati() {
//		//creo 10 bambini con nomi e cognome
//		for (int i = 0; i < 10; i++) {
//			Bambino b = new Bambino("Nome_" + i, "Cognome_" + i , 110.0f);
//			b.cresce(10f);
//			System.out.println(b.infoBambino());
//		}
//	}
//
//}
