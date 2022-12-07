package com.iterator;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

// this is vector program contain the following concepts:
//enumeration and methods.

public class VectorClass {
    public static void main(String[] args) {
        System.out.println("you are in the main method..");
        Vector v = new Vector();
        System.out.println("yor are in the vector..");
        v.add("vector");
        v.add("java");
        v.add("c++");
        System.out.println(v);

        System.out.println("you are in the enumeration..");
        Enumeration e =v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }





    }
}
