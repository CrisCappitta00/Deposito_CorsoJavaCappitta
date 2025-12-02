package com.azienda.classiOggetti.esempio1.ui;

import com.azienda.classiOggetti.esempio1.model.Corso; // importarlo se in package differenti 

public class TestCorso {

	public static void main(String[] args) {
		// creo una var di tipo corso
		Corso c = new Corso();                    // con new richiamo il costruttore e prendo un nuova aria di memoria
		Corso c2 = new Corso();
		Corso c3 = new Corso("Anna","C++", 12);   // chiamata del 2 metodo costruttore parametrizzato
		// c3.docente = "Eva";                    //accesso in scrittura -> cambio il docente da anna ad eva
		c3.setDocente("Eva");                    // come risolvere l'accesso in scrittura se private
		c3.setMateria("C#");
		c3.setCrediti(9);
		//
		String m = c3.getMateria();
		// System.out.println("Il docente del corso 3 è: " + c3.docente); // effettuo un accesso in lettura se public
		System.out.println("Il docente del corso è: " + c3.getDocente() + " la materia insegnata è: " + m + " vale: " + c3.getCrediti() + " crediti."); // risolvo il prolema dell'accesso in lettura se l'attributo è private
		System.out.println("Info del corso c3: " + c3.getAll() );
		c3.setAll("Luisa", "C", 11);
		System.out.println("Info del corso c3: " + c3.getAll() );
		System.out.println("Programma Terminato!");
	}

}
