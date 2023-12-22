package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future future = service.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Another thread was executed");
            }
        });
        service.shutdown();
    }
}
