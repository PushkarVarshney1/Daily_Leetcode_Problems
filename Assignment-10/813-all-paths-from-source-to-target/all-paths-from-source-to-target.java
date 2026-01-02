class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        fun(0,ans,ll,graph);
        return ans;
    }
    // DFS 
    public void fun(int r,List<List<Integer>> ans,List<Integer> ll,int[][]graph){
        ll.add(r);
        if(r == graph.length-1)ans.add(new ArrayList<>(ll));
        else{
            for(int nbrs : graph[r]){
                fun(nbrs,ans,ll,graph);
            }
        }
        ll.remove(ll.size()-1);
    }
}