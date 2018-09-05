package JavaCore;

/**
 * Created by a.shipulin on 04.09.18.
 */
public class ThrowMyExceptionClass {
    public static void main(String[] args) throws MyException {
        int result = 0;
        try {
            result = getAreaValue(-1, 100);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int getAreaValue(int x, int y) {
        if(x <0 || y < 0) {
            throw new IllegalArgumentException("calur ");
        }
        return 0;
    }
}
