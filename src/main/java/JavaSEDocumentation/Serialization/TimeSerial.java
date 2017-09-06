package JavaSEDocumentation.Serialization;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by a.shipulin on 06.09.17.
 */
public class TimeSerial implements Serializable {
    private final static String fileName = "time.ser";
    Calendar calendar;

    public static void main(String[] args) {
        this.calendar = Calendar.getInstance();
        System.out.println(this.calendar.getTime());
    }

}
