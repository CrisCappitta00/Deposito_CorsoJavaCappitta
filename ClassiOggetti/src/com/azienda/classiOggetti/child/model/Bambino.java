package com.azienda.classiOggetti.child.model;

public class Bambino extends Persona {
	private static int contatore = 0;

	public Bambino(String nome2, String cognome2, float altezza2) {
		super(nome2, cognome2, altezza2);
		contatore++;
	}

	public static int getContatore() {
		return contatore;
	}
	//	public String infoBambino() {
	//		return "Nome: " + nome + " - " + "cognome: " + cognome + " - " + "altezza: " + altezza;
	//	}

	//	public void cresce(float altezza) {
	//		if(altezza > 0 ) {
	//			this.altezza += altezza;
	//		}else {
	//			System.out.println("Errore il valore inserito non può essere negativo");
	//		}
	//	}

	@Override
	public String toString() {
		return "Bambino: Nome:" + nome + " - Cognome: " + cognome + " - altezza: " + getAltezza() ;
	}
}
