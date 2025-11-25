class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for(int val : nums){
            if(val % 3 == 0)continue;
            else ans++;
        }
        return ans;
    }
}