package br.com.partypoker.controller;

import java.io.IOException;

import br.com.partypoker.facade.Facade;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class NovoCashGameController {

	@FXML
	private RadioButton tamanho1RB;

	@FXML
	private RadioButton tamanho2RB;

	@FXML
	private Button entrarBttn;

	@FXML
	private TextField tituloTF;

	@FXML
	private TextField buyinTF;

	@FXML
	private ChoiceBox<?> tipoComboBox;

	@FXML
	private ChoiceBox<?> blindsComboBox;

	/**
	 * 
	 */
	private Parent parentNovoCashGame;
	private Scene sceneNovoCashGame;

	private ToggleGroup toggleGroup;

	private TelasController telasController;
	private Facade facade;

	public NovoCashGameController(TelasController telasController, Facade facade) {
		super();
		this.telasController = telasController;
		this.facade = facade;
		this.toggleGroup = new ToggleGroup();

		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/br/com/partypoker/view/NovoCashGameAdmin.fxml"));

		fxmlLoader.setController(this);

		try {
			parentNovoCashGame = (Parent) fxmlLoader.load();
			sceneNovoCashGame = new Scene(parentNovoCashGame);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.tamanho1RB.setToggleGroup(toggleGroup);
		this.tamanho2RB.setToggleGroup(toggleGroup);

		this.tamanho1RB.setSelected(true);

	}

	public Button getEntrarBttn() {
		return entrarBttn;
	}

	public void setEntrarBttn(Button entrarBttn) {
		this.entrarBttn = entrarBttn;
	}

	public TextField getTituloTF() {
		return tituloTF;
	}

	public void setTituloTF(TextField tituloTF) {
		this.tituloTF = tituloTF;
	}

	public TextField getBuyinTF() {
		return buyinTF;
	}

	public void setBuyinTF(TextField buyinTF) {
		this.buyinTF = buyinTF;
	}

	public ChoiceBox<?> getTipoComboBox() {
		return tipoComboBox;
	}

	public void setTipoComboBox(ChoiceBox<?> tipoComboBox) {
		this.tipoComboBox = tipoComboBox;
	}

	public ChoiceBox<?> getBlindsComboBox() {
		return blindsComboBox;
	}

	public void setBlindsComboBox(ChoiceBox<?> blindsComboBox) {
		this.blindsComboBox = blindsComboBox;
	}

	public Parent getParentNovoCashGame() {
		return parentNovoCashGame;
	}

	public void setParentNovoCashGame(Parent parentNovoCashGame) {
		this.parentNovoCashGame = parentNovoCashGame;
	}

	public Scene getSceneNovoCashGame() {
		return sceneNovoCashGame;
	}

	public void setSceneNovoCashGame(Scene sceneNovoCashGame) {
		this.sceneNovoCashGame = sceneNovoCashGame;
	}

	public TelasController getTelasController() {
		return telasController;
	}

	public void setTelasController(TelasController telasController) {
		this.telasController = telasController;
	}

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}

	public RadioButton getTamanho1RB() {
		return tamanho1RB;
	}

	public void setTamanho1RB(RadioButton tamanho1rb) {
		tamanho1RB = tamanho1rb;
	}

	public RadioButton getTamanho2RB() {
		return tamanho2RB;
	}

	public void setTamanho2RB(RadioButton tamanho2rb) {
		tamanho2RB = tamanho2rb;
	}

	public ToggleGroup getToggleGroup() {
		return toggleGroup;
	}

	public void setToggleGroup(ToggleGroup toggleGroup) {
		this.toggleGroup = toggleGroup;
	}

}
