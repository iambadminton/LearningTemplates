package grokaem;

public class RecursionCountDown {
    public static void main(String[] args) {
        RecursionCountDown countDown = new RecursionCountDown();
        countDown.start(10);
    }

    private void start(int value) {
        System.out.println(value);
        value = value - 1;
        if(value == 0) {
            return;
        }
        start(value);
    }
}
