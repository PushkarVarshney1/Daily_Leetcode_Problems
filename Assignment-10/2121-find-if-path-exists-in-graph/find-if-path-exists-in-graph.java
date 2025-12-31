class Solution {
    public boolean validPath(int n, int[][] edges, int src, int des) {
        HashMap<Integer , List<Integer>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(i , new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(src);
        while(!st.isEmpty()){
            int r = st.pop();
            if(visited.contains(r))continue;
            visited.add(r);
            if(r == des)return true;
            for(int nbrs : map.get(r)){
                if(!visited.contains(nbrs))st.push(nbrs);
            }
        }
        return false;
    }
}