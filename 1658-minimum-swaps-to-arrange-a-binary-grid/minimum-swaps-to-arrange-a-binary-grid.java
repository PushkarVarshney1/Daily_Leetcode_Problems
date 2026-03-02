class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] arr = new int[n];
        // Count arr zeros
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 0) count++;
                else break;
            }
            arr[i] = count;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int required = n - 1 - i;
            int j = i;

            // Find suitable row
            while (j < n && arr[j] < required) {
                j++;
            }
            if (j == n) return -1; // no valid row meets requirement
            // Bubble row upward using adjacent ans
            while (j > i) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                ans++;
                j--;
            }
        }
        return ans;
    }
}