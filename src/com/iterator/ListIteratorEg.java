package com.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEg {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        List l = new ArrayList();
        l.add("tejashri");
        l.add(24);
        l.add("silicon stack");
        l.add(1.2);
        l.add(12000.21);
        System.out.println("you are in the array list");
        System.out.println(l);
        System.out.println("--------------------------------------------------------");
        ListIterator i =l.listIterator();
        while (i.hasNext()){
            System.out.println(i.nextIndex());
            System.out.println(i.next());
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("using previous method..");
        while (i.hasPrevious()){
            System.out.println(i.previousIndex());
            System.out.println(i.previous());
        }

    }
}
