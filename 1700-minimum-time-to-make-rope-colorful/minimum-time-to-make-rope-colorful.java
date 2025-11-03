class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=colors.length();
        int ans = 0;
        for(int i=0;i<n-1;i++){
            int max=Integer.MIN_VALUE;
            int c=0;
            if(colors.charAt(i) == colors.charAt(i+1)){
                for(int j=i;j<n;j++){
                    if(j!= n-1 && colors.charAt(j) == colors.charAt(j+1)){
                        max=Math.max(max , neededTime[j]);
                        ans+=neededTime[j];
                    }
                    else{
                        max=Math.max(max , neededTime[j]);
                        ans+=neededTime[j];
                        c=j;
                        break;
                    }
                }
                ans-=max;
                i=c;
            }
        }
        return ans;
    }
}