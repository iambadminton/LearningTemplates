package telegram_java_learning;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("original array = " + Arrays.toString(arr));
        Arrays.fill(arr, 99);
        System.out.println("modified array = " + Arrays.toString(arr));
    }
}
