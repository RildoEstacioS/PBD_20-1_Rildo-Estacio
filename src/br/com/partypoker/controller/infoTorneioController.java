package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.partypoker.App;
import br.com.partypoker.facade.Facade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class infoTorneioController implements Initializable{

    @FXML
    private Label nomeDoTorneioLabel;

    @FXML
    private Label descriçãoTA;

    @FXML
    private Button ParticiparBttn;

    @FXML
    private Label premiaçãoLabel;

    @FXML
    private ImageView voltarButton;

    @FXML
    private ImageView closeButton;


    InicioController inicioController;
    private Stage stageinfoTorneio;
    private Scene sceneInfoTorneio;
    private Parent parentInfoTorneio;
    private Facade facade;
    
	public infoTorneioController(InicioController inicioController, Facade facade) {
		
		this.facade = facade;
		this.inicioController = inicioController;
    	

    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/InfoTorneio.fxml"));
        fxmlLoader.setController(this);
        
        try {
        	parentInfoTorneio = (Parent) fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//Colocar dados da mesa para aparecer aqui!!
	}

	@FXML
	void participarBttnAction(ActionEvent event) {
		System.out.println("Entrou!!");
	}
	
	@FXML
	void voltarActionButton(ActionEvent event) {
		inicioController.getBordePane().setCenter(App.torneioController.getParentTorneio());
		
	}
	
	public InicioController getInicioController() {
		return inicioController;
	}

	public void setInicioController(InicioController inicioController) {
		this.inicioController = inicioController;
	}

	public Stage getStageinfoTorneio() {
		return stageinfoTorneio;
	}

	public void setStageinfoTorneio(Stage stageinfoTorneio) {
		this.stageinfoTorneio = stageinfoTorneio;
	}

	public Scene getSceneInfoTorneio() {
		return sceneInfoTorneio;
	}

	public void setSceneInfoTorneio(Scene sceneInfoTorneio) {
		this.sceneInfoTorneio = sceneInfoTorneio;
	}

	public Parent getParentInfoTorneio() {
		return parentInfoTorneio;
	}

	public void setParentInfoTorneio(Parent parentInfoTorneio) {
		this.parentInfoTorneio = parentInfoTorneio;
	}

	public Button getParticiparBttn() {
		return ParticiparBttn;
	}

	public void setParticiparBttn(Button participarBttn) {
		ParticiparBttn = participarBttn;
	}

	public Label getNomeDoTorneioLabel() {
		return nomeDoTorneioLabel;
	}

	public void setNomeDoTorneioLabel(Label nomeDoTorneioLabel) {
		this.nomeDoTorneioLabel = nomeDoTorneioLabel;
	}

	public Label getDescriçãoTA() {
		return descriçãoTA;
	}

	public void setDescriçãoTA(Label descriçãoTA) {
		this.descriçãoTA = descriçãoTA;
	}

	public Label getPremiaçãoLabel() {
		return premiaçãoLabel;
	}

	public void setPremiaçãoLabel(Label premiaçãoLabel) {
		this.premiaçãoLabel = premiaçãoLabel;
	}

	public ImageView getVoltarButton() {
		return voltarButton;
	}

	public void setVoltarButton(ImageView voltarButton) {
		this.voltarButton = voltarButton;
	}

	public ImageView getCloseButton() {
		return closeButton;
	}

	public void setCloseButton(ImageView closeButton) {
		this.closeButton = closeButton;
	}

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}
	
}
