class Solution {
    public int minSwaps(String s) {
        int c = 0;
        for(char ch : s.toCharArray()){
            if(ch == '['){
                c++;
            }
            else if(ch == ']' && c > 0)c--;
        }
        return (c+1)/2;
    }
}