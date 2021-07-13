package br.com.partypoker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.partypoker.facade.Facade;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class InicioAdmController implements Initializable {

	@FXML
	private BorderPane bordePane;

	@FXML
	private Label admLabel;

	@FXML
	private Label cashGameButton;

	@FXML
	private Label torneioBttn;

	@FXML
	private Label relatorioBttn;

	@FXML
	private Label usuarioBttn;

	private Parent parentInicioAdm;
	private Scene sceneInicioAdm;

	private Facade facade;

	private TelasController telasController;

	public InicioAdmController(TelasController telasController, Facade facade) {
		super();
		this.telasController = telasController;
		this.facade = facade;
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/InicioAdm.fxml"));
		fxmlLoader.setController(this);

		try {
			// Inicio padrão
			parentInicioAdm = (Parent) fxmlLoader.load();
			sceneInicioAdm = new Scene(parentInicioAdm);
//			stageInicioAdm.setScene(sceneInicioAdm);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mudarPanel(Event e) {
		if (e.getSource().equals(cashGameButton)) {
			cashGameButton.setFont(Font.font(null, FontWeight.BOLD, 28));
			torneioBttn.setFont(Font.font(28));
			relatorioBttn.setFont(Font.font(28));
			usuarioBttn.setFont(Font.font(28));

			bordePane.setCenter(telasController.cashGameAdmController.getParentCashGameAdm());
		}

		if (e.getSource().equals(torneioBttn)) {
			torneioBttn.setFont(Font.font(null, FontWeight.BOLD, 28));
			cashGameButton.setFont(Font.font(28));
			relatorioBttn.setFont(Font.font(28));
			usuarioBttn.setFont(Font.font(28));

			bordePane.setCenter(telasController.torneioAdmController.getParentCashGameAdm());
		}

		if (e.getSource().equals(usuarioBttn)) {
			usuarioBttn.setFont(Font.font(null, FontWeight.BOLD, 28));
			torneioBttn.setFont(Font.font(28));
			cashGameButton.setFont(Font.font(28));
			relatorioBttn.setFont(Font.font(28));

			bordePane.setCenter(telasController.usuarioAdmController.getParentUsuarioAdm());
		}

		if (e.getSource().equals(relatorioBttn)) {
			relatorioBttn.setFont(Font.font(null, FontWeight.BOLD, 28));
			usuarioBttn.setFont(Font.font(28));
			torneioBttn.setFont(Font.font(28));
			cashGameButton.setFont(Font.font(28));

			bordePane.setCenter(telasController.relatorioAdmController.getParentRelatorioAdm());
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	public BorderPane getBordePane() {
		return bordePane;
	}

	public void setBordePane(BorderPane bordePane) {
		this.bordePane = bordePane;
	}

	public Parent getParentInicioAdm() {
		return parentInicioAdm;
	}

	public void setParentInicioAdm(Parent parentInicioAdm) {
		this.parentInicioAdm = parentInicioAdm;
	}

	public Scene getSceneInicioAdm() {
		return sceneInicioAdm;
	}

	public void setSceneInicioAdm(Scene sceneInicioAdm) {
		this.sceneInicioAdm = sceneInicioAdm;
	}


	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}

}
