package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 soluton = new Solution1();

        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        //int[] nums = new int[]{3, 2, 4};
        //int target = 6;

        System.out.println(Arrays.toString(soluton.twoSum(nums, target)));

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int diff = target - nums[i];


            if(map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
            }
            map.put(nums[i], i);

        }
        return new int[]{};


    }

}
