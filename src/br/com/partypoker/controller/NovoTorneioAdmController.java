package br.com.partypoker.controller;

import java.io.IOException;

import br.com.partypoker.facade.Facade;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NovoTorneioAdmController {

	@FXML
	private Button salvarBttn;

	@FXML
	private TextField tituloTF;

	@FXML
	private TextField inicioTF;

	@FXML
	private TextField buyinTF;

	@FXML
	private TextArea descricaoTA;

	private Parent parentNovoTorneio;


	private TelasController telasController;
	private Facade facade;

	public NovoTorneioAdmController(TelasController telasController, Facade facade) {
		super();
		this.telasController = telasController;
		this.facade = facade;

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/NovoTorneioAdmin.fxml"));

		fxmlLoader.setController(this);

		try {
			parentNovoTorneio = (Parent) fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@FXML
	public void salvarEventButton(Event event) {
		
	}
	public Button getSalvarBttn() {
		return salvarBttn;
	}
	public void setSalvarBttn(Button salvarBttn) {
		this.salvarBttn = salvarBttn;
	}
	public TextField getTituloTF() {
		return tituloTF;
	}
	public void setTituloTF(TextField tituloTF) {
		this.tituloTF = tituloTF;
	}
	public TextField getInicioTF() {
		return inicioTF;
	}
	public void setInicioTF(TextField inicioTF) {
		this.inicioTF = inicioTF;
	}
	public TextField getBuyinTF() {
		return buyinTF;
	}
	public void setBuyinTF(TextField buyinTF) {
		this.buyinTF = buyinTF;
	}
	public TextArea getDescricaoTA() {
		return descricaoTA;
	}
	public void setDescricaoTA(TextArea descricaoTA) {
		this.descricaoTA = descricaoTA;
	}
	public Parent getParentNovoTorneio() {
		return parentNovoTorneio;
	}
	public void setParentNovoTorneio(Parent parentNovoTorneio) {
		this.parentNovoTorneio = parentNovoTorneio;
	}
	public TelasController getTelasController() {
		return telasController;
	}
	public void setTelasController(TelasController telasController) {
		this.telasController = telasController;
	}
	public Facade getFacade() {
		return facade;
	}
	public void setFacade(Facade facade) {
		this.facade = facade;
	}
	

}
