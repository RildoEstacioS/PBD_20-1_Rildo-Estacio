package br.com.partypoker.model;

import java.util.ArrayList;

public class Torneio {

	
	private Long id;
	private String titulo, estruturaTorneio, inicio;
	private double buyin;
	private boolean rebuy, addon;
	
	private ArrayList<Jogador> jogadoresArrayList;
	
	public Torneio(Long id, String titulo, String estruturaTorneio, String inicio, double buyin, boolean rebuy,
			boolean addon) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.estruturaTorneio = estruturaTorneio;
		this.inicio = inicio;
		this.buyin = buyin;
		this.rebuy = rebuy;
		this.addon = addon;
		this.jogadoresArrayList = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEstruturaTorneio() {
		return estruturaTorneio;
	}

	public void setEstruturaTorneio(String estruturaTorneio) {
		this.estruturaTorneio = estruturaTorneio;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public double getBuyin() {
		return buyin;
	}

	public void setBuyin(double buyin) {
		this.buyin = buyin;
	}

	public boolean isRebuy() {
		return rebuy;
	}

	public void setRebuy(boolean rebuy) {
		this.rebuy = rebuy;
	}

	public boolean isAddon() {
		return addon;
	}

	public void setAddon(boolean addon) {
		this.addon = addon;
	}

	public ArrayList<Jogador> getJogadoresArrayList() {
		return jogadoresArrayList;
	}

	public void setJogadoresArrayList(ArrayList<Jogador> jogadoresArrayList) {
		this.jogadoresArrayList = jogadoresArrayList;
	}
	
	
	
	
}
