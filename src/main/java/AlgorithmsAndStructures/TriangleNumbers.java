package AlgorithmsAndStructures;

/**
 * Created by a.shipulin on 10.04.17.
 */
public class TriangleNumbers {


    public static void main(String[] args) {
        TriangleNumbers tn = new TriangleNumbers();

        System.out.println(tn.calc(3));
    }

    public int calc(int n) {
        int total = 0;
        int i = n;

        if(n==1) {
            return 1;
        }
        else {
            return n + calc(n-1);
        }


    }
}
