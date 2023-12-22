package udemy_java.collections;

import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class ArrayBlockingQueueMyTest {


    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3, true);

        Thread thread1 = new Thread(new Runnable() {
            // поток-продюссер
            @Override
            public void run() {
                while (true) {
                    try {
                        Integer value = new Random().nextInt(10);
                        queue.put(value);
                        System.out.println("Продюссер добавил число " + value);
                        System.out.println("Количество элементов в очереди: " + queue.size());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            // поток - консюмер
            @Override
            public void run() {
                try {
                    while (true) {
                        Integer value = queue.take();
                        System.out.println("Конс.мер получил число " + value);
                        System.out.println("Количество элементов в очереди:" + queue.size());
                        Thread.sleep(3000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        //thread1.join();
        //thread2.join();

    }
}
