

public class Player {
    
    String fullName;
    POSITION Postition;
    int soAoo;
    @Override
    public String toString() {
        return  "Tên: "+  fullName+ "\t\tVị trí: " + Postition + "\tSố áo: " + soAoo + "\n";
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public POSITION getPostition() {
        return Postition;
    }
    public void setPostition(POSITION postition) {
        Postition = postition;
    }
    public int getSoAoo() {
        return soAoo;
    }
    public void setSoAoo(int soAoo) {
        this.soAoo = soAoo;
    }
    public Player(String fullName, POSITION postition, int soAoo) {
        this.fullName = fullName;
        Postition = postition;
        this.soAoo = soAoo;
    }

    public Player(){

    }
    
   
   
} 


