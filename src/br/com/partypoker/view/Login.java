package br.com.partypoker.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {
	
    @FXML
    private TextField lognTF;

    @FXML
    private Button buttonEntrar;

    @FXML
    private Button cadastrarButton;

    @FXML
    private PasswordField senhaTF;

	public TextField getLognTF() {
		return lognTF;
	}

	public void setLognTF(TextField lognTF) {
		this.lognTF = lognTF;
	}

	public Button getButtonEntrar() {
		return buttonEntrar;
	}

	public void setButtonEntrar(Button buttonEntrar) {
		this.buttonEntrar = buttonEntrar;
	}

	public Button getCadastrarButton() {
		return cadastrarButton;
	}

	public void setCadastrarButton(Button cadastrarButton) {
		this.cadastrarButton = cadastrarButton;
	}

	public PasswordField getSenhaTF() {
		return senhaTF;
	}

	public void setSenhaTF(PasswordField senhaTF) {
		this.senhaTF = senhaTF;
	}

    
    
}
