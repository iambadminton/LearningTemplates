package SharpenSkills;

/**
 * Created by a.shipulin on 01.03.18.
 */
public class Chocolate {
    public static int breakChocolate(int n, int m) {
        if (n <= 0 || m <= 0 ) return -1;
        else {
            if (n == 1 && m == 1) {
                return 0;
            } else {
                return n * m - 1;
            }
        }
    }

    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate();
        System.out.print(chocolate.breakChocolate(1, 1));
    }
}
