class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    // Step 1: Build graph (Adjacency List)
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
			int a1 = prerequisites[i][0];
			int b1 = prerequisites[i][1];
			map.get(b1).add(a1);
		}

    // Step 2: Build edges (prerequisite -> course)
        int[] in = new int[map.size()];
        for(int v1 : map.keySet()){
            for(int v2 : map.get(v1)){
                in[v2]++;
            }
        }

    // Step 3: BFS (Kahn’s algorithm)
        Queue<Integer> q = new LinkedList<>();
        int c=0;
        for(int i =0; i<in.length; i++){
            if(in[i] == 0) {
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int r = q.poll();
            c++;
            for(int neighbours : map.get(r)){
                in[neighbours]--;
                if(in[neighbours] == 0){
                    q.add(neighbours);
                }
            }

        }

        // Step 4: If all courses processed => no cycle i.e if c == map.size() --> no cycle 
        
        return c==map.size();
    }
    
}