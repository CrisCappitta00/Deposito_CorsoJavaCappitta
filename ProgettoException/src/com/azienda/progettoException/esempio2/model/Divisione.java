package com.azienda.progettoException.esempio2.model;

public class Divisione {
	public static int divisioneChecked(int x, int y) throws Exception {
		//abbiamo a che fare con una eccezione checked quindi dobbiamo aggiungere la throws
		if(y == 0) {
			throw new Exception();
		}
		return x / y;
	}
	public static int divisioneUnchecked(int x, int y){
		//abbiamo a che fare con una eccezione unchecked
		if(y == 0) {
			throw new RuntimeException();
		}
		return x / y;
	}
	public static int divisioneChecked2(int x, int y) throws Exception {
		//abbiamo a che fare con una eccezione checked quindi dobbiamo aggiungere la throws
		if(y == 0) {
			throw new Exception("Il secondo parametro non puà essere 0. ");
		}
		return x / y;
	}
	public static int divisioneChecked3(int x, int y) throws Exception{
		try {
			return x / y;
		}catch(Exception e) {
			throw new Exception("Il secondo parametro non puà essere 0." , e);
		}
	} 
}
