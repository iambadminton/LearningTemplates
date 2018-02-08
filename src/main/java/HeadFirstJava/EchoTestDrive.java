package HeadFirstJava;

/**
 * Created by a.shipulin on 31.10.17.
 */
public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();

        int x = 0;
        while (x < 5) {
            e1.hello();
            if(x>0) {
                e1.count = e1.count + 1;
            }
            if (x>1) {
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}
