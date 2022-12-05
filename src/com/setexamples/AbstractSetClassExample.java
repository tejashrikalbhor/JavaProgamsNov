package com.setexamples;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AbstractSetClassExample {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        //HashSet
        AbstractSet<String>ss= new HashSet<>();
        ss.add("Ram");
        ss.add("Sham");
        ss.add("Geeta");
        ss.add("Seeta");
        ss.add("Lakhan");
        System.out.println("you are in the Abstract set class of HashSet..");
        System.out.println(ss);
        //LinkedHashSet
        AbstractSet<String>s= new LinkedHashSet<>();
        s.add("Ram");
        s.add("Sham");
        s.add("Geeta");
        s.add("Seeta");
        s.add("Lakhan");
        System.out.println("you are in the Abstract set class of Linked HashSet..");
        System.out.println(s);
        //Tree set
        AbstractSet<String>t= new TreeSet<>();
        t.add("Ram");
        t.add("Sham");
        t.add("Geeta");
        t.add("Seeta");
        t.add("Lakhan");
        t.add("Ankita");
        System.out.println("you are in the Abstract set class of  Tree set..");
        System.out.println(t);
    }
}
