package br.com.partypoker.dao;

import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.model.Mesa;

public class DAOMesa extends DAOGeneric<Mesa> implements IDAOMesa{

	public DAOMesa() {
		super(Mesa.class);
	}

}
