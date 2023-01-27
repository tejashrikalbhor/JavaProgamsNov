package myassignment.scr;

import java.util.ArrayList;
import java.util.List;


public class MainClass {
    public static void main(String[] args) {

        MyFunction myFunction = new MyFunction();
        List<MyFunction> iterator1 = new ArrayList<>();
        iterator1.add(new MyFunction("login","pass"));
        iterator1.add(new MyFunction("Logout","fail"));
        iterator1.add(new MyFunction("log","pass"));
        System.out.println(iterator1);
        }
}
