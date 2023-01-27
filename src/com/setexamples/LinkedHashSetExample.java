package com.setexamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        Set<Integer>i=new HashSet<>();
        i.add(10);
        i.add(1);
        i.add(20);
        i.add(2);
        i.add(30);
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);
        i.add(10);
        i.add(20);
        i.add(30);
        i.add(40);
        i.add(50);
        System.out.println("you are in the linked-hashset of integer..");
        System.out.println(i);
        Set<String>ss=new LinkedHashSet<>();
        ss.add("tejashri");
        ss.add("kalbhor");
        ss.add("Silicon stack");
        ss.add("pune");
        ss.add("maharashtra");
        ss.add("austrax");
        ss.add("technology");
        ss.add("pune");
        ss.add("401221");
        System.out.println("you are in the linked hash set of strings..");
        System.out.println(ss);
    }
}
