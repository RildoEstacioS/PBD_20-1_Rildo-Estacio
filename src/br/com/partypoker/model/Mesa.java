package br.com.partypoker.model;

import java.util.List;

public class Mesa {

	private Long id;
    private String titulo;
    private double buyin;
    private String blinds;
    private int tamanhoMesa;
    private String tipoJogo;
    private List<Jogador> jogadores;



    public Mesa() {
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

    public double getBuyin() {
        return buyin;
    }

    public void setBuyin(double buyin) {
        this.buyin = buyin;
    }

    public String getBlinds() {
        return blinds;
    }

    public void setBlinds(String blinds) {
        this.blinds = blinds;
    }

    public int getTamanhoMesa() {
        return tamanhoMesa;
    }

    public void setTamanhoMesa(int tamanhoMesa) {
        this.tamanhoMesa = tamanhoMesa;
    }

    public String getTipoJogo() {
        return tipoJogo;
    }

    public void setTipoJogo(String tipoJogo) {
        this.tipoJogo = tipoJogo;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
	
}
