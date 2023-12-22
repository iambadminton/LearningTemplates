package Streamapi;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletableFutureExample2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {

                throw new IllegalStateException(e);
            }
            return "Alexander";

        });

        CompletableFuture<Void> greetingFuture = future.thenApply(name -> {
            return("Привет, " + name);
        }).thenAccept(greeting -> {
            System.out.println(greeting.toString());
        });

        greetingFuture.get();



    }




}
