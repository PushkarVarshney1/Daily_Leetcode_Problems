class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long ans = 0;
        int cNeg = 0;
        int min = Integer.MAX_VALUE;
        for(int []a :matrix){
            for(int b : a){ 
                if(b < 0)cNeg++;
                min = Math.min(min , Math.abs(b));
                ans += Math.abs(b);
            }
        }
        if(cNeg % 2 == 0)return ans;
        else {
            return ans - 2 * (min);
        }
    }
}