class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int v : nums){
            if(v >= 0)set.add(v);
        }
        int ans = 1; // b/c the 0 is not positive
        while(set.contains(ans))ans++;
        return ans;

        // Intution is easy , tc -> O(n) but sc -> O(n)
    }
}