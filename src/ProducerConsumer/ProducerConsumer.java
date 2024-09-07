package ProducerConsumer;

import ProducerConsumer.CriticalSection.Consumer;
import ProducerConsumer.CriticalSection.Producer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
    public static void main(String[] args) {

        Queue<Integer> q = new ConcurrentLinkedQueue<>();

        // problem solved of producer consumer
        // but at a time 1 thread will enter ---> we call mutex / synchronized
        // solution is Semaphore
        Lock lock = new ReentrantLock();

        Producer p1 = new Producer(1,"p1",q, lock);
        Producer p2 = new Producer(2,"p2",q, lock);
        Producer p3 = new Producer(3,"p3",q, lock);

        Consumer c1 = new Consumer(1,"c1",q, lock);
        Consumer c2 = new Consumer(2,"c2",q, lock);
        Consumer c3 = new Consumer(3,"c3",q, lock);

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();
        Thread t4 = new Thread(c1);
        t4.start();
        Thread t5 = new Thread(c2);
        t5.start();
        Thread t6 = new Thread(c3);
        t6.start();
    }
}
