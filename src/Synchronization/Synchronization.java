package Synchronization;

import Synchronization.Arithmatic.Arithmatic;
import Synchronization.Arithmatic.ArithmaticWithSemaphorses;
import Synchronization.Arithmatic.ArithmaticWithSynchronized;

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        ////  Using Main thread ////
        /*
        Arithmatic obj = new Arithmatic(0);
        System.out.println("before : " +obj);
        obj.increament();
        obj.decreament();
        System.out.println("after: " +obj);
         */

        //// Using multiple Thread  ////
        //// Race condition comes into the pictures ////
        //// issue comes
        /*
        Arithmatic arithmatic = new Arithmatic(0);
        Thread increament = new Thread(){
            public void run(){
                for (int i=0;i<10000;i++){
                    arithmatic.increament();
                }
            }
        };
        Thread decreament = new Thread(){
            public void run(){
                for (int i=0;i<10000;i++){
                    arithmatic.decreament();
                }
            }
        };
        System.out.println("before thread execution " + arithmatic);
        increament.start();
        decreament.start();
        increament.join();
        decreament.join();
        System.out.println("before thread execution " +arithmatic);
         */

        //// from above code we are not getting expected result ////
        //// Synchronized (one thread at a time) ////
        //// it will always give the correct result ////
        /*
        ArithmaticWithSynchronized arithmaticWithSynchronized = new ArithmaticWithSynchronized(0);
        Thread increament = new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    arithmaticWithSynchronized.increament();
                }
            }
        };
        Thread decreament = new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    arithmaticWithSynchronized.decreament();
                }
            }
        };
        System.out.println("before thread start "+ arithmaticWithSynchronized);
        increament.start();
        decreament.start();
        increament.join();
        decreament.join();
        System.out.println("After thread end "+ arithmaticWithSynchronized);
         */

        //// only one thread are allowed to enter in critical section ////
        //// Semaphores ( thread > 1 are allowed now ) ////
        //// Producer , Consumer Problem ////

        ArithmaticWithSemaphorses arithmatic = new ArithmaticWithSemaphorses(2);
        Thread increament = new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    arithmatic.increament();
                }
            }
        };
        Thread decreament = new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    arithmatic.decreament();
                }
            }
        };
        System.out.println("before thread start "+ arithmatic);
        increament.start();
        decreament.start();
        increament.join();
        decreament.join();
        System.out.println("After thread start "+ arithmatic);




    }
}
