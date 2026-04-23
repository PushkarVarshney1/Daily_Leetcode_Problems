class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        long[] ans = new long[n];
        for(int j : map.keySet()){ 
            int l = map.get(j).size();
            List<Integer> ll = map.get(j);
            if(l == 1){
                ans[ll.get(0)] = 0;
                continue;
            }
            long[] pre = new long[l];
            long[] suff = new long[l];
            pre[0] = ll.get(0);
            suff[l-1] = ll.get(l-1);
            for(int i=1; i<l; i++){
                pre[i] = (long)ll.get(i) + pre[i-1];
            }
            for(int i=l-2; i>=0; i--){
                suff[i] = (long)ll.get(i) + suff[i+1];
            }
            for(int i=0; i<l; i++){
                long curr = ll.get(i);
                // Left: (count * curr) - sumOfPrefix
                // Right: sumOfSuffix - (count * curr)
                ans[ll.get(i)] = (i!=0 && i != l-1) ? (i*curr - pre[i-1]) + (suff[i+1]-(l-i-1)*curr) : (i==0) ?(suff[i+1] - (l-i-1)*curr)  : (i*curr - pre[i-1]);
                
            }
        }
        return ans;
    }
}