package ExceptionHandle;

import ExceptionHandle.RuntimeExceptionHandler.RuntimeExceptionHandler;

import java.util.Scanner;

public class ExceptionHandle {

    /*
        Exception handle
            1. Error ---  Non-recoverable
            2. Exception -- try catch block
        Exception --
            1. always handle in try catch block
            2. handle when it creates in try catch block ( 10% we do )
            3. we can propagate above like  ( 90% time we do )
                (Repository -> service layer -> controller -> controllerAdvice any of
                them we have to handle this error , otherwise code will break)

         Type of Exception ---
            1. User defined exception
            2. Built in exception
                1. Checked Exception (compile time Exception )
                2. Un-checked Exception ( Run-time Exception )

    */

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        ///   without exception use ////
        /*
        System.out.println(a/b);
        */
        ///   with Exception  ///////
        /*
        try {
            System.out.println(a/b);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
         */
        /// Custom Exception ////////

        RuntimeExceptionHandler exceptionHandler = new RuntimeExceptionHandler();
        exceptionHandler.Number(3);
    }
}
