package br.com.partypoker.model;

public class Aviso {
	private Long id;
	private String mensagem, data, autor;
	
	//Complementar classe Aviso
	
	public Aviso(Long id, String mensagem, String data, String autor) {
		super();
		this.id = id;
		this.mensagem = mensagem;
		this.data = data;
		this.autor = autor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	

}
