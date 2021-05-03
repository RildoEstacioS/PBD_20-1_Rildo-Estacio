package br.com.partypoker.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.partypoker.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class InicioController{
	@FXML
	private Label mesa;
	@FXML
	private Label torneio;
	
	private int i = 0;
	
	@FXML
	public void bttnAction() {
		System.out.println("Pegou");
		
		
//		App.telaStage.setScene(telaDois);
		
//		if (i == 0) {
//			label.setText("O botão funcionou!");
//			i++;
//		
//		}else{			
//			label.setText("");
//			i--;
//		}
	}
		
}
