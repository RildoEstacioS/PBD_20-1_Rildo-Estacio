package br.com.partypoker.controller;

import br.com.partypoker.facade.Facade;
import javafx.stage.Stage;

public class TelasController {
	
	public LoginController loginController;
	public CadastroController cadastroController;
	
	public InicioController inicioController;
	
	public CashGameController cashGameController;
	public TorneioController torneioController;
	
	public InfoMesaController infoMesaController;
	public infoTorneioController infoTorneioController;
	public LugarRapidoController lugarRapidoController;
	public FavoritoController favoritoController;
	
	public LoginAdmController loginAdmController;
	public InicioAdmController inicioAdmController;
	public CashGameAdmController cashGameAdmController;
	public TorneioAdmController torneioAdmController;
	public UsuarioAdmController usuarioAdmController;
	public RelatorioAdmController relatorioAdmController;
	
	
	public Facade facade;
	
	public Stage stageGeral;

	public TelasController() {
		super();
		//Facade
		facade = new Facade();

		inicioController = new InicioController(this, facade);
		
		cadastroController = new CadastroController(this, facade);
		loginController = new LoginController(this, facade);
		 
		cashGameController = new CashGameController(this, facade);
		torneioController = new TorneioController(this, facade);
		infoMesaController = new InfoMesaController(this, facade);
		infoTorneioController = new infoTorneioController(this, facade);
		lugarRapidoController = new LugarRapidoController(this, facade);
		favoritoController = new FavoritoController(this, facade);

		inicioAdmController = new InicioAdmController(this, facade);
		loginAdmController = new LoginAdmController(this, facade);
	
		torneioAdmController = new TorneioAdmController(this, facade);
		cashGameAdmController = new CashGameAdmController(this, facade); 
		usuarioAdmController = new UsuarioAdmController(this, facade);
		relatorioAdmController = new RelatorioAdmController(this, facade);
			
	}
	
	

}
