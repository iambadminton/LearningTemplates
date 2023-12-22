package pooling;

public class JavarushIntegerPoolingTest {
    public static void main(String[] args) {
        Integer n1 = 1234;
        Integer n2 = 1234;
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
        System.out.println();

        Integer n3 = 123;
        Integer n4 = 123;
        System.out.println(n3 == n4);
        System.out.println(n3.equals(n4));
        System.out.println();

        Integer n5 = 123;
        Integer n6 = new Integer(123);
        System.out.println(n5 == n6);
        System.out.println(n5.equals(n6));
    }
}
