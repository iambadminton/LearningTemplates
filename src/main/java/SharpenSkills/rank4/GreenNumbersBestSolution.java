package SharpenSkills.rank4;

/**
 https://www.codewars.com/kata/last-digits-of-n-2-equals-equals-n
 */

import java.math.BigInteger;
import java.util.TreeSet;

public class GreenNumbersBestSolution {
    public static BigInteger get(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        }

        TreeSet<BigInteger> treeSet = new TreeSet<>();
        System.out.println("get:: n=" + n);
        addNumber(treeSet, n + n / 5);
        BigInteger[] bigIntegers = treeSet.toArray(new BigInteger[]{});
        return bigIntegers[n - 2];
    }

    public static void addNumber(TreeSet<BigInteger> treeSet, int number) {
        System.out.println("number = " + number);
        int digitNo = 2;
        int counter = 2;
        BigInteger num = new BigInteger("5");
        treeSet.add(num);
        BigInteger num2 = new BigInteger("6");
        treeSet.add(num2);
        while (counter < number) {
            System.out.println("TreeSet=" + treeSet.toString());
            System.out.println("counter=" + counter + " number=" + number);
            BigInteger numSquared = num.multiply(num);
            BigInteger powOfTen = new BigInteger("10").pow(digitNo);
            num = numSquared.mod(powOfTen);
            num2 = powOfTen.add(new BigInteger("1")).subtract(num);
            treeSet.add(num);
            treeSet.add(num2);

            System.out.println("num = " + num.toString() + " num2=" + num2.toString());
            counter += 2;
            digitNo++;
        }
    }

    public static void main(String[] args) {

        System.out.println(GreenNumbersBestSolution.get(100));
    }
}
