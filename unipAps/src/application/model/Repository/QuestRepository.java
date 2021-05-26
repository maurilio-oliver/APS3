package application.model.Repository;

import java.util.ArrayList;
import java.util.List;

import application.model.QuestModel;

public class QuestRepository {
	public List<QuestModel> list = new ArrayList<>();
	int i = 0;

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
	private void addList() {
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
		q0.setIntro("Qual o objetivo da sustentabilidade social?");
		q0.setPoints(10);
		q0.setC(true);
		q0.setQuestA("Melhorar a qualidade de vida usando recursos das gerações futuras.");
		q0.setQuestB("Melhorar a qualidade ambiental.");
		q0.setQuestC("Distribuição de renda com redução das diferenças sociais e melhoria da qualidade de vida.");
		q0.setQuestD("Melhorar a qualidade de vida de classes com rendas baixas.");

		q1.setIntro("Qual é a importância da sustentabilidade social para o mundo?");
		q1.setPoints(10);
		q1.setB(true);
		q1.setQuestA("As ações sustentáveis socialmente são importantes apenas para as pessoas menos favorecidas.");
		q1.setQuestB("Quando colocadas efetivamente em prática, possuem a capacidade de melhorar a qualidade de vida de toda população.");
		q1.setQuestC("A sustentabilidade pode deixar a população mais rica.");
		q1.setQuestD("Não tem importância.");
		
		q2.setIntro("Quais dos exemplos abaixo podem se encaixar em uma ação de \"Sustentabilidade Social\"?");
		q2.setPoints(10);
		q2.setD(true);
		q2.setQuestA("Cortar uma árvore para que seus galhos não machuquem as pessoas");
		q2.setQuestB("Jogar lixo no chão quando não houver lixeira.");
		q2.setQuestC("Somente produtos recicláveis não devem ser reutilizados.");
		q2.setQuestD("Doações de objetos e utensílios para cidadãos necessitados.");

		q3.setIntro("Sustentabilidade ambiental pode de alguma forma ter influências negativas ou positivas \n dentro da Sustentabilidade Social?");
		q3.setPoints(10);
		q3.setC(true);
		q3.setQuestA("Somente negativas, sustentabilidade ambiental atrapalha o desenvolvimento da sustentabilidade \n social.");
		q3.setQuestB("Somente positivas, pois sustentabilidade ambiental é o que dá início a sustentabilidade social.");
		q3.setQuestC("Tem grande influência, quando cuidamos do meio ambiente, a vida na sociedade avança.");
		q3.setQuestD("Nenhuma das alternativas estão corretas.");

		q4.setIntro("Reciclar é sempre a melhor opção?");
		q4.setPoints(10);
		q4.setA(true);
		q4.setQuestA("Não, a reciclagem deve ser a última opção no tratamento dos resíduos.");
		q4.setQuestB("Não, porque devemos pensar em consumir menos.");
		q4.setQuestC("Sim, se não reciclarmos, o lixo irá nos afetar.");
		q4.setQuestD("Sim, porque reciclar é o processo de transformação de material descartável para matéria-prima.");
		
		q5.setIntro("O que é desenvolvimento sustentável?");
		q5.setPoints(10);
		q5.setA(true);
		q5.setQuestA("É o desenvolvimento capaz de suprir as necessidades da geração atual e \n garantir as necessidades das gerações futuras.");
		q5.setQuestB("É o desenvolvimento de reorganização dos materiais não reciclados.");
		q5.setQuestC("É o desenvolvimento capaz de suprir necessidades pessoais e assim fazer um mundo melhor.");
		q5.setQuestD("Nenhuma das alternativas. ");

		q6.setIntro("Sustentabilidade social tem está relacionado a:");
		q6.setPoints(10);
		q6.setD(true);
		q6.setQuestA("Meio ambiente");
		q6.setQuestB("Vida pessoal.");
		q6.setQuestC("Reciclagem de lixo.");
		q6.setQuestD("Vida social.");

	
		q7.setIntro("Ѕоbrе оѕ рrіnсíріоѕ dа еduсаçãо аmbіеntаl, marque а іnсоrrеtа:");
		q7.setPoints(10);
		q7.setB(true);
		q7.setQuestA("É um dіrеіtо dе tоdоѕ. Vіѕа formar сіdаdãоѕ соm соnѕсіênсіа global е рlаnеtárіа е \n rеѕреіtо à ѕоbеrаnіа dоѕ роvоѕ.");
		q7.setQuestB("Nãо é um ato роlítісо, ареѕаr dе ѕеr de trаnѕfоrmаçãо ѕосіаl соm о dеѕеnvоlvеr dо \n реnѕаmеntо сrítісо е іnоvаdоr.");
		q7.setQuestC("Оѕ vаlоrеѕ а ѕеrеm рrесоnіzаdоѕ ѕãо rеlаtіvоѕ à ѕоlіdаrіеdаdе, à іguаldаdе е à \n dеmосrасіа - соmо раrtісіраçãо еquіtаtіvа nоѕ рrосеѕѕоѕ de dесіѕãо роlítіса.");
		q7.setQuestD("О оbјеtіvо é рrоmоvеr а cultura dа раz, dа соореrаçãо, dо dіálоgо е dа аuѕtеrіdаdе feliz.");
		
		q8.setIntro("А еduсаçãо аmbіеntаl tem соmо alguns рrіnсíріоѕ \n\nІ. Ѕоlіdаrіеdаdе."
				+ "\nІІ. Аuѕtеrіdаdе feliz."
				+ "\nІІІ. Соnѕсіênсіа рlаnеtárіа hоlíѕtіса."
				+ "\n Еѕtãо соrrеtоѕ:");
		q8.setPoints(10);
		q8.setD(true);
		q8.setQuestA("Ареnаѕ о item І");
		q8.setQuestB("Оѕ іtеnѕ І е ІІ");
		q8.setQuestC("Оѕ іtеnѕ ІІ е ІІІ");
		q8.setQuestD("Тоdоѕ оѕ іtеnѕ");

		q9.setIntro("Ѕãо рrіnсíріоѕ báѕісоѕ dа еduсаçãо аmbіеntаl:");
		q9.setPoints(10);
		q9.setC(true);
		q9.setQuestA("А реrmаnеntе аvаlіаçãо сrítіса do рrосеѕѕо еduсаtіvо.");
		q9.setQuestB("О рlurаlіѕmо de іdéіаѕ е соnсерçõеѕ реdаgógісаѕ, na реrѕресtіvа dа іntеr, multі е \n trаnѕdіѕсірlіnаrіdаdе.");
		q9.setQuestC("А соnсерçãо dо mеіо аmbіеntе em ѕuа tоtаlіdаdе, соnѕіdеrаndо а іntеrdереndênсіа \n entra о mеіо natural, о ѕóсіо-есоnômісо е о сulturаl, ѕоb о еnfоquе dа ѕuѕtеntаbіlіdаdе.");
		q9.setQuestD("О еnfоquе humаnіѕtа, hоlíѕtісо, dеmосrátісо е раrtісіраtіvо");

		addList();
	}
	
	
	
	

}
