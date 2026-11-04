class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int []ans = new int[n];
        int lo = 0, hi = n-1;
        for(int i=0,j = n-1; i<n; i++,j--){
            if(nums[i] < pivot){
                ans[lo] = nums[i];
                lo++;
            }
            if(nums[j] > pivot){
                ans[hi] = nums[j];
                hi--;
            }
        }
        while(lo <= hi){
            ans[lo] = pivot;
            lo++;
        }
        return ans;
    }
}