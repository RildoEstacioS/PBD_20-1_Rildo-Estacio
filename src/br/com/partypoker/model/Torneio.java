package br.com.partypoker.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "torneio")
public class Torneio implements Entidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo, estruturaTorneio, inicio;
	private double buyin;
	private boolean rebuy, addon;
	private String premio;
	@SuppressWarnings("unused")
	private String infoJogadores;
	
	private ArrayList<Jogador> jogadores;
	
	public Torneio(String titulo, String estruturaTorneio, String inicio, double buyin, boolean rebuy,
			boolean addon, String premio) {
		super();
		this.titulo = titulo;
		this.estruturaTorneio = estruturaTorneio;
		this.inicio = inicio;
		this.buyin = buyin;
		this.rebuy = rebuy;
		this.addon = addon;
		this.premio = premio;
		this.jogadores = new ArrayList<>();
		this.infoJogadores = getInfoJogadores();
	}

	public String getInfoJogadores() {
		return "" + getJogadores().size() + "";
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

	public String getPremio() {
		return premio;
	}

	public void setPremio(String premio) {
		this.premio = premio;
	}

	public void setInfoJogadores(String infoJogadores) {
		this.infoJogadores = infoJogadores;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	
	
	
}
