package multithreading.shield;

public class UseThreads2 {
    public static void main(String[] args) {
        System.out.println("запуск основного потока");
        MyThread2 myThread2 = new MyThread2("Child #1");
        for (int q = 0; q < 50; q++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}
