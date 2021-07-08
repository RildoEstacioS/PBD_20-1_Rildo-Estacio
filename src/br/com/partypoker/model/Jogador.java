package br.com.partypoker.model;


import javax.persistence.*;

@Entity
@Table(name = "jogador")
public class Jogador extends Usuario implements Entidade{
	@Column(nullable = false)
	private float banca;

	public Jogador() {
		super();
	}

	public float getBanca() {
		return banca;
	}

	public void setBanca(float banca) {
		this.banca = banca;
	}
}
