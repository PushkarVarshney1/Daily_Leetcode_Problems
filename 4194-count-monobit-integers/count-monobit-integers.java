class Solution {
    public int countMonobit(int n) {
        if(n == 0)return 1;
        int ans = 2; // because the 0 and 1 are alrady monobit
        for(int i=2; i<=n; i++){
            if((i & (i+1)) == 0)ans++;
        }
        return ans;
    }
}