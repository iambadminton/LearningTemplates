package leetcode.learn.hashtable;

import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArraysSolution {
    public static void main(String[] args) {
        IntersectionTwoArraysSolution solution = new IntersectionTwoArraysSolution();
        int[] arr1 = new int[]{1,2,2,1};
        int[] arr2 = new int[]{2,2};
        int[] result = solution.intersection(arr1, arr2);
        for (int i = 0; i < result.length ; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length ; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length ; i++) {
            set2.add(nums2[i]);
        }
        set.retainAll(set2);

        int[] result = set.stream().mapToInt(Number::intValue).toArray();
        return result;
    }
}
