class Solution {
   public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int[] res = new int[n];
        Arrays.fill(res, -1);
        for (int key : map.keySet()) {
            List<Integer> ll = map.get(key);
            int size = ll.size();
            if (size == 1) continue;
            for (int i = 0; i < size; i++) {
                int curr = ll.get(i);
                int prev = ll.get((i - 1 + size) % size);
                int next = ll.get((i + 1) % size);

                int d1 = Math.abs(curr - prev);
                int d2 = Math.abs(curr - next);
                // circular distance
                d1 = Math.min(d1, n - d1);
                d2 = Math.min(d2, n - d2);
                res[curr] = Math.min(d1, d2);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int q : queries) {
            ans.add(res[q]);
        }
        return ans;
    }
}
