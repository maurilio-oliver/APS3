import java.util.ArrayList;
import java.util.List;

public class QuestRepo {
   public List<Quest> list = new ArrayList<>();
    
   private Quest q0 = new Quest();
   private Quest q1 = new Quest();
   private Quest q2 = new Quest();
   private Quest q3 = new Quest();
   private Quest q4 = new Quest();
   private Quest q5 = new Quest();
   private Quest q6 = new Quest();
   private Quest q7 = new Quest();
   private Quest q8 = new Quest();
   private Quest q9 = new Quest();

 public void addList(){
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
   
   
   
   public void loadQuests(){
       q0.setIntro("pergunta 1");
       q0.setPoints(10);
       q0.setA(true);
       
       q1.setIntro("pergunta 2");
       q1.setPoints(10);
       q1.setB(true);
       
       q2.setIntro("pergunta 3");
       q2.setPoints(10);
       q2.setA(true);
       
       q3.setIntro("pergunta 4");
       q3.setPoints(10);
       q3.setC(true);
       
       q4.setIntro("pergunta 5");
       q4.setPoints(10);
       q4.setB(true);
       
       q5.setIntro("pergunta 6");
       q5.setPoints(10);
       q5.setD(true);
       
       q6.setIntro("pergunta 7");
       q6.setPoints(10);
       q6.setA(true);
       
       q7.setIntro("pergunta 8");
       q7.setPoints(10);
       q7.setB(true);
       
       q8.setIntro("pergunta 9");
       q8.setPoints(10);
       q9.setC(true);
       
       q9.setIntro("pergunta 10");
       q9.setPoints(10);
       q9.setD(true);
       addList();
          
    }
    
    
    
}
