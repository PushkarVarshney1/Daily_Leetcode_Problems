class Solution {
    public int maxCoins(int[] arr) {
        int n=arr.length;
        
        
        int[] a = new int[n + 2];
        a[0] = a[a.length - 1] = 1;

        for (int i = 0; i < n; i++) {
            a[i + 1] = arr[i];
        }
        int [][]dp=new int[a.length][a.length];
        for(int[] x:dp){
            Arrays.fill(x,-1);
        }
        return BurstBalloons(a, 0, a.length - 1,dp);
    }

    public int BurstBalloons(int[] a, int i, int j,int[][] dp) {
        if (i + 1 == j) {
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = Integer.MIN_VALUE;
        for (int k = i + 1; k < j; k++) {
            int left = BurstBalloons(a, i, k,dp);
            int right = BurstBalloons(a, k, j,dp);
            int self = a[i] * a[j] * a[k];
            ans = Math.max(ans, left + right + self);

        }
        return dp[i][j]=ans;
    }
}