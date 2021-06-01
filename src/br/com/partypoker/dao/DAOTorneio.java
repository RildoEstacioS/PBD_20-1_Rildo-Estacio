package br.com.partypoker.dao;

import br.com.partypoker.model.Torneio;

public class DAOTorneio extends DAOGeneric<Torneio> implements IDAOTorneio{

	public DAOTorneio() {
		super(Torneio.class);
	}
	
}
