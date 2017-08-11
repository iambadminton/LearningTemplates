package OracleTutorial.DeckOfCards;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by a.shipulin on 11.08.17.
 * Вывести на печать количество дней в каждом месяце для заданного года
 */
public class MonthOfYear {
    public static void main(String[] args) {
        System.out.println("Input the year:");
        Scanner scanner = new Scanner(System.in);
        try {
            int input = scanner.nextInt();
            Year year = Year.of(input);
            for (Month month : Month.values()) {
                YearMonth yearMonth = YearMonth.of(input, month);
                System.out.println("Months: " + month.toString() + " days: " + yearMonth.lengthOfMonth());
            }
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("Неправильный формат числа! Завершаем!");
            return;
        }
        catch (InputMismatchException ex) {
            System.out.println("Это не число! Завершаем!");
            return;
        }

    }
}
