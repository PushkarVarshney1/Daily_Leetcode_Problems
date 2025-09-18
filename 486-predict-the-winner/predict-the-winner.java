class Solution {
    public boolean predictTheWinner(int[] arr) {
        int n=arr.length;
		int [][]dp=new int[n][n];
		int total = 0;
        // calculate sum of all elements in total
        for (int num : arr) total += num;
        int p1 = fun(arr, 0, n - 1, dp);
        int p2 = total - p1;

        return p1 >= p2;
	}
	
	public static int fun(int []arr,int i,int j,int[][]dp) {
		if(i > j)return 0;
		if(dp[i][j] != 0)return dp[i][j];
		int f=arr[i] + Math.min(fun(arr,i+2,j,dp), fun(arr,i+1,j-1,dp));
		int s=arr[j] + Math.min(fun(arr,i+1,j-1,dp), fun(arr,i,j-2,dp));
		return dp[i][j]=Math.max(f ,  s);
    }
}