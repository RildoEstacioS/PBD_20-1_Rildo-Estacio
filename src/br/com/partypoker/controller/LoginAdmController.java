package br.com.partypoker.controller;

import java.io.IOException;

import br.com.partypoker.facade.Facade;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginAdmController {
	
    @FXML
    private TextField loginTF;

    @FXML
    private Button buttonEntrar;

    @FXML
    private PasswordField senhaTF;

    @FXML
    private Label closeBttn;

    @FXML
    private Label loginJogadorLabel;
    
    private Parent parentLoginAdm;
    private Scene sceneLoginAdm;
    private Stage stageLoginAdmn;

    private LoginController loginController;
    
    private Facade facade;

	public LoginAdmController(LoginController loginController, Facade facade) {
		super();
		this.facade = facade;
		this.loginController = loginController;
		
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/LoginAdministrador.fxml"));
        fxmlLoader.setController(this);		
        try {
 			parentLoginAdm = (Parent) fxmlLoader.load();
 			sceneLoginAdm = new Scene(parentLoginAdm);
 		} catch (IOException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
	}
	

    @FXML
    void bttnEntrarAdmEvent(Event event) {
    	if(event.getSource().equals(this.buttonEntrar)) {
    		System.out.println("Pegou entrar adm");
    	}
    }

    @FXML
    void closeBttnEvent(Event event) {
    	if (event.getSource().equals(this.closeBttn)) {
			System.out.println("Fechou");
		}
    }

    @FXML
    void loginJogadorEvent(Event event) {
		System.out.println("Entrou aqui");

    	if (event.getSource().equals(this.loginJogadorLabel)) {
    		System.out.println("Entrou aqui");
    		loginController.mudarScene();
    	}
    }


	public TextField getLoginTF() {
		return loginTF;
	}


	public void setLoginTF(TextField loginTF) {
		this.loginTF = loginTF;
	}


	public Button getButtonEntrar() {
		return buttonEntrar;
	}


	public void setButtonEntrar(Button buttonEntrar) {
		this.buttonEntrar = buttonEntrar;
	}


	public PasswordField getSenhaTF() {
		return senhaTF;
	}


	public void setSenhaTF(PasswordField senhaTF) {
		this.senhaTF = senhaTF;
	}

	public Parent getParentLoginAdm() {
		return parentLoginAdm;
	}


	public void setParentLoginAdm(Parent parentLoginAdm) {
		this.parentLoginAdm = parentLoginAdm;
	}


	public Scene getSceneLoginAdm() {
		return sceneLoginAdm;
	}


	public void setSceneLoginAdm(Scene sceneLoginAdm) {
		this.sceneLoginAdm = sceneLoginAdm;
	}


	public Stage getStageLoginAdmn() {
		return stageLoginAdmn;
	}


	public void setStageLoginAdmn(Stage stageLoginAdmn) {
		this.stageLoginAdmn = stageLoginAdmn;
	}


	public LoginController getLoginController() {
		return loginController;
	}


	public void setLoginController(LoginController loginController) {
		this.loginController = loginController;
	}


	public Facade getFacade() {
		return facade;
	}


	public void setFacade(Facade facade) {
		this.facade = facade;
	}

    
    
    
}
