class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int ans = -1;
        // from last to 0
        int temp = colors[0];
        int i = n-1;
        while(colors[i] == temp){
            i--;
        }
        ans = Math.max(ans, i);
        // from 0 to last
        temp = colors[n-1];
        i = 0;
        while(colors[i] == temp){
            i++;
        }
        ans = Math.max(ans, n-i-1);
        
        return ans;
    }
}