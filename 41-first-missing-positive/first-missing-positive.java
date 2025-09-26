class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int f=0;
        for(int i=0 ; i<n ;i++){
            if(nums[i] == 1)f=1;
            if(nums[i]<1 || nums[i]>nums.length){
                nums[i]=1;
            }
        }
        if(f!=1)return 1;
        for(int i=0;i<n;i++){
            int x=Math.abs(nums[i]);
            x=x-1;
            if(nums[x]>0)nums[x] *= -1;
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
    //     Arrays.sort(nums);
    //     int ans=fun()
    // }
    // public void fun(int []nums,int idx){
    //     if(idx < nums.length){
    //         return ;
    //     }
    // }

}