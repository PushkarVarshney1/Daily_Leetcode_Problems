class Solution {
    public int longestIncreasingPath(int[][] mat) {
        // It is the Brute Force appraoch there's going a dfs call at every index , gives TLE at higher matrix lengths
        int ans = 0;
        int row = mat.length;
        int col = mat[0].length;
        int [][] dp = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int path = dfs(mat, row, col, i, j, dp);
                ans = Math.max(ans , path);
            }
        }
        return ans;
    }
    // Direction Array 
    private int[][] dir = {{0,-1},{0,1},{-1,0},{1,0}}; // left , right, up, down
    
    public int dfs(int[][] mat,int row,int col,int i, int j, int[][]dp){
        if(dp[i][j] > 0)return dp[i][j];
        int max = 0;
        for(int []a : dir){ 
            int x = i + a[0];
            int y = j + a[1];
            if(x >= 0 && x < row && y >= 0  && y < col && mat[x][y] > mat[i][j]){
                max = Math.max(max , dfs(mat,row,col,x,y,dp));
            }
        }
        return dp[i][j] = max + 1;
    }
}