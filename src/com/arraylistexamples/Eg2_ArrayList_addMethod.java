package com.arraylistexamples;

import java.util.ArrayList;
import java.util.List;

public class Eg2_ArrayList_addMethod {
    public static void main(String[] args) {
        System.out.println("you are in the main()..");
        System.out.println("this is add method with different elements and collection..");
        List<String>name= new ArrayList<>(3);
        name.add("One");
        name.add(1,"Two");

        System.out.println(name);
        List<String>num =new ArrayList<>();
        num.add("1");
        num.add("2");
        num.addAll(name);
        System.out.println(num);

        List<String>ls =new ArrayList<>();
        ls.addAll(name);
        ls.addAll(num);
        ls.add(3,"one");
        ls.addAll(3,name);
        System.out.println(ls);


    }
}
