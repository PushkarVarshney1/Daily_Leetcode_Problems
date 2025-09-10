class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans=Integer.MAX_VALUE;
        int [][]dp=new int[matrix.length][matrix[0].length];
        for(int[]a:dp){
            Arrays.fill(a,-66666);
        }
        for(int col=0 ; col<matrix[0].length ; col++){
            ans=Math.min(ans , fun(matrix,0,col,dp));
        }
        return ans;
    }
    public int fun(int[][] mat, int cr, int cc, int[][] dp) {
        if (cc < 0 || cc >= mat[0].length) {
            return Integer.MAX_VALUE; // invalid col
        }
        if (cr == mat.length - 1) {
            return mat[cr][cc]; // base case (last row)
        }
        if (dp[cr][cc] != -66666) return dp[cr][cc];

        int ld = fun(mat, cr + 1, cc - 1, dp); // left diagonal
        int rd = fun(mat, cr + 1, cc + 1, dp); // right diagonal
        int d = fun(mat, cr + 1, cc, dp);      // down

        return dp[cr][cc] = mat[cr][cc] + Math.min(d, Math.min(ld, rd));
    }

}