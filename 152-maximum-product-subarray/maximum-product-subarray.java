class Solution {
    public int maxProduct(int[] nums) {
        // Modified Kadanes
        int ans = nums[0];
        int max = nums[0] , min = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], nums[i] * max);
            min = Math.min(nums[i], nums[i] * min);
            // answer have to store every time 
            ans = Math.max(max, ans);
        }
        return ans;
    }
}