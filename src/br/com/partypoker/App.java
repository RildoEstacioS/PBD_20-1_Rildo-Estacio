package br.com.partypoker;

import java.io.IOException;

import br.com.partypoker.controller.TelasController;
import br.com.partypoker.exception.BusinessException;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

	public static TelasController telasController;
	
	@Override
	public void start(Stage arg0) throws Exception {
		telasController.loginController.launch(arg0);
		telasController.stageGeral = arg0;

	}
	
	public static void main(String[] args) throws IOException, BusinessException {
		
		telasController = new TelasController();
		Application.launch(args);

		
	}
}
