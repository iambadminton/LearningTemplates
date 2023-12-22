package leetcode;

public class Solution213_1 {
    public static void main(String[] args) {
        //int[] arr = {7,4,1,9,3,8,6,5};
        int[] arr = {1, 2, 3, 2};
        //int[] arr = {1,2,3};


        Solution213_1 solution = new Solution213_1();
        //System.out.println(solution.rob(arr));


        System.out.println(solution.rob_simple(arr, 0, arr.length - 2));

    }

    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        int max1 = rob_simple(nums, 0, nums.length - 2);
        int max2 = rob_simple(nums, 1, nums.length - 1);

        return Math.max(max1, max2);
    }

    public int rob_simple(int[] nums, int start, int end) {
        int t1 = 0;
        int t2 = 0;

        for (int i = start; i <= end; i++) {
            int temp = t1;
            int current = nums[i];
            t1 = Math.max(current + t2, t1);
            t2 = temp;
        }

        return t1;
    }


}
