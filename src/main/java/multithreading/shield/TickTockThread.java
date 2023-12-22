package multithreading.shield;

public class TickTockThread implements Runnable {
    Thread thrd;
    TickTock ttObj;

    public TickTockThread(String name, TickTock ttObj) {
        thrd = new Thread(this, name);
        this.ttObj = ttObj;
        thrd.start();
    }

    @Override
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) ttObj.tick(true);
            ttObj.tick(false);
        } else {
            for (int i = 0; i < 5; i++) ttObj.tock(true);
            ttObj.tock(false);
        }
    }
}
