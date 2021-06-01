package br.com.partypoker.business;

import br.com.partypoker.dao.DAOMesa;
import br.com.partypoker.dao.IDAOMesa;
import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.exception.DaoException;
import br.com.partypoker.model.Mesa;

public class BusinessMesa implements IBusinessMesa{

	private IDAOMesa daoMesa;
	
	public BusinessMesa() {
		daoMesa = new DAOMesa();
	}
	
	@Override
	public void createMesa(Mesa mesa) throws BusinessException {
		try {
			daoMesa.create(mesa);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Mesa reatriveMesa(int id) throws BusinessException {
		// TODO Auto-generated method stub
		Mesa m = null;
		try {
			m = daoMesa.search(Mesa.class, id);
			return m;
		} catch (DaoException e) {
			// TODO Auto-generated catch block
		throw new BusinessException(e.getMessage());		
		}
	}

	@Override
	public boolean updateMesa(Mesa mesa) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			return daoMesa.update(mesa);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new BusinessException(e.getMessage());		
		}
	}

	@Override
	public boolean removeMesa(Mesa mesa) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			return daoMesa.remove(mesa);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new BusinessException(e.getMessage());		
		}
	}

}
