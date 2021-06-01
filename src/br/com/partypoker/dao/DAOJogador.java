package br.com.partypoker.dao;

import br.com.partypoker.model.Jogador;

public class DAOJogador extends DAOGeneric<Jogador> implements IDAOJogador{

	public DAOJogador() {
		super(Jogador.class);
	}
	
}
