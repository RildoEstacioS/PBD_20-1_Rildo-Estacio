//package br.com.partypoker.util;
//
//import java.io.IOException;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//import javafx.stage.StageStyle;
//
//public class UtilTelas extends Application{
//
//		public static Parent parentMesa;
//		public static Parent parentInfoMesa;
//		public static Parent parentTorneio;
//		public static Parent parentInfoTorneio;
//		
//		public void start(Stage stage) {
//			try {
//				//Stage � como se fosse o JFrame, Scene � como se fosse o JPanel			
//				
//				parentMesa = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/Mesa.fxml"));
//				parentInfoMesa = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/InfoMesa.fxml"));
//				parentTorneio = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/Torneio.fxml"));
//				parentInfoTorneio = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/InfoTorneio.fxml"));
//				
//				
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//}
