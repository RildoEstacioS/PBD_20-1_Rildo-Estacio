package br.com.partypoker.controller;

import java.io.IOException;

import br.com.partypoker.App;
import br.com.partypoker.facade.Facade;
import br.com.partypoker.model.Jogador;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class InicioController {

	@FXML
	private BorderPane bordePane;

	@FXML
	private Label userNameLabel;

	@FXML
	private Label cashLabel;

	@FXML
	private ImageView closeButton;

	@FXML
	private Label cashGames;

	@FXML
	private Label torneios;

	@FXML
	private Label lugarRapido;

	@FXML
	private Label favoritos;

	@FXML
	private ChoiceBox<?> comboBoxInicio;

	private Parent parentInicio;
	private Scene sceneInicio;
	
	private Facade facade;

	private Jogador jogador;

	private TelasController telasController;

	public InicioController(TelasController telasController, Facade facade) {
		this.facade = facade;
		this.telasController = telasController;
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/Inicio.fxml"));
		fxmlLoader.setController(this);

		try {
			// Inicio padr�o
			parentInicio = (Parent) fxmlLoader.load();
			sceneInicio = new Scene(parentInicio);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	public void mudarPanel(Event e) {

		if (e.getSource().equals(cashGames)) {
			cashGames.setFont(Font.font(null, FontWeight.BOLD, 28));
			torneios.setFont(Font.font(28));
			lugarRapido.setFont(Font.font(28));
			torneios.setFont(Font.font(28));
			favoritos.setFont(Font.font(28));

			bordePane.setCenter(telasController.cashGameController.getParentMesa());
		}

		if (e.getSource().equals(torneios)) {
			torneios.setFont(Font.font(null, FontWeight.BOLD, 28));
			cashGames.setFont(Font.font(28));
			lugarRapido.setFont(Font.font(28));
			favoritos.setFont(Font.font(28));

			bordePane.setCenter(telasController.torneioController.getParentTorneio());
		}

		if (e.getSource().equals(lugarRapido)) {
			lugarRapido.setFont(Font.font(null, FontWeight.BOLD, 28));
			cashGames.setFont(Font.font(28));
			torneios.setFont(Font.font(28));
			favoritos.setFont(Font.font(28));

			bordePane.setCenter(telasController.lugarRapidoController.getParentLugarRapido());
		}

		if (e.getSource().equals(favoritos)) {
			favoritos.setFont(Font.font(null, FontWeight.BOLD, 28));
			cashGames.setFont(Font.font(28));
			torneios.setFont(Font.font(28));
			lugarRapido.setFont(Font.font(28));

			bordePane.setCenter(telasController.favoritoController.getParentFavorito());
		}

	}

	public BorderPane getBordePane() {
		return bordePane;
	}

	public void setBordePane(BorderPane bordePane) {
		this.bordePane = bordePane;
	}

	public Label getUserNameLabel() {
		return userNameLabel;
	}

	public void setUserNameLabel(Label userNameLabel) {
		this.userNameLabel = userNameLabel;
	}

	public Label getCashLabel() {
		return cashLabel;
	}

	public void setCashLabel(Label cashLabel) {
		this.cashLabel = cashLabel;
	}

	public ImageView getCloseButton() {
		return closeButton;
	}

	public void setCloseButton(ImageView closeButton) {
		this.closeButton = closeButton;
	}

	public Label getCashGames() {
		return cashGames;
	}

	public void setCashGames(Label cashGames) {
		this.cashGames = cashGames;
	}

	public Label getTorneios() {
		return torneios;
	}

	public void setTorneios(Label torneios) {
		this.torneios = torneios;
	}

	public Label getLugarRapido() {
		return lugarRapido;
	}

	public void setLugarRapido(Label lugarRapido) {
		this.lugarRapido = lugarRapido;
	}

	public Label getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(Label favoritos) {
		this.favoritos = favoritos;
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

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
}
