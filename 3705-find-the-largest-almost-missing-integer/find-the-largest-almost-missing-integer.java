class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <= nums.length - k; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j < i + k; j++){
                set.add(nums[j]);
                
            }
            for(int v : set)map.put(v, map.getOrDefault(v, 0) + 1);
        }
        int ans = -1;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}