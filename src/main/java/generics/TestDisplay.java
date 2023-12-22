package generics;

public class TestDisplay {
    public static void main(String[] args) {
        Display<Integer> intValue = new Display<>(0);
        Display<String> strValue = new Display<>("dddddd");
        intValue.show();
        strValue.show();

    }
}
