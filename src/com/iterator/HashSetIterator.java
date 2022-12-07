package com.iterator;

import java.util.*;

//this is  set program which contains following point:
//1.hashset
//2.linked hashset
//3.tree set
//iterator with method

public class HashSetIterator {
    public static void main(String[] args) {
        System.out.println("you are in the main method..");
        // 1.hash set
        Set<String> shop = new HashSet<>();
        shop.add("reliance");
        shop.add("d-mart");
        shop.add("trends");
        shop.add("max");
        System.out.println("you are in the hash set..");
        System.out.println(shop);
        Iterator e = shop.iterator();
        System.out.println("you are in the iterator..");
        while (e.hasNext()){
            System.out.println(e.next());
        }
        //2.list hash set
        Set<String> s = new LinkedHashSet<>();
        s.addAll(shop);
        s.add("go color");
        s.add("bata");
        System.out.println("you are in the linked hash set..");
        System.out.println(s);
        Iterator i = s.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        s.retainAll(shop);
        System.out.println(s);

        // tree set
         Set<String> t = new TreeSet<>();
         t.addAll(s);
         t.add("life style");
         t.add("ccd");
        System.out.println("you are in the tree set..");
        System.out.println(t);
        Iterator ite = t.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }





    }
}
