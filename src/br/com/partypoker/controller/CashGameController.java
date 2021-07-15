package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.com.partypoker.App;
import br.com.partypoker.facade.Facade;
import br.com.partypoker.model.CashGame;
import br.com.partypoker.view.CashListCell;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Callback;

public class CashGameController implements Initializable {

	@FXML
	private TextField buscarCashGameTF;

	@FXML
	private ListView<CashGame> listView;

	private List<CashGame> listMesas = new ArrayList<CashGame>();

	private ObservableList<CashGame> observableListMesas;

	private Parent parentCashGame;

	private Facade facade;

	private TelasController telasController;

	public CashGameController(TelasController telasController, Facade facade) {
		this.facade = facade;
		this.telasController = telasController;

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/CashGame.fxml"));

		fxmlLoader.setController(this);

		observableListMesas = FXCollections.observableArrayList();
		listMesas = facade.loadCashGames();
		observableListMesas.addAll(listMesas);
		try {
			parentCashGame = (Parent) fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listView.setItems(observableListMesas);
		listView.setCellFactory(cell -> new CashListCell());

	}

	public Parent getParentMesa() {
		return parentCashGame;
	}

	public void setParentMesa(Parent parentMesa) {
		this.parentCashGame = parentMesa;
	}

	public TextField getBuscarCashGameTF() {
		return buscarCashGameTF;
	}

	public void setBuscarCashGameTF(TextField buscarCashGameTF) {
		this.buscarCashGameTF = buscarCashGameTF;
	}

	public ListView<?> getListView() {
		return listView;
	}


	public Parent getParentCashGame() {
		return parentCashGame;
	}

	public void setParentCashGame(Parent parentCashGame) {
		this.parentCashGame = parentCashGame;
	}

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}
}
