class Solution {
    public int minSwaps(String s) {
        //  Note : Open brackets == Closing brackets
        //  let imbalance closig brackets = c
        //  min swaps = (c + 1)/2
        int c = 0 , maxImb = 0;
        for(char ch : s.toCharArray()){
            if(ch == ']'){
                c++;
            }
            else if(ch == '['){
                c--;
            }
            if(c > maxImb)maxImb = c;
        }
        return (maxImb + 1)/ 2;
    }
}