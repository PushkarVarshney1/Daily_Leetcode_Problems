class Solution {
    public boolean check(int[] nums) {
        int cnt = 0, n = nums.length;
        for(int i=1; i<n; i++){
            if(nums[i-1]>nums[i]){
                cnt++;
            }
        }
        if(nums[0]<nums[n-1]){
            cnt++;
        }
        System.out.print(cnt);
        return cnt<=1;
    }
}