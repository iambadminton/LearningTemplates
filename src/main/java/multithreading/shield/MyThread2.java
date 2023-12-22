package multithreading.shield;

public class MyThread2 implements Runnable {
    Thread thrd;

    public MyThread2(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + thrd.getName() + " count=" + count);
            }
        }
        catch (InterruptedException e1) {
            System.out.println(thrd.getName() + " прерван");
        }
        System.out.println(thrd.getName() + " завершен");
    }
}
