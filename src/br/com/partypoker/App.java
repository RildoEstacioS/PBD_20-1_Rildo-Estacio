package br.com.partypoker;

import java.io.IOException;

import br.com.partypoker.controller.TelaController;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

public class App extends Application{
	
	public static Stage telaStage;
	
	
	public void start(Stage stage) {
		try {
			//Stage é como se fosse o JFrame, Scene é como se fosse o JPanel
			telaStage = stage;
			
			
			Parent parentTelaUm = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/TelaHome.fxml"));
			Scene sceneUm = new Scene(parentTelaUm);

			
//			Parent parentTelaDois = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/TelaSegunda.fxml"));			
//			Scene sceneDois = new Scene(parentTelaDois);
//			
			stage.setTitle("Testando");
			stage.setScene(sceneUm);
			stage.show();
//			new TelaController(sceneUm, sceneDois);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		launch(args);
	}
	
}
