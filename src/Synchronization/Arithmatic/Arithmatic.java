package Synchronization.Arithmatic;

public class Arithmatic {
    public int count = 0; // by default its zero

    public Arithmatic(int count){
        this.count = count;
    };
    public void increament(){
        count++;
    }
    public void decreament(){
        count--;
    }

    public String toString(){
        return "count "+ count;
    }
}
