package Executors.NumberPrinters;

public class NumberPrint implements Runnable {

    int count;

    public NumberPrint(int number){
        count = number;
    }

    @Override
    public void run() {
        System.out.println(count+ " "+Thread.currentThread().getName());
    }
}
