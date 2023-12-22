package leetcode;

import java.util.*;

public class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int[]  squares = new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {
            nums[i] = nums[i] * nums[i];
        }
        System.out.println(Arrays.toString(nums));

        int left = 0;
        int right = squares.length - 1;
        int curPos = squares.length - 1;
        while (left <= right) {
            if(nums[left] < nums[right]) {
                squares[curPos] = nums[right];
                right--;
            } else {
                squares[curPos] = nums[left];
                left++;
            }
            curPos--;
        }
        return squares;
    }

    /*public int[] sortedSquares(int[] nums) {
        int[] squaresArr = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            squaresArr[i] = nums[i]*nums[i];
        }
        int leftPtr = 0;
        int rightPtr = nums.length-1;
        int currPos = nums.length-1;
        int[] res = new int[nums.length];
        while(leftPtr<=rightPtr){
            if(squaresArr[rightPtr]>squaresArr[leftPtr]){
                res[currPos] = squaresArr[rightPtr];
                rightPtr--;
            }else{
                res[currPos] = squaresArr[leftPtr];
                leftPtr++;
            }
            currPos--;
        }
        return res;
    }

     */


    public static void main(String[] args) {
        Solution977 solution = new Solution977();
        System.out.println(Arrays.toString(solution.sortedSquares(new int[]{-1, 0, 2, 3})));
    }
}

