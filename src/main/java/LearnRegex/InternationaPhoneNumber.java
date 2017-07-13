package LearnRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by a.shipulin on 13.07.17.
 */
public class InternationaPhoneNumber {
    public static void main(String[] args) {
        List<String>cardNumbers = new ArrayList<String>();
        cardNumbers.add("4124152415651254");
        cardNumbers.add("3714496353984313");
        cardNumbers.add("+123 123456");
        cardNumbers.add("+123 23456");

        String regex = "Regex : ^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|\n" +
                "\t\t(?<mastercard>5[1-5][0-9]{14})|\n" +
                "\t\t(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|\n" +
                "\t\t(?<amex>3[47][0-9]{13})|\n" +
                "\t\t(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11})|\n" +
                "\t\t(?<jcb>(?:2131|1800|35[0-9]{3})[0-9]{11}))$";


//        Pattern pattern = Pattern.compile(regex);
        Pattern pattern = Pattern.compile("(?<visa>(4[0-9]{3})[0-9]{0,9}([0-9]{4}))|"
        + "(?<amex>(3[47][0-9]{2})[0-9]{0,9}([0-9]{4}))");
        for(String card: cardNumbers) {

            Matcher matcher = pattern.matcher(card);
//            System.out.println(card + ":" + matcher.matches());
            if(matcher.matches()) {
                //If card is valid then verify which group it belong
                System.out.println("visa:" + matcher.group("visa"));
                System.out.println("amex:" + matcher.group("amex"));
            }
        }
    }
}
