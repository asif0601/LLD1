package Generics;

import Generics.Pair.Pair;

import java.util.*;

public class GenericMain {
    public static void main(String[] args) {
        System.out.println("generic");
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.lastIndexOf(list));
        System.out.println(list.toString());
        list.add(1);
//
//
//        Pair<Integer, Integer> pair = new Pair<>(1, 2);
//        Pair pair1 = new Pair(1,2);
//        System.out.println(pair1);
//        int[] arr = new int[4];

//        ArrayList<Pair<Integer, Integer>> pairList = new ArrayList<>();
//        ArrayList<Pair<Integer, Integer>> pairList2 = new ArrayList<>();
//        pairList.add(new Pair(10,20));
//        pairList.add(new Pair(10,20));
//        pairList2.add(new Pair(10,20));
//        System.out.println(pairList);

        HashSet<Pair<Integer, Integer>> pairs = new HashSet<>();
        pairs.add(new Pair(1, 2));
        pairs.add(new Pair(1, 2));
        System.out.println(pairs);
        Iterator<Pair<Integer, Integer>> itr = pairs.iterator();
        // why we use Integer not int
        // ans --->
    }
}
