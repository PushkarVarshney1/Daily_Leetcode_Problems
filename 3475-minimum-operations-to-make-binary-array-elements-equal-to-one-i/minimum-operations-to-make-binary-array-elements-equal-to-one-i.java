class Solution {
    public int minOperations(int[] nums) {
        // Greedy approach with fixed-range bit flipping using XOR
        int n = nums.length;
        int ans = 0;
        int i = 0;
        while(i < n-2){
            if(nums[i] == 0){
                nums[i] = 1;
                nums[i+1] ^= 1; // only to flip the ele
                nums[i+2] ^= 1;
                ans++;
            }
            i++;
        }
        while(i < n){
            if(nums[i] == 0)return -1;
            i++;
        }
        return ans;
        
    }
}