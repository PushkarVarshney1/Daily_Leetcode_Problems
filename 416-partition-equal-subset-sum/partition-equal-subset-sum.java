class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;

        int total=0;
        for(int v:nums){
            total+=v;
        }
        // if total is odd return false b/c it can't be spliit in two having equal sum;
        if((total & 1) == 1)return false;
        int target = total / 2;

        boolean[][] dp = new boolean[n + 1][target + 1];

        // Base: sum 0 is always possible (by taking no elements)
        for (int i = 0; i <= n; i++) dp[i][0] = true;

        // Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][target];
    }
}