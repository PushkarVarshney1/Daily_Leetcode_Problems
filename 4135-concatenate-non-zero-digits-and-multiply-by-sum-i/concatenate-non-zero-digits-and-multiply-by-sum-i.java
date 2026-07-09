class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0)return 0;
        long sum = 0;
        int x = 0;
        long i = 1;
        long ans = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            if(rem != 0){
                x += (rem * i);
                i *= 10; // forward concat
            }
            n /= 10;
        }
        return x * sum;
    }
}