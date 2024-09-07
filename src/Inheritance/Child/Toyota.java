package Inheritance.Child;

import Inheritance.Parent.Car;

public class Toyota extends Car {

    public int price = 500;

    public String color = "red";
    public static String commonStaticVariable = "child";

    public void getPrice(){
        System.out.println("Child: "+price);
    }

    public void getColor() {
        System.out.println("child: "+ color);
    }

    public static void commonStaticMethod(){
        System.out.println("Child: "+commonStaticVariable);
    }



}
