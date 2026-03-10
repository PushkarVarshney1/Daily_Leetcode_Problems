class Solution {
    public int totalFruit(int[] fruits) {
        // not count the distinct ele having max count
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int st = 0, ed = 0;
        int ans = 0;
        while(ed < fruits.length){
            map.put(fruits[ed], map.getOrDefault(fruits[ed], 0)+1);
            while(map.size() > 2){
                map.put(fruits[st] , map.get(fruits[st])-1);
                if (map.get(fruits[st]) == 0) {
                    map.remove(fruits[st]);
                }
                st++;
            }
            ans = Math.max(ans , ed - st + 1);
            ed++;
        }
        return ans;
    }
}