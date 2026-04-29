class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] < min)min = nums[i];
        }
        int ans = 0;
        for(int i : nums){
            ans += i - min;
        }
        return ans;
    }
}