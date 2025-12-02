package com.azienda.ereditarieta.esempio6.model;

import java.util.Objects;

public class Utente {
	private String nome;
	private String cognnome;
	private int punteggio;
	private Squadra squadra;

	public Utente(String nome, String cognnome, int punteggio) {
		super();
		this.nome = nome;
		this.cognnome = cognnome;
		this.punteggio = punteggio;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognnome() {
		return cognnome;
	}
	public void setCognnome(String cognnome) {
		this.cognnome = cognnome;
	}
	public int getPunteggio() {
		return punteggio;
	}
	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}

	public Squadra getSquadra() {
		return squadra;
	}

	public void setSquadra(Squadra squadra) {
		this.squadra = squadra;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognnome=" + cognnome + ", punteggio=" + punteggio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cognnome, nome, punteggio, squadra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utente other = (Utente) obj;
		return Objects.equals(cognnome, other.cognnome) && Objects.equals(nome, other.nome)
				&& punteggio == other.punteggio && Objects.equals(squadra, other.squadra);
	}
	

}
