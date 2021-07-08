package br.com.partypoker.view;

import br.com.partypoker.model.Torneio;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class TorneioListCell extends ListCell<Torneio> {
    @FXML
    private Label titulo;
    @FXML
    private Label buyin;
    @FXML
    private Label inicio;
    @FXML
    private ImageView entrarBtn;
    @FXML
    private GridPane grid;
    private FXMLLoader loader;

    @Override
    protected void updateItem(Torneio t, boolean empty) {
        super.updateItem(t, empty);

        if(empty || t == null){
            setText(null);
            setGraphic(null);
        }
        else{
            if (loader == null) {
                loader = new FXMLLoader(getClass().getResource("TorneioListCell.fxml"));
                loader.setController(this);

                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            System.out.println(t.getBuyin());
            titulo.setText(t.getTitulo());
            buyin.setText(""+ t.getBuyin());
            inicio.setText(t.getDataInicio());
            setText(null);
            setGraphic(grid);
        }


    }
}
