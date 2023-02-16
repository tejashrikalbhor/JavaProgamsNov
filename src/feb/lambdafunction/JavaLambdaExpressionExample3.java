package feb.lambdafunction;

interface Result{
    void result(float marks);
}
public class JavaLambdaExpressionExample3 {
    public static void main(String[] args) {
        Result r=(marks)->{
            if(marks >35){
                System.out.println("Passed");
            }
            else {
                System.out.println("Failed");
            }

        };
        r.result(24);
        r.result(54);
        r.result(12);
    }
}
