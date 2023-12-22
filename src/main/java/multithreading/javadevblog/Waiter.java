package multithreading.javadevblog;

public class Waiter implements Runnable {
    private Message msg;

    public Waiter(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            try {
                System.out.println(name + " ждет вызова метода notify: " + System.currentTimeMillis());
                msg.wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " Был вызова метода notify: " + System.currentTimeMillis());
            System.out.println(name + ": " + msg.getMsg());
        }

    }
}
