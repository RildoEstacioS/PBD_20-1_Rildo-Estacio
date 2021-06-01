package br.com.partypoker.facade;

import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.model.Jogador;
import br.com.partypoker.model.Mesa;
import br.com.partypoker.model.Torneio;

public interface IFacade {

	//Jogador
	
	//Criar
	public void createJogador(Jogador jogador) throws BusinessException;
	
	//Buscar
	public Jogador reatriveJogador(int id) throws BusinessException;
	
	//Atualizar
	public boolean updateJogador(Jogador jogador) throws BusinessException;

	//Remover
	public boolean removeJogador(Jogador jogador) throws BusinessException;
	
	//Torneio
	
	//Criar
	public void createTorneio(Torneio torneio) throws BusinessException;
	
	//Buscar
	public Torneio reatriveTorneio(int id) throws BusinessException;
	
	//Atualizar
	public boolean updateTorneio(Torneio torneio) throws BusinessException;
	
	//Remover
	public boolean removeTorneio(Torneio torneio) throws BusinessException;
	
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