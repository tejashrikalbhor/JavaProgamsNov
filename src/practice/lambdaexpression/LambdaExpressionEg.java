package practice.lambdaexpression;

interface Read{
    void read();
}

public class LambdaExpressionEg implements Read {
   public void read(){
        System.out.println("i am reading java..");
    }

    public static void main(String[] args) {
//        Read r = new Read() {
//            @Override
//            public void read() { System.out.println("i am reading book..");}};
//        r.read();
        Read r = new LambdaExpressionEg();
        r.read();



}

}

