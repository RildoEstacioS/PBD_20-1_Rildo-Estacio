package br.com.partypoker.controller;

import java.io.IOException;

import br.com.partypoker.facade.Facade;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class FavoritoController {

	@FXML
	private ListView<?> favoritosTorneioLV;

	@FXML
	private ListView<?> favoritosCashGameLV;

	private Facade facade;

	private Parent parentFavorito;

	private TelasController telasController;

	public FavoritoController(TelasController telasController, Facade facade) {

		this.telasController = telasController;
		this.facade = facade;

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/Favorito.fxml"));
		fxmlLoader.setController(this);

		try {
			parentFavorito = (Parent) fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ListView<?> getFavoritosTorneioLV() {
		return favoritosTorneioLV;
	}

	public void setFavoritosTorneioLV(ListView<?> favoritosTorneioLV) {
		this.favoritosTorneioLV = favoritosTorneioLV;
	}

	public ListView<?> getFavoritosCashGameLV() {
		return favoritosCashGameLV;
	}

	public void setFavoritosCashGameLV(ListView<?> favoritosCashGameLV) {
		this.favoritosCashGameLV = favoritosCashGameLV;
	}

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}

	public Parent getParentFavorito() {
		return parentFavorito;
	}

	public void setParentFavorito(Parent parentFavorito) {
		this.parentFavorito = parentFavorito;
	}

}
