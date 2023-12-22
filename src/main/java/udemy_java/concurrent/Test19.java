package udemy_java.concurrent;

import java.util.Random;
import java.util.concurrent.*;

public class Test19 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
                                   @Override
                                   public Integer call() throws Exception {
                                       System.out.println("Starting");
                                       Thread.sleep(3000);
                                       System.out.println("Finished");
                                       Random random = new Random();


                                       int randomValue =  random.nextInt(10);
                                       if(randomValue < 5) {
                                           throw new Exception("Something bad happened");
                                       }
                                       return randomValue;
                                   }
                               }
        );
        executorService.shutdown();
        try {
            int result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }

    }

    public static int calculate() {
        return 5 + 4;
    }
}
