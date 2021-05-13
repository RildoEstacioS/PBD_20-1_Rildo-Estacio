package br.com.partypoker.util;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class UtilTelas extends Application{
	
		public static Stage stage;
		
		public static Scene sceneInicio;
		public static Scene sceneMesa;
		public static Scene sceneInfoMesa;
		public static Scene sceneLogin;
		public static Scene sceneCadastrar;
		public static Scene sceneinfoTorneio;
		public static Scene sceneTorneio;

		public static Parent parentLogin;
		public static Parent parentInicio;
		public static Parent parentMesa;
		public static Parent parentInfoMesa;
		public static Parent parentCadastrar;
		public static Parent parentTorneio;
		public static Parent parentInfoTorneio;

		public void start(Stage stage) {
			try {
				//Stage � como se fosse o JFrame, Scene � como se fosse o JPanel			
				this.stage = stage;
				
				parentLogin = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/Login.fxml"));
				parentInicio = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/Inicio.fxml"));
				parentMesa = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/Mesa.fxml"));
				parentInfoMesa = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/InfoMesa.fxml"));
				parentCadastrar = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/Cadastrar.fxml"));
				parentTorneio = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/Torneio.fxml"));
				parentInfoTorneio = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/InfoTorneio.fxml"));
				
				
				
				sceneLogin = new Scene(parentLogin);
				sceneInicio = new Scene(parentInicio);
//				sceneMesa = new Scene(parentMesa);
				sceneInfoMesa = new Scene(parentInfoMesa);
				sceneCadastrar = new Scene(parentCadastrar);
				sceneinfoTorneio = new Scene(parentInfoTorneio);
				
				stage.initStyle(StageStyle.UNDECORATED);
				stage.setResizable(false);
				stage.setScene(sceneLogin);
				stage.show();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static void changeStage(int a) {
			
			switch (a) {
			case 0:
				stage.setScene(sceneLogin);
				break;
			
			case 1:
				stage.setScene(sceneInicio);
				break;
				
			case 2:
				stage.setScene(sceneMesa);
				break;
				
			case 3:
				stage.setScene(sceneCadastrar);
				break;

			case 4:
				stage.setScene(sceneInfoMesa);
				break;

			case 5:
				stage.setScene(sceneinfoTorneio);
				break;
				
			default:
				break;
			}
			
		}
}
