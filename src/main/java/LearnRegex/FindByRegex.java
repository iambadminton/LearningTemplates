package LearnRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by a.shipulin on 17.07.17.
 */
public class FindByRegex {
    public static void main(String[] args) {
        String string = new String("Дата 22.12.1941 важна для каждого советского гражданина");
        String regex = new String("^(([0-2]?[0-9]|[3]{1}[0,1]{1}).([0]?[0-9]|[1]{1}[0-2]{1}).([0-9]{2})?[0-9]{2})$");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        System.out.println(matcher.find() ? "true" : "false");

        /*
        // IP адрес
        String regexp = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        // для сравнения работы find() и matches()
        String goodIp = "192.168.0.3";
        String badIp = "192.168.0.3g";

        Pattern pattern = Pattern.compile(regexp);

        Matcher matcher = pattern.matcher(goodIp);
        // matches() - true, find() - true
        matcher = pattern.matcher(badIp);
        // matches() - false, find() - true

        // а теперь получим дополнительную информацию
        System.out.println(matcher.find() ?
                "I found '" + matcher.group() + "' starting at index " + matcher.start() + " and ending at index " + matcher.end() + "." :
                "I found nothing!");
        // I found the text '192.168.0.3' starting at index 0 and ending at index 11.
        */
    }
}
