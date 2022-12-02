package com.collection;

import java.util.*;

public class FirstCollection {
    public static void main(String[] args) {
        System.out.println("welcome to my first collection..");
        ArrayList<String> names= new  ArrayList<>();
        names.add("tejashri");
        names.add("rajeshri");
        names.add("john");
        names.add("sohaa");
        System.out.println("this is my array list..");
        System.out.println(names);
        // set ()
        names.set(3,"sonakshii");
        System.out.println("using set()");
        System.out.println(names);
        //add() at particular position
        names.add(1,"sonuu");
        System.out.println("using add()");
        System.out.println(names);

        // link list
        LinkedList list = new LinkedList();
        System.out.println("this is the linked list..");
        list.add("pooja");
        list.add(34);
        list.add(1234567891);
        list.add(15045.76);
        System.out.println(list);

        // vector
        Vector<String> v = new Vector();
        System.out.println("this is the vector..");
        v.add("vector");
        v.add("linked list");
        v.add("array list");
        System.out.println(v);

        //hashset
        HashSet<Double> hs=new HashSet<Double>();
        System.out.println("this is hash set..");
        hs.add(12.12);
        hs.add(24.7);
        hs.add(111.111);
        hs.add(5.5);
        System.out.println(hs);

        //tree set
        TreeSet <Double> ts = new TreeSet<>();
        System.out.println("this is tree set..");
        ts.addAll(hs);
        System.out.println(ts);







    }
}
