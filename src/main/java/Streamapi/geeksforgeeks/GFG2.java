package Streamapi.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Test {
    String print(String str) {
        System.out.println("Hello " + str + "\n");
        return ("Hello " + str + "\n");

    }
}

public class GFG2 extends Test {
   /* @Override
    String print(String str) {
        Function<String, String> func = super::print;

        String newValue = func.apply(str);
        newValue = "Bye " + str + "\n";
        System.out.println(newValue);
        return newValue;

    }*/

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");
        list.forEach(new GFG2()::print);
    }
}
