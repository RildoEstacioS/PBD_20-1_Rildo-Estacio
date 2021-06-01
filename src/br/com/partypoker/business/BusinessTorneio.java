package br.com.partypoker.business;

import br.com.partypoker.dao.DAOTorneio;
import br.com.partypoker.dao.IDAOTorneio;
import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.exception.DaoException;
import br.com.partypoker.model.Torneio;

public class BusinessTorneio implements IBusinessTorneio{

	private IDAOTorneio daoTorneio;
	
	public BusinessTorneio() {
		daoTorneio = new DAOTorneio();
	}
	
	@Override
	public void createTorneio(Torneio torneio) throws BusinessException {
		try {
			daoTorneio.create(torneio);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new BusinessException(e.getMessage());		
		}
	}

	@Override
	public Torneio reatriveTorneio(int id) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			return daoTorneio.search(Torneio.class, id);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new BusinessException(e.getMessage());		
		}
	}

	@Override
	public boolean updateTorneio(Torneio torneio) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			return daoTorneio.update(torneio);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new BusinessException(e.getMessage());		
		}
	}

	@Override
	public boolean removeTorneio(Torneio torneio) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			return daoTorneio.remove(torneio);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new BusinessException(e.getMessage());		
		}
	}

}
