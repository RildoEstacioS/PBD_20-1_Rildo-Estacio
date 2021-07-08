package br.com.partypoker.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "torneio")
public class Torneio implements Entidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, unique = true)
	private String titulo;
	@Column(nullable = false)
	private String descricao;
	@Column(nullable = false)
	private double buyin;
	@Column(nullable = false)
	private boolean rebuy;
	@Column(nullable = false)
	private String dataInicio;
	@Column(nullable = false)
	private String premio;
	@ManyToMany
	@JoinTable(name = "torneio_jogador", joinColumns = {@JoinColumn(name = "id_torneio")}, inverseJoinColumns = {@JoinColumn(name = "id_jogador")})
	private List<Jogador> jogadores;

	public Torneio() { }

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getPremio() {
		return premio;
	}

	public void setPremio(String premio) {
		this.premio = premio;
	}
}
