class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][]dp = new int[text1.length()][text2.length() +1];
        for(int []a : dp)
             Arrays.fill(a , -1);
        return fun(text1, text2, 0, 0, 0,dp);
    }
    int fun(String s1, String s2, int i, int j,int ans, int[][]dp){
        if(i == s1.length() || j == s2.length()) return 0;
        // Memoization
        if(dp[i][j] != -1)return dp[i][j];
        
        if(s1.charAt(i) == s2.charAt(j)){
            ans = 1 + fun(s1, s2, i+1, j+1, ans,dp);
        }
        else{
            int x1 = fun(s1,s2,i+1,j,ans,dp);
            int x2 = fun(s1,s2,i,j+1,ans,dp);
            return dp[i][j] = Math.max(x1 , x2);
        }
        return dp[i][j] = ans;
    }
}