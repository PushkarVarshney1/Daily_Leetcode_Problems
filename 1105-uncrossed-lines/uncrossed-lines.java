class Solution {
    public int maxUncrossedLines(int[] text1, int[] text2) {
        int [][]dp=new int[text1.length][text2.length];
        for(int[]a : dp){
            Arrays.fill(a,-1);
        }
        return fun(text1,text2,0,0,dp);
    }
    // Top Down Approach
    public int fun(int[] s1,int[] s2,int i,int j,int [][]dp){
        if(i == s1.length || j==s2.length){
            return 0;
        }
        if(dp[i][j] != -1)return dp[i][j];
        int ans=0;
        if(s1[i] == s2[j]){
            ans = 1+fun(s1,s2,i+1,j+1,dp);
        }
        else{
            int f=fun(s1,s2,i+1,j,dp);
            int s=fun(s1,s2,i,j+1,dp);
            ans=Math.max(f,s);
            
        }
        return dp[i][j]=ans;
    }
}