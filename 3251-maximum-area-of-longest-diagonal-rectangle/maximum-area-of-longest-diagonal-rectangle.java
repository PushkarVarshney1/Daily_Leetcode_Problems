class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans=0 ;
        double maxdiag=0;
        for(int i=0 ; i<dimensions.length ; i++){
            int a=dimensions[i][0] , b=dimensions[i][1] ;
            double diag = Math.sqrt(a*a + b*b);
            if(diag > maxdiag){
                maxdiag=diag;
                ans=a * b;
            }
            else if(diag == maxdiag)ans=Math.max(ans,a*b);
        }
        return ans;
    }
}