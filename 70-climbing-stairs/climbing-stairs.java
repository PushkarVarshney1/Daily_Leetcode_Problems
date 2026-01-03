class Solution {
    public int climbStairs(int n) {
        // how many stairs you go down means you have to same steps
        int []dp = new int[n+1];
        return fun(n,dp); 
    }
    public int fun(int n,int []dp){
        if(n == 0){
            return 1;
        }
        if(n < 0)return 0;
        if(dp[n] != 0)return dp[n];
        int a = fun(n-1,dp);
        int b = fun(n-2,dp);
        return dp[n] = a + b;
    }
}