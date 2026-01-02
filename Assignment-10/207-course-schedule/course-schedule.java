class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    //  Build graph (Adjacency List)
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
			int a1 = prerequisites[i][0];
			int b1 = prerequisites[i][1];
			map.get(b1).add(a1);
		}
    // Topological sort
        int[] ind=new int[map.size()];
        for(int key: map.keySet()){
            for(int nbrs:map.get(key)){
                ind[nbrs]++;
            }
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0; i<ind.length; i++){
            if(ind[i] == 0)q.add(i);
        }
        int c=0;
        while(!q.isEmpty()){
            int r = q.poll();
            c++;
            for(int nbrs : map.get(r)){
                ind[nbrs]--;
                if(ind[nbrs] == 0)q.add(nbrs);
            }
        }
        return c == map.size() ;
    }
}