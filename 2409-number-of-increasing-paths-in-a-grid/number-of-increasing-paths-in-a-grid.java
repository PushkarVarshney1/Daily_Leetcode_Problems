class Solution {
    static int mod = 1_000_000_007;
    public int countPaths(int[][] mat) {
    //  NOTE ON LOGIC: 
        //  The total paths starting from a cell is NOT its Longest Increasing Path (LIP) length.
        //  Example: If a cell is '1' and it can go to '2' or '3', 
        //  the paths are [1], [1->2...], and [1->3...].
        //  *Imp ->* So, total paths = 1 (the cell itself) + sum of all paths from valid neighbors.
        int ans = 0;
        int row = mat.length;
        int col = mat[0].length;
        int [][] dp = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                ans =(ans + dfs(mat, row, col, i, j, dp)) % mod;
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
                max =(max + dfs(mat,row,col,x,y,dp)) % mod;
            }
        }
        return dp[i][j] = max + 1;
    }
}