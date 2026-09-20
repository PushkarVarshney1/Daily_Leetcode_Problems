class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int idx = 1;
        for(char ch : s.toCharArray()){
            ans += (26 - (ch - 'a')) * idx;
            idx++;
        }
        return ans;
    }
}