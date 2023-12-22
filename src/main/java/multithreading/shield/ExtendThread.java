package multithreading.shield;

public class ExtendThread extends Thread {
    public ExtendThread(String name) {
        super(name);
        this.start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + getName() + " count=" + count);
            }
        }
        catch (InterruptedException e1) {
            System.out.println(getName() + " прерван");
        }
        System.out.println(getName() + " завершен");
    }
}
