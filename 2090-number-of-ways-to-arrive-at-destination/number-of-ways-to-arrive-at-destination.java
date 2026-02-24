class Solution {
    static final int MOD = 1_000_000_007;

    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> map = new ArrayList<>();
        for(int i = 0; i < n; i++){
            map.add(new ArrayList<>());
        }
        // build graph
        for(int[] r : roads){
            int u = r[0], v = r[1], w = r[2];
            map.get(u).add(new Pair(w, v));
            map.get(v).add(new Pair(w, u));
        }
        long[] dis = new long[n];
        Arrays.fill(dis, Long.MAX_VALUE);
        int[] ways = new int[n];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Long.compare(a.dist,b.dist));
        ways[0] = 1;
        dis[0] = 0;

        pq.add(new Pair(0,0)); 
        while(!pq.isEmpty()){
            Pair r = pq.poll();
            long doori = r.dist;
            int node = r.val;

            if(doori > dis[node]) continue;

            for(Pair nei : map.get(node)){
                int adj = nei.val;
                long wt = nei.dist;
                if(doori + wt < dis[adj]){
                    dis[adj] = doori + wt;
                    ways[adj] = ways[node];
                    pq.add(new Pair(dis[adj], adj));
                }
                else if(doori + wt == dis[adj]){
                    ways[adj] = (ways[adj] + ways[node]) % MOD;
                }
            }
        }

        return ways[n-1];
    }

    class Pair{
        long dist;
        int val;

        Pair(long p,int q){
            this.dist = p;
            this.val = q;
        }
    }
}