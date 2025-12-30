class Solution {
    public int makeConnected(int n, int[][] connections) {

        // Simple return " components - 1 "
        if(connections.length<n-1) return -1;
        map = new HashMap<>();
        // Build Graph
        for(int i=0; i<n; i++)map.put(i , new ArrayList<>());

        for(int i=0; i<connections.length; i++){
            map.get(connections[i][0]).add(connections[i][1]);
            map.get(connections[i][1]).add(connections[i][0]);
        }
        
        // Main DFS --> Find the components
        int comp = 0;
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int src : map.keySet()){
            // int src = i;
            if(!visited.contains(src)){
                st.push(src);
                comp++; // components
                while(!st.isEmpty()){
                    int r = st.pop();
                    if(visited.contains(r))continue;
                    visited.add(r);
                    
                    for(int nbrs : map.get(r)){
                        if(!visited.contains(nbrs))st.push(nbrs);
                    }
                }
            }
        }
        return comp - 1;
    }
    private HashMap<Integer , List<Integer>> map;
}