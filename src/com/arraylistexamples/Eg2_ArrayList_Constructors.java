package com.arraylistexamples;

import java.util.ArrayList;
import java.util.List;

public class Eg2_ArrayList_Constructors {
    public static void main(String[] args) {
        // there are 3 constructors used for ArrayList
        // 1.ArrayList();
        List<String> name =new ArrayList<>();
        name.add("tejashri");
        name.add("kalbhor");
        name.add("Employee");
        name.add("Silicon stack");
        System.out.println("you are in the main method");
        System.out.println("Array constructor");
        System.out.println("1.ArrayList()");
        System.out.println(name);

        // 2.ArrayList(size);
        List<Integer> price = new ArrayList<>(5);
        System.out.println("2.ArrayList(5)with size ");
        price.add(10);
        price.add(20);
        price.add(30);
        price.add(40);
        price.add(50);
        price.add(60);
        System.out.println("size of array list is :"+price.size());
        System.out.println(price);
        // 3.ArrayList(Collection c)
        System.out.println("3.ArrayList(Collection c)");
        List <String> collection = new ArrayList<>(name);
        System.out.println(collection);



    }
}
