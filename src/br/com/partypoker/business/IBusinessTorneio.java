package br.com.partypoker.business;

import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.model.Torneio;

public interface IBusinessTorneio {

	//Torneio

	//Criar
	public void createTorneio(Torneio torneio) throws BusinessException;
	
	//Buscar
	public Torneio reatriveTorneio(int id) throws BusinessException;
	
	//Atualizar
	public boolean updateTorneio(Torneio torneio) throws BusinessException;
	
	//Remover
	public boolean removeTorneio(Torneio torneio) throws BusinessException;
}
