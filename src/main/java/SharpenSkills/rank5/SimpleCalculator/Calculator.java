package SharpenSkills.rank5.SimpleCalculator;

import java.util.ArrayList;

/**
 * см. реализацию тут http://java.mazurok.com/?p=454

 Сreate a simple calculator that given a string of operators (+ - * and /) and numbers separated by spaces returns
 the value of that expression

 Example:

 Calculator.evaluate("2 / 2 + 3 * 4 - 6") // => 7
 Remember about the order of operations! Multiplications and divisions have a higher priority and should be performed
 left-to-right. Additions and subtractions have a lower priority and should also be performed left-to-right.
 */
public class Calculator {
    public static Double evaluate(String expression) {
        // your code here
        String operands[] = expression.split(" ");
        ArrayList<String> out = new ArrayList<>();
        for(int i=0; i < operands.length; i++) {
            System.out.println(operands[i]);
        }
        return -1.0;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.evaluate("2 + 2 * 3 - 32");
    }
}
