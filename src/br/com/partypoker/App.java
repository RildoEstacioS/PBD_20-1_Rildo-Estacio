package br.com.partypoker;

import java.io.IOException;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

public class App extends Application{
	public void start(Stage stage) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/br/com/partypoker/view/TelaHome.fxml"));
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
