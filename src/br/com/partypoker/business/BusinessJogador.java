package br.com.partypoker.business;

import br.com.partypoker.dao.DAOJogador;
import br.com.partypoker.dao.IDAOJogador;
import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.exception.DaoException;
import br.com.partypoker.model.Jogador;

public class BusinessJogador implements IBusinessJogador{

	private IDAOJogador daoJogador;
	
	public BusinessJogador() {
		daoJogador = new DAOJogador();
	}
	
	@Override
	public void createJogador(Jogador jogador) throws BusinessException {
		try {
			daoJogador.create(jogador);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new BusinessException(e.getMessage());		
		}
	}

	@Override
	public Jogador reatriveJogador(int id) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			return daoJogador.search(Jogador.class, id);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new BusinessException(e.getMessage());		
		}
	}

	@Override
	public boolean updateJogador(Jogador jogador) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			return daoJogador.update(jogador);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new BusinessException(e.getMessage());		
		}
	}

	@Override
	public boolean removeJogador(Jogador jogador) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			return daoJogador.remove(jogador);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new BusinessException(e.getMessage());		
		}
	}

}
