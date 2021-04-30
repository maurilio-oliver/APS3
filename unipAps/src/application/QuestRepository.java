package application;

import java.util.ArrayList;
import java.util.List;

public class QuestRepository {
	public List<QuestModel> list = new ArrayList<>();

	private QuestModel q0 = new QuestModel();
	private QuestModel q1 = new QuestModel();
	private QuestModel q2 = new QuestModel();
	private QuestModel q3 = new QuestModel();
	private QuestModel q4 = new QuestModel();
	private QuestModel q5 = new QuestModel();
	private QuestModel q6 = new QuestModel();
	private QuestModel q7 = new QuestModel();
	private QuestModel q8 = new QuestModel();
	private QuestModel q9 = new QuestModel();

	public void addList() {
		list.add(q0);
		list.add(q1);
		list.add(q2);
		list.add(q3);
		list.add(q4);
		list.add(q5);
		list.add(q6);
		list.add(q7);
		list.add(q8);
		list.add(q9);
	}

	public void loadQuestModels() {
		q0.setIntro("um navia bateu e furou o pinel, quantos unicornios sobraram?");
		q0.setPoints(10);
		q0.setA(true);
		q0.setQuestA("nenhum por que jacare não come alfase");
		q0.setQuestB("essa pergunta não faz sentido");
		q0.setQuestC("dois(2)");
		q0.setQuestD("resposta e");

		q1.setIntro("por que o raus preto é branco?");
		q1.setPoints(10);
		q1.setB(true);
		q1.setQuestA("n enteresa pra vc palhaço");
		q1.setQuestB("essa pergunta não faz sentido");
		q1.setQuestC("4002-8922");
		q1.setQuestD("teste set quest d 1");

		q2.setIntro("pergunta 3");
		q2.setPoints(10);
		q2.setA(true);
		q2.setQuestA("nenhum por que jacare não come alfase");
		q2.setQuestB("essa pergunta não faz sentido");
		q2.setQuestC("dois(2)");
		q2.setQuestD("resposta e");

		q3.setIntro("pergunta 4");
		q3.setPoints(10);
		q3.setC(true);
		q3.setQuestA("nenhum por que jacare não come alfase");
		q3.setQuestB("essa pergunta não faz sentido");
		q3.setQuestC("dois(2)");
		q3.setQuestD("resposta e");

		q4.setIntro("pergunta 5");
		q4.setPoints(10);
		q4.setB(true);
		q4.setQuestA("nenhum por que jacare não come alfase");
		q4.setQuestB("essa pergunta não faz sentido");
		q4.setQuestC("dois(2)");
		q4.setQuestD("resposta e");
		
		q5.setIntro("pergunta 6");
		q5.setPoints(10);
		q5.setD(true);
		q5.setQuestA("nenhum por que jacare não come alfase");
		q5.setQuestB("essa pergunta não faz sentido");
		q5.setQuestC("dois(2)");
		q5.setQuestD("resposta e");

		q6.setIntro("pergunta 7");
		q6.setPoints(10);
		q6.setA(true);
		q6.setQuestA("nenhum por que jacare não come alfase");
		q6.setQuestB("essa pergunta não faz sentido");
		q6.setQuestC("dois(2)");
		q6.setQuestD("resposta e");
	
		q7.setIntro("pergunta 8");
		q7.setPoints(10);
		q7.setB(true);
		q7.setQuestA("nenhum por que jacare não come alfase");
		q7.setQuestB("essa pergunta não faz sentido");
		q7.setQuestC("dois(2)");
		q7.setQuestD("resposta e");
		
		q8.setIntro("pergunta 9");
		q8.setPoints(10);
		q9.setC(true);
		q0.setQuestA("nenhum por que jacare não come alfase");
		q0.setQuestB("essa pergunta não faz sentido");
		q0.setQuestC("dois(2)");
		q0.setQuestD("resposta e");

		q9.setIntro("pergunta 10");
		q9.setPoints(10);
		q9.setD(true);
		q0.setQuestA("nenhum por que jacare não come alfase");
		q0.setQuestB("essa pergunta não faz sentido");
		q0.setQuestC("dois(2)");
		q0.setQuestD("resposta e");

		addList();
	}

}
