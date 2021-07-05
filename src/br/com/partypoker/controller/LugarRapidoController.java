package br.com.partypoker.controller;

import java.io.IOException;

import javax.swing.ButtonGroup;

import br.com.partypoker.facade.Facade;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class LugarRapidoController {

    @FXML
    private RadioButton cashGameRB;

    @FXML
    private RadioButton torneioRB;

    @FXML
    private Button entrarBttn;

    private ToggleGroup toggleGroup;
    private Facade facade;
    private InicioController inicioController;
//    private Stage stageLugarRapido;
//    private Scene sceneLugarRapido;
    private Parent parentLugarRapido;
    
    public LugarRapidoController(InicioController inicioController, Facade facade) {
    
    	this.inicioController = inicioController;
    	this.facade = facade;
    	this.toggleGroup = new ToggleGroup();

    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/LugarRapido.fxml"));
        fxmlLoader.setController(this);
        
        try {
        	parentLugarRapido = (Parent) fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   	

        this.cashGameRB.setToggleGroup(toggleGroup);
        this.torneioRB.setToggleGroup(toggleGroup);
        
        this.cashGameRB.setSelected(true);
        
    }

	public RadioButton getCashGameRB() {
		return cashGameRB;
	}

	public void setCashGameRB(RadioButton cashGameRB) {
		this.cashGameRB = cashGameRB;
	}

	public RadioButton getTorneioRB() {
		return torneioRB;
	}

	public void setTorneioRB(RadioButton torneioRB) {
		this.torneioRB = torneioRB;
	}

	public Button getEntrarBttn() {
		return entrarBttn;
	}

	public void setEntrarBttn(Button entrarBttn) {
		this.entrarBttn = entrarBttn;
	}

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}

	public InicioController getInicioController() {
		return inicioController;
	}

	public void setInicioController(InicioController inicioController) {
		this.inicioController = inicioController;
	}

	public Parent getParentLugarRapido() {
		return parentLugarRapido;
	}

	public void setParentLugarRapido(Parent parentLugarRapido) {
		this.parentLugarRapido = parentLugarRapido;
	}
    
    
    
    
}
