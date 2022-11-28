package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEg {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        ArrayList <String> name = new ArrayList<>();
        name.add("C");
        name.add("C++");
        name.add("JAVA");
        name.add("ADV JAVA");
        name.add("PYTHON");
        System.out.println("array list is: ");
        System.out.println(name);

        System.out.println("string in reverser order..");

        for (String str:name) {
            System.out.print(str + "\t" );
            StringBuffer br = new StringBuffer(str);
            System.out.print(br.reverse() +"\t");
            System.out.println();
        }
        //iterator forward traversing..
        System.out.println("this is iterator..");
        Iterator<String> i =name.iterator();
        while (i.hasNext()){
            String next = i.next();
            System.out.println(next);
        }

        //ListIterator
        System.out.println("this is list literal..");
        ListIterator ll = name.listIterator(name.size());
        while (ll.hasPrevious()){
            String prev = (String) ll.previous();
            System.out.println(prev);
        }



    }
}
