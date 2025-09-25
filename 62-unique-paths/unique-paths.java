class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m][n];
        int count = Print(0, 0 , m - 1, n - 1,dp);
        return count;
	}
    
	public static int Print(int cr, int cc, int er, int ec,int [][]dp){
            if(cr == er || cc == ec){
                
	            return 1;
	        }
	        if(cr > er || cc > ec){
                
	            return 0;
	        }
            if(dp[cr][cc] != 0){
                return dp[cr][cc];
            }
	        int c1 = Print(cr, cc+1, er, ec, dp);
	        int c2 = Print(cr+1, cc, er, ec, dp);
            return dp[cr][cc] = c1 + c2;
	}
}