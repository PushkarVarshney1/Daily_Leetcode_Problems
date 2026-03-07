class Solution {
    public boolean checkZeroOnes(String s) {
        int one = 0 , zero = 0;
        int m1= 0, m0 = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                one++;
                m1 = Math.max(m1 , one);
                zero = 0;
            }
            else{
                zero++;
                m0 = Math.max(m0 , zero);
                one = 0;
            }
        }
        if(m1 > m0)return true;
        return false;
    }
}