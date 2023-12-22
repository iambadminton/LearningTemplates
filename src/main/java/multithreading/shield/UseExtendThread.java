package multithreading.shield;

public class UseExtendThread {
    public static void main(String[] args) {
        System.out.println("запуск основного потока");
        ExtendThread thrd = new ExtendThread("Child #1");
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
