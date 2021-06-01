  
package br.com.partypoker.view;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.StageStyle;

public class Alerts {

	public static void showAlert(String title, String content, AlertType type) {
		Alert alert = new Alert(type);
		alert.initStyle(StageStyle.DECORATED);
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(content);
		alert.show();
	}
}