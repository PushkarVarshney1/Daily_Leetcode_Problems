class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int idx = 0;
        int c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1 && c == 0){
                c=1;
                idx=i;

            } 
            else if(nums[i] == 1){
                if( (i - idx- 1) < k )return false;
                idx = i;
            }
        }
        return true;
    }
}