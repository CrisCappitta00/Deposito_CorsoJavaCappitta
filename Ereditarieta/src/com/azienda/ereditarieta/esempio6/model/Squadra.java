package com.azienda.ereditarieta.esempio6.model;

import java.util.Objects;

public class Squadra {
	private String nomeSquadra;

	public Squadra(String nomeSquadra) {
		super();
		this.nomeSquadra = nomeSquadra;
	}

	public String getNomeSquadra() {
		return nomeSquadra;
	}

	public void setNomeSquadra(String nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeSquadra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Squadra other = (Squadra) obj;
		return Objects.equals(nomeSquadra, other.nomeSquadra);
	}

}
