package com.azienda.ereditarieta.esempio1.ui;

import com.azienda.ereditarieta.esempio1.model.Figlia;
import com.azienda.ereditarieta.esempio1.model.Madre;
import com.azienda.ereditarieta.esempio1.model.Nonno;

public class TestEreditarieta {

	public static void main(String[] args) {
        Figlia f = new Figlia();
        f.setNomeFiglia("Anna");
        Madre m = new Madre();
        m.setNomeMadre("Claudia");
        Nonno n = new Nonno();
        n.setNomeNonno("Andrea");
        System.out.println("Programma Terminato");
	}

}
