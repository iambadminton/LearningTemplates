package SharpenSkills.rank4;

/**
 * Created by a.shipulin on 05.07.18.
 */
import java.math.*;

public class BigIntegerDemo {

    public static void main(String[] args) {

        // create 2 BigInteger objects
        BigInteger bi1, bi2;

        // create and assign value to exponent
        int exponent = 2;

        // assign value to bi1
        bi1 = new BigInteger("6");

        // perform pow operation on bi1 using exponent
        bi2 = bi1.pow(exponent);

        String str = "Result is " + bi1 + "^" +exponent+ " = " +bi2;

        // print bi2 value
        System.out.println( str );
    }
}