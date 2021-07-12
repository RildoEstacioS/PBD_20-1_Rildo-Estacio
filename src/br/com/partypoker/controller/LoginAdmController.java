package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.partypoker.App;
import br.com.partypoker.facade.Facade;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginAdmController implements Initializable {

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

	private Facade facade;

	private TelasController telasController;

	public LoginAdmController(TelasController telasController, Facade facade) {
		super();
		this.facade = facade;
		this.telasController = telasController;

		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/br/com/partypoker/view/LoginAdministrador.fxml"));
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
		if (event.getSource().equals(this.buttonEntrar)) {
			telasController.stageGeral.setScene(telasController.inicioAdmController.getSceneInicioAdm());
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

		if (event.getSource().equals(this.loginJogadorLabel)) {
			telasController.stageGeral.setScene(telasController.loginController.getSceneLogin());
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

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

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}

}
