package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;

import br.com.partypoker.App;
import br.com.partypoker.model.Jogador;
import br.com.partypoker.model.Torneio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Callback;

public class TorneioController implements Initializable{

    @FXML
    private TableView<Torneio> tableView;

    @FXML
    private TableColumn<Torneio, String> torneioColumn;

    @FXML
    private TableColumn<Torneio, String> jogadoresColumn;

    @FXML
    private TableColumn<Torneio, String> premiacaoColumn;

    @FXML
    private TableColumn<Torneio, Void> participarColumn;
    
    
    private List<Torneio> listaTorneio = new ArrayList<>();
    
    private ObservableList<Torneio> observableLisTorneio;
    
    InicioController inicioController;
    
    private Stage stageTorneio;
    private Scene sceneTorneio;
    private Parent parentTorneio;
    

    
    public TorneioController(InicioController inicioController) {
    	this.inicioController = inicioController;
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/Torneio.fxml"));
        fxmlLoader.setController(this);
        
        try {
        	parentTorneio = (Parent) fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		carregarTableView();		
	}
	

	private void carregarTableView() {
		torneioColumn.setCellValueFactory(new PropertyValueFactory<>("titulo"));
		jogadoresColumn.setCellValueFactory(new PropertyValueFactory<>("infoJogadores"));
		premiacaoColumn.setCellValueFactory(new PropertyValueFactory<>("premio"));
		
		Torneio t1 = new Torneio((long)1, "Cabaré", "aUDASHDUSAHDASDUHA", "10hs", 50.0, true, false, "R$ 10.000,00");
		Torneio t2 = new Torneio((long)2, "Jubileu", "aUDASHDUSAHDASDUHA", "10hs", 50.0, true, false, "R$ 10.000,00");

		Jogador j1 = new Jogador((long)10, "a", "", "", "", "", 100, false, false);
    	Jogador j2 = new Jogador((long)20, "b", "", "", "", "", 100, false, false);
    	Jogador j3 = new Jogador((long)30, "c", "", "", "", "", 100, false, false);

    	t1.getJogadores().add(j1);
    	t1.getJogadores().add(j3);
    	t1.getJogadores().add(j2);
    	
		listaTorneio.add(t1);
		listaTorneio.add(t2);
		
		addBotaoTabela();
		observableLisTorneio = FXCollections.observableArrayList(listaTorneio);
		tableView.setItems(observableLisTorneio);
	}
	
    private void addBotaoTabela() {
    	
    	Callback<TableColumn<Torneio, Void>, TableCell<Torneio, Void>> cellFactory = new Callback<TableColumn<Torneio,Void>, TableCell<Torneio,Void>>() {
		
    		public TableCell<Torneio, Void> call(final TableColumn<Torneio, Void> param){
    			final TableCell<Torneio, Void> cell = new TableCell<Torneio, Void>() {
    				private final Button button = new Button("Participar");
    				{
	    				button.setOnAction((ActionEvent event) ->{
	    					Torneio torneio = getTableView().getItems().get(getIndex());
	    					//Colocar o evento aqui
	    					inicioController.getBordePane().setCenter(App.infoTorneioController.getParentInfoTorneio());
	    				});
    					
    				}
    				@Override
    				public void updateItem(Void item, boolean empty) {
    					super.updateItem(item, empty);
    					if (empty) {
							setGraphic(null);
						} else {
							setGraphic(button);
						}
    				}
    			};
    				return cell;
    			}
    	};
    	
    	participarColumn.setCellFactory(cellFactory);
    }
	public TableView<Torneio> getTableView() {
		return tableView;
	}
	public void setTableView(TableView<Torneio> tableView) {
		this.tableView = tableView;
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
