package br.com.partypoker.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.partypoker.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TelaController implements Initializable{
	@FXML
	public Scene telaUm;
	@FXML
	public Scene telaDois;
	
	public TelaController(Scene telaUm, Scene telaDois) {
		super();
		this.telaUm = telaUm;
		this.telaDois = telaDois;
	}
	
	@FXML
	private Button bttn;
	@FXML
	private Label label;
	
	private int i = 0;
	
	@FXML
	public void bttnAction() {
		
		App.telaStage.setScene(telaDois);
		
//		if (i == 0) {
//			label.setText("O botão funcionou!");
//			i++;
//		
//		}else{			
//			label.setText("");
//			i--;
//		}
	}
		
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
