package br.com.partypoker.controller;

import br.com.partypoker.util.UtilTelas;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class InicioController{
	
    @FXML
    private BorderPane bordePane;

    @FXML
    private AnchorPane escolherModoPane;

    @FXML
    private Label mesaBttn;
    
    @FXML
    private Label torneioBttn;

    @FXML
	public void mudarPanel(Event e) {			
    	if (e.getSource().equals(mesaBttn)) {
    		mesaBttn.setFont(Font.font(null, FontWeight.BOLD, 24));
    		torneioBttn.setFont(Font.font(24));
    		bordePane.setCenter(UtilTelas.parentMesa);
		}
    	
    	if (e.getSource().equals(torneioBttn)) {
    		torneioBttn.setFont(Font.font(null, FontWeight.BOLD, 24));
    		mesaBttn.setFont(Font.font(24));
    		bordePane.setCenter(UtilTelas.parentTorneio);
		}
    }
}
