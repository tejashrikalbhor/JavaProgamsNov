package java8features.lambdaexpression;

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
    }
}
