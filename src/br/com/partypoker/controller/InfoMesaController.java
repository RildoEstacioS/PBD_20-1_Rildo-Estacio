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

public class InfoMesaController implements Initializable{

    @FXML
    private Button voltarButton;

    @FXML
    private Label nomeMesaLabel;

    @FXML
    private Label codigoLabel;

    @FXML
    private Label descricaoTA;

    @FXML
    private Button participarBttn;

    InicioController inicioController;
    private Stage stageInfoMesa;
    private Scene sceneInfoMesa;
    private Parent parentInfoMesa;
    private Parent parentMesa;
    
	public InfoMesaController(InicioController inicioController) {
		this.inicioController = inicioController;
    	

    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/InfoMesa.fxml"));
        fxmlLoader.setController(this);
        
        try {
        	parentInfoMesa = (Parent) fxmlLoader.load();
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
	void participarEventButton(ActionEvent event) {
		System.out.println("Entrou!!");
	}
	
	@FXML
	void voltarButtonAction(ActionEvent event) {
		inicioController.getBordePane().setCenter(App.mesaController.getParentMesa());
	}

	public Button getVoltarButton() {
		return voltarButton;
	}

	public void setVoltarButton(Button voltarButton) {
		this.voltarButton = voltarButton;
	}

	public Label getNomeMesaLabel() {
		return nomeMesaLabel;
	}

	public void setNomeMesaLabel(Label nomeMesaLabel) {
		this.nomeMesaLabel = nomeMesaLabel;
	}

	public Label getCodigoLabel() {
		return codigoLabel;
	}

	public void setCodigoLabel(Label codigoLabel) {
		this.codigoLabel = codigoLabel;
	}

	public Label getDescricaoTA() {
		return descricaoTA;
	}

	public void setDescricaoTA(Label descricaoTA) {
		this.descricaoTA = descricaoTA;
	}

	public Button getParticiparBttn() {
		return participarBttn;
	}

	public void setParticiparBttn(Button participarBttn) {
		this.participarBttn = participarBttn;
	}

	public Stage getStageInfoMesa() {
		return stageInfoMesa;
	}

	public void setStageInfoMesa(Stage stageInfoMesa) {
		this.stageInfoMesa = stageInfoMesa;
	}

	public Scene getSceneInfoMesa() {
		return sceneInfoMesa;
	}

	public void setSceneInfoMesa(Scene sceneInfoMesa) {
		this.sceneInfoMesa = sceneInfoMesa;
	}

	public Parent getParentInfoMesa() {
		return parentInfoMesa;
	}

	public void setParentInfoMesa(Parent parentInfoMesa) {
		this.parentInfoMesa = parentInfoMesa;
	}

	public Parent getParentMesa() {
		return parentMesa;
	}

	public void setParentMesa(Parent parentMesa) {
		this.parentMesa = parentMesa;
	}
}
