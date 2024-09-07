package Runnable.Imple;

import java.util.SortedMap;

public class A extends Thread {

    @Override
    public void run(){
        for(int i=0;i<1000;i++) {
            System.out.print(i + " ");
        }
    }
}
