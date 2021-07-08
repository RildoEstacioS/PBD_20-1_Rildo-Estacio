package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.partypoker.App;
import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.facade.Facade;
import br.com.partypoker.model.Jogador;
import br.com.partypoker.util.Cripto;
import br.com.partypoker.view.Alerts;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController implements Initializable {

	@FXML
	private TextField loginTF;

	@FXML
	private Button buttonEntrar;

	@FXML
	private Button cadastrarButton;

	@FXML
	private PasswordField senhaTF;

	@FXML
	private Label esqueceuSenhaLabel;

	@FXML
	private Label entrarAdminLabel;

	private Parent parentLogin;
	private Scene sceneLogin;
	private Stage stageLogin;
	private InicioController inicioController;
	private CadastroController cadastrarController;
	private Facade facade;
	public static Jogador jogador = null;

	public LoginController(InicioController inicioController, CadastroController cadastrarController, Facade facade) {
		this.facade = facade;
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
	public void bttnEntrarEvent(Event e) throws BusinessException {
		if (e.getSource().equals(this.buttonEntrar)) {
			String login = loginTF.getText();
			String senha = senhaTF.getText();
			if (loginTF.getText().equals("") || senhaTF.getText().equals("")) {
				Alerts.showAlert("Campo(s) em branco", "Um ou mais campos em branco", AlertType.ERROR);				
				return;
			}
			jogador = facade.login(login);
			if (jogador != null) {
				if (Cripto.decode(jogador.getSenha()).equals(senha)) {
					Alerts.showAlert("Logado com Sucesso!", "Usuário Logado com Sucesso.", AlertType.CONFIRMATION);
					inicioController.setJogador(jogador);
					inicioController.getUserNameLabel().setText(jogador.getNome());
					inicioController.getCashLabel().setText("R$ " + jogador.getBanca());
					stageLogin.setScene(inicioController.getSceneInicio());

				} else {
					Alerts.showAlert("Senha invalida!", "Senha pode estar incorreta", AlertType.ERROR);
				}
			}
		}
	}

	@FXML
	public void bttnCadastrarEvent(Event e) {
		if (e.getSource().equals(this.cadastrarButton)) {
			stageLogin.setScene(cadastrarController.getSceneCadastrar());
		}
	}

	@FXML
	public void loginAdmEvent(Event e) {
		System.out.println(e.getSource().equals(this.entrarAdminLabel));
		if (e.getSource().equals(this.entrarAdminLabel)) {
			System.out.println("entrou");
			stageLogin.setScene(App.loginAdmController.getSceneLoginAdm());
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
