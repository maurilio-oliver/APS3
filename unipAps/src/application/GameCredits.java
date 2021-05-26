package application;

import application.model.MainHelper;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GameCredits {
	//@FXML usado para linkar objetos da view com o objeto da class
	@FXML
	Button btn;
	MainHelper home = new MainHelper();

	@FXML
	void test() throws Exception {

		home.start("/application/view/game_home.fxml", "credtos");
	}
}
