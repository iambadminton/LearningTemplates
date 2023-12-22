package JustTest;

import java.math.BigDecimal;

public class NumberComparison {
    public static void main(String[] args) {
        BigDecimal decimal = new
                BigDecimal("0.58499999999999996447286321199499070644378662109375");
        BigDecimal decimal2 = new
                BigDecimal("0.58499999999999996447286321199499070644378662109374");

        System.out.println(decimal.compareTo(decimal2));

        Double x = 0.58499999999999996447286321199499070644378662109375;
        Double y = 0.58499999999999996447286321199499070644378662109374;

        System.out.println(x > y);
    }
}
