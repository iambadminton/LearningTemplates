package leetcode;

public class Solution152 {
    public static void main(String[] args) {


        //int[] arr = new int[]{-2};
        //int[] arr = new int[]{-3, -1, -1};
        //int[] arr = new int[]{0, 2};

        //int[] arr = new int[]{2,3,-2,4};
        //int[] arr = new int[]{-2,0,-1};

        int[] arr = new int[]{2, -5, 3, 1, -4, 0, -10, 2, 8};

        Solution152 solution = new Solution152();
        System.out.println(solution.maxProduct(arr));
    }

    public int maxProduct(int[] nums) {
        int mult = nums[0];
        int max = nums[0];
        int min = nums[0];
        int res = max;

        for (int i = 1; i < nums.length; i++) {
            mult *= nums[i];
            int temp_max = Math.max(nums[i], Math.max(nums[i] * max , nums[i]* min ));
            min = Math.min(nums[i], Math.min(nums[i] * min, nums[i]* max ));

            max = temp_max;

            res = Math.max(min, Math.max(max, res));
        }
        return res;

    }
}
