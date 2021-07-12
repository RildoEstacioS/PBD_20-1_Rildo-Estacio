package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import br.com.partypoker.facade.Facade;
import br.com.partypoker.model.Torneio;
import br.com.partypoker.view.TorneioListCell;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TorneioController implements Initializable {

	@FXML
	private TextField buscarTorneioTF;

	@FXML
	private ListView<Torneio> listView;

	private List<Torneio> listTorneio;
	private ObservableList<Torneio> observableLisTorneio;
	private Parent parentTorneio;
	private Facade facade;
	private TelasController telasController;

	public TorneioController(TelasController telasController, Facade facade) {
		super();
		this.facade = facade;
		this.telasController = telasController;

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/Torneio.fxml"));
		fxmlLoader.setController(this);

		observableLisTorneio = FXCollections.observableArrayList();
		listTorneio = facade.selectAllTorneio();
		observableLisTorneio.addAll(listTorneio);
		try {
			parentTorneio = (Parent) fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listView.setItems(observableLisTorneio);
		listView.setCellFactory(cell -> new TorneioListCell());
	}

	public Parent getParentTorneio() {
		return parentTorneio;
	}

	public void setParentTorneio(Parent parentTorneio) {
		this.parentTorneio = parentTorneio;
	}

	public TextField getBuscarTorneioTF() {
		return buscarTorneioTF;
	}

	public void setBuscarTorneioTF(TextField buscarTorneioTF) {
		this.buscarTorneioTF = buscarTorneioTF;
	}

	public ListView<Torneio> getListView() {
		return listView;
	}

	public void setListView(ListView<Torneio> listView) {
		this.listView = listView;
	}

	public List<Torneio> getListTorneio() {
		return listTorneio;
	}

	public void setListTorneio(List<Torneio> listTorneio) {
		this.listTorneio = listTorneio;
	}

	public ObservableList<Torneio> getObservableLisTorneio() {
		return observableLisTorneio;
	}

	public void setObservableLisTorneio(ObservableList<Torneio> observableLisTorneio) {
		this.observableLisTorneio = observableLisTorneio;
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
