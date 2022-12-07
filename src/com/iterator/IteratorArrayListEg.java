package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//this is an example which contains following points:
//1.array list constructors
//2.iterators and methods
public class IteratorArrayListEg {
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
//        city.clear();
//        System.out.println(city);
//        city.remove("pune");
//        System.out.println(city);
        System.out.println("-----------------------------------------------");

        //array list constructor size specified
        List<Integer> li = new ArrayList<>(5);
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);
        System.out.println("you are in the array list constructor of specified size..");
        System.out.println(li);
        System.out.println("----------------------------------------------------");
        //Array list constructor of collection
        List<String>copy =new ArrayList<>(city);
        System.out.println("you are in the array list collection constructor..");
        System.out.println(copy);
        copy.set(4,"banglorrue");
        copy.add("goa");
        Iterator<String> s = copy.iterator();
        System.out.println("you are in the iterator of array list constructor..");
        System.out.println("---------------------------------------------------------");

        while (s.hasNext()){
           String res = s.next();
            System.out.println(res);
//            s.remove();
            }
        if(copy.contains("delhi")){
            s.remove();
            System.out.println(copy);
        }
    }
}
