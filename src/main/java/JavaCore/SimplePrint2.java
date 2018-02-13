package JavaCore;

/**
 * Created by a.shipulin on 24.11.16.
 */
public class SimplePrint2 {
    public static void main(String[] args) {
        final IPrinter sp = new IPrinter() {
            public void print() {
                System.out.println("SimplePrint2");
            }
        };
    }
}
