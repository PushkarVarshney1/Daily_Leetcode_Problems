class Solution {
    public boolean checkOnesSegment(String s) {
        // do '1' ke bich me koi bhi '0' nahi hona chahiye
        int zero = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                zero++;
            }
            if(zero>0 && s.charAt(i) == '1')return false;
        }
        return true;
    }
}