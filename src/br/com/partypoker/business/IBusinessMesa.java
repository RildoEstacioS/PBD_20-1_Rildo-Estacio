package br.com.partypoker.business;

import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.model.Mesa;
import br.com.partypoker.model.Torneio;

public interface IBusinessMesa {
	
	//Mesa

	//Criar
	public void createMesa(Mesa mesa) throws BusinessException;
	
	//Buscar
	public Mesa reatriveMesa(int id) throws BusinessException;
	
	//Atualizar
	public boolean updateMesa(Mesa mesa) throws BusinessException;
	
	//Remover
	public boolean removeMesa(Mesa mesa) throws BusinessException;
}
