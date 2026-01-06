class Solution {
    public int maxProfit(int[] prices) {
        int [][]dp = new int[prices.length+1][2];
        return dfs(prices, 0, 1, dp);
    }

    private int dfs(int[] prices, int day, int canBuy, int[][]dp) {
        if (day >= prices.length) return 0;
        // Memoization
        if(dp[day][canBuy] != 0)return dp[day][canBuy];

        if (canBuy == 1) {
            int buy = -prices[day] + dfs(prices, day + 1, 0, dp);
            int skip = dfs(prices, day + 1, 1, dp);

            return dp[day][canBuy] = Math.max(buy, skip);
        }
        else {
            int sell = prices[day] + dfs(prices, day + 2, 1, dp); // cooldown tomorrow
            int hold = dfs(prices, day + 1, 0, dp);
            
            return dp[day][canBuy] = Math.max(sell, hold);
        }
    }
}
