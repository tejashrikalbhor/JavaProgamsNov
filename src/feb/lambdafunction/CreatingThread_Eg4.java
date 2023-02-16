package feb.lambdafunction;

public class CreatingThread_Eg4 {
    public static void main(String[] args) {


        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("You are in the run method.");
            }
        };

        Thread t = new Thread(r);
        t.start();

        Runnable r1 = () -> {
            System.out.println("You are in the run method 1");
        };
        Thread t1 = new Thread(r1);
        t1.start();
    }
}