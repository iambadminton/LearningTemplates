package testmemory;

public class DeadLock {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r0 = new Resource();

        Thread myTh1 = new LockThread1(r1 , r0);
        Thread myTh0 = new LockThread2(r1, r0);

        myTh1.setName("Deadlock-1");
        myTh0.setName("Deadlock-2");
        myTh1.start();
        myTh0.start();
    }
}

class Resource {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

class LockThread1 extends Thread {
    private Resource r1, r2;

    public LockThread1(Resource r1, Resource r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void run() {
        int j = 0;
        while (true) {
            synchronized (r1) {
                System.out.println("The first thread got r1's lock " + j);
                synchronized (r2) {
                    System.out.println("The first thread got r2's lock " + j);
                }
            }
            j++;
        }
    }
}

class LockThread2 extends Thread {
    private Resource r1, r2;

    public LockThread2(Resource r1, Resource r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void run() {
        int j = 0;
        while (true) {
            synchronized (r2) {
                System.out.println("The second thread got r2's lock "+ j);
                synchronized (r1) {
                    System.out.println("The second thread got r1'a lock " + j);
                }
            }
            j++;
        }
    }
}
