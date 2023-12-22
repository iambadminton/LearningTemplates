package leetcode;

public class Solution1567 {
    public static void main(String[] args) {
        //int[] nums = new int[]{1, -2, -3, 4}; // 4
        //int[] nums = new int[]{1, -2, -3, 4, 0};

        //int[] nums = new int[]{-1, -2, 3, 0, 1}; // 3

        //int[] nums = new int[]{0, 1, -2, -3, -4};
        //int[] nums = new int[]{1,2,3,5,-6,4,0,10};

        int[] nums = new int[]{-1, -1, -2, -2, -3, -5, -6, 4, 0, 10};

        Solution1567 solution = new Solution1567();
        System.out.println(solution.getMaxLen2(nums));
    }

    public int getMaxLen(int[] nums) {
        int maxLen = 0;
        int currLen = 0;
        int mult = 1;

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                positive = 0;
                negative = 0;
            } else if (nums[i] > 0) {
                positive++;
            } else {
                negative++;
                if (negative % 2 == 0)
                    positive = positive + 2;
            }
            maxLen = Math.max(maxLen, positive);

        }
        return maxLen;
    }

    // лучшее решение, которое я увидел, но не понятно
    public int getMaxLen2(int[] nums) {
        if (nums.length == 0) return 0;

        int positive = 0;
        int negative = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                positive = 0;
                negative = 0;
            } else if (nums[i] > 0) {
                positive++;
                negative = (negative == 0) ? 0 : negative + 1;
            } else {
                int temp = positive;
                positive = (negative == 0) ? 0 : negative + 1;
                negative = temp + 1;
                //negative++;
            }
            maxLen = Math.max(maxLen, positive);
        }

        return maxLen;
    }
}

