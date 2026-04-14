class Solution {
    public boolean isRobotBounded(String instructions) {
        int dirX = 0, dirY = 1;
        int x = 0, y = 0;
        for(char ch : instructions.toCharArray()){
            if(ch == 'L'){
                int temp = dirX;
                dirX = -dirY;
                dirY = temp;
            }
            else if(ch == 'R'){
                int temp = -dirX;
                dirX = dirY;
                dirY = temp;
            }
            else{
                x += dirX;
                y += dirY;
            }
        }
        // bounded if returns to origin || direction changes
        return (x == 0 && y == 0) || !(dirX == 0 && dirY == 1);
    }
}