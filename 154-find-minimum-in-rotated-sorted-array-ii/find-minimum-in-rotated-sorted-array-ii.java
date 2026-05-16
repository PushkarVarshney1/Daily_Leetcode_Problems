class Solution {
    public int findMin(int[] nums) {
        int st = 0, ed = nums.length - 1;
        while(st < ed){
            int mid = (st + ed) / 2;
            if(nums[st] >= nums[mid]){
                if(nums[st] > nums[ed])st++;
                else ed--;
            }
            else{
                if(nums[st] < nums[ed])ed--;
                else st++;
            }
        }
        return nums[st];
    }
}