package multithreading.mkyong.executorservice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;



public class TaskLimitSemaphore {
    private final ExecutorService executor;
    private final Semaphore semaphore;

    public TaskLimitSemaphore(ExecutorService executor, int limit) {
        this.executor = executor;
        this.semaphore = new Semaphore(limit);
    }

    public <T> Future<T> submit(final Callable<T> task) throws InterruptedException {
        semaphore.acquire();
        System.out.println("semaphore.acquire()...");
        return executor.submit(() -> {
            try {
                return task.call();
            } finally {
                semaphore.release();
                System.out.println("semaphore.release()...");
            }
        });
    }

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        //only 2 task are able to run concurrently
        TaskLimitSemaphore obj = new TaskLimitSemaphore(executorService, 2);
        obj.submit(() -> {
            System.out.println(getCurrentDateTime() + ": task1 is running!");
            Thread.sleep(2000);
            System.out.println(getCurrentDateTime() + ": task1 is done!");
            return 1;
        });

        obj.submit(() -> {
            System.out.println(getCurrentDateTime() + ": task2 is running!");
            Thread.sleep(2000);
            System.out.println(getCurrentDateTime() + ": task2 is done!");
            return 2;
        });

        obj.submit(() -> {
            System.out.println(getCurrentDateTime() + ": task3 is running!");
            Thread.sleep(2000);
            System.out.println(getCurrentDateTime() + ": task3 is done!");
            return 3;
        });

        obj.submit(() -> {
            System.out.println(getCurrentDateTime() + ": task4 is running!");
            Thread.sleep(2000);
            System.out.println(getCurrentDateTime() + ": task4 is done!");
            return 4;
        });

        obj.submit(() -> {
            System.out.println(getCurrentDateTime() + ": task5 is running!");
            Thread.sleep(2000);
            System.out.println(getCurrentDateTime() + ": task5 is done!");
            return 5;
        });

        executorService.shutdown();
    }

    private static String getCurrentDateTime() {
        return sdf.format(new Date());
    }

}
