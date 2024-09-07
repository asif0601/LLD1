package ExceptionHandle.RuntimeExceptionHandler;

import Callable.NumberPrinter.InterestRate;

public class RuntimeExceptionHandler extends Exception{

    public void Number(int n){
        System.out.println("int" + n);
    }

    public void Number(Integer n){
        System.out.println("Integer"+n);
    }
    public RuntimeExceptionHandler(){

    }
}
