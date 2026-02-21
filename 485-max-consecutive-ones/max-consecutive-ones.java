class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int c=0;
        for(int v:nums){
            if(v == 1){
                c++;
                ans=Math.max(ans , c);
            }
            else{
                c=0;
            }
        }
        return ans;
    }
}