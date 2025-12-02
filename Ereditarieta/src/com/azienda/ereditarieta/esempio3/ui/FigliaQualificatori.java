package com.azienda.ereditarieta.esempio3.ui;

import com.azienda.ereditarieta.esempio3.model.Qualificatori;

public class FigliaQualificatori extends Qualificatori{

	public static void main(String[] args) {
		//Qualificatori.stringaPrivata = "X"; //mai
		Qualificatori.stringaPubblica = "X";  // accessibile ovunque
		//Qualificatori.stringaDefault = "X"; // qui il default non funziona non siamo nello stesso package
		Qualificatori.stringaProtetta = "X"; // siamo in una classe figlia anche se abbiamo cambiato package funziona

	}

}
