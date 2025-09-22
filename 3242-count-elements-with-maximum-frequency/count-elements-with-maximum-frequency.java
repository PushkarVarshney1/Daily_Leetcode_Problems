class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int x=0;
        for(int v: nums){
            map.put(v , map.getOrDefault(v,0)+1);
            x = Math.max(x , map.get(v));
        }
        int ans=0;
        for (Integer value : map.values()) {
            if(value == x)ans+=value;
        }
        return ans;
    }
}