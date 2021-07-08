package br.com.partypoker.view;

import br.com.partypoker.model.CashGame;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class CashListCell extends ListCell<CashGame> {
    @FXML
    private Label titulo;
    @FXML
    private Label blinds;
    @FXML
    private Label jogadores;
    @FXML
    private ImageView entrarBtn;
    @FXML
    private GridPane grid;

    private FXMLLoader loader;


    @Override
    protected void updateItem(CashGame c, boolean empty) {
        super.updateItem(c, empty);
        if(empty || c == null){
            setText(null);
            setGraphic(null);
        }
        else{
            if (loader == null) {
                loader = new FXMLLoader(getClass().getResource("CashListCell.fxml"));
                loader.setController(this);

                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            System.out.println(c.getTitulo());
            titulo.setText(c.getTitulo());
            blinds.setText(c.getBlinds());
            jogadores.setText(""+c.getTamanho());
            setText(null);
            setGraphic(grid);
        }
    }
}
