package com.setexamples;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        Set<Integer>i = new TreeSet<>();
        i.add(10);
        i.add(20);
        i.add(30);
        i.add(40);
        i.add(50);
        i.add(60);
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
        i.add(15);
        i.add(70);
        System.out.println("you are in the tree set of integers..");
        System.out.println(i);

        Set<String>ss = new TreeSet<>();
        ss.add("Z");
        ss.add("x");
        ss.add("A");
        ss.add("a");
        ss.add("tejashri");
        ss.add("kalbhor");
        ss.add("Silicon stack");
        ss.add("pune");
        ss.add("maharashtra");
        ss.add("austrax");
        ss.add("technology");
        ss.add("pune");
        ss.add("401221");
        System.out.println("you are in the tree set of strings..");
        System.out.println(ss);
    }
}
