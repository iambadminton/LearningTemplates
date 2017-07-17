package LearnRegex;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by a.shipulin on 17.07.17.
 */
public class SplitOnSubstrings {
    public static void main(String[] args) {
        String string = new String("asd:dfdf; dfdf: erer; 123:345;");
        Pattern pattern = Pattern.compile(":|;");
        String[] words = pattern.split(string);
        Arrays.asList(words).forEach(word -> System.out.print(word + "-") );
    }
}
