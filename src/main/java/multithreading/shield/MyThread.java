package multithreading.shield;

public class MyThread implements Runnable {
    String thrdName;

    public MyThread(String name) {
        this.thrdName = name;
    }



    @Override
    public void run() {
        System.out.println(thrdName + " - запуск");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("В " + thrdName + " счетчик = " + i);
            }
        }
        catch (InterruptedException e) {
            System.out.println(thrdName + " прерван");
        }
        System.out.println(thrdName + " - завершение");
    }
}
