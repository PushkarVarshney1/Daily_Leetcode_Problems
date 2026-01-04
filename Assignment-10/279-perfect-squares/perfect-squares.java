class Solution {
    public int numSquares(int n) {
        List<Integer> coins = new ArrayList<>();
        for(int i=1; i*i <= n; i++) coins.add(i*i);

        int [][]dp = new int[coins.size()][n + 1];
        int res = fun(coins, coins.size()-1 , n, dp);
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    public int fun(List<Integer>coins, int idx, int targ,int [][]dp){
        if(targ == 0) return 0;
        if(idx < 0 || targ < 0){
            return Integer.MAX_VALUE;
        }
        if(dp[idx][targ] != 0)return dp[idx][targ];
        // inclusion
        int inc = fun(coins , idx, targ - coins.get(idx), dp);
        if (inc != Integer.MAX_VALUE) inc += 1;
        // exclusion
        int N_inc= fun(coins, idx-1, targ, dp);

        return dp[idx][targ] = Math.min(inc , N_inc) ;
    }
}