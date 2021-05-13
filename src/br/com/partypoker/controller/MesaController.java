package br.com.partypoker.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

public class MesaController {
	
	private int LINHA_GLOBAL = 0;

    @FXML
    private TableView<?> tableView;
    
    @FXML
    private TableColumn<?, ?> mesaCollumn;

    @FXML
    private TableColumn<?, ?> jogadoresCollumn;

    @FXML
    private TableColumn<Data, Void> participarCollumn;

    public void adicionarTabela() {
    	//FINGE QUE TÁ PUXANDO OS DADOS DO BANCO AQUI!!
    	mesaCollumn.setCellValueFactory(new PropertyValueFactory <> ("Mesa1"));
    	jogadoresCollumn.setCellValueFactory(new PropertyValueFactory <> ("10/10"));
    	participarCollumn.setCellFactory((Callback<TableColumn<Data, Void>, TableCell<Data, Void>>) new Button("Action"));
    	
//    	Callback<TableColumn<Data, Void>, TableCell<Data, Void>> cellFactory = new Callback<TableColumn<Data, Void>, TableCell<Data, Void>>() {
//            
//    		@Override
//            public TableCell<Data, Void> call(final TableColumn<Data, Void> param) {
//                final TableCell<Data, Void> cell = new TableCell<Data, Void>() {
//
//                    private final Button btn = new Button("Action");
//
//                    {
//                        btn.setOnAction((ActionEvent event) -> {
//                            Data data = getTableView().getItems().get(getIndex());
//                            System.out.println("selectedData: " + data);
//                        });
//                    }
//                };
//                return cell;
//            }
//        };
        
    	
    }
    
}
