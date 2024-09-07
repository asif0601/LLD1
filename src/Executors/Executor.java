package Executors;

import Executors.NumberPrinters.NumberPrint;

import java.util.concurrent.Executors;

public class Executor {

    public static void main(String[] args) {
        System.out.println("Executors");
        // thread created already there
        // but in Thread when we do t.start() then it create the thread and execute
        java.util.concurrent.Executor executor = Executors.newFixedThreadPool(2);

        for(int i=1;i<=100;i++){
            if(i == 4 || i==10){
                System.out.println("Stop");
            }
            NumberPrint np = new NumberPrint(i);
            executor.execute(np);
        }

    }
}
