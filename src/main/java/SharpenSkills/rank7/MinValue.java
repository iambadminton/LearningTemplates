package SharpenSkills.rank7;

/**
 * Created by a.shipulin on 02.03.18.
 */
public class MinValue {
    public int getMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }

        }
        return min;
    }
}
