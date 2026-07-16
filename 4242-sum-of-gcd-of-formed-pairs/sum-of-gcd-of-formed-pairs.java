class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[]arr = new int[n];
        int max = 0;
        for(int i = 0; i<n; i++){
            max = Math.max(max , nums[i]);
            arr[i] = GCD(max , nums[i]);
        }
        Arrays.sort(arr);
        int st = 0 , ed = n-1;
        long ans = 0;
        while(st < ed){
            ans += GCD(arr[st] , arr[ed]);
            st++;
            ed--;
        }
        return ans;
    }
    int GCD(int a , int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}