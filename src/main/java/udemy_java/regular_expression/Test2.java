package udemy_java.regular_expression;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String a = "Hello12121there343434he454545y";
        String[] words = a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b = "Hello121121212there3434343434hey";
        System.out.println(b.replaceFirst("\\d", "- "));
    }
}
