package leetcode;


import java.util.*;
import java.util.stream.Collectors;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if(set.size() != nums.length) result = true;

        return result;
    }

    public static void main(String[] args) {
        Solution217 solution217 = new Solution217();
        System.out.println(solution217.containsDuplicate(new int[]{1,2,3,1}));
    }
}
