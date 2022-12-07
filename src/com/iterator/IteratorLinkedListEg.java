package com.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// this example is of linked list which contain the following points:
//linked list constructor
//iterator with its  methods

public class IteratorLinkedListEg {
    public static void main(String[] args) {
        System.out.println("you are in the main method..");
        List <String> name = new LinkedList<>();
        name.add("pooja");
        name.add("rupa");
        name.add("kirti");
        System.out.println("you are in linked list ");
        System.out.println(name);

//      iterator with the methods

        Iterator<String> iter = name.iterator();
        System.out.println("iterator: "+iter);
        while (iter.hasNext()){
            String res = iter.next();
            System.out.println(res);
        }
        if(name.contains("pooja")){
           int a= name.indexOf("pooja");
            name.add(a+1,"tejashri");
            System.out.println("element added sucessfully..");
            System.out.println(name);
        }

        // linked list with sized specified constructor.
        List<Integer> li= new LinkedList<>();
        li.add(15000);
        li.add(17000);
        li.add(22000);
        li.add(30000);
        System.out.println("you are in the list constructor of integer.. ");
        System.out.println(li);
        Iterator<Integer> i=li.iterator();
       while (i.hasNext()){
           int res = i.next();
           System.out.println(res);
        }

       List list = new LinkedList(name);
        System.out.println("you are in the collection constructor..");
        System.out.println(list);
        list.addAll(li);
        System.out.println("updated linked list..");
        System.out.println(list);
        Iterator it =list.iterator();
        System.out.println("-----------------------------");
        while (it.hasNext()){
            System.out.println(it.next());

        }
    }
}
