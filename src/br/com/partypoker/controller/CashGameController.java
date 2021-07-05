package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.com.partypoker.App;
import br.com.partypoker.facade.Facade;
import br.com.partypoker.model.Mesa;
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

public class CashGameController implements Initializable{
	
    @FXML
    private TextField buscarCashGameTF;

    @FXML
    private ListView<?> listView;    

    private List<Mesa> listaMesas = new ArrayList<Mesa>();
    
    private ObservableList<Mesa> observableListMesas;
    
    InicioController inicioController;
    
    private Stage stageCashGame;
    private Scene sceneCashGame;
    
    private Parent parentCashGame;
    
	private Parent parentInfoCashGame;
	private Facade facade;
    
    public CashGameController(InicioController inicioController, Facade facade) {
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
        carregarTableView();

    }
    
    private void carregarTableView() {
    	//Depois colocar para puxar do banco
    	//Só alimentando para visualização
//    	
//    	mesaCollumn.setCellValueFactory(new PropertyValueFactory<>("titulo"));
//    	jogadoresCollumn.setCellValueFactory(new PropertyValueFactory<>("infoJogadores"));
//    	
//    	
//    	
//    	Mesa mesa1 = new Mesa("mesa1", 200.0, "Sei la o que e isso", 9, "Cashgame");
//    	Mesa mesa2 = new Mesa("mesa2", 200.0, "Sei la o que e isso", 9, "Cashgame");
//    	Mesa mesa3 = new Mesa("mesa3", 200.0, "Sei la o que e isso", 9, "Cashgame"); 
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
    	
//    	participarCollumn.setCellFactory(cellFactory);
    }


//	public TableView<Mesa> getTableView() {
//		return tableView;
//	}
//
//
//	public void setTableView(TableView<Mesa> tableView) {
//		this.tableView = tableView;
//	}


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


	public TextField getBuscarCashGameTF() {
		return buscarCashGameTF;
	}


	public void setBuscarCashGameTF(TextField buscarCashGameTF) {
		this.buscarCashGameTF = buscarCashGameTF;
	}


	public ListView<?> getListView() {
		return listView;
	}


	public void setListView(ListView<?> listView) {
		this.listView = listView;
	}


	public List<Mesa> getListaMesas() {
		return listaMesas;
	}


	public void setListaMesas(List<Mesa> listaMesas) {
		this.listaMesas = listaMesas;
	}


	public ObservableList<Mesa> getObservableListMesas() {
		return observableListMesas;
	}


	public void setObservableListMesas(ObservableList<Mesa> observableListMesas) {
		this.observableListMesas = observableListMesas;
	}


	public InicioController getInicioController() {
		return inicioController;
	}


	public void setInicioController(InicioController inicioController) {
		this.inicioController = inicioController;
	}


	public Stage getStageCashGame() {
		return stageCashGame;
	}


	public void setStageCashGame(Stage stageCashGame) {
		this.stageCashGame = stageCashGame;
	}


	public Scene getSceneCashGame() {
		return sceneCashGame;
	}


	public void setSceneCashGame(Scene sceneCashGame) {
		this.sceneCashGame = sceneCashGame;
	}


	public Parent getParentCashGame() {
		return parentCashGame;
	}


	public void setParentCashGame(Parent parentCashGame) {
		this.parentCashGame = parentCashGame;
	}


	public Parent getParentInfoCashGame() {
		return parentInfoCashGame;
	}


	public void setParentInfoCashGame(Parent parentInfoCashGame) {
		this.parentInfoCashGame = parentInfoCashGame;
	}


	public Facade getFacade() {
		return facade;
	}


	public void setFacade(Facade facade) {
		this.facade = facade;
	}    
}
