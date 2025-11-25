class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for(int val : nums){
            if((val+1) % 3 == 0 || (val-1) % 3 == 0)ans++;
        }
        return ans;
    }
}