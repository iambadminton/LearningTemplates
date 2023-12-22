package telegram_java_learning;

public class Test4 {

    static int a = 1111;
    static {
        a = a-- - --a;
    }
    {
        a = a++ + ++a;
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
