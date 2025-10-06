class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int si=0 , ei=0;
        int sum = 0;
        int ans=Integer.MAX_VALUE;
        while(ei<nums.length){
            sum+=nums[ei];
            while(sum >= target){ // given condition
                ans = Math.min(ans , ei-si+1);
                sum-=nums[si];
                si++;
            }
            ei++;
        }
        if(ans == Integer.MAX_VALUE)return 0;
        return ans;
    }
}