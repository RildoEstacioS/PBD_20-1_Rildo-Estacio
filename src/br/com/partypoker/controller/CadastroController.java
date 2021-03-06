package br.com.partypoker.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import br.com.partypoker.exception.BusinessException;
import br.com.partypoker.facade.Facade;
import br.com.partypoker.model.Jogador;
import br.com.partypoker.util.Cripto;
import br.com.partypoker.util.Util;
import br.com.partypoker.view.Alerts;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class CadastroController {

    @FXML
    private TextField nomeTF;

    @FXML
    private TextField cpfTF;

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
    
    private TelasController telasController;
    
	private Parent parentCadastrar;
    private Scene sceneCadastrar;

    private Facade facade;
    
    public CadastroController(TelasController telasController, Facade facade) {
    	super();
    	this.facade = facade;
    	this.telasController = telasController;
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/Cadastrar.fxml"));
        fxmlLoader.setController(this);
        
        try {
			parentCadastrar = (Parent) fxmlLoader.load();
			sceneCadastrar = new Scene(parentCadastrar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        control();
        
    }
    
    
   public void control() {
	   closeCadastrarButton.setOnMousePressed(new EventHandler<Event>() {

		@Override
		public void handle(Event arg0) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	});
	   
	   backButton.setOnMousePressed(new EventHandler<Event>() {

		@Override
		public void handle(Event arg0) {
			telasController.stageGeral.setScene(telasController.loginController.getSceneLogin());
		}
	});
   }

    public void bttnCadastrarAction(Event e) throws BusinessException {
    	if (e.getSource().equals(cadastrarButton)) {
    		if (nomeTF.getText().equalsIgnoreCase("") || emailTF.getText().equalsIgnoreCase("") || senhaTF.getText().equalsIgnoreCase("") || senhaTF.getText().equalsIgnoreCase("")) {
    			Alerts.showAlert("Campo(s) em branco", "Um ou mais campos em branco", AlertType.ERROR);
			}
    		else if (!(senhaTF.getText().equals(confirmarTF.getText()))) {
    			Alerts.showAlert("Senhas diferentes", "As senhas precisam ser iguais", AlertType.ERROR);
			}else if(!Util.validarEmail(emailTF.getText())){
				Alerts.showAlert("E-mail inv??lido", "O e-mail precisar ser v??lido", AlertType.ERROR);
			}else if(!Util.validarCPF(cpfTF.getText())){
				Alerts.showAlert("CPF inv??lido", "O CPF precisar ser v??lido", AlertType.ERROR);
			}else if(!Util.validarSenha(senhaTF.getText())){
				Alerts.showAlert("Senha inv??lida", "A senha precisar ser v??lida", AlertType.ERROR);
			}
    		else {
				Jogador jogador = new Jogador();
				jogador.setNome(nomeTF.getText());
				jogador.setCpf(cpfTF.getText());
				jogador.setEmail(emailTF.getText());
				jogador.setSenha(Cripto.encode(senhaTF.getText().getBytes(StandardCharsets.UTF_8)));

				facade.createJogador(jogador);
				Alerts.showAlert("Jogador cadastrado com sucesso", "O jogador foi cadastro no sistema com ??xito", AlertType.CONFIRMATION);
				telasController.stageGeral.setScene(telasController.loginController.getSceneLogin());
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

	public TelasController getTelasController() {
		return telasController;
	}

	public void setTelasController(TelasController telasController) {
		this.telasController = telasController;
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


	public TextField getCpfTF() {
		return cpfTF;
	}


	public void setCpfTF(TextField cpfTF) {
		this.cpfTF = cpfTF;
	}


	public Button getCadastrarButton() {
		return cadastrarButton;
	}


	public void setCadastrarButton(Button cadastrarButton) {
		this.cadastrarButton = cadastrarButton;
	}


	public Facade getFacade() {
		return facade;
	}


	public void setFacade(Facade facade) {
		this.facade = facade;
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

}