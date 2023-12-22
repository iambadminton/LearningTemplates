package AlgorithmsAndStructures.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,6,3,5,0,2,65,78};
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1;  i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if(arr[j] > arr[i]) {
                    int curEl = arr[j];
                    arr[j] = arr[i];
                    arr[i] = curEl;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
