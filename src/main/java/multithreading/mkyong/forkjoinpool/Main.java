package multithreading.mkyong.forkjoinpool;

public class Main {
    public static void main(String[] args) {
        long startMillis = System.currentTimeMillis();
        System.out.println(ForkJoinAdd.startForkJoinSum(1_000_000));
        long endMillis = System.currentTimeMillis();
        System.out.println("Время расчета: " + (endMillis - startMillis));
    }
}
