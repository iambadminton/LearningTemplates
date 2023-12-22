package JustTest;

import java.util.ArrayList;
import java.util.List;

public class ExampleAnalysis {
    public static List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000_000; i++) {
            stringList.add("String " + i);
        }
    }
}
