package leetcode;

import java.util.Arrays;

public class Solution695 {
    boolean seen[][];
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        Solution695 solution = new Solution695();
        System.out.println(solution.maxAreaOfIsland(grid));

    }

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        seen = new boolean[grid.length][grid[0].length];

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {

                maxArea = Math.max(maxArea, area(r, c, grid));

            }

        }
        return maxArea;


    }

    private int area(int r, int c, int[][] grid) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[r].length || grid[r][c] == 0
        || seen[r][c] == true) {
            return 0;
        }
        seen[r][c] = true;
        return 1 + area(r + 1, c, grid)
                + area(r - 1, c, grid)
                + area(r, c + 1, grid)
                + area(r, c - 1, grid);


    }
}
