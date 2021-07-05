package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.sun.tools.javac.launcher.Main;

import br.com.partypoker.App;
import br.com.partypoker.facade.Facade;
import br.com.partypoker.model.Jogador;
import br.com.partypoker.model.Mesa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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

public class CashController implements Initializable{
	
    @FXML
    private TableView<Mesa> tableView;
    
    @FXML
    private TableColumn<Mesa, String> mesaCollumn;

    @FXML
    private TableColumn<Mesa, String> jogadoresCollumn;

    @FXML
    private TableColumn<Mesa, Void> participarCollumn;
    
    

    private List<Mesa> listaMesas = new ArrayList<Mesa>();
    
    private ObservableList<Mesa> observableListMesas;
    
    InicioController inicioController;
    
    private Stage stageCashGame;
    private Scene sceneCashGame;
    
    private Parent parentCashGame;
    
	private Parent parentInfoCashGame;
	private Facade facade;
    
    public CashController(InicioController inicioController, Facade facade) {
    	this.facade = facade;
    	this.inicioController = inicioController;
    	

//    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/Mesa.fxml"));
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/CashGame.fxml"));

        fxmlLoader.setController(this);
        try {
        	parentCashGame = (Parent) fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
   }
    
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
//        carregarTableView();

    }
    
    private void carregarTableView() {
    	//Depois colocar para puxar do banco
    	//S� alimentando para visualiza��o
//    	
//    	mesaCollumn.setCellValueFactory(new PropertyValueFactory<>("titulo"));
//    	jogadoresCollumn.setCellValueFactory(new PropertyValueFactory<>("infoJogadores"));
//    	
//    	
//    	
//    	Mesa mesa1 = new Mesa("mesa1", 200.0, "Sei l� o que � isso", 9, "Cashgame");
//    	Mesa mesa2 = new Mesa("mesa2", 200.0, "Sei l� o que � isso", 9, "Cashgame");
//    	Mesa mesa3 = new Mesa("mesa3", 200.0, "Sei l� o que � isso", 9, "Cashgame"); 
//
//    	Jogador j1 = new Jogador("a", "", "", 100);
//    	Jogador j2 = new Jogador("b", "", "", 100);
//    	Jogador j3 = new Jogador("c","", "", 100);
//
//    	
////    	mesa1.getJogadores().add(j1);
////    	mesa1.getJogadores().add(j2);
////    	mesa2.getJogadores().add(j3);
////    	
//    	listaMesas.add(mesa1);
//    	listaMesas.add(mesa2);
//    	listaMesas.add(mesa3);
//    	
//    	addBotaoTabela();
//    	observableListMesas = FXCollections.observableArrayList(listaMesas);
//    	tableView.setItems(observableListMesas);
    	
    
    } 
    
    private void addBotaoTabela() {
    	Callback<TableColumn<Mesa, Void>, TableCell<Mesa, Void>> cellFactory = new Callback<TableColumn<Mesa,Void>, TableCell<Mesa,Void>>() {
		
    		public TableCell<Mesa, Void> call(final TableColumn<Mesa, Void> param){
    			final TableCell<Mesa, Void> cell = new TableCell<Mesa, Void>() {
    				private final Button button = new Button("Participar");
    				{
	    				button.setOnAction((ActionEvent event) ->{
	    					//Colocar o evento aqui
	    					inicioController.getBordePane().setCenter(App.infoMesaController.getParentInfoMesa());
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
    	
    	participarCollumn.setCellFactory(cellFactory);
    }


	public TableView<Mesa> getTableView() {
		return tableView;
	}


	public void setTableView(TableView<Mesa> tableView) {
		this.tableView = tableView;
	}


	public Stage getStageMesa() {
		return stageCashGame;
	}


	public void setStageMesa(Stage stageMesa) {
		this.stageCashGame = stageMesa;
	}


	public Scene getSceneMesa() {
		return sceneCashGame;
	}


	public void setSceneMesa(Scene sceneMesa) {
		this.sceneCashGame = sceneMesa;
	}


	public Parent getParentMesa() {
		return parentCashGame;
	}


	public void setParentMesa(Parent parentMesa) {
		this.parentCashGame = parentMesa;
	}


	public Parent getParentInfoMesa() {
		return parentInfoCashGame;
	}


	public void setParentInfoMesa(Parent parentInfoMesa) {
		this.parentInfoCashGame = parentInfoMesa;
	}    
}
