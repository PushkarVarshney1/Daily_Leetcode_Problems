class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int row = x + k - 1; 
        int col = y + k - 1; 
        for(int i=y; i<=col; i++){
            int st = x , ed = row;
            while(st < ed){
                int temp  = grid[st][i];
                grid[st][i]  = grid[ed][i];
                grid[ed][i]  = temp;
                st++;
                ed--;
            }
        }
        return grid;
    }
}