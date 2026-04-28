class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> ll = new ArrayList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                ll.add(grid[i][j]);
            }
        }
        Collections.sort(ll);
        int median = ll.get(ll.size() / 2); 
        int ans = 0;
        for(int i : ll){
            if((i - median) % x != 0)return -1;
            ans += Math.abs(i - median) / x;
        }
        return ans;
    }
}