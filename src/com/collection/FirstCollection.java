package com.collection;

import java.util.ArrayList;

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


    }
}
