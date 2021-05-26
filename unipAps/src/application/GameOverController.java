package application;

import application.model.MainHelper;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GameOverController {
	/*
	 * @FXML: usado para deixar as funçoes e objetos visivel para o novo layout
	 * */
	@FXML
	Button btnHome, btnCredits;
	@FXML
 	Label lblTest;
	MainHelper home = new MainHelper();
	
	
	//função que faz o retorno para a tela inicial apenas carregando um novo layou se chamado
	@FXML
	void goToHome() throws Exception {
		home.start("/application/view/game_home.fxml", "inicio");
		
		
	}
	//função que faz o retorno para a tela de credito apenas carregando um novo layou se chamado
	@FXML
	void goToCredits() throws Exception {
		home.start("/application/view/game_credits.fxml", "creditos");
		
		
	}
}
