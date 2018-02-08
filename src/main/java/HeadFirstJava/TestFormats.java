package HeadFirstJava;

import java.util.Date;

/**
 * Created by a.shipulin on 20.11.17.
 */
public class TestFormats {
    public static void main(String[] args) {
        /*String s = String.format("Мне нужно исправить %f ошибки и еще %S и еще %f  и еще %d", 42.0, "ddd", 45.0, 45 );
        System.out.println(s);*/
        Date today = new Date();
        System.out.println(today);

        System.out.println(String.format("%tA, %<tB, %<td", today));
    }
}
