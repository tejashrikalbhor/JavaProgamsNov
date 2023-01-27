package java8features.methodreference;

interface Lambda
{
    public void m1(String name);
}

public class Test012  {


    public static void main(String[] args) {
      /* Lambda l= new Test012();
        l.m1("name");*/

        Lambda l2= name->{
            System.out.println(name);
        };

        l2.m1("tej");
    }


}
