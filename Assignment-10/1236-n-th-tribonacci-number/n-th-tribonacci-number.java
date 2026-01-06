class Solution {
    public int tribonacci(int n) {
        int []dp = new int[n+1];
        Arrays.fill(dp , -1);
        return fun(n, dp);
    }
    int fun(int n, int[]dp){
        if(n == 0 || n == 1)return n;
        if(n == 2)return 1;

        if(dp[n] != -1)return dp[n];
        return dp[n] = fun(n-1, dp) + fun(n-2, dp) + fun(n-3, dp);
    }
}