package br.com.partypoker.business;

import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.model.Jogador;

public interface IBusinessJogador {

	//Jogador
	
	//Criar
	public void createJogador(Jogador jogador) throws BusinessException;
	
	//Buscar
	public Jogador reatriveJogador(Long id) throws BusinessException;
	
	//Atualizar
	public boolean updateJogador(Jogador jogador) throws BusinessException;

	//Remover
	public boolean removeJogador(Jogador jogador) throws BusinessException;

	public Jogador login(String login) throws BusinessException;
}
