package com.azienda.dispositivoMultimediale.model;

public class Cellulare extends DispositivoMultimediale{
	private double megaPixelCamera;
	private boolean fotocamera;

	public Cellulare(String marca, String modello, float prezzo, double megaPixelCamera) {
		super(marca, modello, prezzo);
		this.megaPixelCamera = megaPixelCamera;
		fotocamera = false;
	}

	public double getMegaPixelCamera() {
		return megaPixelCamera;
	}

	public void setMegaPixelCamera(double megaPixelCamera) {
		this.megaPixelCamera = megaPixelCamera;
	}
	
	public boolean getFotocamera() {
		return fotocamera;
	}

	public void setFotocamera(boolean fotocamera) {
		this.fotocamera = fotocamera;
	}

	public void chiama() {
        System.out.println("Il cellulare sta chiamando...");
	}
	public void rispondi() {
		System.out.println("Sta squillando...");
		System.out.println("Chiamata Accettata");
	}
	public void apri() {
		if(!fotocamera) {
			fotocamera = true; // avvio la fotocamera
			System.out.println("La fotocamera è stata avviata");
		}else {
			System.out.println("La fotocamera è già attiva");
		}
	}
	public void chiudi() {
		if(fotocamera) {
			fotocamera = false; // chiudo la fotocamera
			System.out.println("La fotocamera è stata chiusa");
		}else {
			System.out.println("La fotocamera è già chiusa");
		}
	}

	@Override
	public String toString() {
		return super.toString() +
				" - Mega Pixel Camera: " + megaPixelCamera;
	}
	
}
