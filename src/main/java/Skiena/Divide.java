package Skiena;

/**
 * Created by a.shipulin on 24.01.18.
 */
public class Divide {
    public static void main(String[] args) {
        Divide divide = new Divide();

    }

    public Divide() {
        int a=135;
        int b=9;
        System.out.println(division(a,b));
    }

    public static int division(int dividend, int divisor) {
        int quotient = 1;
        int remainder;
        if(divisor == dividend) {
            remainder = 0;
            return 1;

        }
        else{
            if(dividend < divisor)
         {
                remainder = dividend;
                return 0;
            }}

        /*do {
            System.out.println("divisor=" + divisor);
            divisor = divisor << 1;
            quotient = quotient << 1;
            System.out.println("divisor=" + divisor);
            System.out.println("----------");
        }

        while (divisor <= dividend);*/
        quotient = quotient + division(dividend - divisor, divisor);
        return  quotient;
    }
}
