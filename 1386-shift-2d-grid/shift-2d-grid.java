class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int row = grid.length;
        int col = grid[0].length;
        int[][] arr = new int[row][col];
        k %= (row * col);
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int index = i * col + j;
                int newIdx = (index + k) % (row * col);
                arr[newIdx / col][newIdx % col] = grid[i][j];
            }
        }
        for(int []i: arr){
            List<Integer> list = new ArrayList<>();
            for (int num : i)
                list.add(num);
            ans.add(list);
        }
        return ans;
    }
}