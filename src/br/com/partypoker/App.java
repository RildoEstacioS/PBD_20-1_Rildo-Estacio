package br.com.partypoker;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.partypoker.controller.CadastroController;
import br.com.partypoker.controller.CashController;
import br.com.partypoker.controller.InfoMesaController;
import br.com.partypoker.controller.InicioController;
import br.com.partypoker.controller.LoginController;
import br.com.partypoker.controller.CashGameController;
import br.com.partypoker.controller.TorneioController;
import br.com.partypoker.controller.infoTorneioController;
import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.facade.Facade;
import br.com.partypoker.model.Jogador;
import br.com.partypoker.view.Alerts;
import javafx.application.Application;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class App extends Application{
	
	
	public static LoginController loginController;
	public static InicioController inicioController;
	public static CadastroController cadastroController;
	public static CashGameController cashGameController;
	public static TorneioController torneioController;
	public static InfoMesaController infoMesaController;
	public static infoTorneioController infoTorneioController;
	public static Facade facade;
	
	@Override
	public void start(Stage arg0) throws Exception {
		loginController.launch(arg0);
	}
	
	public static void main(String[] args) throws IOException, BusinessException {
		facade = new Facade();

		inicioController = new InicioController(facade);
		cadastroController = new CadastroController(facade);
		loginController = new LoginController(inicioController, cadastroController, facade);
		cashGameController = new CashGameController(inicioController, facade);
		torneioController = new TorneioController(inicioController, facade);
		infoMesaController = new InfoMesaController(inicioController, facade);
		infoTorneioController = new infoTorneioController(inicioController, facade);


		Application.launch(args);
		
	}
}
