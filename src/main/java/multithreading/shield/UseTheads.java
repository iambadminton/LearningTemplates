package multithreading.shield;

public class UseTheads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");
        MyThread myThread1 = new MyThread("Child #1");
        Thread newThread = new Thread(myThread1);
        newThread.start();

        for (int i = 0; i < 30; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println("Прерывание основного потока");
            }
        }

        System.out.println("Завершение основного потока");
    }
}
