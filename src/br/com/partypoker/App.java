package br.com.partypoker;

import br.com.partypoker.util.UtilTelas;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{
		
	static UtilTelas util;
	
	@Override
	public void start(Stage arg0) throws Exception {
		util = new UtilTelas();
		util.start(arg0);
	}
	
	public static void main(String[] args) {
		Application.launch(args);
		
		
	}
}
