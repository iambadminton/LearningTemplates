package Javarush.level3;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by a.shipulin on 16.11.16.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Date date = new Date();
        /*System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);*/

        date.setYear(date.getYear() + 10*100 + 1900);
        System.out.println(date.getYear());
    }
}
