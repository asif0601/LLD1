package AdvanceJavaProject;

import java.util.ArrayList;

class Name{
    String name;
    int age;
    public Name(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "\n" +"name " + this.name + " age " + this.age ;
    }
}
public class CollectionDemo {

    public static void main(String[] args) {
        System.out.println("Collection-demo");

        ArrayList<Name> list = new ArrayList<>();
        // store the data in Array format new ArrayList<>(initialsize)
        list.add(new Name("Salman khan", 50));
        list.add(new Name("ashwarya rai",45));
        list.add(new Name("katrina kaif",35));
        list.add(new Name("deepika padukon",35));
        System.out.println(list); // obj.toString() work here to print the list

    }
}
