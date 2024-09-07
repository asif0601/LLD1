package Callable.NumberPrinter;

import java.util.concurrent.Callable;

public class ActualPrice implements Callable<Integer> {

    int price;

    public ActualPrice(int actualPrice){
        price = actualPrice;
    }
    @Override
    public Integer call() throws Exception {
        Thread.sleep(9000);
        return price;
    }
}
