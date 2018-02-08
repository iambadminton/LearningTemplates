package HeadFirstJava;

import java.util.Calendar;

/**
 * Created by a.shipulin on 21.11.17.
 */
public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.toString());
        calendar.set(2004, 0, 7, 15, 40);
        System.out.println(calendar.toString());
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(2));
        calendar.set(calendar.DATE, 35);
        System.out.println(calendar.toString());
    }
}
