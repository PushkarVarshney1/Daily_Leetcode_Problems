class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0)return 1; // edge case
        int ans = 0;
        int idx = 0; // position
        while(n > 0){
            int rem = n % 2;
            ans += Math.pow(2,idx) * (1 - rem); // (1 - rem) makes complemnt and then change to its base 10
            idx++;
            n /= 2;
        }
        return ans;
    }
}