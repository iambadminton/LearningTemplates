package ThinkingInJava.AboutException;

/**
 * Created by Sanya on 24.09.2018.
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("from f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
