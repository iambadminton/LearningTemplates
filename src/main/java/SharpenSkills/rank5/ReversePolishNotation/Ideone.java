package SharpenSkills.rank5.ReversePolishNotation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

/**
 * Created by a.shipulin on 12.04.18.
 */
class Ideone {
    public static Double calc(List<String> postfix) {
        Deque<Double> stack = new ArrayDeque<Double>();
        for (String x : postfix) {

            System.out.println("calc:: x= " + x);

            if (x.equals("sqrt")) {
                System.out.println("area sqrt");
                stack.push(Math.sqrt(stack.pop()));
            } else if (x.equals("cube")) {
                System.out.println("area cube");
                Double tmp = stack.pop();
                stack.push(tmp * tmp * tmp);
            } else if (x.equals("pow10")) {
                System.out.println("area pow10");
                stack.push(Math.pow(10, stack.pop()));
            } else if (x.equals("+")) {
                System.out.println("area_plus");
                stack.push(stack.pop() + stack.pop());
            } else if (x.equals("-")) {
                System.out.println("area_minus");
                Double b = stack.pop(), a = stack.pop();
                System.out.println("b=" + b + " a=" + a);
                stack.push(a - b);
            } else if (x.equals("*")) {
                System.out.println("area_multiple");
                Double b = stack.pop(), a = stack.pop();
                System.out.println("b=" + b + " a=" + a);

                stack.push(a * b);

            } else if (x.equals("/")) {
                System.out.println("area_divide");
                Double b = stack.pop(), a = stack.pop();
                System.out.println("b=" + b + " a=" + a);
                stack.push(a / b);
            } else if (x.equals("u-")) {
                System.out.println("area_u-");
                stack.push(-stack.pop());
            } else {
                System.out.println("area_double_valueof");
                stack.push(Double.valueOf(x));
            }
        }

        System.out.println("---------- CALC STACK: -->");
        for (Double curr : stack) {
            System.out.println(curr);
        }
        System.out.println(" <--");

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        ExpressionParser n = new ExpressionParser();
        List<String> expression = n.parse(s);
        boolean flag = n.flag;
        if (flag) {
            for (String x : expression) System.out.print(x + " ");
            System.out.println();
            System.out.println(calc(expression));
        }

        /*System.out.println("------------------");
        System.out.println("вычисление моего постфикскного выражения: 4 4 + 4 / 5 +");
        ArrayList<String> myPostfix = new ArrayList<String>();
        myPostfix.add("4");
        myPostfix.add("4");
        myPostfix.add("+");
        myPostfix.add("4");
        myPostfix.add("/");
        myPostfix.add("5");
        myPostfix.add("+");
        System.out.println(calc(myPostfix));*/
    }
}
