package application;

import application.model.MainHelper;
import application.model.Repository.QuestRepository;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GameLayoutController {
	/*
	 * @FXML deixa visivel todas as funçoes e objetos para o novo layout ajudando na linkagem entre view e controller  
	 */
	@FXML
	Button btnA, btnB, btnC, btnD;
	@FXML
	Label intro, lblA, lblB, lblC, lblD, lblQuestN;

	private int i, points;
//objeto que inicia o repositorio
	private QuestRepository quests = new QuestRepository();
//	objeto que inicia a transição de informação entre telas
	private MainHelper mh = new MainHelper();

// as funçoes gameBtn(A,B,C e D) carregam o as informaçoes das questoes no novo layou 
	@FXML
	public void gameBtnA() throws Exception {
		if (i < 10) {
			quests.loadQuestModels();
			loadTxtLabel();
			isPoint(quests.list.get(i).getA());

			i++;
		} else {
			mh.setPoint(points);
			mh.start("/application/view/game_over.fxml", "game_overController");
		}
	}

	@FXML
	public void gameBtnB() throws Exception {
		if (i < 10) {
			quests.loadQuestModels();
			loadTxtLabel();
			isPoint(quests.list.get(i).getB());

			i++;
		} else {
			mh.start("/application/view/game_over.fxml", "game_overController");
		}
	}

	@FXML
	public void gameBtnC() throws Exception {
		if (i < 10) {
			quests.loadQuestModels();
			loadTxtLabel();
			isPoint(quests.list.get(i).getC());

			i++;

		} else {
			mh.start("/application/view/game_over.fxml", "game_overController");
		}
	}

	@FXML
	public void gameBtnD() throws Exception {
		if (i < 10) {
			quests.loadQuestModels();
			loadTxtLabel();
			isPoint(quests.list.get(i).getD());

			i++;
		} else {

			mh.start("/application/view/game_over.fxml", "game_overController");
			mh.setPoint(points);
			System.out.println(mh.getPoint());

		}
	}
//busca almenta os pontos 
	private void isPoint(Boolean result) {
		if (result == true) {
			points = points + 1;
		}else {
			points += 0 ;
		}
	}

	//carrega as legendas 
	private void loadTxtLabel() {

		intro.setText(quests.list.get(i).getIntro());
		lblA.setText(quests.list.get(i).getQuestA());
		lblB.setText(quests.list.get(i).getQuestB());
		lblC.setText(quests.list.get(i).getQuestC());
		lblD.setText(quests.list.get(i).getQuestD());
		lblQuestN.setText("Questão: "+(i+1));
		
	}

}
