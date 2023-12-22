package JustTest;


import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class TestSimpleFormat {
    public static void main(String[] args) throws Exception {
        // displaying current date and time
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MM/yyyy hh:mm:s");
        System.out.println("Today's date = " + simpleformat.format(cal.getTime()));
        // current time
        Format f = new SimpleDateFormat("HH.mm.ss");
        String strResult = f.format(new Date());
        System.out.println("Time = " + strResult);
        // displaying hour
        f = new SimpleDateFormat("H");
        String strHour = f.format(new Date());
        System.out.println("Current Hour = " + strHour);
        // displaying minutes
        f = new SimpleDateFormat("mm");
        String strMinute = f.format(new Date());
        System.out.println("Current Minutes = " + strMinute);
        // displaying seconds
        f = new SimpleDateFormat("ss");
        String strSeconds = f.format(new Date());
        System.out.println("Current Seconds = " + strSeconds);


        System.out.println(new Date().getTime());
    }
}
