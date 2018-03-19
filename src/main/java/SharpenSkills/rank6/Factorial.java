package SharpenSkills.rank6;

/**
 * Created by a.shipulin on 19.03.18.
 */
public class Factorial {
    public static int fact(int c) {
        if(c==1) {
            return 1;
        }
        else {
            return c * fact(c - 1);
        }
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.fact(0));
        System.out.println(Integer.MAX_VALUE);
    }
}
