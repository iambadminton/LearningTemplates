package udemy_java.collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Test98 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

        new Thread() {
            @Override
            public void run() {
                try {
                    Integer value = queue.take();
                    System.out.println("Consumer takes value:" + value);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    int value = new Random().nextInt(10);
                    queue.add(value);
                    System.out.println("Producer added new value: " + value);

                }

            }
        }.start();
    }


}
