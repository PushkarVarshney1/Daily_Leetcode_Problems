class Solution {
    public int[] shuffle(int[] nums, int k) {
        int n = nums.length;
        int []ans = new int[n];
        int idx = 0;
        for(int i=0; i<n-k; i++){
            ans[idx++] = nums[i];
            ans[idx++] = nums[i+k];
        }
        return ans;
    }
}