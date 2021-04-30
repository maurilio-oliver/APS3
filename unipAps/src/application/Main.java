package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
	@FXML
	Button btn;

	Stage sage = new Stage();

	public void start(Stage homeStage) {
		try {

			Parent root = FXMLLoader.load(getClass().getResource("principal.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			homeStage.setScene(scene);
			homeStage.setTitle("Earth Care");
			homeStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void alter() throws IOException {

		GameLayoutView quiz = new GameLayoutView();
		quiz.initGame(sage);
	}

	public static void main(String[] args) {
		launch(args);

		/*
		 * Scanner sc = new Scanner(System.in); QuestRepo game = new QuestRepo();
		 * boolean palp = false; String palpite = "A"; int acertos =0;
		 * game.loadQuests();
		 * 
		 * for (Quest Q : game.list) { System.out.println("1)"+Q.getIntro()); //palpite
		 * = sc.nextLine().substring(0, 1).toUpperCase();
		 * 
		 * switch (palpite) { case "A": palp = Q.getA(); break; case "B": palp =
		 * Q.getB(); break; case "C": palp = Q.getC(); break; case "D": palp = Q.getD();
		 * break;
		 * 
		 * default: break; } if (palp) { System.out.println("\n Acertou \n"); acertos =
		 * acertos+1; }else{ System.out.println("\n Errou \n"); }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * System.out.println("\n\n"+"\n\n"); sc.close(); }
		 */

	}

}
