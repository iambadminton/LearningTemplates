package RetraTech;

/**
 * Created by a.shipulin on 27.09.17.
 */
public class A {
    public static void main(String[] args) {
        System.out.println(check(1));
        System.out.println(check(2));
        System.out.println(check(3));
        System.out.println(check(4));

    }

    private static String check(int x) {
        if (x < 3) {
            x--;
        }
        switch (x) {
            case 1:
                return "one";
            case 2:
                x = 3;
            case 3:
                break;
            case 4:
            default:
                return "x";

        }
        return "Result " + x;
    }
}
