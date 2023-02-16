package feb.lambdafunction;

interface Draw{
    void draw();
}
class Shape implements Draw {

    @Override
    public void draw() {
        System.out.println("you are in shape class");
    }
}
public class WithoutLambdaExpression_Eg1 {
    public static void main(String[] args) {
        System.out.println("you are in main");
        Shape s= new Shape();
        s.draw();
    }
}
