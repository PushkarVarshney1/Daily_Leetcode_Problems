class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i=left; i<=right; i++){
            int c = 0;
            int n = i;
            while(n > 0){
                n &= (n-1);
                c++;
            }
            if(isPrime(c))ans++;
        }
        return ans;
    }
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}