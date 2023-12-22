package multithreading;

public class Example1 {
    private static int x = 0;
    private static int y = 0;
    private static int a = 0;
    private static int b = 0;

    public Example1() {
        try {
            synchronized (this) {
                a = 0;
                b = 0;
                x = 0;
                y = 0;
            }
            Thread p = new Thread(() -> {
                a = 1;
                x = b;
            });
            Thread q = new Thread(() -> {
                b = 1;
                y = a;
            });
            q.start();
            p.start();
            p.join();
            q.join();
            System.out.println("x=" + x + ", y=" + y);
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();


    }
}
