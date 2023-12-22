package leetcode;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 */

import java.util.*;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set set = new HashSet<List<Integer>>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length ; k++) {
                    if(i == j || i == k || j == k) {
                        continue;
                    }

                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triple = new ArrayList<Integer>(Arrays.asList(Integer.valueOf(nums[i]), Integer.valueOf(nums[j]), Integer.valueOf(nums[k])));
                        triple.sort((o1, o2) -> o1 < o2 ? -1 : (o1 == o2 ? 0 : 1));
                        set.add(triple);
                    }
                }

            }

        }
        return new ArrayList<List<Integer>>(set);
    }

    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        List<List<Integer>> result = solution15.threeSum(new int[]{-1,0,1,2,-1,-4});
        for (int i = 0; i < result.size() ; i++) {
            for (int j = 0; j < result.get(i).size() ; j++) {

                System.out.print(result.get(i).get(j) + ",");
                //if(j!= result.size()-1) {
                //    System.out.print(",");
                //}
            }
            System.out.print("\n");

        }
    }
}


