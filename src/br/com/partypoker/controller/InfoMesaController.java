package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.partypoker.App;
import br.com.partypoker.facade.Facade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class InfoMesaController implements Initializable{

    @FXML
    private Label nomeMesaLabel;

    @FXML
    private Label descricaoTA;

    @FXML
    private Button participarBttn;

    @FXML
    private ImageView voltarButton;

    @FXML
    private ImageView closeButton;

    InicioController inicioController;
//    private Stage stageInfoMesa;
//    private Scene sceneInfoMesa;
    private Parent parentInfoMesa;
    private Facade facade;
    
	public InfoMesaController(InicioController inicioController, Facade facade) {
		
		this.facade = facade;
		this.inicioController = inicioController;
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/InfoMesa.fxml"));
        fxmlLoader.setController(this);
        
        try {
        	parentInfoMesa = (Parent) fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//Colocar dados da mesa para aparecer aqui!!
	}

	@FXML
	void participarEventButton(ActionEvent event) {
		System.out.println("Entrou!!");
	}
	
	@FXML
	void voltarButtonAction(ActionEvent event) {
		inicioController.getBordePane().setCenter(App.cashGameController.getParentMesa());
	}

	public Label getNomeMesaLabel() {
		return nomeMesaLabel;
	}

	public Label getDescricaoTA() {
		return descricaoTA;
	}

	public void setDescricaoTA(Label descricaoTA) {
		this.descricaoTA = descricaoTA;
	}

	public Button getParticiparBttn() {
		return participarBttn;
	}

	public void setParticiparBttn(Button participarBttn) {
		this.participarBttn = participarBttn;
	}

	public Parent getParentInfoMesa() {
		return parentInfoMesa;
	}

	public void setParentInfoMesa(Parent parentInfoMesa) {
		this.parentInfoMesa = parentInfoMesa;
	}

}
