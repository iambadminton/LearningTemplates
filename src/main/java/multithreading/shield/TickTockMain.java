package multithreading.shield;

public class TickTockMain {
    public static void main(String[] args) {
        TickTock tickTock = new TickTock();
        TickTockThread thread1 = new TickTockThread("Tick", tickTock);
        TickTockThread thread2 = new TickTockThread("Tock", tickTock);
        try {
            thread1.thrd.join();
            thread2.thrd.join();
        }
        catch (InterruptedException e) {
            System.out.println("Прерывание основного потока");
        }
    }
}
