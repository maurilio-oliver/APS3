public class Quest {
   private String intro;
   private int points;
   private boolean acerto;
   private boolean a,b,c,d = false;


public void setA(boolean a){
    this.a = a;
}
public void setB(boolean b){
    this.b = b;
}
public void setC(boolean c){
   this.c = c;
}
public boolean setD(boolean d){
    return d;
}
public boolean getA(){
    return a;
}
public boolean getB(){
    return b;
}
public boolean getC(){
    return c;
}
public boolean getD(){
    return d;
}
public String getIntro() {
    return intro;
}
public void setIntro(String intro) {
    this.intro = intro;
}
public int getPoints() {
    return points;
}
public void setPoints(int points) {
    this.points = points;
}
public boolean isAcerto() {
    return acerto;
}
public void setAcerto(boolean acerto) {
    this.acerto = acerto;
}

   
   
}
