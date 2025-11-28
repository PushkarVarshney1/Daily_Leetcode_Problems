class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0;
        for(int i=0;i<n;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        for(int i=0; i<n; i++){
            if(map.get(nums[i]) == 2)
            {
                ans^=nums[i];
                map.put(nums[i],map.get(nums[i])-1);
            }
        }
        return ans;
    }
}