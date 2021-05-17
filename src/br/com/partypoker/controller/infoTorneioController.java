package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.partypoker.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class infoTorneioController implements Initializable{

	  @FXML
	    private Button voltarBttnAction;

	    @FXML
	    private Label nomeTorneioLabel;

	    @FXML
	    private Label descricaoLabel;

	    @FXML
	    private Button ParticiparBttn;

	    @FXML
	    private Label premiacaoLabel;


    InicioController inicioController;
    private Stage stageinfoTorneio;
    private Scene sceneInfoTorneio;
    private Parent parentInfoTorneio;
    
	public infoTorneioController(InicioController inicioController) {
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

	public Button getVoltarBttnAction() {
		return voltarBttnAction;
	}

	public void setVoltarBttnAction(Button voltarBttnAction) {
		this.voltarBttnAction = voltarBttnAction;
	}

	public Label getNomeTorneioLabel() {
		return nomeTorneioLabel;
	}

	public void setNomeTorneioLabel(Label nomeTorneioLabel) {
		this.nomeTorneioLabel = nomeTorneioLabel;
	}

	public Label getDescricaoLabel() {
		return descricaoLabel;
	}

	public void setDescricaoLabel(Label descricaoLabel) {
		this.descricaoLabel = descricaoLabel;
	}

	public Button getParticiparBttn() {
		return ParticiparBttn;
	}

	public void setParticiparBttn(Button participarBttn) {
		ParticiparBttn = participarBttn;
	}

	public Label getPremiacaoLabel() {
		return premiacaoLabel;
	}

	public void setPremiacaoLabel(Label premiacaoLabel) {
		this.premiacaoLabel = premiacaoLabel;
	}

	
}
