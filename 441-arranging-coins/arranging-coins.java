class Solution {
    public int arrangeCoins(int n) {
        if(n == 1)return 1;
        long s = 0;
        for(int i=1; i<n; i++){
            s += i;
            if(s > n)return i-1;
        }
        return n-1;
    }
}