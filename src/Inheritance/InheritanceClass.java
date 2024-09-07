package Inheritance;

import Inheritance.Child.Toyota;
import Inheritance.Parent.Car;

import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class InheritanceClass {

    /// ******** Important Point ************ ///
    // data access through the ref type
    // method or behaviour ( Non-static )  access through the object type (
    /// ************************************* ///

    public static void main(String[] args) {
        ////// data member //////
        /////  static data member /////
        /////  decide at compile time ( using Ref type )  which will be executed ////
        /*
        Car obj1 = new Car();
        System.out.println("  " + obj1.commonStaticVariable);
        Car obj2 = new Toyota();
        System.out.println("  " + obj2.commonStaticVariable);
        Toyota obj3 = new Toyota();
        System.out.println("  " + obj3.commonStaticVariable);
         */
        ////// data member //////
        /////  non-static data member /////
        /////  decide at compile time ( using Ref type ) which will be executed ////
//        /*
        Car obj1 = new Car();
        System.out.println(" common object " + obj1.price);
        Car obj2 = new Toyota();
        System.out.println("  " + obj2.price);
        System.out.println(" child object " + ((Toyota) obj2).color);
        Toyota obj3 = new Toyota();
        System.out.println("  " + obj3.price);
//         */

        ////// Method //////
        /////  non-static data member /////
        /////  decide at Run time ( using Object type )  which will be executed ////
        /*
        Car obj1 = new Car();
        obj1.getPrice();
        Car obj2 = new Toyota();
        obj2.getPrice();
        Toyota obj3 = new Toyota();
        obj3.getPrice();
         */
        ////// Method //////
        /////  static data member /////
        /////  decide at Compile time ( using Ref type ) which will be executed ////
        /*
        Car obj1 = new Car();
        obj1.commonStaticMethod();
        Car obj2 = new Toyota();
        obj2.commonStaticMethod();
        Toyota obj3 = new Toyota();
        obj3.commonStaticMethod();
         */


    }
}
