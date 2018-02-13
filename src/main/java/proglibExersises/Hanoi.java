package proglibExersises;

/**
 * Created by Sanya on 12.02.2018.
 * Пример написания кода для Ханойской башни
 * код взят с https://proglib.io/p/program-code/
 *
 */
public class Hanoi {
    public static void main(String[] args) {
        Hanoi han = new Hanoi();
        han.hanoi(10, "ddd", "ff", "c");
    }

    public static void hanoi(int n, String a, String b, String c){
        if (n == 1) System.out.println("#" + n + " " + a + " -> " + c);
        else {
            hanoi(n - 1, a, c, b);
            System.out.println("#" + n + " " + a + " -> " + c);
            hanoi(n - 1, b, a, c);
        }
    }
}
