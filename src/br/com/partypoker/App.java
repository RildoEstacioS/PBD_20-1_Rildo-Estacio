package br.com.partypoker;

import java.io.IOException;

import br.com.partypoker.controller.InicioController;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.application.Application;

public class App extends Application{
	
	public static Stage telaStage;
	public static Scene sceneInicio;
	public static Scene sceneMesa;
	public static Scene sceneInfoMesa;
	public static Scene sceneLogin;


	public void start(Stage stage) {
		try {
			//Stage � como se fosse o JFrame, Scene � como se fosse o JPanel			
			
			Parent parentInicio = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/Inicio.fxml"));
			sceneInicio = new Scene(parentInicio);
			
			Parent parentMesa = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/Mesa.fxml"));
			sceneMesa = new Scene(parentMesa);
			
			Parent parentInfoMesa = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/InfoMesa.fxml"));
			sceneInfoMesa = new Scene(parentInfoMesa);

			Parent parentLogin = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/Login.fxml"));
			sceneLogin = new Scene(parentLogin);

			stage.initStyle(StageStyle.UNDECORATED);
			stage.setResizable(false);
			stage.setScene(sceneLogin);
			stage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		launch(args);
	}
	
}
