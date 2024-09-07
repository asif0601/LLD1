package Synchronization.Arithmatic;

public class ArithmaticWithSynchronized {
    int count;
    public ArithmaticWithSynchronized(int count){
        this.count = count;
    }

    public synchronized void increament(){
        count++;
    }
    public synchronized void decreament(){
        count--;
    }

    public String toString(){
        return "count " + count;
    }
}
