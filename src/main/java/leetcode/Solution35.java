package leetcode;

public class Solution35 {
    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();

        int[] arr = new int[]{1, 3, 5, 6};
        int target = 5;
        System.out.println(solution35.searchInsert(arr, target));
        target = 2;
        System.out.println(solution35.searchInsert(arr, target));
        target = 7;
        System.out.println(solution35.searchInsert(arr, target));
        target = 0;
        System.out.println(solution35.searchInsert(arr, target));

    }

    public int searchInsert(int[] nums, int target) {
//        System.out.println("target = "  + target);
        int low = 0;
        int high = nums.length - 1;
        int middle = high / 2;

        while (low <= high) {
            middle = low + (high - low) / 2;
//            System.out.println("middle =" + middle + ", low=" + low + ", high=" + high);
            if (nums[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        System.out.printf("low = %d\n", low);
        return low;






    }
}
