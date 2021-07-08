package br.com.partypoker.facade;

import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.model.CashGame;
import br.com.partypoker.model.Jogador;
import br.com.partypoker.model.Torneio;

public interface IFacade {

	//Jogador
	
	//Criar
	public void createJogador(Jogador jogador) throws BusinessException;
	
	//Buscar
	public Jogador reatriveJogador(Long id) throws BusinessException;
	
	//Atualizar
	public boolean updateJogador(Jogador jogador) throws BusinessException;

	//Remover
	public boolean removeJogador(Jogador jogador) throws BusinessException;

	//Login
	public Jogador login(String login) throws  BusinessException;

	//Torneio
	
	//Criar
	public void createTorneio(Torneio torneio) throws BusinessException;
	
	//Buscar
	public Torneio reatriveTorneio(Long id) throws BusinessException;
	
	//Atualizar
	public boolean updateTorneio(Torneio torneio) throws BusinessException;
	
	//Remover
	public boolean removeTorneio(Torneio torneio) throws BusinessException;
	
	//Mesa
	
	//Criar
	public void createMesa(CashGame cashGame) throws BusinessException;
	
	//Buscar
	public CashGame reatriveMesa(Long id) throws BusinessException;
	
	//Atualizar
	public boolean updateMesa(CashGame cashGame) throws BusinessException;
	
	//Remover
	public boolean removeMesa(CashGame cashGame) throws BusinessException;
	
}