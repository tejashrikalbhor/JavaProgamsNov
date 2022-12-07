package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEg {
    public static void main(String[] args) {
        System.out.println("you are in the mai method..");
        System.out.println("you are in tha arraylist ");
        System.out.println("------------------------------------------");
        List<String>city = new ArrayList<>();
        city.add("pune");
        city.add("mumbai");
        city.add("delhi");
        city.add("hydrabad");
        city.add("solapur");
        city.add("nashik");
        System.out.println(city);
        System.out.println("------------------------------------------");
        Iterator<String> i = city.iterator();
        System.out.println("you are in the iterator..");
        System.out.println("------------------------------------------");
        while (i.hasNext()){
           String r= i.next();
            System.out.println(r);
           }
        if(city.contains("pune")) {
            System.out.println("------------------------------------------");
            System.out.println("pune is in the array list..");
            System.out.println("------------------------------------------");
        }
        city.remove("nashik");
        System.out.println(city);
        int size =city.size();
        System.out.println(size);
        city.clear();
        System.out.println(city);
        city.remove("pune");
        System.out.println(city);



    }
}
