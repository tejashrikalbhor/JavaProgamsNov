package com.setexamples.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        //Hashmap
        System.out.println("you are in the main..");
        Map<Integer,String>m = new HashMap<>();
        m.put(1,"pune");
        m.put(2,"goa");
        m.put(3,"delhi");
        m.put(4,"nashik");
        m.put(6,"bangloore");
        System.out.println("you are in the hash map..");
        System.out.println(m.values());

        //LinkedHashMap
        System.out.println("you are in the main..");
        Map<Integer,String>ml = new LinkedHashMap<>();
        ml.put(1,"pune");
        ml.put(2,"goa");
        ml.put(3,"delhi");
        ml.put(4,"nashik");
        ml.put(6,"bangloore");
        System.out.println("you are in the Linked hash map..");
        System.out.println(ml.values());

        //TreeMap
        System.out.println("you are in the main..");
        Map<Integer,String>mt = new TreeMap<>();
        mt.put(1,"pune");
        mt.put(2,"goa");
        mt.put(3,"delhi");
        mt.put(4,"nashik");
        mt.put(6,"bangloore");
        System.out.println("you are in the TreeMap..");
        System.out.println(mt.values());

    }
}
