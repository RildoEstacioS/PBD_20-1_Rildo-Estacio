package br.com.partypoker.business;

import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.model.CashGame;

import java.util.List;

public interface IBusinessMesa {
	
	//Mesa

	//Criar
	public void createMesa(CashGame cashGame) throws BusinessException;
	
	//Buscar
	public CashGame reatriveMesa(Long id) throws BusinessException;
	
	//Atualizar
	public boolean updateMesa(CashGame cashGame) throws BusinessException;
	
	//Remover
	public boolean removeMesa(CashGame cashGame) throws BusinessException;

    List<CashGame> selectAll();
}
