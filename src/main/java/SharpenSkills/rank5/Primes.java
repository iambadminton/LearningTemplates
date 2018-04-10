package SharpenSkills.rank5;

import java.math.BigInteger;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;

/**
 * NOT RESOLVED
 * <p>
 * https://www.codewars.com/kata/5519a584a73e70fa570005f5/train/java
 * Create an endless stream of prime numbers - a bit like IntStream.of(2,3,5,7,11,13,17), but infinite.
 * The stream must be able to produce a million primes in a few seconds.
 * If this is too easy, try Prime Streaming (NC-17).
 * Created by a.shipulin on 10.04.18.
 */
public class Primes {
    public static IntStream stream() {
        /*return IntStream.iterate(2, i -> i + 1).filter(i -> isPrime(i));*/
        return IntStream.iterate(2, i -> nextPrimeNumber(i));
    }

    public static boolean isPrime(long n) {
        BigInteger bi = BigInteger.valueOf(n);
        boolean probablyPrime = bi.isProbablePrime((int) Math.log(n));
        return probablyPrime;
    }


    public static int nextPrimeNumber(int n) {
        long temp = n + 1;
        long next = 0;
        long exit = 0;
        long i = 2;

        while (exit == 0) {
            if (temp % i == 0 && i != temp) {
                temp ++;
                i = 2;
                continue;
            }
            if ((i == temp) || (i > Math.pow(temp, 0.5))) {
                next = temp;
                exit = 1;
            }
            i++;
        }
        return (int) next;

    }


    public static boolean prime(long n) {
        for (long i = 2; i <= Math.pow(n, 0.5); i++)
            if (n % i == 0)
                return false;
        return true;
    }


    /*public static boolean ferma(long n) {
            if(n == 2)
                return true;
            //srand(time(NULL));
            for(int i=0;i<100;i++){
                long a = (long)(Math.random() % (n - 2)) + 2;
                if (gcd(a, n) != 1)
                    return false;
                if( pows(a, n-1, n) != 1)
                    return false;
            }
            return true;
    }

    public static long mul(long a, long b, long m){
        if(b==1)
            return a;
        if(b%2==0){
            long t = mul(a, b/2, m);
            return (2 * t) % m;
        }
        return (mul(a, b-1, m) + a) % m;
    }

    public static long pows(long a, long b, long m){
        if(b==0)
            return 1;
        if(b%2==0){
            long t = pows(a, b/2, m);
            return mul(t , t, m) % m;
        }
        return ( mul(pows(a, b-1, m) , a, m)) % m;
    }



    public static long gcd(long a, long b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }*/


    public static void main(String[] args) {
        /*IntStream.iterate(2, i -> i + 1).filter(i -> prime(i)).forEach(System.out::println);*/
        /*IntStream.iterate(2, i -> i + 1).limit(600).filter(i -> isPrime(i)).forEach(System.out::println);*/
        /*IntStream.iterate(2, i -> nextPrimeNumber(i)).forEach(System.out::println);*/

        //test_0_10();
        //test_10_10();
        //test_100_10();

        LocalTime begin = LocalTime.now();
        //System.out.println(LocalTime.now());
        test_1000_10();
        /*IntStream.iterate(2, i -> nextPrimeNumber(i)).limit(100000).forEach(System.out::println);*/
        System.out.println(begin);
        System.out.println(LocalTime.now());
    }

    // =========================================
    private static void test(int skip, int limit, int... expect) {
        int[] found = Primes.stream().skip(skip).limit(limit).toArray();
        System.out.println(Arrays.toString(found));
        assertArrayEquals(expect, found);
    }


    public static void test_0_10() {
        test(0, 10, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    }

    public static void test_10_10() {
        test(10, 10, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71);
    }

    public static void test_100_10() {
        test(100, 10, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601);
    }

    public static void test_1000_10() {
        test(1000, 10, 7927, 7933, 7937, 7949, 7951, 7963, 7993, 8009, 8011, 8017);
    }
}

