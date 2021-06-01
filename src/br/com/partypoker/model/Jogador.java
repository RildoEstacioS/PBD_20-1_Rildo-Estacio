package br.com.partypoker.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Jogador implements Entidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome, email, senha;
	private int pontos;
	private boolean isAdmin = false;
	private boolean isSuperUser = false;
	
	public Jogador() {}
	
	public Jogador(String nome, String email, String senha, int pontos) {
		super();
		this.nome = nome;
//		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.pontos = pontos;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return email;
	}
	public void setLogin(String login) {
		this.email = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public boolean isSuperUser() {
		return isSuperUser;
	}
	public void setSuperUser(boolean isSuperUser) {
		this.isSuperUser = isSuperUser;
	}

	@Override
	public String toString() {
		return "Jogador [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", pontos=" + pontos
				+ ", isAdmin=" + isAdmin + ", isSuperUser=" + isSuperUser + "]";
	}
	
	
}
