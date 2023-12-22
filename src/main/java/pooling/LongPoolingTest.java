package pooling;

public class LongPoolingTest {
    public static void main(String[] args) {
        Long a = 1l;
        Long b = 1l;
        Long c = new Long(1);


        long x = 1l;
        long y = 1l;

        System.out.println("a == b:" + (a == b) );
        System.out.println("a == c:" + (a == c) );

        System.out.println("x == y:" + (x == y) );
    }
}
