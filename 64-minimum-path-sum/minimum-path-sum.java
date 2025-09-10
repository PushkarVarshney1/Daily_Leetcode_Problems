class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return Minimum(grid,0,0,dp);
    }
    public int Minimum(int[][]grid , int cr , int cc,int[][] dp){
        if(cc==grid[0].length-1 && cr==grid.length-1){
            return grid[cr][cc];
        }
        if(cc==grid[0].length || cr==grid.length){
            return Integer.MAX_VALUE;
        }
        if(dp[cr][cc] != -1)return dp[cr][cc];
        int d=Minimum(grid,cr+1,cc,dp);
        int r=Minimum(grid,cr,cc+1,dp);
        return dp[cr][cc]=Math.min(d,r) + grid[cr][cc];
    }
}