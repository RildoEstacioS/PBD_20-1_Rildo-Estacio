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

public class UsuarioAdmController implements Initializable {

    @FXML
    private TextField buscarUsuarioTF;

    @FXML
    private ImageView buscarBttn;

    @FXML
    private ListView<?> listViewUsuario;

	private Parent parentUsuarioAdm;
	private Facade facade;
	private TelasController telasController;
	
	public UsuarioAdmController(TelasController telasController, Facade facade) {
		super();
		this.telasController = telasController;
		this.facade = facade;

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/UsuarioAdm.fxml"));

		fxmlLoader.setController(this);
		try {
			
			parentUsuarioAdm = (Parent) fxmlLoader.load();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	public TextField getBuscarUsuarioTF() {
		return buscarUsuarioTF;
	}

	public void setBuscarUsuarioTF(TextField buscarUsuarioTF) {
		this.buscarUsuarioTF = buscarUsuarioTF;
	}

	public ImageView getBuscarBttn() {
		return buscarBttn;
	}

	public void setBuscarBttn(ImageView buscarBttn) {
		this.buscarBttn = buscarBttn;
	}

	public ListView<?> getListViewUsuario() {
		return listViewUsuario;
	}

	public void setListViewUsuario(ListView<?> listViewUsuario) {
		this.listViewUsuario = listViewUsuario;
	}

	public Parent getParentUsuarioAdm() {
		return parentUsuarioAdm;
	}

	public void setParentUsuarioAdm(Parent parentUsuarioAdm) {
		this.parentUsuarioAdm = parentUsuarioAdm;
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
