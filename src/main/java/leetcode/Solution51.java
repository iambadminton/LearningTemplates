package leetcode;

import java.util.ArrayList;
import java.util.List;

/* leetcode Task 51
solution from youtube https://www.youtube.com/watch?v=jJMWhGKq3SM
 */

public class Solution51 {
    List<List<String>> result;

    public static void main(String[] args) {
        Solution51 solution = new Solution51();
        System.out.println(solution.solveNQueens(4));


    }

    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Filled it as empty cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<int[]> queens = new ArrayList<>();
        dfs(board, 0, queens);
        return result;


    }

    private void dfs(char[][] board, int r, List<int[]> queens) {
        // check if all queens are placed
        if (queens.size() == board.length) {
            // construct  output
            List<String> rows = new ArrayList<>();
            for (char[] row : board) {
                System.out.println("new String(row) = " + new String(row));
                rows.add(new String(row));
            }
            System.out.println("\n");
            result.add(rows);
        }

        // try adding the queen
        for (int c = 0; c < board.length; c++) {
            if (canAddQueen(r, c, queens)) {
                board[r][c] = 'Q';
                queens.add(new int[]{r, c});
                dfs(board, r + 1, queens);
                board[r][c] = '.';
                queens.remove(queens.size() - 1);
            }
        }

    }

    private boolean canAddQueen(int r, int i, List<int[]> queens) {
        for (int[] q : queens) {
            int dx = Math.abs(r - q[0]);
            int dy = Math.abs(i - q[1]);
            if(dx == 0 || dy ==0 || dx == dy) return false;
        }
        return true;
    }
}
