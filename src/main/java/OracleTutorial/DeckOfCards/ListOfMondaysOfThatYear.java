package OracleTutorial.DeckOfCards;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 * Created by a.shipulin on 11.08.17.
 * Вычисляем первый понедельник по введенному году. Месяц берем из текущей даты.
 */
public class ListOfMondaysOfThatYear {
    public static void main(String[] args) {
        System.out.println("Введите год:");
        Scanner scanner = new Scanner(System.in);
        try {
            int input = scanner.nextInt();
            LocalDate localDate = LocalDate.now();
            Month month = localDate.getMonth();
            YearMonth yearMonth = YearMonth.of(input,month);
            System.out.println(yearMonth.atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
        }
        catch (Exception e) {
            System.out.println("Вы ввели неправильный год! Завершаем! ");
            return;

        }
    }
}
