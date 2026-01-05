class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length();
        if (m + n != s3.length())
            return false;
        Boolean [][]dp = new Boolean[m+1][n+1];
        return rec(s1, s2, s3, 0, 0, dp);
    }

    boolean rec(String s1, String s2, String s3, int i, int j, Boolean[][]dp) {
        int m = s1.length(), n = s2.length(), k = i + j;

        if (i == m && j == n && k == s3.length())
            return true;
        if(dp[i][j] != null)return dp[i][j];

        boolean a = i < m && s1.charAt(i) == s3.charAt(k) && rec(s1, s2, s3, i + 1, j,dp);
        boolean b = j < n && s2.charAt(j) == s3.charAt(k) && rec(s1, s2, s3, i, j + 1, dp);

        return dp[i][j] = a || b;
    }
}