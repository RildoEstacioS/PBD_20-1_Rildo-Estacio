package br.com.partypoker.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.partypoker.util.UtilTelas;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable{

    @FXML
    private TextField lognTF;

    @FXML
    private Button buttonEntrar;

    @FXML
    private Button cadastrarButton;

    @FXML
    private PasswordField senhaTF;
	
	@FXML
	public void bttnEntrarEvent(Event e) {
		UtilTelas.changeStage(1); //Ajeitar depois com regras de negócio...			
		
	}
	
	@FXML
	public void bttnCadastrarEvent(Event e) {
		UtilTelas.changeStage(3); 
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
