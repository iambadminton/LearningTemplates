package OracleTutorial.DeckOfCards;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Created by a.shipulin on 11.08.17.
 */
public class DateFirstClass {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today.toString());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.toString());

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime.toString());

        Period period = Period.ofDays(5);
        System.out.println(period.toString());

        Period period1 = Period.ofYears(10);
        System.out.println(period1.toString());

        Duration  duration = Duration.ofDays(5);
        System.out.println(duration.toString());

        Duration duration1 = Duration.ofMinutes(1440);
        System.out.println(duration1.toString());

        DayOfWeek dayOfWeek = DayOfWeek.MONDAY.plus(3);
        Locale locale = Locale.getDefault();
        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dayOfWeek.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, locale));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        Instant instant = Instant.now();
        System.out.println(instant.toString());

        System.out.println("==========================");

        String in = new String("19590709");
        String in2 = new String("01.01.2017");
        LocalDate localDate = LocalDate.parse(in, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(localDate.toString());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD.MM.yyyy");
        LocalDate localDate1 = LocalDate.parse(in2,formatter);
        System.out.println(localDate1.toString());

        LocalDate localDate2 = LocalDate.of(2017, Month.AUGUST, 1);
        System.out.println(localDate2.toString());

        System.out.println("**************************");
        LocalDate date = LocalDate.now();

//        System.out.printf("The previous Thursday is: %s%n",
                // date.with(TemporalAdjuster.previous(DayOfWeek.THURSDAY)));






    }
}
