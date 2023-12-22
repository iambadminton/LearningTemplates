package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution740 {
    private HashMap<Integer, Integer> points = new HashMap<>();
    private HashMap<Integer, Integer> cache = new HashMap<>();


    public static void main(String[] args) {
        //int arr[] = new int[]{3,4,2};
        //int arr[] = new int[]{2,2,3,3,3,4};
        int arr[] = new int[]{10000};

        Solution740 solution = new Solution740();
        System.out.println(solution.deleteAndEarn(arr));

    }

    private int maxPoints(int num) {
        // Check for base cases
        if (num == 0) {
            return 0;
        }

        if (num == 1) {
            return points.getOrDefault(1, 0);
        }

        if (cache.containsKey(num)) {
            return cache.get(num);
        }

        // Apply recurrence relation
        int gain = points.getOrDefault(num, 0);
        cache.put(num, Math.max(maxPoints(num - 1), maxPoints(num - 2) + gain));
        return cache.get(num);
    }

    public int deleteAndEarn(int[] nums) {
        int maxNumber = 0;

        // Precompute how many points we gain from taking an element
        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNumber = Math.max(maxNumber, num);
        }

        return maxPoints(maxNumber);
    }

}

