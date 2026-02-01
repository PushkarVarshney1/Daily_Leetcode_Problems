class Solution {
    public int minimumCost(int[] nums) {
        // Not To sort the whole array b/c the first ele is always be the part of answer.
        // So sort the array from index 1 to last.
        Arrays.sort(nums, 1, nums.length);
        return nums[0] + nums[1] + nums[2];
    }
}