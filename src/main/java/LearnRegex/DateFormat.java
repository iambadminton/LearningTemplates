package LearnRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by a.shipulin on 17.07.17.
 */
public class DateFormat {
    public static void main(String[] args) {
        List<String> dates = new ArrayList<String>();
        dates.add("32.02.2017");
        dates.add("01.01.2017");
        dates.add("03.12.2017");
        dates.add("01.01.01.2001");
        dates.add("03.13.2017");
        dates.add("03.12.17");
        dates.add("3.12.17");
        dates.add("22.13.1941");


        String regex = new String("^([0-2]?[0-9]|[3]{1}[0,1]{1}).([0]?[0-9]|[1]{1}[0-2]{1}).([0-9]{2})?[0-9]{2}$");

        Pattern pattern = Pattern.compile(regex);
        for(String date: dates) {
            Matcher matcher = pattern.matcher(date);
            System.out.println(date + " " + matcher.matches());
        }
    }
}
