class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int []ans ={0,0};
        int idx=0;
        Map<Integer , Integer> map = new HashMap<>();
        for(int v:nums){
            map.put(v,map.getOrDefault(v,0)+1);
            if(map.get(v) == 2){
                ans[idx]=v;
                idx++;
            }
        }
        return ans;
    }
}