class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long z=0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == 0){
                z++;
            }
            else{
                ans+=(z*(z+1))/2;
                z=0;
            }
            if(i==nums.length-1 && nums[nums.length-1]==0)ans+=(z*(z+1))/2;
        }
        return ans;
    }
}