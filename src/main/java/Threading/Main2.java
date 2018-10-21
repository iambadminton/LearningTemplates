package Threading;

import java.util.concurrent.*;

/**
 * Created by Sanya on 15.10.2018.
 */
public class Main2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyRannable());
        System.out.println(executorService.submit(new MyCallable()).get());
        executorService.shutdown();
    }
    static class MyRannable implements Runnable{
        @Override
        public void run() {
            System.out.println(1);
        }
    }

    static class MyCallable implements Callable {
        @Override
        public Object call() throws Exception {
            return "2";
        }
    }

}
