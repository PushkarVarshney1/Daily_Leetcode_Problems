class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = 0;
        if(n % 2 != 0)x = 1;
        while(n > 0){
            int rem = n % 2;
            if(x != rem)return false;
            x = (rem == 1) ? 0 : 1;
            n /= 2;
        }
        return true;
    }
}