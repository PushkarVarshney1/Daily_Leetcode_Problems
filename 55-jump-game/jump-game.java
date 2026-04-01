class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int s=0;
        while(i < nums.length){
            if(i>s)return false;
            s=Math.max(s,i+nums[i]);
            i++;
        }
        return true;
    }
}