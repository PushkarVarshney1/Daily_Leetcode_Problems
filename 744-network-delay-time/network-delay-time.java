class Solution {
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    public int networkDelayTime(int[][] times, int n, int k) {
        // Build Graph
        map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i+1 , new HashMap<>());
        }
        for(int i=0; i<times.length; i++){
            map.get(times[i][0]).put(times[i][1] , times[i][2]);
        }
        int ans = Dijkstra(k);
        return ans;
    }

    class DijkstraPair{
		int vtx;
		// String acqPath;
		int cost;
		public DijkstraPair(int vtx,int cost){
			this.vtx=vtx;
			// this.acqPath=acqPath;
			this.cost=cost;
			
		}
	}
	
	public int Dijkstra(int src){
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(src,0));
        int ans = 0;
		while(!pq.isEmpty()) {
			// 1. remove
			DijkstraPair rp = pq.poll();
			// 2. Ignore if Already visited
			if(visited.contains(rp.vtx)) {
				continue;
			}
			// 3. Mark Visited
			visited.add(rp.vtx);
			// 4. Self Work
            ans=rp.cost;
			// 5. Add nbrs
			for(int nbrs : map.get(rp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.cost + cost));
				}
			}
		}
        if(visited.size() != map.size())return -1;
        return ans;
	}
}