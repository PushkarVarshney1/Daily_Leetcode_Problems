class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count = 0;
        int underscore = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'R')count++;
            else if(ch == '_')underscore++;
            else count--;
        }
        return Math.abs(count) + underscore;
    }
}