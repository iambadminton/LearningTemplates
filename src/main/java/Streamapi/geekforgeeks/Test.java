package Streamapi.geekforgeeks;

public class Test {
    public static void main(String[] args) {
        int a = 5;
        Square s = (int x) -> x * x;

        int answer = s.calculate(a);
        System.out.println("answer = " + answer);
    }
}
