package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.javafx.application.LauncherImpl;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController implements Initializable{

    @FXML
    private TextField lognTF;

    @FXML
    private Button buttonEntrar;

    @FXML
    private Button cadastrarButton;

    @FXML
    private PasswordField senhaTF;
	
    private Parent parentLogin;
    private Scene sceneLogin;
    private Stage stageLogin;
    private InicioController inicioController;
    private CadastroController cadastrarController;
    
    public LoginController(InicioController inicioController, CadastroController cadastrarController) {
    	
    	this.inicioController = inicioController;
    	this.cadastrarController = cadastrarController;
    	cadastrarController.setLoginController(this);
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/Login.fxml"));
        fxmlLoader.setController(this);
        
        try {
			parentLogin = (Parent) fxmlLoader.load();
			sceneLogin = new Scene(parentLogin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void launch(Stage stage) {
    		this.stageLogin = stage;
    		stageLogin.setScene(sceneLogin);
    		stageLogin.initStyle(StageStyle.UNDECORATED);
    		stageLogin.setResizable(false);
    		stageLogin.show();
    }
    
    
	@FXML
	public void bttnEntrarEvent(Event e) {
		if (e.getSource().equals(this.buttonEntrar)) {
			System.out.println("Cabaré");
			stageLogin.setScene(inicioController.getSceneInicio());		
		}
	}
	
	@FXML
	public void bttnCadastrarEvent(Event e) {
		if (e.getSource().equals(this.cadastrarButton)) {
			System.out.println("VAi CARAI!!");
			stageLogin.setScene(cadastrarController.getSceneCadastrar());		
		}
	}
	
	public void mudarScene() {
		stageLogin.setScene(sceneLogin);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

	public Button getCadastrarButton() {
		return cadastrarButton;
	}

	public void setCadastrarButton(Button cadastrarButton) {
		this.cadastrarButton = cadastrarButton;
	}

	public Parent getParentLogin() {
		return parentLogin;
	}

	public void setParentLogin(Parent parentLogin) {
		this.parentLogin = parentLogin;
	}

	public Scene getSceneLogin() {
		return sceneLogin;
	}

	public void setSceneLogin(Scene sceneLogin) {
		this.sceneLogin = sceneLogin;
	}

	public Stage getStageLogin() {
		return stageLogin;
	}

	public void setStageLogin(Stage stageLogin) {
		this.stageLogin = stageLogin;
	}

}
