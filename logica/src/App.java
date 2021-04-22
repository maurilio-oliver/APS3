import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       QuestRepo game = new QuestRepo();
       boolean palp = false;
       String palpite = "A";
       int acertos =0;
       game.loadQuests();
       
       for (Quest Q : game.list) {
           System.out.println("1)"+Q.getIntro());
            //palpite = sc.nextLine().substring(0, 1).toUpperCase();

           switch (palpite) {
                case "A":
                    palp = Q.getA();
                        break;
                case "B":
                    palp = Q.getB();
                        break;
                case "C":
                    palp = Q.getC();
                        break;
                case "D":
                    palp = Q.getD();
                        break;
           
               default:
                   break;
           }
           if (palp) {
               System.out.println("\n Acertou \n");
                acertos = acertos+1;
           }else{
            System.out.println("\n Errou \n");
           }
           
           
       }

       
      System.out.println("\n\n"+"\n\n");
        sc.close();
    }
}
