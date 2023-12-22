package Streamapi;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        int result = IntStream.range(0,8).parallel().peek(it -> System.out.printf("Thread [%s] peek: %d\n", Thread.currentThread().getName(), it)).sum();
        System.out.println("sum: " + result);

    }
}
