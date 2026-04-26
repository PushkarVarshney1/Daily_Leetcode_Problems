class Solution {
    public boolean containsCycle(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    if (solve(grid, visited, i, j, -1, -1, grid[i][j])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    boolean solve(char[][] arr, boolean[][] visited, int i, int j, int pi, int pj, char target) {
        visited[i][j] = true;

        for (int[] a : dir) {
            int x = i + a[0];
            int y = j + a[1];
            if (x < 0 || y < 0 || x >= arr.length || y >= arr[0].length) continue;
            if (arr[x][y] == target) {
                if (visited[x][y]) {
                    if (x != pi || y != pj) return true;
                } 
                else if (solve(arr, visited, x, y, i, j, target)) return true;
            }
        }
        return false;
    }
}