class Solution {
    public int countTriples(int n) {

        // Optimize from previous ( TC -> n2 )
        int ans = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                long temp = (long)(i*i) + (long)(j*j);
                double c = Math.sqrt(temp);
                // check if c is Integer not float then ans++
                boolean check_C = (c == (int)c);
                // Also check c is less than n
                boolean Inrange = (c <= n);
                if(Inrange == true && check_C  == true) ans++;
            }
        }
        return ans;
    }
}