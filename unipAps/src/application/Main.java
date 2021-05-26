package application;

import application.model.MainHelper;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage home) throws Exception {
		//inicia um a class de transição de dados 
	    MainHelper window = new MainHelper(home);
	    
	    //chamada de tela
		window.start("/application/view/game_home.fxml", "inicio");	
		
	}
	
	
	//carrega os argumentos da aplicação
	public static void main(String[] args) {
		launch(args);

	}

}
