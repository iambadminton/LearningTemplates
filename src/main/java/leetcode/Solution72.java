package leetcode;

public class Solution72 {
    public int minDistance(String word1, String word2) {
        /*int[] diff = new int[word2.length()];
        int prevPos = 0;
        String currentWord = word1;
        int i = 0;
        int count = 0;
        while (!currentWord.equals("") && i < word2.length()) {

            if (currentWord.contains(String.valueOf(word2.charAt(i)))) {
                diff[i] = 1;
                prevPos = currentWord.indexOf(word2.substring(i, i + 1)) == -1 ? 0 : currentWord.indexOf(word2.substring(i, i + 1));
                currentWord = currentWord.substring(prevPos + 1);
            } else {
                diff[i] = 0;
            }
            System.out.println(diff[i] + " word2.substring(i, i + 1) = " + word2.substring(i, i + 1) + "  prevPos = " + prevPos + " currentWOrd = " + currentWord);
            i++;
            prevPos = 0;
        }

        return 0;
         */

        int n = word1.length(), m = word2.length();
        int[][] dp = new int[n + 1][m + 1];
        StringBuilder w1 = new StringBuilder(word1);
        StringBuilder w2 = new StringBuilder(word2);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = -1;
            }
        }
        minEdit(dp, w1, w2, n - 1, m - 1);
        return dp[n][m];
    }

    public int minEdit(int[][] dp, StringBuilder w1, StringBuilder w2, int i, int j) {
        System.out.println("w1 = " + w1.toString() + ", w2 = " + w2.toString() + ", i = " + i + ", j = " + j);
        if (i == -1 && j == -1) return dp[i + 1][j + 1] = 0;
        if (i == -1) return dp[i + 1][j + 1] = j + 1;
        if (j == -1) return dp[i + 1][j + 1] = i + 1;
        if (dp[i + 1][j + 1] != -1) return dp[i + 1][j + 1];
        if (w1.charAt(i) == w2.charAt(j)) return dp[i + 1][j + 1] = minEdit(dp, w1, w2, i - 1, j - 1);
        int r1 = minEdit(dp, w1, w2, i - 1, j) + 1;
        int r2 = minEdit(dp, w1, w2, i, j - 1) + 1;
        int r3 = minEdit(dp, w1, w2, i - 1, j - 1) + 1;
        r1 = Math.min(r1, Math.min(r2, r3));
        return dp[i + 1][j + 1] = r1;
    }

    public static void main(String[] args) {
        Solution72 solution72 = new Solution72();
        //solution72.minDistance("horse", "ros");
        int res = solution72.minDistance("intention", "execution");
        System.out.println(res);
    }


}
