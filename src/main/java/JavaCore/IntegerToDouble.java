package JavaCore;

import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class IntegerToDouble {
    public static void main(String[] args) {
        Integer a = 0;
        Double b;
        //b = a.doubleValue()
        BigDecimal c;
        c = BigDecimal.valueOf(0);
        System.out.println(c);
        System.out.println(c.movePointLeft(3).setScale(1, BigDecimal.ROUND_HALF_UP));

        //System.out.println(StringUtils.isNumeric(c));

    }
}
