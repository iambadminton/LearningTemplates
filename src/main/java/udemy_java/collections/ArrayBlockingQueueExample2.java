package udemy_java.collections;

import LearnJavaMail.BufferedReaderExample;


import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrayBlockingQueueExample2 {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            Buffer buffer = new Buffer();
            executorService = Executors.newFixedThreadPool(2);
            executorService.execute(new Producer(buffer));
            executorService.execute(new Consumer(buffer));
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(true) {
            try {
                buffer.get();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(true) {
            Random random = new Random();
            int data = random.nextInt(1000);
            buffer.put(data);
        }
    }


}

class Buffer {
    private BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(1);

    public void get() {
        try {
            System.out.println("Consumer received - " + blockingQueue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void put(int data) {
        try {
            blockingQueue.put(data);
            System.out.println("Producer produced - " + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}