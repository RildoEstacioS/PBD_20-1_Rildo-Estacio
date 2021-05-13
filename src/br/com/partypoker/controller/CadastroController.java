package br.com.partypoker.controller;

import br.com.partypoker.util.UtilTelas;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CadastroController {

    @FXML
    private TextField nomeTF;

    @FXML
    private TextField emailTF;

    @FXML
    private PasswordField senhaTF;

    @FXML
    private PasswordField confirmarTF;

    @FXML
    private Button cadastrarButton;
    
    public void bttnCadastrarAction() {
    	UtilTelas.changeStage(0);
    }

}