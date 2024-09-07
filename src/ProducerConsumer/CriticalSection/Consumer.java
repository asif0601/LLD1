package ProducerConsumer.CriticalSection;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {
    int number;
    String name;
    Queue<Integer> q;

    Semaphore P;
    Semaphore C;
    Lock lock;
    public Consumer(int number, String name , Queue<Integer> q, Lock lock){
        this.number = number;
        this.name = name;
        this.q = q;
        this.lock = lock;
    }
    @Override
    public void run() {
        while(true){
            lock.lock();
            if(!q.isEmpty()){
                System.out.println(name+ " is removing the object, size "+q.size());
                q.remove();
            }
            lock.unlock();
        }
    }
}
