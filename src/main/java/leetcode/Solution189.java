package leetcode;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.Arrays;

public class Solution189 {
    public static void main(String[] args) {
        Solution189 solution = new Solution189();

        //int[] arr = {1,2,3,4,5,6,7};
        //solution.rotate(arr, 3);

        int[] arr = {-1,-100,3,99};
        solution.rotate(arr, 2);

        System.out.println("arr = " + Arrays.toString(arr));

    }
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];

        System.out.println("temp = " + Arrays.toString(temp));

        for (int i = 0; i < nums.length ; i++) {
            int curIdx = (i + k)%nums.length;

            System.out.println(i + "=>" + curIdx);
            temp[curIdx] = nums[i];
        }

        for (int i = 0; i < nums.length ; i++) {
            nums[i] = temp[i];
        }


    }
}
