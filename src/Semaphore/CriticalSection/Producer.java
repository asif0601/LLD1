package Semaphore.CriticalSection;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    int number;
    String name;
    Queue<Integer> q;
    Semaphore P;
    Semaphore C;
    int count; // it not thread safe
    public Producer(int number, String name , Queue<Integer> q, int count, Semaphore P, Semaphore C){
        this.number = number;
        this.name = name;
        this.q = q;
        this.P = P;
        this.C = C;
        this.count = count;
    }
    @Override
    public void run() {
        while(true){
            try {
                P.acquire();
                if(q.size() < 10){
                    q.add(number);
                    count++;
                    System.out.println("Producer "+ name+ " is adding the object, size "+q.size()+" count "+count);
                }
                C.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
