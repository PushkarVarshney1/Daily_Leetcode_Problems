class Solution {

    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;

        int[] dist1 = getDistanceBFS(node1, edges);
        int[] dist2 = getDistanceBFS(node2, edges);
        int ans = -1;
        int minMax = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (dist1[i] != -1 && dist2[i] != -1) {
                int cur = Math.max(dist1[i], dist2[i]);
                if (cur < minMax) {
                    minMax = cur;
                    ans = i;
                }
            }
        }
        return ans;
    }

    private int[] getDistanceBFS(int start, int[] edges) {
        int n = edges.length;
        int[] dist = new int[n];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dist[start] = 0;

        while (!q.isEmpty()) {
            // remove
            int curr = q.poll();

            int next = edges[curr];
            if (next != -1 && dist[next] == -1) {
                dist[next] = dist[curr] + 1;
                q.add(next);
            }
        }
        return dist;
    }
}
