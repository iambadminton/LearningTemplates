package leetcode;

import java.util.Arrays;

public class Solution167 {
    public static void main(String[] args) {
//        int[] arr = {2,7,11,15};
//        int target = 9;
        int[] arr = {2,3, 4};
        int target = 6;
        Solution167 solution = new Solution167();
        System.out.println(Arrays.toString(solution.twoSum(arr, target)));

    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] temp = new int[2];
        while (left <= right && temp[0] == 0) {
            if(numbers[left] + numbers[right] > target) {
                System.out.println("111");
                right--;
            }
            else if (numbers[left] + numbers[right] < target){
                System.out.println("222");
                left++;
            }
            if(numbers[left] + numbers[right] == target) {
                System.out.println("333");

                temp[0] = left + 1;
                temp[1] = right + 1;
                return temp;
            }
        }
        return temp;
    }
}
