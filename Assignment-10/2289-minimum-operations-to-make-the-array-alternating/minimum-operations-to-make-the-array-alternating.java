class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;

        Map<Integer,Integer> even = new HashMap<>();
        Map<Integer,Integer> odd = new HashMap<>();

        for(int i=0;i<n;i++){
            if(i%2==0) even.put(nums[i], even.getOrDefault(nums[i],0)+1);
            else odd.put(nums[i], odd.getOrDefault(nums[i],0)+1);
        }

        // find top two frequent in even
        int e1Val=0, e1Cnt=0, e2Cnt=0;
        for(int k: even.keySet()){
            int c = even.get(k);
            if(c > e1Cnt){
                e2Cnt = e1Cnt;
                e1Cnt = c;
                e1Val = k;
            } else if(c > e2Cnt){
                e2Cnt = c;
            }
        }

        // find top two frequent in odd
        int o1Val=0, o1Cnt=0, o2Cnt=0;
        for(int k: odd.keySet()){
            int c = odd.get(k);
            if(c > o1Cnt){
                o2Cnt = o1Cnt;
                o1Cnt = c;
                o1Val = k;
            } else if(c > o2Cnt){
                o2Cnt = c;
            }
        }

        // if most frequent values differ → best
        if(e1Val != o1Val){
            return (n/2 - e1Cnt) + (n - n/2 - o1Cnt);
        }

        // else choose second best combination
        return Math.min((n/2 - e1Cnt) + (n - n/2 - o2Cnt) , (n/2 - e2Cnt) + (n - n/2 - o1Cnt));
    }
}
