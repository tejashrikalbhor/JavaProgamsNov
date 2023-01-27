package java8features.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

interface Read{
    void sayHello();

}
public class LambdaExpressionZeroParams {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        Read r=()->{
            System.out.println("welcome to sey hello..");
            System.out.println("hello world!");
        };
        r.sayHello();
        System.out.println("Lambda function with zeo parameters..");
        r.sayHello();

        System.out.println("---------------------------------------------------");
        List l =new ArrayList();
        l.add("tejashri");
        l.add("preeti");
        l.add("laxmi");
        l.add("swathi");
        l.add("pooja");
        System.out.println(l);
       l.forEach(
               (n)-> System.out.println(n)
       );
    }
}
