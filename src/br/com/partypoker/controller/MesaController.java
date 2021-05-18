package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.com.partypoker.App;
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

public class MesaController implements Initializable{
	
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
    
    private Stage stageMesa;
    private Scene sceneMesa;
    
    private Parent parentMesa;
    
	private Parent parentInfoMesa;

    
    public MesaController(InicioController inicioController) {
    	
    	this.inicioController = inicioController;
    	

    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/Mesa.fxml"));
        fxmlLoader.setController(this);
        
        try {
        	parentMesa = (Parent) fxmlLoader.load();
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
    	
    	mesaCollumn.setCellValueFactory(new PropertyValueFactory<>("titulo"));
    	jogadoresCollumn.setCellValueFactory(new PropertyValueFactory<>("infoJogadores"));
    	
    	
    	
    	Mesa mesa1 = new Mesa((long) 1, "mesa1", 200.0, "Sei lá o que é isso", 9, "Cashgame");
    	Mesa mesa2 = new Mesa((long) 2, "mesa2", 200.0, "Sei lá o que é isso", 9, "Cashgame");
    	Mesa mesa3 = new Mesa((long) 3, "mesa3", 200.0, "Sei lá o que é isso", 9, "Cashgame"); 

    	Jogador j1 = new Jogador((long)10, "a", "", "", "", "", 100, false, false);
    	Jogador j2 = new Jogador((long)20, "b", "", "", "", "", 100, false, false);
    	Jogador j3 = new Jogador((long)30, "c", "", "", "", "", 100, false, false);

    	
    	mesa1.getJogadores().add(j1);
    	mesa1.getJogadores().add(j2);
    	mesa2.getJogadores().add(j3);
    	
    	listaMesas.add(mesa1);
    	listaMesas.add(mesa2);
    	listaMesas.add(mesa3);
    	
    	addBotaoTabela();
    	observableListMesas = FXCollections.observableArrayList(listaMesas);
    	tableView.setItems(observableListMesas);
    	
    
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
		return stageMesa;
	}


	public void setStageMesa(Stage stageMesa) {
		this.stageMesa = stageMesa;
	}


	public Scene getSceneMesa() {
		return sceneMesa;
	}


	public void setSceneMesa(Scene sceneMesa) {
		this.sceneMesa = sceneMesa;
	}


	public Parent getParentMesa() {
		return parentMesa;
	}


	public void setParentMesa(Parent parentMesa) {
		this.parentMesa = parentMesa;
	}


	public Parent getParentInfoMesa() {
		return parentInfoMesa;
	}


	public void setParentInfoMesa(Parent parentInfoMesa) {
		this.parentInfoMesa = parentInfoMesa;
	}    
}
