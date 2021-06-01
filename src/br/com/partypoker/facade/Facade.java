package br.com.partypoker.facade;

import br.com.partypoker.business.BusinessJogador;
import br.com.partypoker.business.BusinessMesa;
import br.com.partypoker.business.BusinessTorneio;
import br.com.partypoker.business.IBusinessJogador;
import br.com.partypoker.business.IBusinessMesa;
import br.com.partypoker.business.IBusinessTorneio;
import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.model.Jogador;
import br.com.partypoker.model.Mesa;
import br.com.partypoker.model.Torneio;

public class Facade implements IFacade{
	private static Facade instance;
	
//	public static Facade getInstance() {
//		
//		if(instance == null) {
//			instance = new Facade();
//		}
//		return instance;
//	}
//	
	private IBusinessJogador businessJogador;
	private IBusinessMesa businessMesa;
	private IBusinessTorneio businessTorneio;
	
	public Facade() {
		super();
		businessJogador = new BusinessJogador();
		businessMesa = new BusinessMesa();
		businessTorneio = new BusinessTorneio();
	}

	
	//JOGADOR
	
	@Override
	public void createJogador(Jogador jogador) throws BusinessException {
		businessJogador.createJogador(jogador);
	}

	@Override
	public Jogador reatriveJogador(int id) throws BusinessException {
		return businessJogador.reatriveJogador(id);
	}

	@Override
	public boolean updateJogador(Jogador jogador) throws BusinessException {
		// TODO Auto-generated method stub
		return businessJogador.updateJogador(jogador);
	}

	@Override
	public boolean removeJogador(Jogador jogador) throws BusinessException {
		// TODO Auto-generated method stub
		return businessJogador.removeJogador(jogador);
	}

	
	//TORNEIO
	@Override
	public void createTorneio(Torneio torneio) throws BusinessException {
		businessTorneio.createTorneio(torneio);
	}

	@Override
	public Torneio reatriveTorneio(int id) throws BusinessException {
		return businessTorneio.reatriveTorneio(id);
	}

	@Override
	public boolean updateTorneio(Torneio torneio) throws BusinessException {
		// TODO Auto-generated method stub
		return businessTorneio.updateTorneio(torneio);
	}

	@Override
	public boolean removeTorneio(Torneio torneio) throws BusinessException {
		// TODO Auto-generated method stub
		return businessTorneio.removeTorneio(torneio);
	}

	//MESA
	
	@Override
	public void createMesa(Mesa mesa) throws BusinessException {
		businessMesa.createMesa(mesa);
	}

	@Override
	public Mesa reatriveMesa(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return businessMesa.reatriveMesa(id);
	}

	@Override
	public boolean updateMesa(Mesa mesa) throws BusinessException {
		// TODO Auto-generated method stub
		return businessMesa.updateMesa(mesa);
	}

	@Override
	public boolean removeMesa(Mesa mesa) throws BusinessException {
		// TODO Auto-generated method stub
		return businessMesa.removeMesa(mesa);
	}
	
	
	
}
