package com.azienda.ereditarieta.esempio3.ui;

import com.azienda.ereditarieta.esempio3.model.Qualificatori;

public class TestQualificatori {

	public static void main(String[] args) {
		//Qualificatori.stringaPrivata = "X";
		Qualificatori.stringaPubblica = "X";  // accessibile ovunque
		//Qualificatori.stringaDefault = "X"; // il default va col package
		//Qualificatori.stringaProtetta = "X";  // non funziona perché non siamo in una classe figlia e abbiamo cambiato package
	}

}
