class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = grid[i][j];
                if(i > 0) arr[i][j] += arr[i-1][j];
                if(j > 0) arr[i][j] += arr[i][j-1];
                if(i > 0 && j > 0) arr[i][j] -= arr[i-1][j-1];
            }
        }
        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(arr[i][j] <= k) count++;
            }
        }
        return count;
    }
}