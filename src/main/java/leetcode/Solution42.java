package leetcode;

public class Solution42 {
    public static void main(String[] args) {
        //int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] arr = new int[]{4, 2, 0, 3, 2, 5};

        Solution42 solution = new Solution42();
        System.out.println(solution.trap(arr));

    }

    public int trap(int[] height) {
        int left = 0;
        int right = 0;
        int prevLocalMax = height[0];
        int volume = 0;
        int[] left_max = new int[height.length];
        int[] right_max = new int[height.length];
        int leftMax = 0;
        int rightMax = 0;

        for (int i = 0; i < height.length; i++) {
            left_max[i] = Math.max(leftMax, height[i]);
            leftMax = left_max[i];

            right_max[height.length - 1 - i] = Math.max(rightMax, height[height.length - 1 - i]);
            rightMax = right_max[height.length - 1 - i];
        }

        for (int i = 1; i < height.length; i++) {
            volume += Math.min(right_max[i], left_max[i]) - height[i];
        }
        return volume;

    }
}
