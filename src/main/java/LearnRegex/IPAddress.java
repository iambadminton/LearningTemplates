package LearnRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by a.shipulin on 13.07.17.
 */
public class IPAddress {
    public static void main(String[] args) {
        List<String> ipAddresses = new ArrayList<String>();
        ipAddresses.add("192.16.8.5");
        ipAddresses.add("0.0.0.0");
        ipAddresses.add("256.256.256.256");
        ipAddresses.add("01.001.001.001");

        String regex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        Pattern pattern = Pattern.compile(regex);
        for (String email : ipAddresses) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + ":" + matcher.matches());
        }
    }
}
