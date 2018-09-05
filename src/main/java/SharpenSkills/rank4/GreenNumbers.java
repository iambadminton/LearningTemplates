package SharpenSkills.rank4;

import java.math.BigInteger;

/**
 * Created by a.shipulin on 05.07.18.
 */
public class GreenNumbers {

    public static BigInteger get(int n) {
        // Your code here!
        int curr_n = 0;
        BigInteger curr_b;
        int counter = 0;
        while(counter != n) {
            curr_n++;
            curr_b = BigInteger.valueOf(curr_n);
            if((curr_b.pow(2).toString().substring(curr_b.pow(2).toString().length() - curr_b.toString().length()).equals(curr_b.toString())) ) {
                counter++;
                if(counter==n) {
                    return curr_b;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        GreenNumbers numbers = new GreenNumbers();
        System.out.println(numbers.get(100).toString());
    }
}
