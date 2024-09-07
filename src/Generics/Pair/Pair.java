package Generics.Pair;

import java.security.Key;
import java.util.Iterator;

public class Pair <X, Y> {

    private X key;
    private Y value;

    public Pair(){

    }
    public Pair(X key, Y value){
        this.key = key;
        this.value = value;
    }
    public Y getValue() {
        return value;
    }
    public X getKey() {
        return key;
    }


    @Override
    public String toString(){
        return this.key+" ---> "+this.value;
    }

    // used to check that 2 objects are how equals
    // on the basis of single data or multiple data
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;

        if(obj == null || obj.getClass()!=this.getClass()) return false;
        return ((Pair<?, ?>) obj).key == this.key && ((Pair<?, ?>) obj).value == this.value;
    }

    // by default its not called while adding in the ArrayList
    // its default called in HashSet, HashMap etc to check the hash value
    @Override
    public int hashCode(){
        int result = key.hashCode();
        result = result * 31 + value.hashCode();
        return result;
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}
