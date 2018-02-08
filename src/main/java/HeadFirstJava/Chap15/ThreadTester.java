package HeadFirstJava.Chap15;

/**
 * Created by a.shipulin on 18.12.17.
 */
public class ThreadTester {
    public static void main(String[] args) {
        Runnable thread = new MyRannable();
        Thread myThread = new Thread(thread);
        myThread.start();
        System.out.println("Возвращаемся в метод main");

        System.out.println("isAlive=" +myThread.isAlive());
    }
}
