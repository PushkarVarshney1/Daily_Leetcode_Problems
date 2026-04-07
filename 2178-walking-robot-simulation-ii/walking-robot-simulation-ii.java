class Robot {
    int row = 0, col = 0;
    int dirX = 1, dirY = 0;
    int x = 0, y = 0;

    public Robot(int width, int height) {
        row = width;
        col = height;
    }
    
    public void step(int num) {
        int perimeter = 2 * (row + col) - 4;
        num %= perimeter;
        if (num == 0 && x == 0 && y == 0) {
            dirX = 0;
            dirY = -1; 
            return;
        }
        while (num > 0) {
            int nx = x + dirX;
            int ny = y + dirY;
            // if going out of boundary → turn left 
            if (nx < 0 || nx >= row || ny < 0 || ny >= col) {
                int temp = dirX;
                dirX = -dirY;
                dirY = temp;
                continue;
            }
            x = nx;
            y = ny;
            num--;
        }
    }
    
    public int[] getPos() {
        return new int[]{x, y};
    }
    
    public String getDir() {
        if (dirX == 0 && dirY == 1) return "North";
        else if (dirX == 0 && dirY == -1) return "South";
        else if (dirX == 1 && dirY == 0) return "East";
        else return "West";
    }
}