class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int[] parent = new int[n];
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(arr[i][0] - arr[i + 1][0]) <= maxDiff) {
                union(arr[i][1], arr[i + 1][1], parent, rank);
            }
        }

        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = find(queries[i][0], parent) == find(queries[i][1], parent);
        }
        return ans;
    }

    private int find(int x, int[] parent) {
        if (parent[x] != x)
            parent[x] = find(parent[x], parent);
        return parent[x];
    }

    private void union(int a, int b, int[] parent, int[] rank) {
        int pa = find(a, parent);
        int pb = find(b, parent);
        if (pa == pb)
            return;

        if (rank[pa] < rank[pb]) {
            parent[pa] = pb;
        } else if (rank[pa] > rank[pb]) {
            parent[pb] = pa;
        } else {
            parent[pb] = pa;
            rank[pa]++;
        }
    }
}