package leetcode;

import java.util.Arrays;

public class Solution918 {
    public static void main(String[] args) {
        Solution918 solution = new Solution918();
        //int[] nums = new int[]{1,-2,3,-2};
        int[] nums = new int[]{5,-3,5};

        System.out.println(solution.maxSubarraySumCircular(nums));

    }

    private int maxSubarraySumCircular(int[] nums) {
        int[] arr = new int[2*nums.length];

        System.arraycopy(nums, 0, arr, 0, nums.length);
        System.arraycopy(nums, 0, arr, nums.length , nums.length);
        System.out.println(Arrays.toString(arr));

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            sum += arr[i];
            if (sum > max)
                max = sum;
            if(sum <= 0)
                sum = 0;
        }
        return max;


    }


}
