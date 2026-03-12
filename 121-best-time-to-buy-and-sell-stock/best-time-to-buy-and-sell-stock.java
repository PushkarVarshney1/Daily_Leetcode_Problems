class Solution {
    public int maxProfit(int[] arr) {
        // Brute force --> gives TLE
        int n = arr.length;
        // sbse pehle mehnga lunga b/c stock mughe kam price me chahiye hoga
        int buy = Integer.MAX_VALUE; 
        int ans = 0;
        for(int i=0; i<n; i++){
            if(arr[i] < buy){
                buy = arr[i];
            }
            if(arr[i] - buy > ans)ans = arr[i] - buy;
        }
        return ans;
    }
}