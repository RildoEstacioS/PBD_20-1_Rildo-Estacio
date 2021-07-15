package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.partypoker.facade.Facade;
import javafx.event.Event;
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

public class TorneioAdmController implements Initializable {

    @FXML
    private TextField buscarTorneioTF;

    @FXML
    private ImageView buscarBttn;

    @FXML
    private ListView<?> listViewTorneio;

    @FXML
    private Label plusButtonNovoTorneio;
	
	private Parent parentTorneioAdm;
	private Facade facade;
	private TelasController telasController;
	
	public TorneioAdmController(TelasController telasController, Facade facade) {
		super();
		this.telasController = telasController;
		this.facade = facade;

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/TorneioAdm.fxml"));

		fxmlLoader.setController(this);
		try {
			
			parentTorneioAdm = (Parent) fxmlLoader.load();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	public void criarNovoTorneio(Event event) {
		if (event.getSource().equals(plusButtonNovoTorneio)) {
			System.out.println("AQUI");
			telasController.inicioAdmController.getBordePane().setCenter(telasController.novoTorneioAdmController.getParentNovoTorneio());
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	

	public TextField getBuscarTorneioTF() {
		return buscarTorneioTF;
	}

	public void setBuscarTorneioTF(TextField buscarTorneioTF) {
		this.buscarTorneioTF = buscarTorneioTF;
	}

	public ImageView getBuscarBttn() {
		return buscarBttn;
	}

	public void setBuscarBttn(ImageView buscarBttn) {
		this.buscarBttn = buscarBttn;
	}

	public ListView<?> getListViewTorneio() {
		return listViewTorneio;
	}

	public void setListViewTorneio(ListView<?> listViewTorneio) {
		this.listViewTorneio = listViewTorneio;
	}

	public Label getPlusButton() {
		return plusButtonNovoTorneio;
	}

	public void setPlusButton(Label plusButton) {
		this.plusButtonNovoTorneio = plusButton;
	}

	public Parent getParentCashGameAdm() {
		return parentTorneioAdm;
	}

	public void setParentCashGameAdm(Parent parentCashGameAdm) {
		this.parentTorneioAdm = parentCashGameAdm;
	}

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}

	public TelasController getTelasController() {
		return telasController;
	}

	public void setTelasController(TelasController telasController) {
		this.telasController = telasController;
	}

}
