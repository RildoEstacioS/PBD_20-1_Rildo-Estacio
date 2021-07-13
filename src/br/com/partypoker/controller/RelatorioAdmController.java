package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.partypoker.facade.Facade;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class RelatorioAdmController implements Initializable {

    @FXML
    private ListView<?> listViewRelatorio;

    @FXML
    private Label plusButton;
    
	private Parent parentRelatorioAdm;
	private Facade facade;
	private TelasController telasController;
	
	public RelatorioAdmController(TelasController telasController, Facade facade) {
		super();
		this.telasController = telasController;
		this.facade = facade;

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/RelatorioAdm.fxml"));

		fxmlLoader.setController(this);
		try {
			
			parentRelatorioAdm = (Parent) fxmlLoader.load();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	public ListView<?> getListViewRelatorio() {
		return listViewRelatorio;
	}

	public void setListViewRelatorio(ListView<?> listViewRelatorio) {
		this.listViewRelatorio = listViewRelatorio;
	}

	public Label getPlusButton() {
		return plusButton;
	}

	public void setPlusButton(Label plusButton) {
		this.plusButton = plusButton;
	}

	public Parent getParentRelatorioAdm() {
		return parentRelatorioAdm;
	}

	public void setParentRelatorioAdm(Parent parentRelatorioAdm) {
		this.parentRelatorioAdm = parentRelatorioAdm;
	}

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}

	public TelasController getTelasController() {
		return telasController;
	}

	public void setTelasController(TelasController telasController) {
		this.telasController = telasController;
	}

	
}
