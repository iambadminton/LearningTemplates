package SharpenSkills.rank4;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/55983863da40caa2c900004e/train/java
 * You have to create a function that takes a positive integer number and returns the next bigger number formed by the
 * same digits:
 * Kata.nextBiggerNumber(12)==21
 * Kata.nextBiggerNumber(513)==531
 * Kata.nextBiggerNumber(2017)==2071
 * If no bigger number can be composed using those digits, return -1:
 * <p>
 * Kata.nextBiggerNumber(9)==-1
 * Kata.nextBiggerNumber(111)==-1
 * Kata.nextBiggerNumber(531)==-1
 */
public class Kata {
    public static long nextBiggerNumber(long n) {
        char tmp;
        int count = 0;
        int nIndex = 0;
        char[] digits = String.valueOf(n).toCharArray();
        //System.out.println(String.valueOf(digits));
        // отсортируем методом пузырька
        for (int i = 0; i < digits.length; i++) {
            for (int j = digits.length - 1; j >= i + 1; j--)
                if (digits[j] > digits[j - 1]) {
                    tmp = digits[j - 1];
                    digits[j - 1] = digits[j];
                    digits[j] = tmp;
                    count++;
                    nIndex = j;
                    //return Long.parseLong(String.valueOf(digits));
                    //System.out.println("count=" + count + " digits=" + Long.parseLong(String.valueOf(digits)));
                    System.out.println("nIndex=" + nIndex);
                    Arrays.sort(digits, nIndex, digits.length-1);
                    return Long.parseLong(String.valueOf(digits));

                }
        }



        //System.out.println(String.valueOf(digits));

        if (Long.parseLong(String.valueOf(digits)) == Long.valueOf(n)) {
            //System.out.println("YES!!!");
            return -1;
        } else {
            Arrays.sort(digits, nIndex, digits.length-1);
            return Long.parseLong(String.valueOf(digits));
        }


}

    public static void main(String[] args) {
        System.out.println(Kata.nextBiggerNumber(1234567890));
    }
}