package multithreading.asynchronous;

import com.google.common.util.concurrent.ForwardingExecutorService;
import javarevisited.vendingmachine.SoldOutException;

import java.math.BigInteger;
import java.util.concurrent.*;

public class AsyncTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        System.out.println(System.currentTimeMillis());
        Future futureTask = executorService.submit(getFactorial(20));
        StringBuilder progress = new StringBuilder("");
//        while (!futureTask.isDone()) {
//            progress = progress.append("*");
//            System.out.println(progress);
//        }
        System.out.println("Result is:" + futureTask.get());
        System.out.println(System.currentTimeMillis());
        //executorService.shutdown();

    }

    public static Callable getFactorial(int number) {
        Callable<String> callable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello Thread " + threadName);
            BigInteger fact = new BigInteger("1");
            for(int i = 1; i < number; i++){
                //fact = fact * i;
                fact = fact.multiply(new BigInteger(String.valueOf(i)));
            }

            return "For thread " + threadName + " factorial is " + fact;
        };
        return callable;
    }
}
