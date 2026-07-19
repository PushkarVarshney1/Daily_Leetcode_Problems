class Solution {
    public boolean isThree(int n) {
        int root = (int)Math.sqrt(n);
        if(root * root != n)return false;
        return isPrime(root);
    }
    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}