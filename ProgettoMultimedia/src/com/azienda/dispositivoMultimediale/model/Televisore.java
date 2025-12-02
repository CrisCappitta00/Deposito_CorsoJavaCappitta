package com.azienda.dispositivoMultimediale.model;

public class Televisore extends DispositivoMultimediale{
	private int numeroCanali;
	private int canaleSelezionato = 1;
	private boolean onOff; // provo ad aggiungere lo stato acceso e spento true acceso, off spento
	public Televisore(String marca, String modello, float prezzo, int numeroCanali) {
		super(marca, modello, prezzo);
		this.numeroCanali = numeroCanali;
		onOff = false; // tv spenta di default
	}
	public int getNumeroCanali() {
		return numeroCanali;
	}
	public void setNumeroCanali(int numeroCanali) {
		this.numeroCanali = numeroCanali;
	}
	public int getCanaleSelezionato() {
		return canaleSelezionato;
	}
	public void setCanaleSelezionato(int canaleSelezionato) {
		this.canaleSelezionato = canaleSelezionato;
	}
	public boolean getOnOff() {
		return onOff;
	}
	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}
	public void cambiaCanale(int numeroCanale) {
		if (numeroCanale >= 1 && numeroCanale <= numeroCanali) {
			canaleSelezionato = numeroCanale;
			System.out.println("Canale cambiato a: " + canaleSelezionato);
		} else {
			System.out.println("Canale non valido!");
		}
	}
	public void accendi() {
		if(!onOff) {
			onOff = true;
			System.out.println("Il televisore è stato acceso");
		}else {
			System.out.println("Il televisore è gia acceso");
		}
	}
	public void spegni() {
		if(!onOff) {
			onOff = false;
			System.out.println("Il televisore è stato spento");
		}else {
			System.out.println("Il televisore è gia spento");
		}
	}
	public void gestioneOnOff() {
		if(onOff) {
			accendi();
		}else {
			spegni();
		}
	}
	@Override
	public String toString() {
		return super.toString() + " - canali disponibili: " + numeroCanali;
	}

}
