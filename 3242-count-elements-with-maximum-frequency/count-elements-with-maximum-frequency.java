class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int v: nums){
            map.put(v , map.getOrDefault(v,0)+1);
        }
        int x=0;
        for (Integer value : map.values()) {
            x = Math.max(x , value);
        }
        int ans=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == x)ans+=entry.getValue();
        }
        return ans;
    }
}