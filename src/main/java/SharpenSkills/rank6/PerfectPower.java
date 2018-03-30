package SharpenSkills.rank6;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/54d4c8b08776e4ad92000835/train/java
 * A perfect power is a classification of positive integers:
 * <p>
 * In mathematics, a perfect power is a positive integer that can be expressed as an integer power of another positive
 * integer. More formally, n is a perfect power if there exist natural numbers m > 1, and k > 1 such that mk = n.
 * Your task is to check wheter a given integer is a perfect power. If it is a perfect power, return a pair m and k with
 * m^k = n as a proof. Otherwise return Nothing, Nil, null, NULL, None or your language's equivalent.
 * <p>
 * Note: For a perfect power, there might be several pairs. For example 81 = 3^4 = 9^2, so (3,4) and (9,2) are valid
 * solutions. However, the tests take care of this, so if a number is a perfect power, return any pair that proves it.
 * <p>
 * Examples
 * <p>
 * isPerfectPower(4) => new int[]{2,2}
 * isPerfectPower(5) => null
 * isPerfectPower(8) => new int[]{2,3}
 * isPerfectPower(9) => new int[]{3,2}
 */
public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        int k = 2;
        double m = -1;
        boolean isPerfectP = false;
        if(n==0) {
            return null;
        }
        while (isPerfectP == false && m <= n && m!= 0 && k!= n) {
            m = Math.log10(n) / Math.log10(k);

            System.out.println(m + "  k=" + k);
            if ((m % 1 == 0 && m!= 0 && m!= 1) || (Math.pow(k, Math.round(m)) == n && m!=0)) {
                isPerfectP = true;
                return new int[]{k, (int)Math.round(m)};
            }
            k++;

        }

        return null;


    }

    public static void main(String[] args) {
        PerfectPower power = new PerfectPower();
        System.out.println(Arrays.toString(power.isPerfectPower(3124)));
    }
}
