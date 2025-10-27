class Solution {
    public int compress(char[] chars) {
        
        // Two POinters approach
        
        int j=0; // idx where the actual ans is placed
        
        for(int i=0; i<chars.length ;){
            char ch=chars[i];
            int c=0; // update after loop means after placed on answer.
            while(i < chars.length && chars[i]==ch){
                c++;
                i++;
            }
            chars[j]=ch;
            j++;
            if(c>1){ // if c>9 like 10 --> "1","0" here use c>1 b/c "1" cannot be the answer
                for(char x : String.valueOf(c).toCharArray()){
                    chars[j]=x;
                    j++;
                }
            }
        }
        return j;
    }
}