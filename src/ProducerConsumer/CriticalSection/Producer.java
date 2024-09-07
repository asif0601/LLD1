package ProducerConsumer.CriticalSection;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{
    int number;
    String name;
    Queue<Integer> q;
    Lock lock;
    public Producer(int number, String name , Queue<Integer> q, Lock lock){
        this.number = number;
        this.name = name;
        this.q = q;
        this.lock = lock;
    }

    public Producer(int number, String c1, Queue<Integer> q, Semaphore p, Semaphore c) {
    }

    @Override
    public void run() {
        while(true){
            if(q.size() < 3){
                System.out.println(name+ " is adding the object, size "+q.size());
                q.add(number);
            }
        }
    }
}
