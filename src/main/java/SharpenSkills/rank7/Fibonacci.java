package SharpenSkills.rank7;

/**
 * Created by a.shipulin on 14.03.18.
 */
public class Fibonacci {

    public int getFib(int f) {
        if(f == 0 ) {
            return 0;
        }
        else {
            if(f==1) {
                return 1;
            }
            else {
                return getFib(f-1) + getFib(f-2);
            }
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.getFib(11));
        System.gc();
        System.out.println(fibonacci.getFib(11));
    }
}
