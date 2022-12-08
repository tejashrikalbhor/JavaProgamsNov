package java8features.lambdaexpression;

interface Draw{
    void getData();
}
public class LambdaExpressionEg {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        Draw d =()-> {
            System.out.println("you are in the getData method..");
            System.out.println("using lambda expression with 0 parameter.. ");
        };
        d.getData();
    }
}
