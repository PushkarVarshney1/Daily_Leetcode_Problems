class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int ans = Integer.MAX_VALUE;
        for(List<Integer> i : map.values()){
            if(i.size() < 3)continue;
            int st = 0, ed = 2;
            while(ed < i.size()){
                int c = 2*(i.get(ed) - i.get(st));
                ans = Math.min(ans , c);
                st++;
                ed++;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}