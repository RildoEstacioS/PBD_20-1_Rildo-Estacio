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

public class TorneioController implements Initializable{


    @FXML
    private TextField buscarTorneioTF;

    @FXML
    private ListView<Torneio> listView;
    
    private List<Torneio> listTorneio;
    
    private ObservableList<Torneio> observableLisTorneio;
    
    InicioController inicioController;
    
    private Stage stageTorneio;
    private Scene sceneTorneio;
    private Parent parentTorneio;
    private Facade facade;

    
    public TorneioController(InicioController inicioController, Facade facade) {
    	this.facade = facade;
    	this.inicioController = inicioController;
    	
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
	public Stage getStageTorneio() {
		return stageTorneio;
	}
	public void setStageTorneio(Stage stageTorneio) {
		this.stageTorneio = stageTorneio;
	}
	public Scene getSceneTorneio() {
		return sceneTorneio;
	}
	public void setSceneTorneio(Scene sceneTorneio) {
		this.sceneTorneio = sceneTorneio;
	}
	public Parent getParentTorneio() {
		return parentTorneio;
	}
	public void setParentTorneio(Parent parentTorneio) {
		this.parentTorneio = parentTorneio;
	}
}
