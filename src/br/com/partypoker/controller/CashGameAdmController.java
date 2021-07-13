package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.partypoker.facade.Facade;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CashGameAdmController implements Initializable {

	@FXML
	private TextField buscarCashGameTF;

	@FXML
	private ImageView buscarButton;

	@FXML
	private ListView<?> mesasLV;

	@FXML
	private Label nomeMesa;

	@FXML
	private Label blindsLabel;

	@FXML
	private Label buyinLabel;

	@FXML
	private Label numJogadoresLabel;

	@FXML
	private ListView<?> jogadoresLV;

	@FXML
	private Label plusButton;

	private Parent parentCashGameAdm;
	private Facade facade;
	private TelasController telasController;
	
	public CashGameAdmController(TelasController telasController, Facade facade) {
		super();
		this.telasController = telasController;
		this.facade = facade;

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/CashGameAdm.fxml"));

		fxmlLoader.setController(this);
		try {
			
			parentCashGameAdm = (Parent) fxmlLoader.load();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	public TextField getBuscarCashGameTF() {
		return buscarCashGameTF;
	}

	public void setBuscarCashGameTF(TextField buscarCashGameTF) {
		this.buscarCashGameTF = buscarCashGameTF;
	}

	public ImageView getBuscarButton() {
		return buscarButton;
	}

	public void setBuscarButton(ImageView buscarButton) {
		this.buscarButton = buscarButton;
	}

	public ListView<?> getMesasLV() {
		return mesasLV;
	}

	public void setMesasLV(ListView<?> mesasLV) {
		this.mesasLV = mesasLV;
	}

	public Label getNomeMesa() {
		return nomeMesa;
	}

	public void setNomeMesa(Label nomeMesa) {
		this.nomeMesa = nomeMesa;
	}

	public Label getBlindsLabel() {
		return blindsLabel;
	}

	public void setBlindsLabel(Label blindsLabel) {
		this.blindsLabel = blindsLabel;
	}

	public Label getBuyinLabel() {
		return buyinLabel;
	}

	public void setBuyinLabel(Label buyinLabel) {
		this.buyinLabel = buyinLabel;
	}

	public Label getNumJogadoresLabel() {
		return numJogadoresLabel;
	}

	public void setNumJogadoresLabel(Label numJogadoresLabel) {
		this.numJogadoresLabel = numJogadoresLabel;
	}

	public ListView<?> getJogadoresLV() {
		return jogadoresLV;
	}

	public void setJogadoresLV(ListView<?> jogadoresLV) {
		this.jogadoresLV = jogadoresLV;
	}

	public Label getPlusButton() {
		return plusButton;
	}

	public void setPlusButton(Label plusButton) {
		this.plusButton = plusButton;
	}

	public Parent getParentCashGameAdm() {
		return parentCashGameAdm;
	}

	public void setParentCashGameAdm(Parent parentCashGameAdm) {
		this.parentCashGameAdm = parentCashGameAdm;
	}

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}

}
