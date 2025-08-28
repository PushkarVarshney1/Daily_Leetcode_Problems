class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int s=0;
        for(int k:map.keySet()){
            if(map.get(k)==1)s+=k;
        }
        return s;
    }
}