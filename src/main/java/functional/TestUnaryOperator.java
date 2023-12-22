package functional;

import java.util.function.UnaryOperator;

public class TestUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> op = x -> x ^ 1;
        System.out.println(op.apply(2));
    }
}
