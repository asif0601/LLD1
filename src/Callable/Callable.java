package Callable;

import Callable.NumberPrinter.ActualPrice;
import Callable.NumberPrinter.InterestRate;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        InterestRate rte = new InterestRate(2.5);
        ActualPrice act = new ActualPrice(1000);
        Future<Double> futureRate = executorService.submit(rte);
        Future<Integer> futurePrice = executorService.submit(act);

        // get() is the block the main thread;
        System.out.println("before blocked here  -----  ");
        Double esRate = futureRate.get();
        System.out.println("blocked here  -----  ");
        Integer esPrice = futurePrice.get();
        System.out.println("unblocked here ---- ");


        double finalPrice = esPrice + (esPrice * esRate)/100;
        System.out.println(finalPrice+"  final-price");

    }
}
