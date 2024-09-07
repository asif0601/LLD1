package Lambda;

import Callable.NumberPrinter.InterestRate;
import Executors.NumberPrinters.NumberPrint;
import Lambda.Number.NumberInterface;
import Lambda.Number.NumberInterfaceImp;

import java.util.*;
import java.util.concurrent.*;

public class Lambda {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // ****** Normal implementation
        /*
        NumberInterface np = new NumberInterfaceImp();
        System.out.println(np.operation(4,5));
        */
        // ***** Anonymous experssion *******
        /*
        NumberInterface add = new NumberInterface() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };
        NumberInterface subtractor = new NumberInterface() {
            public int operation(int a, int b){
                return a-b;
            }
        };
        System.out.println(add.operation(10,5));
        System.out.println(subtractor.operation(10,5));
         */

        // *****  lambda expression ********
        /*
        NumberInterface add = (a, b) -> a+b;
        NumberInterface subtract = (a, b) -> a-b;
        System.out.println(add.operation(10,5));
        System.out.println(subtract.operation(10,5));
         */

        // we are going to use anonymous function to sort the array
        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        Collections.sort(list, comp);
        System.out.println(list);
         */

        // ********** lambda expression on Runnable interface ******
        /*
        Runnable runnable = () -> System.out.println("runnable");
        Thread thread = new Thread(runnable);
        thread.start();
         */
        // ********* Anonymous expression in callable interface ****
        /*
        Callable callable = new Callable() {
            @Override
            public String  call() throws Exception {
                Thread.sleep(5000);
                return "Callable";
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> futureString =  executorService.submit(callable);
        String str = futureString.get();
        System.out.println(str);
         */







    }
}
