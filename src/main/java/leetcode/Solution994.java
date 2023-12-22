package leetcode;

import java.util.Arrays;

public class Solution994 {
    int[][] rotten;
    public static void main(String[] args) {
        int[][] fruits = new int[][] {{2,1,1},{0,1,1},{1,0,1}};
        Solution994 solution = new Solution994();
        System.out.println(solution.orangesRotting(fruits));

    }

    public int orangesRotting(int[][] grid) {
        int minTime = 0;

        rotten = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length ; i++) {
            rotten[i] = grid[i].clone();
        }

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if(grid[r][c] == 2) {
                    minTime = Math.min(minTime, getTime(r, c, grid));
                }
            }
        }

        for (int i = 0; i < rotten.length; i++) {
            for (int j = 0; j < rotten[0].length ; j++) {
                if(rotten[i][j] == 1)
                    return -1;
            }
        }



        return minTime;


    }

    private int getTime(int r, int c, int[][] grid) {
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }
        rotten[r][c] = 2;
        return 1 + getTime(r + 1, c, grid)
                + getTime(r -1, c ,grid)
                + getTime(r, c+1, grid)
                + getTime(r, c -2, grid);


    }

}
