package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1222 {
    public static void main(String[] args) {
        int[][] queens = new int[][]{{0, 0}, {1, 1}, {2, 2}, {3, 4}, {3, 5}, {4, 4}, {4, 5}};
        int[] king = new int[]{3, 3};


        Solution1222 solution = new Solution1222();
        System.out.println(solution.queensAttacktheKing3(queens, king));


        int i = 0;
        int j = 0;
        System.out.println(++i + " - " + j++);
        System.out.println(i + " - " + j);

    }

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> queensCanAttack = new ArrayList<>();

        int boardSize = 8;

        // north-west
        for (int[] q : queens) {
            if (q[0] + q[1] == king[0] + king[1]) {

            }
        }
        return queensCanAttack;
    }

    public List<List<Integer>> queensAttacktheKing2(int[][] queens, int[] king) {
        List<List<Integer>> result = new ArrayList<>();

        int boardSize = 8;

        for (int[] q : queens) {
            List<Integer> current = new ArrayList<>();

            int dx = Math.abs(q[0] - king[0]);
            int dy = Math.abs(q[1] - king[1]);

            if (dx == 0 || dy == 0 || dx == dy) {
                current.add(q[0]);
                current.add(q[1]);

                result.add(current);
            }

        }

        return result;
    }

    public List<List<Integer>> queensAttacktheKing3(int[][] queens, int[] k) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] cand = new int[8]; //At most 8 queens
        Arrays.fill(cand, -1);

        int i = 0;
        for (int[] q : queens) {
            if (q[0] + q[1] == k[0] + k[1]) update(queens, q, k, cand, 0, i, 0);
            if (q[0] - q[1] == k[0] - k[1]) update(queens, q, k, cand, 2, i, 0);
            if (q[1] == k[1]) update(queens, q, k, cand, 4, i, 0);
            if (q[0] == k[0]) update(queens, q, k, cand, 6, i, 1);
            i++;
        }

        for (int idx : cand)
            if (idx != -1)
                //ans.add(List.of(queens[idx][0], queens[idx][1]));
                ans.add(Arrays.asList(queens[idx][0], queens[idx][1]));

        return ans;
    }

    // j in this method means which direction to check, 0 = row, 1 = col
    private static void update(int[][] queens, int[] q, int[] k, int[] cand, int id, int i, int j) {
        if (q[j] < k[j]) ++id;
        if (cand[id] == -1 || Math.abs(q[j] - k[j]) < Math.abs(queens[cand[id]][j] - k[j]))
            cand[id] = i;
    }
}
