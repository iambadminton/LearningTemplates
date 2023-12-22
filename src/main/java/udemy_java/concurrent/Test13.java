package udemy_java.concurrent;

import java.sql.SQLOutput;
import java.util.concurrent.*;

public class Test13 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future future = service.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return "thread was executed";
            }
        });
        System.out.println("Начало выполнения");
        System.out.println(future.get());
        System.out.println("Конец выполнения");
        service.shutdown();
    }
}

