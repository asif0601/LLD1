package Generics.Pair;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class CollectionPair<X, Y> implements Iterable<Object> {
    List<Pair<X,Y>> list = new ArrayList<>();

    public void add(Pair<X,Y> obj){
        list.add(obj);
    }

    @Override
    public Iterator<Object> iterator() {
        return new PairImplemetation();
    }

    @Override
    public void forEach(Consumer<? super Object> action) {
        Iterable.super.forEach(action);
    }

    public class PairImplemetation implements Iterator<Object>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
