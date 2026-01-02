class Solution {
    public int edgeScore(int[] edges) {
        long[] arr = new long[edges.length];

        // compute edge arrs
        for (int i = 0; i < edges.length; i++) {
            arr[edges[i]] += i;
        }

        int ans = 0;
        long max = arr[0];

        // find node with maximum arr
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ans = i;
            }
        }
        return ans;
    }
}
