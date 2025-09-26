class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        // new flag array
        int []arr=new int[n+1];
        for(int i=0;i<n;i++){
            if(nums[i]>0 && nums[i]<n+1){
                arr[nums[i]-1]=1;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) return i+1;
        }
        return n+1; 
    }
}