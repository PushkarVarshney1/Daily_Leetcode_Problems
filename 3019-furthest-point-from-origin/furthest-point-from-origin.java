class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count = 0, Uscore = 0;
        for(char ch : moves.toCharArray()){
            if(ch == '_')Uscore++;
            else if(ch == 'L')count++;
            else count--;
        }
        return Math.abs(count) + Uscore;
    }
}