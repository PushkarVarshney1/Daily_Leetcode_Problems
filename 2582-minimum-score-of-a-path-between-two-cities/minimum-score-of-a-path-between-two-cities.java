class Solution {
    class Pair {
        int tar;
        int cost;
        Pair(int tar, int cost) {
            this.tar = tar;
            this.cost = cost;
        }
    }
    // It has components but when you go with 1st index it must be sure that the ending index is in same component , so do not try to go in all components and check, use BFS or DFS only starting with index 1;
    public int minScore(int n, int[][] roads) {
        List<List<Pair>> map = new ArrayList<>(n + 1);
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0; i <= n; i++) {
            map.add(new ArrayList<>());
        }
        for(int[] i : roads) {
            map.get(i[0]).add(new Pair(i[1], i[2]));
            map.get(i[1]).add(new Pair(i[0], i[2]));
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        q.add(1);// start with 1
        visited[1] = true;
        while (!q.isEmpty()) {
            int r = q.poll();
            for (Pair edge : map.get(r)) {
                ans = Math.min(ans, edge.cost);
                if (!visited[edge.tar]) {
                    visited[edge.tar] = true;
                    q.add(edge.tar);
                }
            }
        }
        return ans;
    }
}