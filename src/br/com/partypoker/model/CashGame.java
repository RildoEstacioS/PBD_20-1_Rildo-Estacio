package br.com.partypoker.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "cash")
public class CashGame implements Entidade{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @Column(nullable = false, unique = true)
    private String titulo;
    @Column(nullable = false)
    private float buyin;
    @Column(nullable = false)
    private String blinds;
    @Column(nullable = false)
    private int tamanho;
    @Column(nullable = false)
    private String tipo;
    @ManyToMany
    @JoinTable(name = "cash_jogador", joinColumns = {@JoinColumn(name = "id_cash")}, inverseJoinColumns = {@JoinColumn(name = "id_jogador")})
    private List<Jogador> jogadores;
    
    public CashGame() {}

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

    public float getBuyin() {
        return buyin;
    }

    public void setBuyin(float buyin) {
        this.buyin = buyin;
    }

    public String getBlinds() {
        return blinds;
    }

    public void setBlinds(String blinds) {
        this.blinds = blinds;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
