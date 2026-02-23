class Solution {
    public int maximumStrongPairXor(int[] nums) {
        // Brute Force --> O(n2)
        int max = 0;
        for(int i= 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                if((Math.abs(nums[i]-nums[j])) <= Math.min(nums[i], nums[j])){
                    max = Math.max(max, nums[i] ^ nums[j]);
                }
            }
        }
        return max;
    }
}