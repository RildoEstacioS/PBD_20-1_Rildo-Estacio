package br.com.partypoker.dao;

import br.com.partypoker.model.CashGame;

public class DAOMesa extends DAOGeneric<CashGame> implements IDAOMesa{

	public DAOMesa() {
		super(CashGame.class);
	}

}
