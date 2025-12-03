class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            // if even increment i
            if(nums[i] % 2 == 0) i++;
            // if odd decrement j
            else if(nums[j] % 2 != 0) j--;
            else{
                // swap
                nums[i] ^= nums[j];
                nums[j] ^= nums[i];
                nums[i] ^= nums[j];
            }
        }
        return nums;
    }
}