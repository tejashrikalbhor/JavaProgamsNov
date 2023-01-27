package practice.list;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        // adding data of different data type
        List city = new java.util.ArrayList<>();
        city.add("pune");
        city.add("mumbai");
        city.add("goa");
        city.add(null);
        city.add(4012201);
        System.out.println("you are in the array list");
        System.out.println(city);

        //
        List <String>city1 = new java.util.ArrayList<>();
        city1.add("pune");
        city1.add("mumbai");
        city1.add("goa");
        city1.add(null);
        city1.add("mumbai");
        city1.add("goa");
        System.out.println("you are in the array list of string..");
        System.out.println(city1);

    }
}
