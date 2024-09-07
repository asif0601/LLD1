package Semaphore;

import Semaphore.CriticalSection.Consumer;
import Semaphore.CriticalSection.Producer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Semaphores {

    public static void main(String[] args) {
        Queue<Integer> q = new ConcurrentLinkedQueue<>();
        int count = 100; // it will not thread safe
        // solution is Semaphore
        Semaphore P = new Semaphore(10);
        Semaphore C = new Semaphore(0);


        Producer p1 = new Producer(1,"c1",q, count, P, C);
        Producer p2 = new Producer(2,"p2",q, count, P, C);
        Producer p3 = new Producer(3,"p3",q, count, P, C);

        Consumer c1 = new Consumer(1,"c1",q, count, P, C);
        Consumer c2 = new Consumer(2,"c2",q, count, P, C);
        Consumer c3 = new Consumer(3,"c3",q, count, P, C);

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
