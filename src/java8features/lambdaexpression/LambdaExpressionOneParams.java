package java8features.lambdaexpression;

interface Data{
    void getData(String name);
}
public class LambdaExpressionOneParams {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        Data d=(name)->{
            System.out.println("name is: "+name);
        };
        d.getData("tejashri");
        System.out.println("Lambda function with one parameter");
        Data d1=(name)->{
            System.out.println("name is: "+name);
        };
        d1.getData("rajeshri");
        System.out.println("Lambda function with one parameter");
    }
}
