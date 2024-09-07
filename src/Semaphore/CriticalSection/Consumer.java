package Semaphore.CriticalSection;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {
    int number;
    String name;
    Queue<Integer> q;
    Semaphore P;
    Semaphore C;
    int count;
    public Consumer(int number, String name , Queue<Integer> q, int count, Semaphore P, Semaphore C){
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
                C.acquire(); // Count of C--;
                if(!q.isEmpty()){

                    q.remove();
                    count--;
                    System.out.println("Consumer "+ name+ " is removing the object, size "+q.size()+" count "+count);
                }
                P.release(); // Count of p++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
