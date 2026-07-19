class Solution {
    public int findGCD(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        return gcd(min, max);
    }
    int gcd(int n, int m){
        int ans = -1;
        for(int i=1; i<=n; i++){
            if(n % i == 0 && m % i == 0){
                ans = Math.max(ans, i);
            }
        }
        return ans;
    }
}