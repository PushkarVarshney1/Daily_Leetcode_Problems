class Solution {
    private int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
    static int[][] dp;

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();
        dp = new int[m][n];
        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        health -= grid.get(0).get(0);
        return fun(grid, health, 0, 0);
    }

    public boolean fun(List<List<Integer>> grid, int health, int i, int j) {
        int m = grid.size();
        int n = grid.get(0).size();
        if(i < 0 || j < 0 || i >= m || j >= n || health < 1)
            return false;
        if(i == m - 1 && j == n - 1)
            return true;

        if(dp[i][j] >= health)
            return false;
        dp[i][j] = health;
        for(int[] d : dir) {
            int x = i + d[0];
            int y = j + d[1];
            if(x >= 0 && y >= 0 && x < m && y < n) {
                int nh = health - grid.get(x).get(y);
                if(fun(grid, nh, x, y))
                    return true;
            }
        }
        return false;
    }
}