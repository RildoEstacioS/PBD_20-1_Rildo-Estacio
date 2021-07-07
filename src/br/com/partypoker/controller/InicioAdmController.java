package br.com.partypoker.controller;

import java.io.IOException;

import br.com.partypoker.facade.Facade;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class InicioAdmController {

	@FXML
    private BorderPane bordePane;

    @FXML
    private Label administradorLabel;

    @FXML
    private ImageView closeButton;

    @FXML
    private Label cashGameLabel;

    @FXML
    private Label torneioLabel;

    @FXML
    private Label relatoriosLabel;

    @FXML
    private Label usuarioLabel;

    @FXML
    private ChoiceBox<?> comboBoxInicio;
    
    private Facade facade;
    private Parent parentInicioAdm;
    private Scene sceneInicioAdm;
    private Stage stageInicioAdm;

	public InicioAdmController(Facade facade) {
		super();
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/br/com/partypoker/view/InicioAdm.fxml"));
		fxmlLoader.setController(this);
		
		try {
			// Inicio padrão
			parentInicioAdm = (Parent) fxmlLoader.load();
			sceneInicioAdm = new Scene(parentInicioAdm);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void launch(Stage stage) {
		this.stageInicioAdm = stage;
		stageInicioAdm.setScene(sceneInicioAdm);
		stageInicioAdm.initStyle(StageStyle.UNDECORATED);
		stageInicioAdm.setResizable(false);
		stageInicioAdm.show();
	}
	
	public void mudarPanel(Event e) {
		if (e.getSource().equals(cashGameLabel)) {
			
			System.out.println("CashGame admin");
			
		}
		
		if (e.getSource().equals(torneioLabel)) {
			System.out.println("TorneioAdm");
		}
		
		if (e.getSource().equals(usuarioLabel)) {
			System.out.println("Usuario adm");
		}
		
		if (e.getSource().equals(relatoriosLabel)) {
			System.out.println("Relatorio");
		}
	}

	public BorderPane getBordePane() {
		return bordePane;
	}

	public void setBordePane(BorderPane bordePane) {
		this.bordePane = bordePane;
	}

	public Label getAdministradorLabel() {
		return administradorLabel;
	}

	public void setAdministradorLabel(Label administradorLabel) {
		this.administradorLabel = administradorLabel;
	}

	public ImageView getCloseButton() {
		return closeButton;
	}

	public void setCloseButton(ImageView closeButton) {
		this.closeButton = closeButton;
	}

	public Label getCashGameLabel() {
		return cashGameLabel;
	}

	public void setCashGameLabel(Label cashGameLabel) {
		this.cashGameLabel = cashGameLabel;
	}

	public Label getTorneioLabel() {
		return torneioLabel;
	}

	public void setTorneioLabel(Label torneioLabel) {
		this.torneioLabel = torneioLabel;
	}

	public Label getRelatoriosLabel() {
		return relatoriosLabel;
	}

	public void setRelatoriosLabel(Label relatoriosLabel) {
		this.relatoriosLabel = relatoriosLabel;
	}

	public Label getUsuarioLabel() {
		return usuarioLabel;
	}

	public void setUsuarioLabel(Label usuarioLabel) {
		this.usuarioLabel = usuarioLabel;
	}

	public ChoiceBox<?> getComboBoxInicio() {
		return comboBoxInicio;
	}

	public void setComboBoxInicio(ChoiceBox<?> comboBoxInicio) {
		this.comboBoxInicio = comboBoxInicio;
	}

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
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

	public Stage getStageInicioAdm() {
		return stageInicioAdm;
	}

	public void setStageInicioAdm(Stage stageInicioAdm) {
		this.stageInicioAdm = stageInicioAdm;
	}

    
    
}
