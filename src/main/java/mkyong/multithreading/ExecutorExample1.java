package mkyong.multithreading;

import java.util.concurrent.*;

public class ExecutorExample1 {
    public ExecutorExample1() {
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        //Runnable, return void< nothing, submit and run the task async
        executor.submit(() -> System.out.println("I'm Runnable task"));

        // Callable, return a future, submit and run the task async
        Future<Integer> futureTask1 = executor.submit(() -> {
            System.out.println("I'm Callable task.");
            return 1+1;
        });

        try {
            otherTask("Before Future Result");

            Integer result = futureTask1.get(5, TimeUnit.SECONDS);
            System.out.println("Get future result: " + result);
            otherTask("After Future Result");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

    private static void otherTask(String name) {
        System.out.println("I'm other task! " + name);
    }
}
