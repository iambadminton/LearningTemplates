package SharpenSkills.rank5;

import java.util.*;

/**
 * https://www.codewars.com/kata/calculator/train/java
 * <p>
 * см. реализацию тут http://java.mazurok.com/?p=454
 * <p>
 * Сreate a simple calculator that given a string of operators (+ - * and /) and numbers separated by spaces returns
 * the value of that expression
 * <p>
 * Example:
 * <p>
 * Calculator.evaluate("2 / 2 + 3 * 4 - 6") // => 7
 * Remember about the order of operations! Multiplications and divisions have a higher priority and should be performed
 * left-to-right. Additions and subtractions have a lower priority and should also be performed left-to-right.
 */

/*Решение: сначала переданное выражение раскладываем в обратную польскую нотацию, а дальше, проходя по получившемуся
 результату делаем свертку с необходимым вычислением*/

public class Calculator {
    private static String operators = "+-*/";
    private static String delimiters = " " + operators;

    private static int priority(String str) {
        if (str.equalsIgnoreCase("+") || str.equalsIgnoreCase("-")) {
            return 1;
        } else if (str.equalsIgnoreCase("*") || str.equalsIgnoreCase("/")) {
            return 2;
        }
        return 3;
    }

    public static Double evaluate(String expression) {

        return calc(parse(expression));
    }

    public static List<String> parse(String expression) {
        String operands[] = expression.split(" ");
        ArrayList<String> out = new ArrayList<>();
        Deque<String> stack = new ArrayDeque<>();
        String curr = "";

        StringTokenizer tokenizer = new StringTokenizer(expression, delimiters, true);
        while (tokenizer.hasMoreElements()) {
            curr = tokenizer.nextToken();
            if (curr.equalsIgnoreCase(" ") == true) {
                continue;
            }
            if (operators.indexOf(curr) != -1) {
                while (!stack.isEmpty() && (priority(curr) <= priority(stack.peek()))) {
                    out.add(stack.pop());
                }
                stack.push(curr);
            } else {
                out.add(curr);
            }
        }
        while (!stack.isEmpty()) {
            out.add(stack.pop());
        }

        return out;
    }


    public static Double calc(List<String> postfix) {
        Deque<Double> stack = new ArrayDeque<Double>();
        for (String curr : postfix) {
            if (curr.equalsIgnoreCase("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (curr.equalsIgnoreCase("-")) {
                Double b = stack.pop();
                Double a = stack.pop();
                stack.push(a - b);
            } else if (curr.equalsIgnoreCase("*")) {
                stack.push(stack.pop() * stack.pop());

            } else if (curr.equalsIgnoreCase("/")) {
                Double b = stack.pop();
                Double a = stack.pop();
                stack.push(a / b);

            } else {
                stack.push(Double.valueOf(curr));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        /*calculator.evaluate("2 +  2 * 3 - 32");

        System.out.println(calculator.calc(new ArrayList(Arrays.asList("2 2 + 4 / 5 +".split(" ")))));*/

        for (String str : parse("2 - 3 - 4")) {
            System.out.print(" " + str);
        }

        System.out.println("           ");
        System.out.println(calculator.calc(parse("2 - 3 - 4")));
    }
}
