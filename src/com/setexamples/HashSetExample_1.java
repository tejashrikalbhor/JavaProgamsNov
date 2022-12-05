package com.setexamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample_1 {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        Set<Integer>s =new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(20);
        s.add(10);
        boolean show = s.contains(10);
        System.out.println("you are in the set of integers..");
        System.out.println(s);
        System.out.println(show);

        Set<String>ss = new HashSet<>();
        ss.add("tejashri");
        ss.add("kalbhor");
        ss.add("Silicon stack");
        ss.add("pune");
        System.out.println("you are in the set of strings.. ");
        System.out.println(ss);



    }
}
