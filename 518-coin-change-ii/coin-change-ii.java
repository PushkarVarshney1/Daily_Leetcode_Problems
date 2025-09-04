class Solution {
    public int change(int amount, int[] coins) {
        int [][]dp=new int[amount+1][coins.length];
        for(int []a:dp){
            Arrays.fill(a,-1);
        }
        return fun(coins,amount,0,dp);
    }
    public int fun(int[]coin,int am,int i,int [][]dp){
        if(am == 0){
            return 1;
        }
        if(i== coin.length)return 0;
        if(dp[am][i] != -1){
            return dp[am][i];
        }
        int inc=0 , exc=0;
        if(i==coin.length)return 0;
        if(am>=coin[i]){
            inc=fun(coin,am-coin[i],i,dp);
        }
        exc=fun(coin,am,i+1,dp);
        return dp[am][i]=inc+exc;
    }

}