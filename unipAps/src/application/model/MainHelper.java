package application.model;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * Class auxiliar de transiçao entre view e controler
 */
public class MainHelper {
	// deixa o valor do estagio atual imutavel
	static Stage stage;

	// captura pontos para a proxima etapa
	private static int point;

	public MainHelper() {
	}

	// captura o estagio atual
	public MainHelper(Stage sts) {
		MainHelper.stage = sts;
	}

	// apenas adicionar um novo layout a este estagio
	public void start(String path, String title) throws Exception {
		try {

			Parent parent = FXMLLoader.load(getClass().getResource(path));

			Scene scene = new Scene(parent);
			scene.getStylesheets().add(getClass().getResource("/application/Style.css").toExternalForm());
			stage.setScene(scene);
			stage.setTitle(title);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// fecha o estagio e com isso o jogo inteiro
	

	public void setPoint(int point) {
		MainHelper.point = point;
	}

	public int getPoint() {
		return MainHelper.point;
	}

}
