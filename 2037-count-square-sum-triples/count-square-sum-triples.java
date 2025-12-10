class Solution {
    public int countTriples(int n) {

        // Brute force
        int ans = 0;
        for(int i=1; i<=n; i++){
            int a = i*i;
            for(int j=1; j<=n; j++){
                int b = j*j;
                for(int k=1;k<=n;k++){
                    if((k*k) == a + b)ans++;
                }
            }
        }
        return ans;
    }
}