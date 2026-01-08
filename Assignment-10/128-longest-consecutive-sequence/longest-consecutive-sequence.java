class Solution {
    public int longestConsecutive(int[] nums) {
        // The first way by sorting which takes TC -> O(nlog(n))

        // edge case
        if(nums.length == 0)return 0;
        Arrays.sort(nums);
        int ans = 1;
        int c = 1;
        for(int i=0; i<nums.length-1; i++){
            // the main condition
            if(nums[i] == nums[i+1])continue;

            if(nums[i] + 1 == nums[i+1]){
                c++;
            }
            else c = 1;
            ans = Math.max(ans , c);
        }
        return ans;
    }
}