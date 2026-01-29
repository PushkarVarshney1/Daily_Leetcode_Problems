class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        // Using queue dataStructure but another approach -> TC : O(n) & SC : O(n)
        Queue<Integer> q = new LinkedList<>();
        for(int val : tickets){
            q.add(val);
        }
        int ans = 0;

        while(true){
            int r = q.poll();   
            r--;
            ans++;
            // if this was person k
            if(k == 0){
                if(r == 0) return ans; // target finished
                else {
                    q.add(r);          // target goes back in queue
                    k = q.size() - 1;  // new position of target
                }
            }
            else {
                // not target
                if(r > 0) q.add(r);
                k--; // target moves one step forward
            }
        }
    }
}
