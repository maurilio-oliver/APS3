package application;

import application.model.MainHelper;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {
	/*
	 * @FXML deixa visivel para o layout o objeto
	 * inicia um objeto do tipo view que sera linkado a estrutura da tela 
	 */ 
	
	@FXML
	Button btnStart;
	
	//inicia a chamada do objeto que faz a transição de tela 
	MainHelper game = new MainHelper();
	



	//@FXML deixa  a função visivel para o btnStart que foi criado no layout
	@FXML
	public void startGame() throws Exception {
		
		//@troca: chamada de função que troca a tela apenas mantendo a sena e carregando um novo layout por sima 
		game.start("/application/view/game_layout.fxml", "life care");
	}
	
	

}
