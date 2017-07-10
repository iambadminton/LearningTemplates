import java.util.Arrays;

public class test2 {
    public static void main(String [] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6};

        moveRight(a, 2);
        System.out.println(Arrays.toString(a));

        a = new int[]{0, 1, 2, 3, 4, 5, 6};

        moveLeft(a, 2);
        System.out.println(Arrays.toString(a));
    }

    public static void moveRight(int[] array, int positions) {
        int size = array.length;

        for (int i = 0; i < positions; i++) {
            int temp = array[size - 1];

            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j-1];
            }

            array[0] = temp;
        }
    }

    public static void moveLeft(int[] array, int positions) {
        int size = array.length;

        for (int i = 0; i < positions; i++) {
            int temp = array[0];

            for (int j = 0; j < size-1; j++) {
                array[j] = array[j+1];
            }

            array[size-1] = temp;
        }
    }
}