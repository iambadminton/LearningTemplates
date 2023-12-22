package Streamapi;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try{
                    TimeUnit.SECONDS.sleep(5);
                }
                catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                System.out.println("Я буду работать в отдельном потоке, а не в главном");

            }
        });
        future.get();
        System.out.println("А я работаю в этом потоке");
    }
}
