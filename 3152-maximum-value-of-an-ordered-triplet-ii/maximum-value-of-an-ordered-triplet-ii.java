class Solution {
    public long maximumTripletValue(int[] nums) {
        // value of triplet is maximum --> (nums[i] - nums[j] is maximum )* (maximum element)
        long ans = 0;
        long maxDiff = 0;
        long maxNum = 0;
        for(int num : nums){
            ans = Math.max(ans , maxDiff * num);
            maxDiff = Math.max(maxDiff , maxNum - num);
            maxNum = Math.max(maxNum , num);
        }
        return ans;
    }
}