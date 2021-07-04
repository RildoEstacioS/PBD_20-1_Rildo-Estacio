package br.com.partypoker.controller;

import java.io.IOException;

import br.com.partypoker.App;
import br.com.partypoker.facade.Facade;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class InicioController{
	
    @FXML
    private BorderPane bordePane;
    
    @FXML
    private AnchorPane escolherModoPane;

    @FXML
    private Label mesaBttn;
    
    @FXML
    private Label torneioBttn;
    
    private Parent parentInicio;
    private Scene sceneInicio;
    private Stage stageInicio;
    private Facade facade;
    
	public InicioController(Facade facade) {

		this.facade = facade;
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/Inicio.fxml"));
        fxmlLoader.setController(this);
    
        try {
        	//Inicio padrão
        	parentInicio = (Parent) fxmlLoader.load();
        	sceneInicio = new Scene(parentInicio);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void launch(Stage stage) {
		this.stageInicio = stage;
		stageInicio.setScene(sceneInicio);
		stageInicio.initStyle(StageStyle.UNDECORATED);
		stageInicio.setResizable(false);
		stageInicio.show();
    }
    
    @FXML
	public void mudarPanel(Event e) {		
    	
    	
    	if (e.getSource().equals(mesaBttn)) {
    		mesaBttn.setFont(Font.font(null, FontWeight.BOLD, 24));
    		torneioBttn.setFont(Font.font(24));
    		bordePane.setCenter(App.mesaController.getParentMesa());
		}
    	
    	if (e.getSource().equals(torneioBttn)) {
    		torneioBttn.setFont(Font.font(null, FontWeight.BOLD, 24));
    		mesaBttn.setFont(Font.font(24));
    		bordePane.setCenter(App.torneioController.getParentTorneio());
		}
    }
    
    public void mudarPanelCentral(Event e) {  
//    	bordePane.setCenter(UtilTelas.parentInfoTorneio);
    }

	public BorderPane getBordePane() {
		return bordePane;
	}

	public void setBordePane(BorderPane bordePane) {
		this.bordePane = bordePane;
	}

	public AnchorPane getEscolherModoPane() {
		return escolherModoPane;
	}

	public void setEscolherModoPane(AnchorPane escolherModoPane) {
		this.escolherModoPane = escolherModoPane;
	}

	public Label getMesaBttn() {
		return mesaBttn;
	}

	public void setMesaBttn(Label mesaBttn) {
		this.mesaBttn = mesaBttn;
	}

	public Label getTorneioBttn() {
		return torneioBttn;
	}

	public void setTorneioBttn(Label torneioBttn) {
		this.torneioBttn = torneioBttn;
	}

	public Parent getParentInicio() {
		return parentInicio;
	}

	public void setParentInicio(Parent parentInicio) {
		this.parentInicio = parentInicio;
	}

	public Scene getSceneInicio() {
		return sceneInicio;
	}

	public void setSceneInicio(Scene sceneInicio) {
		this.sceneInicio = sceneInicio;
	}

	public Stage getStageInicio() {
		return stageInicio;
	}

	public void setStageInicio(Stage stageInicio) {
		this.stageInicio = stageInicio;
	}
    
    
    
}
