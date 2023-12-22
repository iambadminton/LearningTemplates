package leetcode;

import java.util.Arrays;

public class Solution283 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        //int[] arr = {1, 0, 1};
        System.out.println(Arrays.toString(arr));
        Solution283 solution = new Solution283();
        solution.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void moveZeroes(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int left = 0;
        int right = 0;

        while (right < nums.length && left <= right) {
            while (nums[right] == 0 && right < nums.length -1) {
                System.out.println(right + " => " + nums[right] + " => "
                        + (nums[right] == 0 && right < nums.length) + "(" + nums[right] +")");
                right++;
            }
            System.out.println("right = " + right);
            if(nums[left] == 0) {
                int temp  = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }

            left++;
            right++;

        }
    }
}
