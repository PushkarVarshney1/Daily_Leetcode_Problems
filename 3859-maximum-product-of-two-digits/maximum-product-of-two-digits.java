class Solution {
    public int maxProduct(int n) {
        int m1 = 0;
        int m2 = 0;
        while(n > 0){
            int rem = n % 10;
            if(m1 <= rem){
                m2 = m1;
                m1 = rem;
            }
            else if(rem > m2){
                m2 = rem;
            }
            n /= 10;
        }
        return m1 * m2;
    }
}