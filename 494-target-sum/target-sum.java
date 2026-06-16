class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return fun(nums, target, 0, 0);
    }
    public int fun(int[] arr, int tar, int idx, int sum){
        if(idx >= arr.length){
            return (sum == tar) ? 1 : 0;
        }
        int s = fun(arr, tar, idx+1, sum- arr[idx]);
        int a = fun(arr, tar, idx+1, sum+ arr[idx]);
        return s + a;
    }
}