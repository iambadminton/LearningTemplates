package LearnRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by a.shipulin on 13.07.17.
 */
public class CreditCardNumber {
    public static void main(String[] args) {
        List<String> cardNumbers = new ArrayList<String>();
        cardNumbers.add("+1 1234567890123");
        cardNumbers.add("+12 123456789");
        cardNumbers.add("+123 123456");
        cardNumbers.add("+123 23456");

        String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
        Pattern pattern = Pattern.compile(regex);
        for (String email : cardNumbers) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + ":" + matcher.matches());
        }
    }

}
