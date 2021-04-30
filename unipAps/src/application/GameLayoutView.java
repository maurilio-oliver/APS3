package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class GameLayoutView {
	@FXML
	Button btnA;
	@FXML
	Button btnB;
	@FXML
	Button btnC;
	@FXML
	Button btnD;
	@FXML
	Label intro;
	@FXML
	Label lblA;
	@FXML
	Label lblB;
	@FXML
	Label lblC;
	@FXML
	Label lblD;

	QuestRepository quests = new QuestRepository();

	public void initGame(Stage stage) throws IOException {

		try {

			Parent root = FXMLLoader.load(getClass().getResource("game_layout.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.setTitle("Earth Care");
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	int i = 1;
	@FXML
public void gameBtnA(int i ) {
		if (i <= 10) {
			quests.loadQuestModels();
			String result = "" + quests.list.get(i).getA();
			intro.setText(quests.list.get(i).getIntro());
			System.out.println(i + " " + result);
			i++;
		} else {
			System.out.println("fim de jogo");
		}
}
	@FXML
	public void tert(int i ) {
		if (i <= 10) {
			quests.loadQuestModels();
			String result = "" + quests.list.get(i).getA();
			intro.setText(quests.list.get(i).getIntro());
			System.out.println(i + " " + result);
			i++;
		} else {
			System.out.println("fim de jogo");
		}

	}

}
