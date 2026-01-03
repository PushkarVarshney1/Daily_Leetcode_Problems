class Solution {
    public int minPathSum(int[][] grid) {
        int [][]dp = new int[grid.length][grid[0].length];
        for(int []a : dp)
        Arrays.fill(a,-1);
        return fun(0, 0, grid, dp);
    }
    // Memoization
    int fun(int cr, int cc ,int[][]grid, int[][]dp){
        if(cr == grid.length-1 && cc == grid[0].length-1) return grid[cr][cc];
        if(cr > grid.length-1 || cc > grid[0].length-1)return Integer.MAX_VALUE;

        if(dp[cr][cc] != -1)return dp[cr][cc];

        int right = fun(cr, cc+1, grid, dp);
        int down = fun(cr+1, cc, grid, dp);
        
        return dp[cr][cc] = Math.min(right , down) + grid[cr][cc];
    }
}