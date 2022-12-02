package com.arraylistexamples;

import java.util.ArrayList;
import java.util.List;

public class Eg3_ArrayList_RemoveMethod {
    public static void main(String[] args) {
        System.out.println("you are in the main()");
        List<String > subjects= new ArrayList<>();
        subjects.add("c");
        subjects.add("c++");
        subjects.add("java");
        subjects.add("maths");
        subjects.add("python");
        System.out.println("we are using remove ()");
        System.out.println(subjects);
        subjects.remove("maths");
        System.out.println(subjects);

        List<String>sub = new ArrayList<>();
        sub.add("maths");
        sub.add("science");
        sub.add("history");
        sub.add("geography");
        System.out.println(sub);

        List<String>remove1 = new ArrayList<>();
        System.out.println("you are in the remove method..");
        remove1.addAll(sub);
        System.out.println(remove1);
//        Boolean isRemoved =remove1.removeAll(remove1);
        System.out.println("after applying removeAll method");
//        System.out.println(isRemoved);
        remove1.remove(1);
        System.out.println(remove1);
        remove1.add("civics");
        remove1.add("geography");
        System.out.println("--------------------------------");
        System.out.println(remove1);
        remove1.remove("geography");
        System.out.println("after applying remove method");
        System.out.println(remove1);






    }
}
