package com.collection;

import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        ArrayList <String> name = new ArrayList<>();
        name.add("C");
        name.add("C++");
        name.add("JAVA");
        name.add("ADV JAVA");
        name.add("PYTHON");
        System.out.println("array list is: ");
        System.out.println(name);

        for (String str:name) {
            System.out.print(str + "\t" );
            StringBuffer br = new StringBuffer(str);
            System.out.print(br.reverse() +"\t");
            System.out.println();
        }


    }
}
