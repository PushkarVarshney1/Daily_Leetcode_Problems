class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        // Simulation
        for(int i[] : queries){
            int l = i[0], r = i[1];
            while(l <= r){
                nums[l] = (int)(((long)nums[l] * i[3] % 1_000_000_007));
                l += i[2];
            }
        }
        int ans = 0;
        for(int v: nums)ans ^= v;
        return ans;
    }
}