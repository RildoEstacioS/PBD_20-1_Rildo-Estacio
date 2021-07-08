package br.com.partypoker.business;

import br.com.partypoker.dao.DAOMesa;
import br.com.partypoker.dao.IDAOMesa;
import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.exception.DaoException;
import br.com.partypoker.model.CashGame;

import java.util.List;

public class BusinessMesa implements IBusinessMesa{

	private IDAOMesa daoMesa;
	
	public BusinessMesa() {
		daoMesa = new DAOMesa();
	}
	
	@Override
	public void createMesa(CashGame cashGame) throws BusinessException {
		try {
			daoMesa.create(cashGame);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public CashGame reatriveMesa(Long id) throws BusinessException {
		// TODO Auto-generated method stub
		CashGame m = null;
		try {
			m = daoMesa.search(CashGame.class, id);
			return m;
		} catch (DaoException e) {
			// TODO Auto-generated catch block
		throw new BusinessException(e.getMessage());		
		}
	}

	@Override
	public boolean updateMesa(CashGame cashGame) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			return daoMesa.update(cashGame);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new BusinessException(e.getMessage());		
		}
	}

	@Override
	public boolean removeMesa(CashGame cashGame) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			return daoMesa.remove(cashGame);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new BusinessException(e.getMessage());		
		}
	}

	@Override
	public List<CashGame> selectAll() {
		List<CashGame> list = null;
		try {
			list =  daoMesa.searchAll();
		} catch (DaoException e) {
			e.printStackTrace();
		}
		return list;
	}

}
