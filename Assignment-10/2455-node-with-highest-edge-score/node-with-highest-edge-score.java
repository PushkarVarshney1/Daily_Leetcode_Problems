class Solution {
    public int edgeScore(int[] edges) {
        HashMap<Integer,List<Integer>> idx = new HashMap<>();
        HashMap<Integer,Long> map = new HashMap<>();
        for(int i=0;i<edges.length;i++){
            idx.put(edges[i] , new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            idx.get(edges[i]).add(i);
        }
        long ans = 0; // this takes the max ele
        Integer[] arr = new Integer[edges.length];
        for(int key : idx.keySet()){
            long x = 0;
            for(int nbrs : idx.get(key))x += nbrs;
            ans = Math.max(ans , x);
            map.put(key , x);
        }
        int res = Integer.MAX_VALUE; // max's index in map
        for (int k : map.keySet()) {
            if (map.get(k) == ans) {
                res = Math.min(res, k);
            }
        }
        return res;
    }
}