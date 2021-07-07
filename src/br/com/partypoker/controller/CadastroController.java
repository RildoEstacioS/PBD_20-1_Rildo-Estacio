package br.com.partypoker.controller;

import java.io.IOException;

import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.facade.Facade;
import br.com.partypoker.model.Jogador;
import br.com.partypoker.view.Alerts;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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

    @FXML
    private ImageView backButton;

    @FXML
    private ImageView closeCadastrarButton;

    private Parent parentCadastrar;
    private Scene sceneCadastrar;
    private Stage stageCadastrar;
    private LoginController loginController;
    private InicioController inicioController;
    private Facade facade;
    
    public CadastroController(InicioController inicioController, Facade facade) {
    	this.facade = facade;
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/Cadastrar.fxml"));
        fxmlLoader.setController(this);
        
        try {
			parentCadastrar = (Parent) fxmlLoader.load();
			sceneCadastrar = new Scene(parentCadastrar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void launch(Stage stage) {
    		this.stageCadastrar = stage;
    		stageCadastrar.setScene(sceneCadastrar);
    		stageCadastrar.initStyle(StageStyle.UNDECORATED);
    		stageCadastrar.setResizable(false);
    		stageCadastrar.show();
    }
    
    public void bttnCadastrarAction(Event e) throws BusinessException {
    	if (e.getSource().equals(cadastrarButton)) {
    		if (nomeTF.getText().equalsIgnoreCase("") || emailTF.getText().equalsIgnoreCase("") || senhaTF.getText().equalsIgnoreCase("") || senhaTF.getText().equalsIgnoreCase("")) {
    			Alerts.showAlert("Campo(s) em branco", "Um ou mais campos em branco", AlertType.ERROR);
			}
    		else if (!(senhaTF.getText().equals(confirmarTF.getText()))) {
    			Alerts.showAlert("Senhas diferentes", "As senhas precisam ser iguais", AlertType.ERROR);
			}else {
				facade.createJogador(new Jogador(nomeTF.getText(),emailTF.getText(), senhaTF.getText(), 10000));
				Alerts.showAlert("Jogador cadastrado com sucesso", "O jogador foi cadastro no sistema com êxito", AlertType.CONFIRMATION);
				loginController.mudarScene();
				
			}
    		
    	}
    }

	public Parent getParentCadastrar() {
		return parentCadastrar;
	}

	public void setParentCadastrar(Parent parentCadastrar) {
		this.parentCadastrar = parentCadastrar;
	}

	public Scene getSceneCadastrar() {
		return sceneCadastrar;
	}

	public void setSceneCadastrar(Scene sceneCadastrar) {
		this.sceneCadastrar = sceneCadastrar;
	}

	public Stage getStageCadastrar() {
		return stageCadastrar;
	}

	public void setStageCadastrar(Stage stageCadastrar) {
		this.stageCadastrar = stageCadastrar;
	}

	public LoginController getLoginController() {
		return loginController;
	}

	public void setLoginController(LoginController loginController) {
		this.loginController = loginController;
	}

	public TextField getNomeTF() {
		return nomeTF;
	}

	public void setNomeTF(TextField nomeTF) {
		this.nomeTF = nomeTF;
	}

	public TextField getEmailTF() {
		return emailTF;
	}

	public void setEmailTF(TextField emailTF) {
		this.emailTF = emailTF;
	}

	public PasswordField getSenhaTF() {
		return senhaTF;
	}

	public void setSenhaTF(PasswordField senhaTF) {
		this.senhaTF = senhaTF;
	}

	public PasswordField getConfirmarTF() {
		return confirmarTF;
	}

	public void setConfirmarTF(PasswordField confirmarTF) {
		this.confirmarTF = confirmarTF;
	}

	public Button getCadastrarButton() {
		return cadastrarButton;
	}

	public void setCadastrarButton(Button cadastrarButton) {
		this.cadastrarButton = cadastrarButton;
	}

	public ImageView getBackButton() {
		return backButton;
	}

	public void setBackButton(ImageView backButton) {
		this.backButton = backButton;
	}

	public ImageView getCloseCadastrarButton() {
		return closeCadastrarButton;
	}

	public void setCloseCadastrarButton(ImageView closeCadastrarButton) {
		this.closeCadastrarButton = closeCadastrarButton;
	}

	public InicioController getInicioController() {
		return inicioController;
	}

	public void setInicioController(InicioController inicioController) {
		this.inicioController = inicioController;
	}

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}
}