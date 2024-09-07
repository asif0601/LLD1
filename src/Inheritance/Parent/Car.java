package Inheritance.Parent;

public class Car {

    public int price;
    public static String commonStaticVariable = "parent";
    public void getPrice(){
        System.out.println("Parent: "+ price);
    }

    public static void commonStaticMethod(){
        System.out.println("Parent: "+commonStaticVariable);
    }
}
