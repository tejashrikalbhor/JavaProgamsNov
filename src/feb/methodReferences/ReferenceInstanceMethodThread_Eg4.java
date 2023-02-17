package feb.methodReferences;

public class ReferenceInstanceMethodThread_Eg4 {
    public  void dispaly() {
        System.out.println("you are in the instance method");
    }
    public static void main(String[] args) {
        System.out.println("you are in the main");
        Thread t =new Thread(new ReferenceInstanceMethodThread_Eg4()::dispaly);
        t.start();
    }
}
