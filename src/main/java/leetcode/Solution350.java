package leetcode;

import java.util.*;

public class Solution350 {
    public static void main(String[] args) {
        //int[] nums1 = new int[]{1,2,2,1};
        //int[] nums2 = new int[]{2,2};

        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};

        Solution350 solution = new Solution350();
        System.out.println(Arrays.toString(solution.intersect(nums1, nums2)));

    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length ; i++) {
            if(map.containsKey(nums2[i])) {
                int currV =map.get(nums2[i]);
                map.put(nums2[i], ++currV);
            } else {
                map.put(nums2[i], 1);
            }

        }

        for (int i = 0; i < nums1.length ; i++) {
            if(map.get(nums1[i]) != null && map.get(nums1[i]) != 0) {
                list.add(nums1[i]);
                int currV = map.get(nums1[i]);
                map.put(nums1[i], --currV);
            }
        }

        return list.stream().mapToInt(i-> i).toArray();


    }
}
