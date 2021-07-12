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

public class infoTorneioController implements Initializable {

	@FXML
	private Label nomeDoTorneioLabel;

	@FXML
	private Label descricaoLabel;

	@FXML
	private Button ParticiparBttn;

	@FXML
	private Label premiacaoLabel;

	@FXML
	private ImageView voltarButton;

	@FXML
	private ImageView closeButton;

	private Parent parentInfoTorneio;
	private Facade facade;
	private TelasController telasController;

	public infoTorneioController(TelasController telasController, Facade facade) {

		this.facade = facade;
		this.telasController = telasController;

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
		// Colocar dados da mesa para aparecer aqui!!
	}

	@FXML
	void participarBttnAction(ActionEvent event) {
		System.out.println("Entrou!!");
	}

	@FXML
	void voltarActionButton(ActionEvent event) {
		telasController.inicioController.getBordePane().setCenter(telasController.torneioController.getParentTorneio());

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

	public Label getDescricaoLabel() {
		return descricaoLabel;
	}

	public void setDescricaoLabel(Label descricaoLabel) {
		this.descricaoLabel = descricaoLabel;
	}

	public Label getPremiacaoLabel() {
		return premiacaoLabel;
	}

	public void setPremiacaoLabel(Label premiacaoLabel) {
		this.premiacaoLabel = premiacaoLabel;
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
