package feb.methodReferences;

public class ReferenceStaticMethodThreadEg2 {
    public static void say() {
        System.out.println("you are in the static method.");
    }

    public static void main(String[] args) {
        Thread t =new Thread(ReferenceStaticMethodThreadEg2::say);
        t.start();
    }
}