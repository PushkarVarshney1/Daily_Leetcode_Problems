class Solution {
    public List<Boolean> checkIfPrerequisite(int num, int[][] pre, int[][] qs) {
        // Build graph 
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<num;i++){
            map.put(i, new ArrayList<>());
        }
        // Topological Sort
        int []inD= new int[num];
        for(int []a : pre){
            map.get(a[0]).add(a[1]);
            inD[a[1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        // ll stores the HashSet for all numCourses and the set stores "What is the preRequisite for each numCourse"
        List<Set<Integer>> ll = new ArrayList<>(); 
        for(int i=0; i<num; i++){
            ll.add(new HashSet<>());
        }
        for(int i=0; i<inD.length; i++){
            if(inD[i] == 0){
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
			int r = q.poll();
			for(int nbrs:map.get(r)) {
                ll.get(nbrs).add(r);
                // add all ancestors of r
                ll.get(nbrs).addAll(ll.get(r));
				inD[nbrs]--;
				if(inD[nbrs]==0) {
					q.add(nbrs);
				}
			}
		}
        //System.out.print(ll);
        List<Boolean> ans = new ArrayList<>();
        for(int []a : qs){
            if(ll.get(a[1]).contains(a[0])){
                ans.add(true);
            }
            else ans.add(false);
        }
        return ans;
    }
}