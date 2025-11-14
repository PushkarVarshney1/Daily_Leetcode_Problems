class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i=0;
        int j = n-1;
        while(i<j){
            if(-nums[i] == nums[j]){
                return nums[j];
            }
            else{
                int max=Math.max(-nums[i] , nums[j]);
                if(max == -nums[i]){
                    i++;
                } 
                else j--;
            }
        }
        return -1;
    }
}