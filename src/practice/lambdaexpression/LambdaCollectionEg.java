package practice.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

interface Play{
    void play();
}
public class LambdaCollectionEg {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        List l =new ArrayList();
        l.add("tejashri");
        l.add("kalbhor");
        l.add(24);
        l.add(1.2);
        System.out.println(l);
        Play p=()->{
            l.forEach((n)->System.out.println(n));
        };
        p.play();

    }
}
