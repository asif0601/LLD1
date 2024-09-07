package Runnable;

import Runnable.Imple.A;
import Runnable.Imple.RunnableA;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.lang.*;

public class RunnableImplementation extends Thread {
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            System.out.println("running");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
//        Runnable task = () -> {
//            System.out.println("Runnable task is running.");
//        };
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.execute(task);
//        executorService.shutdown();

        // its like setTimeout function in javascript that execute work asynchronously
//        A obj1 = new A();
//        A obj2 = new A();

        // it don't start work concurrently
//        thread.run();
//        thread1.run();

        // it will work concurrently
//        obj1.start();
//        obj2.start();

//        Runnable obj1 = new RunnableA();
//        Runnable obj2 = new RunnableA();
//        Thread runnableA1 = new Thread(obj1);
//        Thread runnableA2 = new Thread(obj2);
//        System.out.println(Thread.currentThread().getName()+" current thread");
//        Thread.sleep(10000);
//        System.out.println(runnableA1+ "  runnableA1");
//        System.out.println(runnableA2+ "  runnableA2");
//        runnableA1.start();
//        runnableA2.start();

        // The start method creates a new thread and then calls the run method in that new thread.
        //  run method use to work concurrently
        //  start method work asynchronusly like frontend

        RunnableImplementation t = new RunnableImplementation();
        t.setPriority(MAX_PRIORITY);
        t.start();
        t.join();
        System.out.println("completed");
        // start run join setPriority




    }
}
