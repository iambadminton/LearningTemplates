package telegram_java_learning;

import java.util.concurrent.atomic.AtomicReference;

public class TestThread {
    private static String message = "hello";
    private static AtomicReference<String> atomicReference;

    public static void main(final String[] arguments) throws InterruptedException {
        atomicReference = new AtomicReference<>(message);

        new Thread("Thread 1") {
            @Override
            public void run() {
                atomicReference.compareAndSet(message, "Thread 1");
                message = message.concat("-Thread 1");
            }

            ;
        }.start();

        System.out.println("message = " + message);
        System.out.println("Atomic Reference of Message is: " + atomicReference.get());
    }
}
