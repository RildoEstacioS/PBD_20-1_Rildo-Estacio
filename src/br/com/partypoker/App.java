package br.com.partypoker;

import java.io.IOException;

import br.com.partypoker.controller.CadastroController;
import br.com.partypoker.controller.InfoMesaController;
import br.com.partypoker.controller.InicioController;
import br.com.partypoker.controller.LoginController;
import br.com.partypoker.controller.MesaController;
import br.com.partypoker.controller.TorneioController;
import br.com.partypoker.controller.infoTorneioController;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{
	
	
	public static LoginController loginController;
	public static InicioController inicioController;
	public static CadastroController cadastroController;
	public static MesaController mesaController;
	public static TorneioController torneioController;
	public static InfoMesaController infoMesaController;
	public static infoTorneioController infoTorneioController;

	@Override
	public void start(Stage arg0) throws Exception {
		loginController.launch(arg0);
		
	}
	
	public static void main(String[] args) throws IOException {
		inicioController = new InicioController();
		cadastroController = new CadastroController();
		loginController = new LoginController(inicioController, cadastroController);
		mesaController = new MesaController(inicioController);
		torneioController = new TorneioController(inicioController);
		infoMesaController = new InfoMesaController(inicioController);
		infoTorneioController = new infoTorneioController(inicioController);
		
		Application.launch(args);
		
	}
}
