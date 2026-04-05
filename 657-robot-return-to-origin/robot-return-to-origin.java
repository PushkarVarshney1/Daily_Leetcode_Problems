class Solution {
    // Using recursion
    public boolean judgeCircle(String moves) {
        return movement(moves, 0, 0,0);
    }
    
    boolean movement(String s,int idx , int x, int y){
        if(idx >= s.length()){
            return (x==0 && y==0);
        }
        char ch = s.charAt(idx);
        if(ch == 'U'){
           return movement(s, idx + 1, x, y+1);
        }
        else if(ch == 'D'){
            return movement(s, idx + 1, x, y-1);
        }
        else if(ch == 'L'){
            return movement(s, idx + 1, x-1, y);
        }
        return movement(s, idx + 1, x+1, y);
    }
}