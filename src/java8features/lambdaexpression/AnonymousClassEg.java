package java8features.lambdaexpression;


interface Area{
    void getArea(int l,int b);
}
public class AnonymousClassEg {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        Area a =new Area() {
            @Override
            public void getArea(int l, int b) {
                System.out.println("We are using anonymous  classs");
                System.out.println("Area of rectangle is :"+(l*b));
            }
        };
        a.getArea(12,10);

    }
}
