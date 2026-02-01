class Solution {
    public int minimumCost(int[] nums) {
        int i = 1 , j = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(i < j){
            min = Math.min(min, nums[i]+nums[j]);
            if(nums[i] > nums[j])i++;
            else j--;
        }
        return nums[0] + min;
    }
}