package Callable.NumberPrinter;

import java.util.concurrent.Callable;

public class InterestRate implements Callable<Double> {

    Double interestRate;
    public InterestRate(Double rate){
        interestRate = rate;
    }
    @Override
    public Double call() throws Exception {
        Thread.sleep(4000);
        return interestRate;
    }
}
