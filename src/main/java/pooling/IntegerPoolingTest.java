package pooling;

public class IntegerPoolingTest {
    public static void main(String[] args) {
        Integer x = 120;
        Integer y = 120;

        int a = 400;
        int b = 400;
        System.out.println("a == b: " + (a == b));
        System.out.println("x == y: " + (x == y));
        System.out.println("x.equals(y) = " + (x.equals(y)));

    }
}
