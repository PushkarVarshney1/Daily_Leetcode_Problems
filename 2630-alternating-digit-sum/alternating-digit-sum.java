class Solution {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int ans = 0;
        int flag = 0;
        int i = 0;
        while(i < s.length()){
            int rem = s.charAt(i) - '0';
            if(flag == 0){
                ans += rem;
                flag = 1;
            }
            else{
                ans -= rem;
                flag = 0;
            }
            i++;
        }
        return ans;
    }
}